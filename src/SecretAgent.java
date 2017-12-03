
public class SecretAgent {

	int getCode(Vault v) {
		for (int i = 0; i < Integer.MAX_VALUE ; i++) {
			if (v.trycode(i) == true) {
				
				return i;
			}

		}
		return -1;
	}
}
