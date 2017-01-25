package fr.demos.formation.springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("helloAnnoteId")
public class HelloAnnote {
	
	@Autowired
	private Message message;

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	
	public String sayHello(){
		
		return message.getText();
		
		
	}
	
	
}
