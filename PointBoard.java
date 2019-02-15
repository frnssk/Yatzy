package yatzy;

import java.util.HashMap;

public class PointBoard {
	private HashMap<String, Integer> scoreboard = new HashMap<String, Integer>();
	private String[] names = {	
							"Ettor", "Tvåor", "Treor", "Fyror", "Femor", "Sexor",
							"Par", "Två par", "Triss", "Fyrtal", "Kåk", 
							"Liten stege", "Stor stege", "Chans", "Yatzy"	
							};

	public PointBoard() {
		for(int i = 0; i < names.length; i++) {
			scoreboard.put(names[i], 0);
		}
	}

	public void setValue(String key, int value) {
		scoreboard.replace(key, value);
	}
	
	public void print(String key) {
		System.out.println(scoreboard.get(key));
	}

	public static void main(String[] args) {
		PointBoard pb = new PointBoard();
		String[] names = {	
				"Ettor", "Tvåor", "Treor", "Fyror", "Femor", "Sexor",
				"Par", "Två par", "Triss", "Fyrtal", "Kåk", 
				"Liten stege", "Stor stege", "Chans", "Yatzy"	
				};

		pb.setValue("Ettor", 5);
		pb.setValue("Tvåor", 6);
		pb.setValue("Par", 3);
		for(int i = 0; i < 15; i++) {
			pb.print(names[i]);
		}

	}
}
