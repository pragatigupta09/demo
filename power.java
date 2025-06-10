import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        int base=sc.nextInt();
        System.out.println("Enter exponent");
        int exponent=sc.nextInt();
        int power=(int)Math.pow(base, exponent);
        System.out.println("Power is = " + power);
    }
    
}
