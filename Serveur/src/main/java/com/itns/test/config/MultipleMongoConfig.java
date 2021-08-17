package com.itns.test.config;

import com.mongodb.client.MongoClients;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(MultipleMongoProperties.class)
public class MultipleMongoConfig {

    private final MultipleMongoProperties mongoProperties;

    @Primary
    @Bean(name = "primaryMongoTemplate")
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(this.mongoProperties.getPrimary()));
    }

    @Bean(name = "secondaryMongoTemplate")
    public MongoTemplate secondaryMongoTemplate() throws Exception {
        return new MongoTemplate(secondaryFactory(this.mongoProperties.getSecondary()));
    }

    @Bean
    @Primary
    public MongoDatabaseFactory primaryFactory(final MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb://"+mongo.getHost()+":"+mongo.getPort()), mongo.getDatabase());
    }

    @Bean
    public MongoDatabaseFactory secondaryFactory(final MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create("mongodb://"+mongo.getHost()+":"+mongo.getPort()), mongo.getDatabase());
    }

}