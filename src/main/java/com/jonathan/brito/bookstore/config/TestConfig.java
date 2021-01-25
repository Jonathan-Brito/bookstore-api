package com.jonathan.brito.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;



import com.jonathan.brito.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbservice;
	
	@Bean
	public void instanciaBaseDados() {
		this.dbservice.instanciaBaseDados();
	}

}
