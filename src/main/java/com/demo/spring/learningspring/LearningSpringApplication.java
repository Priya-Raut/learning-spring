package com.demo.spring.learningspring;

import com.demo.spring.learningspring.data.entity.Guest;
import com.demo.spring.learningspring.data.entity.Reservation;
import com.demo.spring.learningspring.data.entity.Room;
import com.demo.spring.learningspring.data.repository.GuestRepository;
import com.demo.spring.learningspring.data.repository.ReservationRepository;
import com.demo.spring.learningspring.data.repository.RoomRepository;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}
	
}
