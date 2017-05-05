class Test{
	public static void main(String[] args) {
	int result =Calculator.add(10,20,40);
	System.out.println(result+"    Addition of Three Numbers");
      System.out.println("=======================================");
	System.out.println(Calculator.addition(10.11,20.33)+"   Addition of two numbers");
      System.out.println("==========================");
	System.out.println(Calculator.Speed(100,2)+" KM /hr");
      System.out.println("=======================================");
	System.out.println(Calculator.Area(123.12)+ "  Area of a circle");
      System.out.println("========================================");
	System.out.println(Calculator.Factorial(5)+ "is an Factorial of A given numer");
      System.out.println("==========================================");
        System.out.println(Calculator.iseven(6));
          System.out.println("====================================");
        System.out.println(Calculator.isodd(6));
          System.out.println("====================================");
        System.out.println(Calculator.isprime(17));
          System.out.println("====================================");
        System.out.println(Calculator.divisible(36));
          System.out.println("====================================");
        System.out.println(Calculator.Time(3600));
          System.out.println("====================================");
        System.out.println(Calculator.Multiple37(20));
          System.out.println("====================================");
        System.out.println(Calculator.Cricket(300,50,180,40)+" Runs Per Over To Win The Match");
          System.out.println("====================================");
        System.out.println(" The number of Digit's Present are :"+Calculator.digitCount(123));
          System.out.println("====================================");
        System.out.println(Calculator.largestOfThree(10,20,30)+" Is the largest of Three Numbers");
          System.out.println("====================================");
        System.out.println(Calculator.reverse(1234));
          System.out.println("====================================");
       // System.out.println(Calculator.fibonacci(7));
        System.out.println(Calculator.compute(34));
        System.out.println("======================================");
        System.out.println("The Even Numbers Are ");
        Calculator.evenNumbers(10,20);
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("The Odd Numbers Are ");
        Calculator.oddNumbers(10,20);
        System.out.println("======================================");
        Calculator.primeNumbers(10,20);
        System.out.println("======================================");
	}
}


/*

C:\Users\Mahesh K\Desktop\JAVA\Methods>javac Test.java

C:\Users\Mahesh K\Desktop\JAVA\Methods>java Test
70    Addition of Three Numbers
=======================================
30.439999999999998   Addition of two numbers
==========================
50 KM /hr
=======================================
47628.1150848  Area of a circle
========================================
120is an Factorial of A given numer
==========================================
true
====================================
false
====================================
true
====================================
true
====================================
1.0
====================================
false
====================================
12 Runs Per Over To Win The Match
====================================
 The number of Digit's Present are :3
====================================
30 Is the largest of Three Numbers
====================================
4321
====================================
7
======================================
The Even Numbers Are
10
12
14
16
18
20
======================================
======================================
The Odd Numbers Are
11
13
15
17
19
======================================
prime Numbers from10to20are
11 13 17 19
======================================

C:\Users\Mahesh K\Desktop\JAVA\Methods>
*/