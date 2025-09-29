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
}
