package inheritance;

public class Hierarchical_Inheritence_Test {

	public static void main(String[] args) {
		Hierarchical_Inheritence_Child1 c1 = new Hierarchical_Inheritence_Child1();
		c1.Father();
		c1.Son1();
		System.out.println("--------------------------------------------------");
		Hierarchical_Inheritence_Child2 c2 = new Hierarchical_Inheritence_Child2();
		c2.Father();
		c2.Son2();
		System.out.println("--------------------------------------------------");
		Hierarchical_Inheritence_Child3 c3 = new Hierarchical_Inheritence_Child3();
		c3.Father();
		c3.Son3();
		
	}
}
