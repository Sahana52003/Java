class InvoiceGenerator 
{
    static byte invoiceSeries = 10;         
    static short invoiceCount = 100;            
    static int lastInvoiceNo = 1050;            
    static long totalInvoices = 98765L;         
    static float taxRate = 18.5f;            
    static double amount = 2500.99;           
    static char currency = 36;               
    static boolean isPaid = true;           
    static String customerName = "Alice";
    static String[] purchasedItems = {"Laptop", "Mouse", "Keyboard"};
    public static void main(String[] args) {
        invoiceSeries = 20;
        invoiceCount = 120;
        lastInvoiceNo = 2050;
        totalInvoices = 123456L;
        taxRate = 12.0f;
        amount = 4999.75;
        currency = 36;
        isPaid = false;
        customerName = "John";
        System.out.println("Invoice Series: " + invoiceSeries);
        System.out.println("Invoice Count: " + invoiceCount);
        System.out.println("Last Invoice No: " + lastInvoiceNo);
        System.out.println("Total Invoices: " + totalInvoices);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Paid: " + isPaid);
        System.out.println("Customer: " + customerName);
        System.out.println("Purchased Items: " + purchasedItems);
    }
}
