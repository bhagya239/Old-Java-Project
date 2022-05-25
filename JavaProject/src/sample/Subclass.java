package sample;

public class Subclass implements Abc,Pqr{
	
	@Override
	public void m1() {
		
		Abc.super.m1();
	Pqr.super.m1();
		//System.out.println("sub-class method m1");
	}


	
	public static void main(String[] args) {
		
		Pqr sc= new Subclass();
	sc.m1();
	
		
	}

	

	

	


}
