import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// byte type from -128 to 127

		byte range;
		range = 123;

		// short type -32768 to 32767
		short value = 23456;

		// long type -263 to 263-1
		// long var = -453792983L;

		// double
		double dbl = 45.7;

		// float
		float number = -42.3f;

		// char
		char letter = '\uffff';

		// System.out.println(letter);

		// JAVA OPERATORS

		/*
		 * + Addition - Subtraction * Multiplication / Division % Modulo Operation
		 * (Remainder after division)
		 * 
		 */

		int a = 12, b = 2;

		// Addition
		System.out.println("a + b = " + (a + b));

		// Subtraction
		System.out.println("a - b = " + (a - b));

		// multiplication
		System.out.println("a * b = " + (a * b));

		// Division
		System.out.println("a / b = " + (a / b));

		// Modulo
		System.out.println("a % b = " + (a % b));

		// Assignment Operators

		// create variables
		int c = 4;
		int var;

		// assign value string
		var = c;
		System.out.println("Var using =:" + var); // 4

		// assign value using =+
		var += c;
		System.out.println("Var using =+ : " + var); // 8

		// assign value using =*
		var *= c;
		System.out.println("Var using =* : " + var); // 32

		// assign value using -=
		var -= c;
		System.out.println("Var using -= :" + var); // 28

		// Increment Decrement value

		int d = 12, e = 12;
		int res1, res2;

		// original value
		System.out.println("Value of d : " + d);

		// increment operator
		res1 = ++d;
		System.out.println("After increment: " + res1);

		System.out.println("Value of b:" + e);

		// decrement operator
		res2 = --e;
		System.out.println("After increment: " + res2);

		res1 = ++res1;
		System.out.println(res1);

		// Java instanceof Operator

		String str = "Fouad";
		Boolean result;

		result = str instanceof String;
		System.out.println("Is str an object of String ?" + result);

		// difference between print() println()
		System.out.println("println 1");
		System.out.println("println 2");

		System.out.print("print 1");
		System.out.print("print 1");
		System.out.println("");

		// Java Input

		// create an object of Scanner
		Scanner input = new Scanner(System.in);
		/*
		 * // take input from the user System.out.println("Enter an integer : "); int
		 * number2 = input.nextInt(); System.out.println("You entered " +number2);
		 * 
		 * // float System.out.println("enter float : "); float myFloat =
		 * input.nextFloat(); System.out.println("Float entered : " +myFloat);
		 * 
		 * //double System.out.println("enter double : "); double myDouble =
		 * input.nextDouble(); System.out.println("Double entered : "+myDouble);
		 * 
		 * //String System.out.println("enter String :" ); String myString =
		 * input.next(); System.out.println("String entered :" +myString);
		 * 
		 * 
		 * 
		 * 
		 * // JAVA Expressions System.out.println("Enter nbr1 :"); int nbr1 =
		 * input.nextInt(); System.out.println("Enter nbr2 :"); int nbr2 =
		 * input.nextInt();
		 * 
		 * if (nbr1 == nbr2) { System.out.println("equals"); }else {
		 * System.out.println("not equals"); }
		 * 
		 * input.close();
		 */

		// if ... else ... if

		int n = 0;

		if (n > 0) {
			System.out.println("the number is positive");
		} else if (n < 0) {
			System.out.println("the number is negative");
		} else {
			System.out.println("the number is 0");
		}

		// nested if .. else

		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

		if (n1 >= n2) {

			if (n1 >= n3) {
				largest = n1;
			} else {
				largest = n3;
			}

		} else {

			if (n2 >= n3) {
				largest = n2;
			} else {
				largest = n3;
			}

		}

		System.out.println("Largest Number : " + largest);

		// switch

		int nb = 29;
		String size;

		switch (nb) {
		case 29:
			size = "small";
			break;

		case 42:
			size = "medium";
			break;

		case 44:
			size = "Large";
			break;

		case 48:
			size = "Extra large";
			break;
		default:
			size = "Unknow";
			break;
		}

		System.out.println("Size : " + size);

		// Loop

		// for loop
		int n4 = 6;
		for (int i = 0; i < n4; i++) {
			// System.out.println("Java is fun");
			System.out.println(i);
		}

		int sum = 0;
		int m = 3;

		for (int i = 1; i <= m; i++) {
			sum += i;
		}

		System.out.println("Sum =" + sum);

		// for each loop

		// array
		int[] numbers = { 3, 7, 5, -5 };

		for (int nbr : numbers) {
			System.out.println(nbr);
		}

		int[] nbrs = { 1, 2, 3 };
		int sum1 = 0;

		for (int nb1 : nbrs) {
			sum1 += nb1;
		}

		System.out.println("Sum = " + sum1);

		// while

		int i = 1, p = 5;

		while (i <= p) {
			System.out.println(i);
			i++;
		}

		// do while
		int j = 1, h = 5;

		do {
			System.out.println(j);
			j++;
		} while (j <= h);

		/*
		 * int sum2 = 0, nm = 0;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * do { sum2 += nm; System.out.println("Enter number"); nm = scanner.nextInt();
		 * } while (nm >= 0);
		 * 
		 * System.out.println("Sum =" + sum2); scanner.close();
		 */

		/*
		 * Enter a number 25 Enter a number 9 Enter a number 5 Enter a number -3 sum =
		 * 39
		 */

		// Break statement

		for (int index = 1; index <= 10; ++index) {

			// if the value of i is 5 the loop terminates
			if (index == 5) {
				break;
			}
			System.out.println(index);
		}

		// Java arrays

		int[] age = { 8, 24, 18, 50 };

		System.out.println("First element : " + age[0]);
		System.out.println("Second element : " + age[1]);
		System.out.println("Third element : " + age[2]);
		System.out.println("Fourth element : " + age[3]);

		// using for loop

		System.out.println("using for loop");
		for (int k = 0; k < age.length; k++) {
			System.out.println(age[k]);
		}

		// using foreach

		System.out.println("using for each");
		for (int v : age) {
			System.out.println(v);
		}

		// ex
		int[] nombres = { 1, 2, 3 };
		int sm = 0;
		Double average;

		for (int k : nombres) {
			sm += k;
		}

		int arrayLength = nombres.length;

		average = ((double) sm / (double) arrayLength);

		System.out.println("Sum = " + sm);
		System.out.println("Average = " + average);

		// Multidimensional Arrays

		int[][] a2 = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };

		System.out.println("Length of row 1: " + a2[0].length);
		System.out.println("Length of row 2: " + a2[1].length);
		System.out.println("Length of row 3: " + a2[2].length);

		// print all elements

		for (int k = 0; k < a2.length; k++) {
			for (int k2 = 0; k2 < a2[k].length; k2++) {
				System.out.println(a2[k][k2]);
			}
		}

		// foreach
		System.out.println("using foreach : ");
		for (int[] ks : a2) {
			for (int ks2 : ks) {
				System.out.println(ks2);
			}
		}

		// Java copy arrays

		int[] s = { 1, 2, 3, 4, 5 };
		int[] positiveNbrs = s;

		for (int k : positiveNbrs) {
			System.out.println(k + ", ");
		}

		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = new int[6];

		// copy element to destination

		for (int k = 0; k < source.length; k++) {
			destination[k] = source[k];
		}

		System.out.println(Arrays.toString(destination));

		// method arraycopy()

		int[] n5 = { 1, 2, 3 ,4 };
		int[] n6 = new int[4];
		
		System.arraycopy(n5, 0, n6, 0, 4);
		System.out.println("n6 = " +Arrays.toString(n6));

		
		// POO
		
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		//calling method
		led.turnOn();
		halogen.turnOff();
	
		// Somme
		//Somme obj = new Somme();
		
		//int result1 = obj.addNumbers(2,4);
		//System.out.println("Sum is : "+result1);
		
		// sqrt()
		
		System.out.println("Square root of 4 is: " +Math.sqrt(9));
		
		// constructor
		
		Test test = new Test();
		System.out.println("The name is : "+test.getName());
	
		// constructor with no parameter
		Class1 cls1 = new Class1();
		
		// constructor with parameter
		Class1 cls2 = new Class1("Python");
		
		cls1.getName();
		cls2.getName();
		
		// Join two String
		
		String first = "Java ";
		String second = "Programming";
		
		String joinedString = first.concat(second);
		System.out.println(joinedString);
		
		
		// compare two strings
		
		String first1 = "java programming";
	    String second2 = "java programming";
	    String third = "python programming";
		
	    // compare 1 and 2
	    boolean result3 = first1.equals(second2);
	    System.out.println("Strings first and second are equal: " + result3);
		
	    boolean result4 = first1.equals(third);
	    System.out.println("Strings first and third not are equal: " + result4);
		
	    // Access modify private
	    
	    Class1 data = new Class1();
	    
	    data.setAge(20);
	    System.out.println("my age is : "+data.getAge());
	
	    // Recursion java : repetetion

	    
	    
	    
	    
	    
	
	}

}
