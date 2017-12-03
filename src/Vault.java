import javax.swing.JOptionPane;

public class Vault {
	private int secretcode = 102345;

	Vault() {

	}

	boolean trycode(int guess) {
		if (secretcode == guess) {
			return true;
		} else {
			return false;
		}
	}

}
