package com.chakri.springweb2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chakri.springweb2.JobPost;
import com.chakri.springweb2.jobrepo.JobRepo;
@Service
public class jobService {
	@Autowired
	private JobRepo repo;
	
	public void addJob(JobPost jobPost){
		repo.addJob(jobPost);
		
	}
	public List<JobPost> getALLJobs(){
		return repo.getAllJobs();		
	}
}