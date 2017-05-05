//1.Addition of three numbers

class Calculator{
	public static int add(int num1,int num2,int num3){
		return num1+num2+num3;
	}
	//2.Addition of two numbers
	public static  Double addition(Double num1,Double num2){
		return num1+num2;
	}
	//4.A method takes time and distance as input and returns speed
	public static  int Speed(int distance,int time){
	    int speed=distance/time;
	    return speed;
	}
	//5.Write an API which accepts radius as input and return area of a Circle as output
	public static Double Area(Double radius){
		final Double PI=3.142;
		Double area=radius*radius*PI;
		return area;
	}
	//6.A method which accepts a number as input and returns Factorial of that number
	public static int Factorial(int n){
        int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	//7.Develop an API which takes an integer as input and returns true if it is even false if it’s not
	public static Boolean iseven(int num){
		if(num%2==0)
			return true;
			else
				return false;
		
	}
	//8.Develop an API which takes an integer as input and returns true if it is odd false if it’s not
	public static  Boolean isodd(int num){
		if(num%2!=0)
			return true;
		else
			return false;
	}
	//9. Develop an API which takes an integer as input and returns true if it is prime false if it’s not
	public static  Boolean isprime(int num){
      
     
      if( num%1==0 && num!=0)
      	return true;
      else
      	return false;
	}

    //10.Develop an API which takes an integer as input and returns a Fibonacci series of that size
	
	//12. Develop an API which takes an integer as input and returns true if it is divisible by 6 false if it’s not
	public static Boolean divisible(int num){
		if(num%6==0)
			return true;
		else
			return false;
	}

	//13. A method accepts the time in seconds and returns the time in hours
	public static float Time(float sec){
        float time=sec/3600;
		return time;
	}

	 //16. A method that counts the number of Digits in an Integer
    public static int digitCount(int n){
    	int i=0;
    	while(n>0){
    		n=n/10;
    		i++;
    	}
    	return i;
    }

    /*18. Calculate RequiredRunRate : A team is chasing the target set in a one day international match. The objective is to compute the required run rate. 
    The following have provided as input: target, maxOvers, currentScore, oversBowled */

    public static  int Cricket(int target,int maxOvers,int currentScore,int oversBowled ){
    	int remainingOvers=maxOvers-oversBowled;
       
        int remainingRun=target-currentScore;
        int requiredRR=(remainingRun/(remainingOvers*6)*6);
        return requiredRR;
    } 

    //20. Sum2Digit : Given a 2 digit number as input, compute the sum of its digits. Assume that the number has 2 digits

    public static int compute( int MethParam )
    {
    	int Sum=0;
        int rem = MethParam%10; 
        Sum+=rem;        

        MethParam = MethParam/10; 
        if(MethParam>10)
            compute(MethParam);

        return Sum+MethParam;  
    }


	
	//27.->Multiple37 : Given a number n, return true if it is divisible by either 3 or 7
    
    public static  Boolean Multiple37(int num){
    	if(num%3==0 || num%7==0)
    		return true;
    	else
    		return false;
    }

    
   

    //28->LargestOfThree : Given three numbers as input, return the largest number.

    public static int largestOfThree(int num1,int num2,int num3){
    	int i=-1;
    	if(num1>=num2 && num1>=num3){
    		return num1;
    	}
    	if(num2>=num1 && num2>=num3){
    		return num2;
    	}
    	if(num3>=num1 && num3>=num2){
    		return num3;
    	}
          return i;
    }

    //39. Reverse3 : Given a 3 digit number as input, reverse it

     public static int reverse(int n){
      int reverse=0;
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }

       return reverse;
     }

     //43. Write a method to generate even numbers between from and to
     public static void evenNumbers(int from,int to){
     	
     	for(int i=from;i<=to;i++){
     		if(i%2==0)
     			System.out.println(i);
     	}
     }

     //44. Write a method to generate odd numbers between from and to
     public static void oddNumbers(int from,int to){
     	for (int i=from;i<=to ;i++ ) {
     		if(i%2==1)
     			System.out.println(i);
     	}
     }

     //45. Write a method to generate prime numbers between from and to
     public static void primeNumbers(int from,int to){
     	int num=0;
     	String primeNumber= "";
     	for (int i=from;i<=to ;i++ ) {
     		int counter=0;
     		for (num=i;num>=1 ;num-- ) {
     			if(i%num==0){
     				counter=counter+1;
     			}
     		}
     		if(counter==2){
     			primeNumber=primeNumber+i+" ";
     		}
     	}
     	System.out.println("prime Numbers from"+from+"to"+to+"are");
        System.out.println(primeNumber);
    }
 
	

}



