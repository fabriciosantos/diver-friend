package com.diverfriend;

import com.diverfriend.gateway.database.model.User;
import com.diverfriend.gateway.database.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {

    private final UserRepository repository;

    public Initializer(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Denver JUG", "Utah JUG", "Seattle JUG",
                "Richmond JUG").forEach(name ->
                repository.save(User.builder().name(name).build())
        );

        repository.findAll().forEach(System.out::println);
    }
}
