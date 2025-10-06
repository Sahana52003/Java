14. What do you mean by array and example to print array elements in reverse order.

			class ReversedOrder
			{
			public static void main(String[] args){
			int[] arr={4,2,1,6,7,8};
			for(int i=arr.length-1;i>=0;i--){
			System.out.print("Reversed order : " + arr[i] + " , " );
			}
			}
			}

9. program to print default values of all datatypes.
class Car
{
static int price;
static byte num;
static short values;
static long phoneNumber;
static double cost;
static float val;
static char a;
static boolean isAvailable;
static String name;
public static void main(String[] args){
System.out.println(price);
System.out.println(num);
System.out.println(values);
System.out.println(phoneNumber);
System.out.println(cost);
System.out.println(val);
System.out.println(a);
System.out.println(isAvailable);
System.out.println(name);
}
}

12. Example for method with return type.
		class Mobile{
		public static String productNames(){
		System.out.println("The products are ....");
		return "Vivo";
		}
		public static void main(String[] args){
		System.out.println(productNames());
		}
		}


13. Example for parameterized variable.
	class Car{
	public static void carName(String name){
	System.out.prinltn("The brand Name is .... " + name);
	}
	public static void amount(int price){
	System.out.println("The Car price are ......" + price);
	}
	public static void main(String[] args){
	carName("KN");
	amount(2800);
	}
	}		