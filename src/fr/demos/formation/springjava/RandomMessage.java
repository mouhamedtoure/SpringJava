package fr.demos.formation.springjava;

import java.util.Random;

public class RandomMessage implements Message {

	@Override
	public String getText() {
		String [] mesTextes = {"je suis le premier message" , "je suis le deuxi�me" ,"je suis le troisi�me" , "je suis le quatri�me"};
		
		return mesTextes[new Random().nextInt(mesTextes.length)];
	}

}
