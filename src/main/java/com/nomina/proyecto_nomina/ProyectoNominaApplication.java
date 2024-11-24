package com.nomina.proyecto_nomina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@SpringBootApplication
public class ProyectoNominaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoNominaApplication.class, args);
	}
}

@Configuration
class ApplicationConfiguration {

  @Bean
  MongoClient mongoClient() {
      return MongoClients.create("mongodb://localhost:27017");
  }

  @Bean
  MongoOperations mongoTemplate(MongoClient mongoClient) {
      return new MongoTemplate(mongoClient, "ProjectNomina");
  }
}