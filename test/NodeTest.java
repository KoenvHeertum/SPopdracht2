package test;
import static org.junit.Assert.*;

import org.junit.Test;

import so2.Node;

public class NodeTest {

	@Test
	public void test() {
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
		System.out.println(n0.showRoute("ABBA"));
	}

}
