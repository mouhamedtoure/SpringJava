package fr.demos.formation.springjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		
		// Lance Spring (charge la config de Spring)
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		
		// Demande a Spring de fournir une instance d'un bean
		HelloAnnote obj =  (HelloAnnote) context.getBean("helloAnnoteId");
		System.out.println(obj.sayHello());
		context.close();
	}

}
