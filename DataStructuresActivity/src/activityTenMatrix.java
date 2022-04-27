import java.util.Scanner;
public class activityTenMatrix {

	//push
	static int push() {
	Scanner in = new Scanner (System.in);
	System.out.print("Enter number to add to the stack: ");
	return in.nextInt();
	}
	
	//pop
	static int pop(int current) {
		return --current;
	}
	
	//top
	static void top (int[] stack, int current_size) {
		System.out.println("The top value of stack: " + stack[current_size]);
	}
	
	//size
	static void size (int current_size, int stack_size) {
		System.out.println("Current stack size: " + (current_size+1)+ ", Total stack size: " + stack_size);
	}
	
	//empty
	static void empty (int current_size) {
		if (current_size == 0) System.out.println("TRUE");
		else System.out.println("FALSE");
	} 
	
	//display
	static void display (int[] stack, int current_size) {
		for (int i = 0; i <(current_size); i++) {
			System.out.println(stack[i]+" ");
		}
	}
	
	//exit
	static void exit() {
		System.out.println("Programmer name: Ben Joshua Solanor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("How many elements will have the stack: ");
		int stack_size = in.nextInt();
		int current_size = 0;
		int[] stack = new int [stack_size];
		System.out.println("Stack created");
		
		int opts;
		
		do {
			System.out.println("MENU");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. TOP");
			System.out.println("4. SIZE");
			System.out.println("5. EMPTY");
			System.out.println("6. DISPLAY STACK");
			System.out.println("7. EXIT");
			System.out.println("Enter your choice");
			
			opts = in.nextInt();
			switch (opts) {
			case 1: if (current_size == stack_size) {
				System.out.println("Stack overflow");
			} else {
				stack[current_size] = push();
				current_size++;
			}
			break;
			case 2: if (current_size == 0) {
				System.out.println("The stack is empty");
			} else {
				current_size = pop(current_size);
			}
			break;
			case 3: top(stack,current_size-1);
			break;
			case 4: size(current_size-1, stack_size);
			break;
			case 5: empty(current_size-1);
			break;
			case 6: display(stack, current_size);
			break;
			case 7: exit();
			break;
			}
		} while (opts != 7);
	}
}
