package so2;

import java.util.HashMap;

public class Node {

	private int chance;
	private Node currentNode;
	private String name;
	private HashMap<String, Node> steps = new HashMap<String, Node>();

//	Opdracht 2.1

	public Node(String name) {
		setName(name);
	}

	public void addNode(String letter, Node node) {
		steps.put(letter, node);
	}

//	Deze functie wordt uiteindelijk niet meer gebruikt.
	public String showOptions(String letter) {
//		Deze try/catch vangt een niet-bestaande verbinding af. Niet de mooiste oplossing hiervoor.
		try {
			Node node = steps.get(letter);
			return (node.getName());
		} catch (Exception e) {
			return ("ERROR: Dat is geen bestaande verbinding.");
		}
	}

	public boolean hasOption(String letter) {
		try {
			Node node = steps.get(letter);
			String throwaway = node.getName();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

//	Gaat naar de volgende node, als de letter overeen komt.
	public void goToOption(String letter) {
		setCurrentNode(getCurrentNode().steps.get(letter));
	}

//	Maakt een string met de route die je afloopt.
	public String showRoute(String string) {
		String str = getName(); // append eerste n0
		String s1 = string.toLowerCase();
//		source: https://stackoverflow.com/questions/196830/what-is-the-easiest-best-most-correct-way-to-iterate-through-the-characters-of-a
		for (int i = 0, n = s1.length(); i < n; i++) {
			char c = s1.charAt(i);
			Node node = getCurrentNode().steps.get(Character.toString(c));
			try { // Om nullpointer op te vangen bij verkeerde letter
				if (hasOption(Character.toString(c))) {
					str = str + ", " + node.getName();
					goToOption(Character.toString(c));
				} else if (!hasOption(Character.toString(c))) {
					System.out.println("klopt niet");
				}
			} catch (Exception e) {
				System.out.println("Dit is geen valide optie.");
				str = str + ", ERROR";
			}
		}
		return str;
	}

//	Einde 2.1, begin 2.2.

	// Dit is een endnode. Hij heeft geen list namelijk!

	public Node getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}

	public HashMap<String, Node> getSteps() {
		return steps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int data) {
		this.chance = data;
	}

}
