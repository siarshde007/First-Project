package io.arsh.portfolio.onileservicetracker;

import io.arsh.portfolio.onileservicetracker.domain.Enum;
import io.arsh.portfolio.onileservicetracker.domain.User;
import io.arsh.portfolio.onileservicetracker.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnileServiceTrackerApplication {
    @Autowired
    private UserRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(OnileServiceTrackerApplication.class, args);
    }
  //  @Bean
  //  CommandLineRunner runner(){
  //      return args -> {
  //          repo.save(new User("Arshdeep","Singh","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
  //          repo.save(new User("Harneet","Kaur","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
  //         User user = repo.save(new User("Harkirat ","Singh","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
  //          System.out.println(user);
  //      };
  //  }

}
