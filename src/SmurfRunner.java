
public class SmurfRunner {
public static void main(String[] args) {
Smurf hi = new Smurf("Handy");
String hi1 = hi.getName();
System.out.println(hi1);
hi.eat();
Smurf hi2 = new Smurf("Papa");
String hi3 = hi2.getName();
System.out.println(hi3);
String whole = hi2.getHatColor();
System.out.println(whole);
System.out.println("I am a "+ hi2.isGirlOrBoy());
Smurf h4 = new Smurf("Smurfette");
String hi5 = h4.getName();
System.out.println(hi5);
String whole1 = h4.getHatColor();
System.out.println(whole1);
System.out.println("I am a "+ h4.isGirlOrBoy());
}
}
