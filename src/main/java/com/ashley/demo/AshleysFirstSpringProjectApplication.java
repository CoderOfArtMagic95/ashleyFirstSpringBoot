package com.ashley.demo;
//import com.ashley.demo.controllers.MainController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AshleysFirstSpringProjectApplication {

	/* To see our app working in the browser,
	 *  we have to start the application.
	 *  Right click on your app and select
	 *   Run As -> Spring Boot App*/
	public static void main(String[] args) {
		//MainController main = new MainController();
		SpringApplication.run(AshleysFirstSpringProjectApplication.class, args);
        //main.getClass();
	}
	/* To see the app running in the browser, 
	 * open your browser window and navigate to "http://localhost:8080"
	 * Congratulations!  You just wrote your first Spring Boot App!*/

}
