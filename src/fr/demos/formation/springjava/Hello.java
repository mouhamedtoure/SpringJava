package fr.demos.formation.springjava;

import org.springframework.stereotype.Component;

@Component("helloId")
public class Hello {

	public String sayHello() {
		return "Hello World!";
	}

}
