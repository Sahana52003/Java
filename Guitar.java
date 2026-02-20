class Guitar extends Instrument {
@Override 
public void testSound() { 
System.out.println("Checked sound tested"); 
}
@Override
public void decorate() { 
System.out.println("Can decorate with design or sticker..");
}
@Override
public void adjustStrings(){
System.out.println("the guitar strings makes the pitch go up");
}
}