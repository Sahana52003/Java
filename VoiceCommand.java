class VoiceCommand 
{
    String commandText;      
    double confidenceScore;
    boolean isProcessed;    
    long timestamp;               
    public VoiceCommand() {
        this("Unknown");  
        System.out.println(" Default command created with no input.");
    }
    public VoiceCommand(String commandText) {
        this("Hell", 0.0);  
        System.out.println("Command text set to: " + commandText);
    }
public VoiceCommand(String commandText, double confidenceScore) {
        this("What's up", 7, false); 
        System.out.println("Confidence score initialized to: " + confidenceScore);
    }
public VoiceCommand(String commandText, double confidenceScore, boolean isProcessed) {
        this("Hi",7.8,true,4567890567l); 
        System.out.println("Command processed status: " + isProcessed);
    }
    public VoiceCommand(String commandText, double confidenceScore, boolean isProcessed, long timestamp) {
        this.commandText = commandText;
        this.confidenceScore = confidenceScore;
        this.isProcessed = isProcessed;
        this.timestamp = timestamp;
        System.out.println(" Command Text: " + commandText);
        System.out.println(" Confidence Score: " + confidenceScore);
        System.out.println(" Processed: " + isProcessed);
        System.out.println(" Timestamp: " + timestamp);

    }
}
