package com.student.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentModel {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

}
