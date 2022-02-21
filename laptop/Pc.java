package laptop;

public class Pc extends Laptop{
     public void getSystemInfo() {
    	 System.out.println("MAC");
		
	}
     public static void main(String[] args) {
	     Pc type=new Pc();
	     type.getSystemInfo();
	}
}
