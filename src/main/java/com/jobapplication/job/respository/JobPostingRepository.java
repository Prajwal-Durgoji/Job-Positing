package com.jobapplication.job.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobapplication.job.dto.JobPosting;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {

}
