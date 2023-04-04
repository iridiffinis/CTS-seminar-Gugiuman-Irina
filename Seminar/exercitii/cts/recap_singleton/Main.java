package cts.recap_singleton;

import cts.recap_singleton.lazy_initialization.AgentieLI;

public class Main {

	public static void main(String[] args) {
		AgentieLI agentie1 = AgentieLI.getInstance("AgeTur", 5000, 8);
		AgentieLI agentie2 = AgentieLI.getInstance("ComTravel", 9000, 10);
		
		System.out.println(agentie1.toString());
		System.out.println(agentie2.toString());

	}

}
