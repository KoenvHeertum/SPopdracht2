package so2;

public class MCM {
	
	private double a = 0.1;
	private double b = 0.3;
	private double c = 0.6;
	
	public String dobbelsteen() {
		double randomChance = Math.random();
		System.out.println(randomChance);
		if(randomChance <= a) {
			return "a";
		} else if(randomChance <= a+b) {
			return "b";
		} else if(randomChance <= a+b+c) {
			return "c";
		} else {
			return "null";
		}	
	}
}
