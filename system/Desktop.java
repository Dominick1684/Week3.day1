package org.system;

public class Desktop {

	
	
	public void desktopSize()  {
		
		System.out.println("Verify Desktop is swithced on");

	}
	
	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		dk.desktopSize();
		
		Computer cm = new Computer();
		cm.computerMode();
		
	}
}
