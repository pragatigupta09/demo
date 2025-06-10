import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no.");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        System.out.println("Enter third no.");
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println("Average of three numbers is = " + average);
    }
    
}
