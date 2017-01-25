package fr.demos.formation.springjava;

//  @Component("helloId")
public class Hello {
	
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
