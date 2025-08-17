class TeluguMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Baahubali", "RRR", "Pushpa", "Arjun Reddy", 
            "Ala Vaikunthapurramuloo", "Magadheera", "Sye", 
            "Eega", "Pokiri", "Janatha Garage"};
        System.out.println("Telugu Movies :");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }

        System.out.println("====================");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }
    }
}

