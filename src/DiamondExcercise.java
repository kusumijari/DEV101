import java.util.Scanner;

public class DiamondExcercise {
    public static void main(String[] args) {
        DiamondExcercise diamondExcercise = new DiamondExcercise();
        System.out.println("Printing isoceles traingle");
        diamondExcercise.isoceles();
        System.out.println("Printing diamond");
        diamondExcercise.diamond();
        System.out.println("Printing diamond with name");
        diamondExcercise.diamondWithName();
    }

    public void isoceles() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1 ; i < n * 2 + 1; i += 2){
            for(int j = 0 ; j < n - i /2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public void diamond() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1 ; i < n * 2 + 1; i += 2){
            for(int j = 0 ; j < n - i /2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for(int i = n * 2 - 3  ; i > 0; i -= 2){
            for(int j = 0 ; j < n - i /2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public void diamondWithName() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i =1 ; i < n * 2 - 1; i += 2){
            for(int j = 0 ; j < n - i /2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("Kusum");

        for(int i = n * 2 - 3 ; i > 0; i -= 2){
            for(int j = 0 ; j < n - i /2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < i; j ++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
