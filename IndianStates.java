class IndianStates {
    public static void main(String[] args) {
        String[] states = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
            "Chhattisgarh", "Goa", "Gujarat", "Haryana",
            "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala",
            "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya",
            "Mizoram", "Nagaland", "Odisha", "Punjab",
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
            "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };
        System.out.println("Indian States :");
        for (int i = 0; i < states.length; i++) {
            System.out.println("IndianStates are : "+ states[i]);
        }
        System.out.println("=====================:");
        for (String state : states) {
            System.out.println("States are : " + state);
        }
    }
}
