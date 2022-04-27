package com.ThisIsAPackage;
import java.util.Date;
import java.util.Arrays;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class HelloWorld {

	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		byte sampleNum = 100 ;
		long viewsCount = 1_100_100_100_000_000_000l;
		int numBers = 100_000_000;
		double price = 10.99;
		float priceLess = 10.99f;
		char Letter = 'A';
		
		Date now = new Date();
		System.out.println(now);
		
		byte x = 1;
		byte y = x;
		
		System.out.println(y);
		
		Point point1 = new Point(1,1);
		Point point2 = point1;
		point1.x=2;
		System.out.println(point2);
		
		String message = "Hello world";
		System.out.println(message.length());
		System.out.println(message.indexOf("world"));
		System.out.println(message.replace("d", "h"));
		
		
		//Percentage of male and female code //

		int a,b,c;
		double d, e;
		System.out.print("Enter the number of males: ");
		a = in.nextInt();
		System.out.print("Enter the number of females: ");
		b = in.nextInt();
		c = a+b;
		System.out.print("Number of students: " + c);
		
		d = a * 100 / c;
		e = b * 100 / c;
		System.out.println("Male: " + d + "%");
		System.out.println("Female: " + e + "%");
		
		System.out.println("Hello\"World\"");
		
		int [] numbers = {25,23,27,37};
		Arrays.sort(numbers);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		
		int[][][] multNum = new int[3][3][3];
		multNum[0][0][0] = 3;
		multNum[0][1][0] = 7;
		multNum[0][2][0] = 9;
		
		multNum[1][0][0] = 5;
		multNum[1][1][0] = 8;
		multNum[1][2][0] = 6;
		
		multNum[2][0][0] = 1;
		multNum[2][1][0] = 2;
		multNum[2][2][0] = 3;
		
		System.out.println(Arrays.deepToString(multNum));
		
		int[][][] multiNum = new int[3][3][3];
		multiNum[0][0][1] = 3;
		multiNum[0][0][0] = 7;
		multiNum[0][2][0] = 9;
		
		multiNum[1][0][0] = 5;
		multiNum[1][1][0] = 8;
		multiNum[1][2][0] = 6;
		
		multiNum[2][0][0] = 1;
		multiNum[2][1][0] = 2;
		multiNum[2][2][0] = 3;
		System.out.println(Arrays.deepToString(multiNum));
		//Practice 2 Dimensional array//
		int[][][] mulNum = new int[3][3][3];
		mulNum[0][0][1] = 3;
		mulNum[0][0][0] = 7;
		mulNum[0][2][0] = 9;
		
		mulNum[1][0][0] = 5;
		mulNum[1][1][0] = 8;
		mulNum[1][2][0] = 6;
		
		mulNum[2][0][0] = 1;
		mulNum[2][1][0] = 2;
		mulNum[2][2][0] = 3;
		System.out.println(Arrays.deepToString(mulNum));
		
		double name = (double) 10/ (double) 3;
		System.out.println(name);
		
		int s = 1;
		int z = s++;
		System.out.println(s);
		System.out.println(z);
		
		String t = "100200";
		Integer.parseInt(t);
		System.out.println(t);
		
		double result = Math.random()*100;
		System.out.println(result);
		
		double res = Math.random()*100;
		System.out.println(res);
		
		double low = Math.max(result, res);
		System.out.print(low);
		
		int g,f,h,i;
		System.out.println("Enter number: ");
		g = in.nextInt();
		System.out.println("Enter number: ");
		f = in.nextInt();
		System.out.println("Enter number: ");
		h = in.nextInt();
		System.out.println("Enter number: ");
		i = in.nextInt();
		
		int [] ew = {g,f,h,i};
		System.out.println(Arrays.toString(ew));
		System.out.println(ew.length);
		
	}
}
