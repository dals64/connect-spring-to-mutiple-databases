package com.itns.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.itns.test.repositories.primary",
        mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {

}
