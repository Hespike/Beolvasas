import java.util.Scanner;

public class Beolvasas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Hogy hívnak?");
        String nev = sc.nextLine();
        System.out.println("Hello " + nev + "! Hany eves vagy?");
        int kor = sc.nextInt();
        System.out.println("Hello " + nev + ", aki " + kor + " eves.");
    }
}
