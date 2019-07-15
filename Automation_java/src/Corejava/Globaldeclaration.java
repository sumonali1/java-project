package Corejava;

public class Globaldeclaration {
	
	private String str;
	
	public void Sample(){
		str="Mahesh"; //assigning the value
		System.out.println("Welcome " +str);
	}
	
	public void Sample2(){
		str="Kishore";
		System.out.println("Welcome " +str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Globaldeclaration g=new Globaldeclaration();
		g.Sample();
		g.Sample2();
				
	}

}
