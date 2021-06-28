package com.shrenik;

public class MainApp {

	public static void main(String[] args) {
		String emailid = new String("PETER33@gmail.com"); //xf6677
		
		String another = "peter33@gmail.com"; //xf9090
		
		System.out.println("emaild == another = " + (emailid == another));
		
		//3. equals()
		System.out.println("emailid.equals(anohter) = " + emailid.equals(another));

		//4. equalsToIgnoreCase()
		System.out.println("emailid.equalsToIgnoreCase(another) = " + emailid.equalsIgnoreCase(another));
		
		//5. compareTo()
		System.out.println("emaild.compreTo(another) = " + emailid.compareTo(another));
		
		//6. compareToIgnoreCase()
		System.out.println("emailid.compareToIgnoreCase(another) = " + emailid.compareToIgnoreCase(another));
	}

}
