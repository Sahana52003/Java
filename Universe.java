
class Universe
 {

class Universe {

    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        boolean[] isAvailable = {true, false, true, true, false};
        System.out.println("Iterating planets with while loop:");
        int i = 0;
        while (i < planets.length) {
            System.out.println("The UNIVERSE of planets names are : " + planets[i]);
            i++;
        }
        System.out.println("--------------------------------");

       int j=0;
        do {
            System.out.println("The index : " + j + " and Universe : " + isAvailable[j]);
           j++;

        int j = 0;
        do {
            System.out.println("The index : " + j + " and Universe : " + isAvailable[j]);
            j++;

        } while (j<isAvailable.length);
    }
}
