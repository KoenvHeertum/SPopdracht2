package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import so2.KansNode;

class KansNodeTest {

	@Test
	void test() {
		System.out.println("\nKansNode\n");

		KansNode k0 = new KansNode("k0", (double) 1 / 6, 1);
		KansNode k1 = new KansNode("k1", (double) 1 / 6, 2);
		KansNode k2 = new KansNode("k2", (double) 1 / 6, 3);
		KansNode k3 = new KansNode("k3", (double) 1 / 6, 4);
		KansNode k4 = new KansNode("k4", (double) 1 / 6, 5);
		KansNode k5 = new KansNode("k5", (double) 1 / 6, 6);
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
