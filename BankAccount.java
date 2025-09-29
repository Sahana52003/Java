class BankAccount {
 static byte branchCode = 12;          
 static short atmCount = 25;           
 static int accountNumber = 100245;     
 static long accountBalance = 7500550L; 
 static float interestRate = 4456.5f;     
 static double balance = 7500.50;       
 static char accountType = 'S';        
 static boolean isActive = true;         
 static String holderName = "Bob";
 static String[] bankNames={"SBI","KBI","Canara","ICICI"};  
 public static void main(String[] args){
 holderName = "Alice";
 accountNumber = 200678;
 branchCode = 34;
 atmCount = 40;
 accountBalance = 9123456789L;
 balance = 15000.75;
 accountBalance= 1500075L;
 interestRate = 6.25f;
 accountType = 'C';
 isActive = false;
 System.out.println("------------------Bank Account Details -------------------");
 System.out.println("Account Holder: " + holderName);
 System.out.println("Account Number: " + accountNumber);
 System.out.println("Branch Code: " + branchCode);
 System.out.println("ATM Count: " + atmCount);
 System.out.println("Account Number: " + accountNumber);
 System.out.println("Account Balance : " + balance);
 System.out.println("Account Balance : " + accountBalance);
 System.out.println("Interest Rate: " + interestRate);
 System.out.println("Account Type: " + accountType);
 System.out.println("Active: " + isActive);
 System.out.println("The Bank Name are : " + bankNames[3]);
    }
}
