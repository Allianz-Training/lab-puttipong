package com.allianz.helloWorld;

public class HelloWorld {
	public static void main (String args[]) {
		//lab4optional();
		//lab5();
		//lab6();
//		lab8();
//		lab9();
//		lab10();
//		lab11(200,50);
//		lab11void();
	}
	public static void lab4optional() {
		int input = 50;
		double typeA = 4.25;
		double typeB = 3.25;
		double typeC = 2.25;
		double total = 0;
		
		if(input>1 && input<=50) {
			total = input * typeA;
		}
		else if(input > 50 && input<=100) {
			total = input *typeB;
		}
		else if (input >100) {
			total = input * typeC;
		}
		System.out.println("1. Total: "+ total);
	}
	public static void lab5() {
		int num = 50;
		switch(num) {
		case 40: System.out.println("F");break;
		case 50: System.out.println("D"); break;
		case 60: System.out.println("C");break;
		case 70: System.out.println("B");break;
		case 80: System.out.println("A");break;
		}
		
	}
	public static void lab6() {
		int i =1;
		int sum=0;
		System.out.println("---------------( 1 )------------------");
		while(i<=10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println("----------------( 2 )-----------------");
		System.out.println("Sum"+ sum);
		System.out.println("-----------------( 3 )---------------");
		while(i<=100) {
			if(i%12==0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("------------------( 4 )---------------");
		int[] arr = {1,2,3,4,5};
		for(int counter: arr) {
			System.out.println(counter);
		}
	}
	public static void lab8() {

		for (int count = 0; count <= 20; count++) {
			if (count == 11) {
				System.out.println("Prayuth 11 ended");
				break;
			}
			System.out.println("Prayuth " + count);
		}
	}

	public static void lab9() {
		for (int count = 0; count <= 20; count++) {

			if (count == 11)
				continue;
			System.out.println("Taksin " + count);
		}
	}
	
	public static void lab10() {
		for (int i = 1; i <= 10; i++) {
			if (i == 2) continue;
			System.out.println("Number " + i);
		}
		
	}
	
	public static int lab11(int x, int y) {
		return x + y;
	}
	public static void lab11void() {
		System.out.println("Prawit");
	}
}


