package com.fruit.configuration;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

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
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(mongo(), "fruit");
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDbFactory(), mappingMongoConverter());
	}

	@Bean
	public DefaultMongoTypeMapper defaultMongoTypeMapper() {
		return new DefaultMongoTypeMapper(null);
	}

	@Bean
	public MongoMappingContext mongoMappingContext() {
		return new MongoMappingContext();
	}

	@SuppressWarnings("deprecation")
	@Bean
	public MappingMongoConverter mappingMongoConverter() throws Exception {
		return new MappingMongoConverter(mongoDbFactory(),
				mongoMappingContext());
	}
}
