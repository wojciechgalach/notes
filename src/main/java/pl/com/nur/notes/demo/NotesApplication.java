package pl.com.nur.notes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NotesApplication {

    public static void main(String[] args) {

        SpringApplication.run(NotesApplication.class, args);
    }

}
