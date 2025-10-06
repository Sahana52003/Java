
//write a program to print fibonacci series upto 10 numbers .
class FibonacciSeries
{
public static void main(String[] args){
int num=10;
int first=0;
int second=1;
for(int i=0;i<=num;i++){
System.out.println("The Fibonacci Series are : ");
System.out.println(first+" ");
int nextNumber=first+second;
first=second;
second=nextNumber;
}
}

class FibonacciSeries 
{
    public static void main(String[] args) {
     int n=20;
      int first=0,second=1;
     System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i=1;i<=n;i++) {
        System.out.print(first + " ");
            int next=first+second;
            first=second;
            second=next;
        }
    }

}
