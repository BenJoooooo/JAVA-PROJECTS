import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Integer Value: ");
		int num = in.nextInt();
		System.out.print("OPTION:\n1. Sum of digit"
				+ "\n2. Revers the number\n3. Prime number checking"
				+ "\n4. Display all the number from 2 to n(n is a users input)"
				+ ". Apply the algorithm of Sieve of Eratosthenese\n5. Palindrome Checking"
				+ "\n6. Odd or even number\n7. exit\nInput: ");
		
		int options = in.nextInt();
		
		switch (options) {
		//Sum of digit//
		case 1: System.out.print("Sum: " + getSum(num));
		break;
		//Reverse the number//
		case 2: int reversed = 0;
					while (num != 0 ) {
					int digits = num % 10;
					reversed = reversed * 10 + digits;
					num /= 10;
				}
				System.out.print("\nReverse the number: " + reversed);
		break;
		//Prime number checking//
		case 3: System.out.print("Given: ");
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      // condition for non prime number//
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }
	
			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
		break;
		//Display all the prime number//
		case 4: System.out.print("Display all the prime number from 2 to n");
				System.out.print("Given: ");
				sieveOfEratosthenes(num);
		break;
		//Palindrome checking//
		case 5: System.out.print("Palindrome Checking");
				System.out.print("\nGiven: ");
		break;
		//Odd or even number//
		case 6: System.out.println("Odd or even number");
				System.out.println("Given: " + num);
				if (num % 2 == 0 ) {
					System.out.print("Answer: Even number");
				}
				else {
					System.out.print("Answer: Odd number");
				}
		break;
		//Exit//
		case 7: System.out.print("Program terminated");
				System.exit(options);
		}
	}
	//function to get the sum//
	public static int getSum(int n) {     
        int sum = 0; 
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
	//sieve of eratosthenes//
	public static void sieveOfEratosthenes(int n) { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<=n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prime[p] == true) 
            { 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
}
