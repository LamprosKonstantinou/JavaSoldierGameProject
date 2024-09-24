
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Number of soldiers: "+ Soldier.getCounter());
		
		Soldier S1 = new Soldier("XY112");
		Soldier S2 = new Soldier("XZ223");
		
		System.out.println("Number of soldiers: "+ Soldier.getCounter());


	}

}
