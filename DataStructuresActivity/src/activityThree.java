import java.util.Scanner;
public class activityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int i = 0;
			while( i !=6) {
				System.out.println("[Option 1]String Copy");
				System.out.println("[Option 2]String Concatenate");
				System.out.println("[Option 3]String Comparison");
				System.out.println("[Option 4]String Reverse the first string output: ");
				System.out.println("[Option 5]String Second String conversion (uppercase to lowercase and vice-versa");
				System.out.println("[Option 6]The program will be exit..");
				System.out.println("Enter your Options: ");
				i = sc.nextInt();
			switch (i) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				String str;
				String subs;
				int b;
				System.out.println("Input First String: ");
				str = sc1.nextLine();
				System.out.println("Input Second String: ");
				subs = sc1.nextLine();
				System.out.println("Enter string number you copy: ");
				b = sc1.nextInt();
				String ab = str;
				String cd = subs;
				if (b ==1)
				{
				System.out.println("String 3"+ ab +"\n");
				}
				else if(b == 2)
				{
				System.out.println("String 3: "+ cd +"\n");
				}
				break;
			case 2:
				Scanner sc2 = new Scanner(System.in);
				String str1;
				String subs1;
				System.out.println("Input First String: ");
				str1 = sc2.nextLine();
				System.out.println("Input Second String: ");
				subs1 = sc2.nextLine();
				String S3 =str1.concat(subs1);
				System.out.println("Output: " + S3 );
				break;
			case 3:
				Scanner sc3 = new Scanner(System.in);
				String str2;
				String subs2;
				System.out.println("Input First String: ");
				str2 = sc3.nextLine();
				System.out.println("Input Second String: ");
				subs1 = sc3.nextLine();
				if(str2.equals(subs1)) {
					System.out.println("They are equal.");
				}
				else {
					System.out.println("They are not equal.");
				}
				break;
			case 4:
				Scanner sc4 = new Scanner(System.in);
				String str3, rev="", reve="";
				String subs3;
				String sub;
				System.out.println("Input First String: ");
				str = sc4.nextLine();
				System.out.println("Input Second String: ");
				subs = sc4.nextLine();
				System.out.println("Enter String number you reverse: ");
				int d =sc4.nextInt();
				if(d == 1) {
					int length =str.length();
					for(int i1 =length-1; i1>=0; i1--)
					rev = rev+str.charAt(i1);
					System.out.println("Reversed string: "+rev);
				} else if(d == 2)
				{
				int length=subs.length();
				for(int i1=length-1; i1>=0;i1--)
				reve=reve+subs.charAt(i1);
				System.out.println("Reversed string: "+reve);
				}
				break;
			case 5:
				Scanner d1 = new Scanner(System.in);
				String str4;
				String subs4;
				System.out.println("Input First String: ");
				str = d1.nextLine();
				System.out.println("Input Second String: ");
				subs = d1.nextLine();
				System.out.println("Enter String number you change: ");
				int b1 = d1.nextInt();
				if(b1==1)
				{
				System.out.println(str);
				System.out.println(str.toUpperCase());
				System.out.println(str.toLowerCase());
				}
				else if(b1==2) {
				System.out.println("String"+subs);
				System.out.println(subs.toUpperCase());
				System.out.println(subs.toLowerCase());
				}
				break;
			case 6:
				System.out.println("The program will be exit..");
				default:
			}
		}
	}
}
