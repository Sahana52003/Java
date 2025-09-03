class Company {
static String name="Infosys";
static String location="Bangalore";
static int employees=250000;
static String industry="IT Services";
static int establishedYear=1981;
public static void displayCompanyName() {
System.out.println("The company name is : " + name);
showLocation();
}
public static void showLocation() {
System.out.println("Th Company was Located in : " + location);
revealEmployeeCount();
}
public static void revealEmployeeCount() {
System.out.println("In Company the Total employees are : " + employees);
provideIndustryInfo();
}
public static void provideIndustryInfo() {
System.out.println("Industry is  : " + industry);
highlightEstablishedYear();
}
public static void highlightEstablishedYear() {
System.out.println("Where the comapny was  Established in : " + establishedYear);
}
public static void main(String[] args) {
displayCompanyName();
    }
}
