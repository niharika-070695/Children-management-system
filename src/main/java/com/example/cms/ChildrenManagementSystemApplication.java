package com.example.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cms.entity.Student;
import com.example.cms.repository.StudentRepository;

@SpringBootApplication
public class ChildrenManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ChildrenManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Pawan","Kalyan","pawankalyan@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Erica","Fernandez","ericafern@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sanjay","Jadhav","sanjay@gmail.com");
//		studentRepository.save(student3);
//		
		
	}

}
