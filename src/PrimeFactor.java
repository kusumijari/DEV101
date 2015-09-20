import java.util.Scanner;

public class PrimeFactor {
    void generate(int n){
        for (int i=2; i < n; i++){
            int c=0;
            for (int j = 2; j < i/2; j++) {
                if(i % j == 0 )
                    c++;
            }
            if(c== 0 && ( n % i == 0)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        PrimeFactor PF = new PrimeFactor();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = S.nextInt();
        PF.generate(n);
    }

}
