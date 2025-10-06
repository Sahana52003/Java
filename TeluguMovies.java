class TeluguMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Baahubali", "RRR", "Pushpa", "Arjun Reddy", 
            "Ala Vaikunthapurramuloo", "Magadheera", "Sye", 
            "Eega", "Pokiri", "Janatha Garage"};
        System.out.println("Telugu Movies :");
        for (int i = 0; i < movieNames.length; i++) {
           

            if (i < 10) {
                System.out.println("Popular Movie: " + movieNames[i]);
            } else { 
                System.out.println("Other Movie: ");

            if (i < 5) {
                System.out.println("Popular Movie: " + movieNames[i]);
            } else { 
                System.out.println("Other Movie: " + movieNames[i]);

            }
        }
        System.out.println("====================");
	int index=0;
        for (String movie : movieNames) {
           
		 System.out.println("====================");
		if(index<6){
		System.out.println("Movie Name are : " + movie);
		index++;
    } 		
		
	}
}
}