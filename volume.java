import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double radius=sc.nextDouble();
        System.out.println("Enter height");
        double height=sc.nextDouble();
        double pi=3.14;
        double volume=pi * Math.pow(radius, 2) * height;
        System.out.println(volume);
    }
}
