import java.util.Scanner;

/**
 * Created by kusumi on 06/08/15.
 */
public class TriangleExercise {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j =0; j < n; j++){
                if(j < i){
                    System.out.print("*");
                }
            }
            System.out.println("*");
        }

    }
}
