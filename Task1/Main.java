class Main{
	
	public static void main(String[] args){

		Team team1 = new Team("FitnessTeam");
		Team team2 = new Team("SchoolTeam");
		Team team3 = new Team("CodeTeam");
		Team team4 = new Team("BroCodeTeam");
		Team team5 = new Team("CodingWithJohnTeam");
		Team team6 = new Team("WhatItDoFlightCrewTeam");


		team1.setRank(2);
		team2.setRank(3);
		team3.setRank(4);
		team4.setRank(1);
		team5.setRank(5);
		team6.setRank(1);


		team1.addPlayer("MoaF");
		team2.addPlayer("Amandu");
		team3.addPlayer("MoMo");
		team4.addPlayer("Lolo");
		team5.addPlayer("Pet");
		team6.addPlayer("Flight");


		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		System.out.println(team6.toString());

	}


}