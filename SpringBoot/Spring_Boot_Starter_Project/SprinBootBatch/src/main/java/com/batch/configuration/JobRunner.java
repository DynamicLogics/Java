package com.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JobRunner implements CommandLineRunner{
	
	@Autowired
    private JobLauncher jobLauncher;

    @Autowired   
    private Job createEmployeeJob;
    
	@Override
	public void run(String... args) throws Exception {
		
		JobParameters jobParameters =
		          new JobParametersBuilder()
		            .addLong("time", System.currentTimeMillis())
		            .toJobParameters();
			/*
			 * here, 'createEmployeeJob' will start the job implementation that we had declared inside the 
			 * 'BatchConfig.java' file 'public Job createEmployeeJob(Step step777)' method 
			 * 
			 */
		    jobLauncher.run(createEmployeeJob, jobParameters);
		    System.out.println("JOB Execution completed!"); 
		    
	}
	
} 
 