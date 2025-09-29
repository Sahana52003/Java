class AverageOfNumbers {
    public static void main(String[] args) {
        int[] num = {3,4,9,7,8,2};
        int sum = 0;
	for(int i=0;i<num.length;i++){
	sum=sum+num[i];
}
double average=(double)sum/num.length;
    System.out.println("Sum = " + sum);
System.out.println("=================");
 System.out.println("Average = " + average);
}
}

class AverageOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {3,4,9,7,8,2};
        int sum = 0;
        int i = 0;
        do {
          sum += numbers[i];
            i++;
        } while (i < numbers.length);
	double average = (double) sum / numbers.length;
    System.out.println("Sum = " + sum);
System.out.println("=================");
     System.out.println("Average = " + average);
    }
}

