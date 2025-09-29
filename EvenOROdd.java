// write a program to check whether a given number is even or odd .
class EvenOROdd
{
public static void main(String[] args){
int[] num={2,3,6,5,8,1,9,11,34,21};
for(int n:num){
if(n%2==0)
{
System.out.println("The Number is Even : " + n);
}else{
System.out.println("The Number is Odd : " + n);
}
}
}
}