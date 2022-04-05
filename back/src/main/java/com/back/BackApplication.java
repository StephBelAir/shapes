package com.back;

import com.back.dao.ShapeDao;
import com.back.dao.ShapesListDAO;
import com.back.model.*;

import java.lang.invoke.MethodHandles;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class BackApplication {

	private static final Logger LOGGER = LoggerFactory.logger(MethodHandles.lookup().lookupClass());


	public static void main(String[] args) {

		SpringApplication.run(BackApplication.class, args);
	}

	/*--====================  Add default data at app init   ====================--*/

	@Bean
	public CommandLineRunner commandLineRunner(ShapeDao shapeDao, ShapesListDAO shapesListDAO) {

		return args -> {

			Form created;
			for (int j = 0; j < 4; j++) {
				ShapeList list = new ShapeList();
				for (int i = 0; i < 3; i++) {
					created = new Triangle(i%17);
					created = shapeDao.save(created);
					list.addShape(created);
				}
				shapesListDAO.save(list);
			}


						LOGGER.info("*** Application started with Default Data ***");
			LOGGER.info(shapesListDAO.findAll());
			//*/

		};
	}

}

