import java.util.*;
public class Practice {
	
			public static int countWords(String str)
		    {
		       int count = 0;
		        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
		        {
		            for (int i = 0; i < str.length(); i++)
		            {
		                if (str.charAt(i) == ' ')
		                {
		                    count++;
		                }
		            }
		            count = count + 1; 
		        }
		        return count;
		    }
		    
		    public static String insertString( 
		        String originalString, 
		        String stringToBeInserted, 
		        int index) 
		    { 
		  
		        String newString = originalString.substring(0, index + 1) 
		                           + stringToBeInserted 
		                           + originalString.substring(index + 1); 
		        return newString; 
		    } 
		    
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("INPUT STRING :");
		        String str = sc.nextLine();
		        
		        System.out.print("OPTION:\n[1] count number of characters\n[2] count number of words\n[3] search a substring\n[4] replace character\n[5] deleting the word\n[6] insert a word\n[7] exit\nInput: ");
		        int option = sc.nextInt();
		        
		        switch(option){
		            case 1: 
		                System.out.printf("Number of character(s) %d", str.length());
		                break;
		            case 2:
		                System.out.printf("Number of word(s) %d", countWords(str));
		                break;
		            case 3:
		                System.out.print("Input Key to be search : ");
		                String sub = sc.next();
		                System.out.printf("result: Found in index %d", str.indexOf(sub));
		                break;
		           case 4:
		               System.out.print("Input a character to be replace : ");
		               String toBeReplace = sc.next();
		               System.out.print("Replace with: ");
		               String replaceWith = sc.next();
		               System.out.println("Result : " + str.replace(toBeReplace, replaceWith));
		               break;
		          case 5:
		              System.out.print("Word to be delete: ");
		              String toBeDelete = sc.next();
		              System.out.print("result : ");
		              if(str.contains(toBeDelete))
		                  System.out.print(str.replace(toBeDelete, ""));
		              else 
		                  System.out.printf("%s Not found", toBeDelete);
		              break;
		          case 6:
		              System.out.print("Word to be Inserted: ");
		              String toBeInserted = sc.next();
		              System.out.print("After Index: ");
		              int afterIndex = sc.nextInt();
		              System.out.print("Result: "+insertString(str,toBeInserted, afterIndex));
		              break;
		          case 7:
		              System.out.print("Program is about to exit...");
		              break;
		          default : 
		        	  System.out.print("Error input");
		        }
		 }
	}

