 class AlexaApp {
    String userName;
    int deviceCount;
    boolean isPremium;
    char appCode;
    public AlexaApp() {
        this("DefaultUser");  
        System.out.println(" Default Alexa user created");
    }
public AlexaApp(String userName) {
        this("V", 1); 
        System.out.println(" User name set to " + userName);
    }
public AlexaApp(String userName, int deviceCount) {
        this("pooja",3, "English");  
        System.out.println(" Device count set to " + deviceCount + " for user " + userName);
    }
public AlexaApp(String userName, int deviceCount, String language) {
        this("JK",2,"Telugu", false);  
        System.out.println("Language set to " + language + " for user " + userName);
    }
public AlexaApp(String userName, int deviceCount, String language, boolean isPremium) {
        this.userName = userName;
        this.deviceCount = deviceCount;
        this.isPremium = isPremium;
        this.appCode =appCode;
        System.out.println("Final AlexaApp object created!");
        System.out.println(" User Name: " + userName);
        System.out.println(" Device Count: " + deviceCount);
        System.out.println(" Language: " + language);
        System.out.println(" Premium User: " + isPremium);
        System.out.println(" App Code: " + appCode);
    }
}
