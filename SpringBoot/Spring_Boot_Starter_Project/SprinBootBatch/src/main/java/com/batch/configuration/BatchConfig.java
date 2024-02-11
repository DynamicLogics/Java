package com.batch.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.PathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.batch.bean.Person;
import com.batch.dao.PersonDAO;
import com.batch.job.PersonListener;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public JobExecutionListener listener() {
		return new PersonListener();
	}
	
	//Here the 'reader()' method will read the values from the CSV files
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public FlatFileItemReader<Person> reader() {
		//System.out.println("------------INSIDE STEP-READER--------------------------");
		FlatFileItemReader<Person> reader = new FlatFileItemReader<>();
		reader.setLinesToSkip(1);
		reader.setResource(new PathResource("E:/Programming/Java/Spring_Boot_Starter_Project/SprinBootBatch/src/main/resources/sample-data.csv"));
		DefaultLineMapper<Person> customerLineMapper = new DefaultLineMapper<>();
		//here this 'DelimitedLineTokenizer' constructor by default uses comma to separate values 
		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		//here I'am setting the column names from the CSV file from which I have to read the data
		tokenizer.setNames(new String[] {"id","name","surname"});
		customerLineMapper.setLineTokenizer(tokenizer);
		//here, the 'PersonFieldSetMapper' will read the values and convert them into the 'Person' POJO/Bean object 
		customerLineMapper.setFieldSetMapper(new PersonFieldSetMapper());
		customerLineMapper.afterPropertiesSet();
		reader.setLineMapper(customerLineMapper);
		System.out.println("READER: "+reader.toString());
		return reader; 
	}   
      
	/*
	  here, the 'writer()' method will get the data from the 'process()' method and will then insert that 
	  data into the database
	  here the 'DataSource' that we are passing as the input parameter this datasource values that
	  we assigned in our '.yml' or '.properties' files will be read by '@EnableBatchProcessing'  
	*/
	@Bean
	public JdbcBatchItemWriter<Person> writer(DataSource dataSource) {
		//System.out.println("------------INSIDE STEP-WRITER--------------------------");
		return new JdbcBatchItemWriterBuilder<Person>()
		   .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Person>())
		   .sql("INSERT INTO people (person_Id, person_Name, person_Surname) VALUES (:personId, :personName, :personSurname)")
		   .dataSource(dataSource)
		   .build();
	}
	
	/*
		here, the 'processor()' method will do the custom logic operations that we want to 
		perform on our data that we fetch from the 'read()' method, in this case I'am making the CSV read
		data to capital letters 
	*/
	@Bean
	public ItemProcessor<Person, Person> processor() {
		//System.out.println("------------INSIDE STEP-PROCESS--------------------------");
		return new PersonItemProcessor();
	}
	
	/*
	 * here, 'step777()' method will firstofall decide how much amount of data it needs to work on
	 * then it will start the read() operation, then 'process()' operation and then 'write()' operation
	 * here, 
	 * ItemReader: it is a generic interface whose implementation has been done in 'FlatFileItemReader<Person> reader()'
	 * ItemWriter: it is a generic interface whose implementation has been done in 'JdbcBatchItemWriter<Person> writer(DataSource dataSource)'
	 * ItemProcessor: it is a generic interface whose implementation has been done in 'ItemProcessor<Person, Person> processor()'
	 * 
	 */
	@Bean
	public Step step777(ItemReader<Person> reader, ItemWriter<Person> writer, ItemProcessor<Person, Person> processor) {
			//System.out.println("------------INSIDE MAIN-STEP--------------------------");
			return stepBuilderFactory
		   .get("step777")
		   //here chunk size means at a single time how much 
		   //amount of data this batch operation should work on
		   .<Person, Person>chunk(4)
		   .reader(reader)
		   .processor(processor)
		   .writer(writer)
		   .build();
	}
	
	/*
	 * here, 'job' will have the 'step' that we implemented above 
	 * 
	 */
	@Bean
	public Job createEmployeeJob(Step step777) {
		return jobBuilderFactory
		  .get("createEmployeeJob")
		  .incrementer(new RunIdIncrementer())
		  .listener(listener())
		  .flow(step777)
		  .end()
		  .build();
	}

	/*
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setJdbcUrl("jdbc:h2:tcp://localhost/~/mydb");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}*/

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
}
