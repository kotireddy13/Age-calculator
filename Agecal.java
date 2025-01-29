import java.util.Scanner;

public class Agecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter current year:");
        int year = sc.nextInt();
        System.out.println("enter birth year: ");
        int birthyear = sc.nextInt();
        int age = year-birthyear;
        System.out.println("Age ="+age);
    }
}
