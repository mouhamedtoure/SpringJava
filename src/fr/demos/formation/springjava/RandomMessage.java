package fr.demos.formation.springjava;

import java.util.Random;

public class RandomMessage implements Message {

	@Override
	public String getText() {
		String [] mesTextes = {"je suis le premier message" , "je suis le deuxième" ,"je suis le troisième" , "je suis le quatrième"};
		
		return mesTextes[new Random().nextInt(mesTextes.length)];
	}

}
