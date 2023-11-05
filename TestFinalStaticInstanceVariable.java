package FinalSabit;

public class TestFinalStaticInstanceVariable {
	
	private static int x;
	private static int y = 50;
	private static int z;
	
	
	
	private static final int a = 60;
	private static final int b;
	
	static { //static final constructor'dan tanımlanmadığı için static blok ile tanımlama yapılabilir.
		b = 70;
	}
	
	
	public TestFinalStaticInstanceVariable(int z) {
		this.z =z;
	}
	
	

	public static void main(String[] args) {
		
		
		TestFinalStaticInstanceVariable testfinalStaticInstanceVariable = new TestFinalStaticInstanceVariable(20);
		System.out.println("x ==> " + testfinalStaticInstanceVariable.x); //static tanımlanmış alanlara instance üzerinden ulaşıabilir. 
		System.out.println("y ==> " + testfinalStaticInstanceVariable.y);
		System.out.println("z ==> " + z); //aynı class içerisinde olduğunda instance variable direkt kullanılablir.
		
		
		
		System.out.println("a ==> " + testfinalStaticInstanceVariable.a);
		System.out.println("b ==> " + testfinalStaticInstanceVariable.b);
		
		//System.out.println("a ==> " + a);
		//System.out.println("b ==> " + b);
		
		

	}

}
