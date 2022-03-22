package com.back;

import com.back.dao.ShapeDao;
import com.back.model.Circle;
import com.back.model.Rectangle;
import com.back.model.Triangle;

import java.lang.invoke.MethodHandles;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class BackApplication { private static final Logger LOGGER = LoggerFactory.logger(MethodHandles.lookup().lookupClass());


	public static void main(String[] args) {

		SpringApplication.run(BackApplication.class, args);
	}

	/*--====================  Add default data at app init   ====================--*/

	@Bean
	public CommandLineRunner commandLineRunner(ShapeDao shapeDao) {

		return args -> {
			shapeDao.save(new Triangle(5));
			shapeDao.save(new Circle(10));
			shapeDao.save(new Rectangle(4, 10));
			shapeDao.save(new Rectangle(6, 9));

			LOGGER.info("Application started with Default Data ");

		};
	}

}

