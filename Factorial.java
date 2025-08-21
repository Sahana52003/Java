class Factorial {
    public static void main(String[] args) {
         int n = 5;            
         int fact = n; 
	for (int i = n-1; i>=1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}  
             



class Factorial {
    public static void main(String[] args) {
        int n = 5; 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact); 
	}
}
