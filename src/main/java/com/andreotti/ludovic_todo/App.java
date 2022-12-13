package com.andreotti.ludovic_todo;

import com.andreotti.ludovic_todo_controller.Todo_vue;
import com.andreotti.ludovic_todo_data.Todo_storage;

public class App {

	public static void main(String[] args) {

		Todo_vue.askQuestion();
		Todo_storage.showStorage();

	}

}
