import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numner : ");
		int num =scan.nextInt();
		
		 int rem ,revs=0, temp = num;
		
		 while(num !=0) {
			 rem = num % 10;
			 revs =(revs*10)+rem;
			 num= num / 10;
			 
		 }
		
		if(temp==revs) {
			System.out.println("Its Palindrome :"+ num);
		}
		else {
			System.out.println("Its not a Palindrome :" +num);
			
		}

	}

}
