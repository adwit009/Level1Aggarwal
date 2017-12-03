
public class spyRunner {
	public static void main(String[] args) {
		Vault v = new Vault();
		SecretAgent you = new SecretAgent();
		int code = you.getCode(v);
		if (code == -1) {
			System.out.println("You could not find the code. You are fired");
			System.exit(0);
		}
		if (v.trycode(code) == true) {
			System.out.println("You cracked the safe. Good job. Unlike Neel, you aren't fired.");
		}

	}
}
