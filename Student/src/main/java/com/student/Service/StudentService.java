package com.student.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.Domain.Student;
import com.student.model.StudentModel;
import com.student.repo.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
	
	private final StudentRepo studentRepo;
	
	public List<StudentModel> findAllStudents()
	{
	
		List<Student> allStudentList = new ArrayList<>();
		allStudentList= studentRepo.findAll();
		
		
		return convertEtoModel(allStudentList);
	}

    public List<StudentModel> convertEtoModel(List<Student> allStudentList) {
		
    	List<StudentModel> listOfStudentModel= new ArrayList<>();
    	
    	
    	for (Student s1:allStudentList )
    	{
    	StudentModel m1=
    		StudentModel.builder().firstName(s1.getFirstName())
    		.build();
    		listOfStudentModel.add(m1);
    	}
    	
		return 	listOfStudentModel;
	}

}
