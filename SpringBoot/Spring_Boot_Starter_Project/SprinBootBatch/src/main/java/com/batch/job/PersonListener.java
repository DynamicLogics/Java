package com.batch.job;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class PersonListener implements JobExecutionListener{

	//they are like the post-construct and pre-destroy methods in springboot
	//here if you want to execute some logic before the batch runs or after 
	//batch execution completes then you can use these below two methods 
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("A Job has started: "+jobExecution.getStartTime());
		System.out.println("Status of the Job: "+jobExecution.getStatus());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("A Job has Completed: "+jobExecution.getEndTime());
		System.out.println("Status of the Job: "+jobExecution.getStatus());
	}

}
