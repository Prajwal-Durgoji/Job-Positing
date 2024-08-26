![1](https://github.com/user-attachments/assets/2d8c1573-1519-4336-a90c-daaf585803fb)

![2](https://github.com/user-attachments/assets/f5115a5e-30f6-4d86-89a4-a546fb05590a)

![3](https://github.com/user-attachments/assets/3f33369a-7d87-4665-ba1c-659212ecf3e4)

![4](https://github.com/user-attachments/assets/a2e2d17d-3851-4b8f-9535-1311ac301437)

![5](https://github.com/user-attachments/assets/4b52f4d3-b9e2-4599-b4c7-b6e74a1c06c5)

Create Job Posting

URL: /api/job-postings/add/job
Method: POST
Description: Creates a new job posting.
Request Body: JobPosting object.
Response: Returns the created JobPosting object.

Get Job Posting by ID

URL: /api/job-postings/job/{id}
Method: GET
Description: Retrieves a job posting by its ID.
Path Variable: id (Long) - ID of the job posting.
Response: Returns the JobPosting object if found, otherwise returns 404 Not Found.

Get All Job Postings

URL: /api/job-postings/get/all
Method: GET
Description: Retrieves all job postings.
Response: Returns a list of all JobPosting objects.

Update Job Posting

URL: /api/job-postings/update/{id}
Method: PUT
Description: Updates an existing job posting by its ID.
Path Variable: id (Long) - ID of the job posting.
Request Body: JobPosting object.
Response: Returns the updated JobPosting object.

Delete Job Posting

URL: /api/job-postings/delete/{id}
Method: DELETE
Description: Deletes a job posting by its ID.
Path Variable: id (Long) - ID of the job posting.
Response: Returns 204 No Content on successful deletion.



