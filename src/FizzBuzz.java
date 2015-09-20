
public class FizzBuzz {
    void fizzBuzz(){
        String f= "Fizz";
        String b= "Buzz";
        for (int n = 1; n < 100; n++) {
            if((n % 3!= 0) && (n % 5 != 0)){
                System.out.println(n);
            }
            else if((n % 3 == 0) && (n % 5 == 0)){
                System.out.println(f+b);
            }
            else if(n % 3 == 0) {
                System.out.println(f);
            }
            else{
                System.out.println(b);
            }
        }

    }
    public static void main(String[] args) {
        FizzBuzz FB = new FizzBuzz();
        FB.fizzBuzz();
    }
}
