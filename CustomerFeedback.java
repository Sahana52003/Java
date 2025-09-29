class CustomerFeedback 
{
    static byte feedbackID = 1;             
    static short totalWords = 25;              
    static int customerID = 1001;           
    static long orderID = 987654321L;         
    static float avgResponseTime = 1.5f;       
    static double purchaseAmount = 2500.99;     
    static char ratingChar = 'A';             
    static boolean isPositive = true;           
    static String feedback = "Great experience!";
    static String[] suggestions = {"Faster delivery", "More offers", "Better packaging"};
    public static void main(String[] args) {
        feedbackID = 2;
        totalWords = 30;
        customerID = 2002;
        orderID = 123456789L;
        avgResponseTime = 2.0f;
        purchaseAmount = 3999.50;
        ratingChar = 'B';
        isPositive = false;
        feedback = "Service could be improved.";
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Order ID: " + orderID);
        System.out.println("Word Count: " + totalWords);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Avg Response Time: " + avgResponseTime);
        System.out.println("Rating Char: " + ratingChar);
        System.out.println("Positive: " + isPositive);
        System.out.println("Feedback: " + feedback);
        System.out.println("Suggestions: " + suggestions[1]);
    }
}
