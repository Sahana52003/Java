class Chatbot extends AI {
boolean isActive = true;
double accuracy = 98.7;
public void reply() {
System.out.println("Chatbot is replying smartly using " + isActive + " with accuracy " + accuracy );
}
public void assist() {
super.learn();
System.out.println("Chatbot is assisting the user" + super.isActive + "  and version " + super.version );
}
public static void main(String[] args) {
AI ai = new AI();
ai.process();
ai.learn();
Chatbot bot = new Chatbot();
bot.reply();
bot.assist();
AI system = new Chatbot();
System.out.println("AI type: " + system.isActive);
    }
}