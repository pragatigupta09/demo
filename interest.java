import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        double principal=sc.nextDouble();
        System.out.println("Enter rate");
        double rate=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        double simple_interest=(principal*rate*time)/100;
        System.out.println("Volume is = " + simple_interest);
    }
    
}
