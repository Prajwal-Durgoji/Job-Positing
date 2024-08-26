package com.jobapplication.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobapplication.job.dto.JobPosting;
import com.jobapplication.job.respository.JobPostingRepository;

@Service
public class JobPostingService {
	
	@Autowired
	private JobPostingRepository jobPostingRepository;

	public JobPosting createJobPosting(JobPosting jobPosting) {
		return jobPostingRepository.save(jobPosting);
	}

	public Optional<JobPosting> getJobPosting(Long id) {
		return jobPostingRepository.findById(id);
	}

	public List<JobPosting> getAllJobPostings() {
		return jobPostingRepository.findAll();
	}

	public JobPosting updateJobPosting(Long id, JobPosting jobPosting) {
		jobPosting.setId(id);
        return jobPostingRepository.save(jobPosting);
	}

	public void deleteJobPosting(Long id) {
		jobPostingRepository.deleteById(id);
		
	}
}
