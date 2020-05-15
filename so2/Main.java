package so2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TextNode\n");
		
		Node n0 = new Node("n0");
		Node n1 = new Node("n1");
		Node n2 = new Node("n2");
		Node n3 = new Node("n3");
		
		n0.setCurrentNode(n0);
		n0.addNode("a", n2);
		n0.addNode("b", n1);
		n1.addNode("a", n1);
		n1.addNode("b", n2);
		n2.addNode("b", n3);
		n3.addNode("a", n3);
		n3.addNode("b", n0);
		
		//Elke combinatie werkt!
		System.out.println(n0.showRoute("AB"));
		
		System.out.println("\nKansNode\n");
		
		KansNode k0 = new KansNode("k0", (double)1/6, 1);
		KansNode k1 = new KansNode("k1", (double)1/6, 2);
		KansNode k2 = new KansNode("k2", (double)1/6, 3);
		KansNode k3 = new KansNode("k3", (double)1/6, 4);
		KansNode k4 = new KansNode("k4", (double)1/6, 5);
		KansNode k5 = new KansNode("k5", (double)1/6, 6);
		KansNode startNode = new KansNode("startNode", 1.0);
		
		

		startNode.addOption(k0);
		startNode.addOption(k1);
		startNode.addOption(k2);
		startNode.addOption(k3);
		startNode.addOption(k4);
		startNode.addOption(k5);
		
		startNode.setCurrentNode(startNode);
		startNode.generateNumber(startNode.getOptions());
		
	}

}
