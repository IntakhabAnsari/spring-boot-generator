package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.CustomerDtlsEntity;
import com.ashokit.repositories.CustomerDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		CustomerDtlsRepository repo = ctxt.getBean(CustomerDtlsRepository.class);
		
		CustomerDtlsEntity entity = new CustomerDtlsEntity();
		
		entity.setCustomerName("David");
		entity.setCustomerEmail("david.k@gmail.com");
		
	    CustomerDtlsEntity save = repo.save(entity);
	    System.out.println(save);
	    ctxt.close();
	    
	}

}
