import java.util.Scanner;

public class sum {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no:");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is=" + sum);
    }
    
}
