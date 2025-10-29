import java.util.Arrays;
class Biryani {
public static void main(String[] args){
String[] ingredients={"Basmati Rice","Chicken","Red Chili","Garlic","Onions","Oil","Yogurt","Water","Whole Spices","Saffron"};
System.out.println("The ingredients for Biryani are : " + ingredients[0]);
System.out.println("The ingredients for Biryani are : " + ingredients[1]);
System.out.println("The ingredients for Biryani are : " + ingredients[2]);
System.out.println("The ingredients for Biryani are : " + ingredients[3]);
System.out.println("The ingredients for Biryani are : " + ingredients[4]);
System.out.println("The ingredients for Biryani are : " + ingredients[5]);
System.out.println("The ingredients for Biryani are : " + ingredients[6]);
System.out.println("The ingredients for Biryani are : " + ingredients[7]);
System.out.println("The ingredients for Biryani are : " + ingredients[8]);
System.out.println("The ingredients for Biryani are : " + ingredients[9]);
System.out.println("The ingredients for Biryani are : " + ingredients.length);

System.out.println("The ingredients for Biryani are : " + ingredients[0,3]);

System.out.println("The ingredients for Biryani are : " +  Arrays.toString(ingredients));
}
}