package com.fruit.configuration;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;

/**
 * Created by zhang on 2017-6-1.
 */
@Configuration
// @EnableMongoRepositories(basePackages = "com.fruit.repositories.mongo")
public class ApplicationConfiguration {

	@SuppressWarnings("deprecation")
	@Bean
	public Mongo mongo() throws UnknownHostException {
		return new Mongo("192.168.75.128", 27017);
	}

	@SuppressWarnings("deprecation")
	public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(mongo(), "fruit");
	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDbFactory());
	}
}
