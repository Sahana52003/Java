class Nurse extends HospitalStaff {
 @Override 
public void updateReport() { 
System.out.println("updating medical report"); 
}
  @Override 
public void appointment() { 
System.out.println("Nurse scheduling appointment for patient"); 
}
}