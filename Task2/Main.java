import java.util.Scanner;

class Main{
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);


		System.out.print("Please Enter Your Name: ");
		String userName = scanner.nextLine();

		while(userName.trim().isEmpty()){
			System.out.print("You must enter something!: ");
			userName = scanner.nextLine();
		}

		System.out.println("Welcome Back " + userName + "!");

		System.out.print("Please Enter Your Age: ");
		int userAge = Integer.parseInt(scanner.nextLine());


		System.out.println(userName + " your are " + userAge + " years old!");


		int retirementAge = 67;

		int timeLeftForRetirment = retirementAge - userAge;

		if(userAge < 67){
			System.out.println("You have " + timeLeftForRetirment + " left for retirment!");
		} else if(userAge >= 67){
			System.out.println("You are already retired!");
		}
		


	}




}