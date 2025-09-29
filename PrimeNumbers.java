//4. check wheter a number is prime number or not .
class PrimeNumbers
{
public static void main(String[] args){
 int n = 3; 
        int i;
        
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}
