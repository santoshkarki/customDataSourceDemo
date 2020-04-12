package com.example.customDataSourceDemo;

import com.example.customDataSourceDemo.Model.Student;
import com.example.customDataSourceDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class CustomDataSourceDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomDataSourceDemoApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student s1 = new Student("Josh","56789");
		Student s2 = new Student("Ram","23467");
		studentRepository.save(s1);
		studentRepository.save(s2);

		Optional<Student> student = studentRepository.findById(1L);
		if(student.isPresent()){
			System.out.println(student.toString());
		}
	}
}
