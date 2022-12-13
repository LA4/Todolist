package com.andreotti.ludovic_todo_controller;

public class Todo_vue {

	public static void askQuestion() {
		System.out.println("Bienvenue dans votre liste de tâches.");
		System.out.println("Que souhaitez vous faire ?");
		showChoices();
	}

	public static void showChoices() {
		System.out.println("1- Ajouter une tâche\n2- Retirer une tâche\n3- Voir mes tâches");
		Todo_action.takeChoice();

	}

}
