package com.yusufakbas.customquery;

import com.yusufakbas.customquery.model.User;
import com.yusufakbas.customquery.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CustomQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomQueryApplication.class, args);
    }

    private final UserRepository userRepository;

    public CustomQueryApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            userRepository.deleteAll();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            List<User> users = Arrays.asList(
                    new User("murat", false, 45000, sdf.parse("1999-08-15")),
                    new User("ahmet", true, 39900, sdf.parse("2001-05-06")),
                    new User("ali", false, 32000, sdf.parse("2001-05-06")),
                    new User("sinem", true, 35000, sdf.parse("2001-05-06")),
                    new User("banu", true, 55000, sdf.parse("2001-05-06")),
                    new User("yusuf", true, 88888, sdf.parse("2001-05-06"))
            );
            userRepository.saveAll(users);
        };
    }


}
