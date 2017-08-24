package com.ncusuario.configurations.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = {"com.ncusuario.gateways.mongodb.repositories"}
)
@EnableMongoAuditing
public class MongoDbConfiguration {
}
