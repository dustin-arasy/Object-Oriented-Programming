package Session1;

import java.util.Scanner;

public class Welcome {
    public static void main (String[] args){
        System.out.println("Session1.Welcome to Java!");
        int a = 10;
        System.out.println("A = " + a);
        double b = 22/7.0;
        System.out.printf("B = %.2f\n", b);
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Name = " + name);
        switch (name){
            case "Daniel":
                System.out.println("Selamat Pagi!"); break;
            default:
                System.out.println("Selamat Siang!");
        }
        int c = scan.nextInt();
        System.out.println(" C = " + c);
        for (int i = 0; i < c; i++) {
            System.out.println("loop");
        }
    }
}
