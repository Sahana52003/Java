class UsersProfile 
{
    String userName;
    int age;
    String email;
    boolean isPremium;
    String preferredLanguage;

    public UsersProfile() {
        this("Guest");
        System.out.println("Default user profile created.");
    }

    public UsersProfile(String userName) {
        this("Nandu", 25);
        System.out.println("User name set to: " + this.userName);
    }

    public UsersProfile(String userName, int age) {
        this("Mukki", 22, "guest@example.com");
        System.out.println("Age set to: " + this.age);
    }

    public UsersProfile(String userName, int age, String email) {
        this("Ram",23,"ramtyuio45678@gmail.coom", false);
        System.out.println("Email set to: " + this.email);
    }

    public UsersProfile(String userName, int age, String email, boolean isPremium) {
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.isPremium = isPremium;
        this.preferredLanguage =preferredLanguage;
        System.out.println(" User Name: " + userName);
        System.out.println(" Age: " + age);
        System.out.println(" Email: " + email);
        System.out.println(" Premium: " + isPremium);
        System.out.println(" Preferred Language: " + preferredLanguage);
    }
}
