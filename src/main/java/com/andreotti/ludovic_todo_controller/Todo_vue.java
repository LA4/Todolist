package com.andreotti.ludovic_todo_controller;

import java.util.Scanner;

public class Todo_vue {

	static Scanner sc = new Scanner(System.in);

	public static void askQuestion() {
		System.out.println("Bienvenue dans votre liste de tâches.");
		System.out.println("Que souhaitez vous faire ?");
	}

	public static void showChoices() {
//		int choice;

		System.out.println("1- Ajouter une tâche\n 2- Retirer une tâche\n 3- Voir mes tâches");

		choice = sc.nextInt();

	}

}
