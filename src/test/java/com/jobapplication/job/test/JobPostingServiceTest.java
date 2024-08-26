package com.jobapplication.job.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jobapplication.job.dto.JobPosting;
import com.jobapplication.job.respository.JobPostingRepository;
import com.jobapplication.job.service.JobPostingService;

@ExtendWith(MockitoExtension.class)
public class JobPostingServiceTest {

    @Mock
    private JobPostingRepository jobPostingRepository;

    @InjectMocks
    private JobPostingService jobPostingService;

    private JobPosting jobPosting;

//    @BeforeEach
//    void setUp() {
//        jobPosting = new JobPosting();
//        jobPosting.setId(1L);
//        jobPosting.setTitle("Software Engineer");
//        jobPosting.setDescription("Develop and maintain software applications.");
//        jobPosting.setLocation("Remote");
//        jobPosting.setCompany("ABC Inc.");
//        jobPosting.setSalaryRange("$60,000 - $80,000");
//        jobPosting.setRequiredSkills(Arrays.asList("Java", "Spring Boot"));
//        
//    }

    @Test
    void testCreateJobPosting() {
        when(jobPostingRepository.save(any(JobPosting.class))).thenReturn(jobPosting);

        JobPosting createdJobPosting = jobPostingService.createJobPosting(jobPosting);

        assertNotNull(createdJobPosting);
        assertEquals(jobPosting.getId(), createdJobPosting.getId());
        verify(jobPostingRepository, times(1)).save(jobPosting);
    }

    @Test
    void testGetJobPosting() {
        when(jobPostingRepository.findById(1L)).thenReturn(Optional.of(jobPosting));

        Optional<JobPosting> foundJobPosting = jobPostingService.getJobPosting(1L);

        assertTrue(foundJobPosting.isPresent());
        assertEquals(jobPosting.getId(), foundJobPosting.get().getId());
        verify(jobPostingRepository, times(1)).findById(1L);
    }

    @Test
    void testGetAllJobPostings() {
        List<JobPosting> jobPostings = Arrays.asList(jobPosting);
        when(jobPostingRepository.findAll()).thenReturn(jobPostings);

        List<JobPosting> allJobPostings = jobPostingService.getAllJobPostings();

        assertNotNull(allJobPostings);
        assertEquals(1, allJobPostings.size());
        verify(jobPostingRepository, times(1)).findAll();
    }

    @Test
    void testUpdateJobPosting() {
        when(jobPostingRepository.save(any(JobPosting.class))).thenReturn(jobPosting);

        JobPosting updatedJobPosting = jobPostingService.updateJobPosting(1L, jobPosting);

        assertNotNull(updatedJobPosting);
        assertEquals(jobPosting.getId(), updatedJobPosting.getId());
        verify(jobPostingRepository, times(1)).save(jobPosting);
    }

    @Test
    void testDeleteJobPosting() {
        doNothing().when(jobPostingRepository).deleteById(1L);

        jobPostingService.deleteJobPosting(1L);

        verify(jobPostingRepository, times(1)).deleteById(1L);
    }
}
