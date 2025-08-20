class PrimeNumber
{
public static void main(String[] args)
{
int n=6;
if(n%2==0){
System.out.println("Yes, it is a Prime Number");
}else{
System.out.println("It is not a PrimeNumber");
}
}
}



class Prime {
    public static void main(String[] args) {
        int[] primeValues = {2,4,6,11,14,23,28,31,36,45,67,73};
        for (int n : primeValues) {
            if (n <= 1) {
                System.out.println(" is  Prime number:" + n);
            } else {
		int j;
                for ( j = 2; j < n; j++) {
                    if (n % j == 0) {
			System.out.println(" is  Prime number:" + n);
                        break; 
                    }
                }
		
                if (j == n) {
                    System.out.println(n + " is a Prime number.");
                } else {
                    System.out.println(n + " is NOT a Prime number.");
                }
            }
        }
    }
}





class Prime {
    public static void main(String[] args) {
        int[] primeValues = {3,6,1,12,11,45,17,29,31,38,43,47,19};
		for(int i=0;i<primeValues.length;i++){
			int number=primeValues[i];
	switch(number){
                case 3:
                    System.out.println( "Yes,is a Prime Number:"+primeValues[0]);
                    break;
                case 6:
                    System.out.println("NOT a Prime Number"+primeValues[1]);
                    break;
		case 1:
                    System.out.println("NOT a Prime Number"+primeValues[2]);
                    break;
		case 12:
                    System.out.println("NOT a Prime Number"+primeValues[3]);
                    break;
		case 11:
                    System.out.println("Yes, is a Prime Number :"+primeValues[4]);
                    break;
		case 45:
                    System.out.println("Not a Prime Number"+primeValues[5]);
                    break;
		case 17:
                    System.out.println("Yes a Prime Number"+primeValues[6]);
                    break;
		case 29:
                    System.out.println("NOT a Prime Number"+primeValues[7]);
                    break;
	}
}
        }
}
