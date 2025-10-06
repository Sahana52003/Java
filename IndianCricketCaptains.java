class IndianCricketCaptains {
    public static void main(String[] args) {
        String[] captains = {"CK Nayudu","Lala Amarnath","Vijay Hazare","Nawab of Pataudi","Kapil Dev","Mohammad Azharuddin","Sourav Ganguly","Rahul Dravid",
            "MS Dhoni","Virat Kohli","Rohit Sharma"};
        System.out.println("Indian Cricket Team Captains:");
        for (int i = 0; i < captains.length; i++) {

              
System.out.println("=============================");

		 if (captains.length<10) {
  
		System.out.println("Captains are : "+ captains[i]);
 		
            }else{
		System.out.println("Other captains");
}
}
        

            System.out.println("IndianCricketCaptains are : " + captains[i]);
        }

        System.out.println("=======================");
        for (String captain : captains) {
            System.out.println("Captains are : " + captain);
        }
    }
}
 