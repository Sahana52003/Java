class Firefox extends Browser
 {
public void pinTab(){
System.out.println("can pin som imp info in the tab");
}
public static void main(String[] args){
Browser browser = new Chrome();
browser.open();
Chrome chrome=(Chrome)browser;
chrome.installExtension();
Browser bro=new Firefox();
bro.open();
Firefox ff=(Firefox)bro;
ff.pinTab();
}
}