//3. write a program to print array elements in reversed order using for loop .
class ReversedOrder {
public static void main(String[] args) {
int[] num={1, 2, 3, 4, 6};
for (int i=num.length-1;i>=0;i--) {
System.out.print("The reversed ordered numbers are: " + num[i] + " ");
}
}
}