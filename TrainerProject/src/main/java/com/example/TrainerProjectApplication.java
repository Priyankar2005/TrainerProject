package com.example;

import com.example.entity.Trainer;
import com.example.repository.TrainerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrainerProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrainerProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(TrainerRepository repo) {
		return args -> {
			repo.save(new Trainer("Priyankar", "9830686254", "Kolkata", "priyankar@gmail.com", "Python", 80000));
			repo.save(new Trainer("Tamoghno", "8272935856", "Delhi", "tom@yahoo.com", "C++", 90000));
			repo.save(new Trainer("Hitesh", "9870695645", "Mumbai", "hitesh@gmail.com", "Java", 40000));
			repo.save(new Trainer("Souporno", "9876054321", "Bangalore", "souporno@gmail.com", "Python", 20000));
			repo.save(new Trainer("Nick", "9087654356", "Chennai", "nick@gmail.com", "C", 50000));
			repo.save(new Trainer("David", "9765432187", "Pune", "david@outlook.com", "Java", 85000));
			repo.save(new Trainer("Rooney", "9609876543", "Hyderabad", "rooney@gmail.com", "Python", 55000));
			repo.save(new Trainer("Rahul", "9067859930", "Jaipur", "rahul@gmail.com", "JavaScript", 85000));
			repo.save(new Trainer("Devraj", "1234567890", "Goa", "devraj@yahoo.com", "Python", 90000));
			repo.save(new Trainer("Tuhin", "8765904567", "Ahmedabad", "tuhin@gmail.com", "C", 27000));
		};
	}
}