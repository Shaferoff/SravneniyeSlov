import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String a, b;
    a = sc.next();
    b = sc.next();
    if (a.equals(b)) System.out.println("Yes");
    else System.out.println("No");
    }
}