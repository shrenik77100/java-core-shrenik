package com.shrenik;

public class MainApp {

	public static void main(String[] args) {
		String testString = "Java is Cross Platform Langauge. Cross Platform means on any OS you can run Java";
	
		System.out.println(testString);
	
		//8. substring()
		System.out.println("Split String from index 4 upto 20 = " + testString.substring(4, 20));
		
		System.out.println("Split String from index 10 :" + testString.substring(10));
	
		//9. split()
		String []ans = testString.split("Platform");
		System.out.println("Split String from word 'Platform' : ");
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
		
		//10. indexOf()
		System.out.println("IndexOf = " + testString.indexOf("Java")); //0
		System.out.println("IndexOf = " + testString.indexOf("Cross")); //8
		
		//11. lastIndexOf()
		System.out.println("lastIndexOf = " + testString.lastIndexOf("Java")); //76
		System.out.println("lastIndexOf = " + testString.lastIndexOf("Cross")); //33
		
		//startWith(), endsWith(), trim(), charAt()
				
	}

}
