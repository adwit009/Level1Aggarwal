
public class Driver {
	public static void main(String[] args) {
		SeaCreatures patrick = new SeaCreatures("Spongebob");
		String patrick1 = "";
		patrick1 = patrick.getName();;
		System.out.println(patrick1);
		patrick.eat();
		patrick.laugh();
		SeaCreatures squid = new SeaCreatures("Squidward");
		
		patrick1 = squid.getName();;
		System.out.println(patrick1);
		squid.eat();
		squid.laugh();
		SeaCreatures pat = new SeaCreatures("Patrick");
		
		patrick1 = pat.getName();;
		System.out.println(patrick1);
		pat.eat();
		pat.laugh();
	pat.die();
	}
}
