package so2;

import java.util.ArrayList;

public class KansNode {

	private String name;
	private KansNode currentNode;
	private int number = -1;
	private double chance;
	private ArrayList<KansNode> options = new ArrayList<>();

	// Dit is een eindnode!
	public KansNode(String name, double chance, int number) {
		setName(name);
		setNumber(number);
		setChance(chance);
	}

	// Dit is een tussennode!
	public KansNode(String name, double chance) {
		setName(name);
		setChance(chance);
	}

	public void addOption(KansNode kansNode) {
		options.add(kansNode);
	}

	public void addOptions(ArrayList<KansNode> list) {
		options.addAll(list);
	}

	public void printArrayList(ArrayList<KansNode> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}

	public boolean addUpTo100(ArrayList<KansNode> list) {
		double c = 0;
		for (int i = 0; i < list.size(); i++) {
			c = c + list.get(i).getChance();
		}
//		System.out.println(c); // Print de opgetelde kans
		if (c == 1.0 || c == 0.9999999999999999) {
			return true;
		} else {
			return false;
		}
	}

	public void generateNumber(ArrayList<KansNode> list) {

		if (getCurrentNode().addUpTo100(list)) {
			if (getCurrentNode().getNumber() < 0) {

				double random = Math.random();
//				System.out.println("Random number is " + random); // random syso

				double chance1 = 0;

				for (int i = 0; i < list.size(); i++) {
					chance1 = chance1 + list.get(i).getChance(); // add chance aan chance1
					if (chance1 > random) {
						System.out.println(list.get(i).getNumber());
						setCurrentNode(list.get(i));
//						System.out.println(getCurrentNode().getName());
						break;
					}
				}
			} 
		} else {
			System.out.println("Iets add niet up.");
		}
	}

	public int getEndNodeNumber() {
		return 0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getChance() {
		return chance;
	}

	public void setChance(double chance) {
		this.chance = chance;
	}

	public ArrayList<KansNode> getOptions() {
		return options;
	}

	public KansNode getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(KansNode currentNode) {
		this.currentNode = currentNode;
	}
}
