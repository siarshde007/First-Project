package io.arsh.portfolio.onileservicetracker.config;

import io.arsh.portfolio.onileservicetracker.domain.Enum;
import io.arsh.portfolio.onileservicetracker.domain.User;
import io.arsh.portfolio.onileservicetracker.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
   private UserRepo repo;

    public UserConfig(UserRepo repo) {
        this.repo = repo;
    }
    @Bean
    CommandLineRunner runner(){
        return args -> {
            repo.save(new User("Arshdeep","Singh","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
            repo.save(new User("Harneet","Kaur","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
            repo.save(new User("Harkirat ","Singh","Ajit nagar",6475617977L,"singh@gmail.com", Enum.ACTIVE));
        };
    }
}
