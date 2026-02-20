class Eagle extends Bird {
    void hunt() {
        System.out.println("Eagle is hunting the bird");
    }
    public static void main(String[] args) {
        Eagle egle = new Eagle();
        egle.eat();   
        egle.fly(); 
        egle.hunt(); 
	Bird bird=egle;
	bird.fly();
	bird.eat(); 
	Animal ani=new Bird();
	ani.eat();
    }
}