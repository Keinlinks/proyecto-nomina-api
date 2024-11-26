package com.nomina.proyecto_nomina;

import java.util.Collections;

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
		SpringApplication app = new SpringApplication(ProyectoNominaApplication.class);
    app.setDefaultProperties(Collections
          .singletonMap("server.port", "8081"));
        app.run(args);
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