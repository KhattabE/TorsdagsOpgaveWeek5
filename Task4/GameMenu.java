import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	

	private ArrayList<String> actions = new ArrayList<>();

	GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}



	public void displayMenu(){

		for(String action : actions){
			System.out.println(action);
		}

	}


	public String promptUser(){

		Scanner scan = new Scanner(System.in);


		for(String action : actions){
			System.out.println(action);
		}

			System.out.print("Type a number to choose an action: ");
			String choice = scan.nextLine();

			return choice;
	}





}