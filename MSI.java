class MSI{
public static void main(String[] args)
{
String Brand="MSI";
Brand ="MSI Modern 14";
byte size =4;
size=124;
short sizeV=376;
sizeV=3426;
int valueName=36678;
valueName=2465;
long size1=14547904567l;
size1=57763434545l;
float sizeName=866546754.2343f;
sizeName=573456765.2232f;
double price=253248744.87546;
price=47234565562.234;
char names='Z';
names='T';
char nameV=86;
nameV=45;
Boolean isValid=true;
isValid=false;
System.out.println("The brand of HP is : " + Brand);
System.out.println("The byte size of brand is : " + size);
System.out.println("The sizeV of brand is : " + sizeV);
System.out.println("The valueName of brand is : " + valueName);
System.out.println("The size1 of  brand is : " + size1);
System.out.println("The sizeName of  brand is : " + sizeName);
System.out.println("The price of  brand is : " + price);
System.out.println("The names of  brand is : " + names);
System.out.println("The nameV of  brand is : " + nameV);
System.out.println("The brand is  isvalid : " + isValid);

        if (size1>price) {
            System.out.println("The MSI is greater than price value");
        } else {
            System.out.println("The MSI not equal");
        }

        if (sizeV == nameV) {
            System.out.println("The sizeV is same has nameV ");
        } else {
            System.out.println("The sizeV has a different value.");
        }

}
}