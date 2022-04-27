
		import java.util.Arrays;
		import java.util.Scanner;
		public class ActivitySixArray {

			public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
			        System.out.println("Select Option:");
			        System.out.println("1. Sum of N in array");
			        System.out.println("2. Find the maximum and minimum number in array");
			        System.out.println("3. delete duplicate values in array");
			        System.out.println("4. compute for odd and even numbers");
			        System.out.println("5. exit");
			        
			        int ch = sc.nextInt();
			        
			        if(ch == 1){
			            System.out.println("Input size Array");
			            int size_array = sc.nextInt();
			            int []arr = new int[size_array];
			            System.out.println("Input "+size_array+" value: ");
			            for(int i = 0; i < size_array; i++){
			                arr[i] = sc.nextInt();
			            }
			            int sum = 0; 
			            for (int i = 0; i < size_array; i++){
			                sum += arr[i];
			            }
			            System.out.println("sum of "+size_array+" values  "+sum);
			        }else if(ch == 2 ){
			            System.out.println("Input size Array");
			            int size_array = sc.nextInt();
			            int []arr = new int[size_array];
			            System.out.println("Input "+size_array+" value: ");
			            for(int i = 0; i < size_array; i++){
			                arr[i] = sc.nextInt();
			            }
			            Arrays.sort(arr);
			            System.out.println("Maximum value "+ arr[size_array - 1]);
			            System.out.println("Minimum value "+ arr[0]);
			        }else if(ch == 3){
			            System.out.println("Input size Array");
			            int size_array = sc.nextInt();
			            int []arr = new int[size_array];
			            System.out.println("Input "+size_array+" value: ");
			            for(int i = 0; i < size_array; i++){
			                arr[i] = sc.nextInt();
			            }
			            int []new_arr = new int[size_array];
			            new_arr[0] = arr[0];
			            int counter = 1;
			            for(int i = 1; i < size_array; i++){
			                int exist = 0;
			                for(int val: new_arr){
			                    if(val == arr[i]){
			                        exist++;
			                        break;
			                    }
			                }
			                if(exist >= 1){
			                    continue;
			                }else {
			                    new_arr[counter] = arr[i];
			                    counter ++ ;
			                }
			            }
			            System.out.print("Distinct Value ");
			            for(int i = 0; i < counter ; i ++ ){
			                System.out.print(" "+new_arr[i]);
			            }
			        }else if(ch == 4){
			            int[] arr = new int[10];
			            System.out.println("Input 10 value ");
			            for(int i = 0; i < 10; i ++ ){
			                arr[i] = sc.nextInt();
			            }
			            int odd = 0;
			            int even = 0;
			            for(int val: arr){
			                if(val % 2 == 0){
			                    even += val;
			                }else {
			                    odd += val;
			                }
			            }
			            System.out.println("Sum of Even numbers "+ even);
			            System.out.println("Sum of Odd numbers "+ odd);
			        }else {
			            System.out.println("Program is about to exit ... ");
			        }
			    }
			}


