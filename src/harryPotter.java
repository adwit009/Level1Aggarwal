
public class harryPotter {
	

		private boolean cloakOn;
		
		harryPotter() {
			System.out.println("making Harry Potter...");
		}

		void castSpell(String spell){
	System.out.println("casting spell: " + spell);
		}

		void makeInvisible(boolean invisible) {
			this.cloakOn = invisible;
			
			if (cloakOn)
				System.out.println("Harry is invisible");
			else
				System.out.println("Harry is visible");
		}

		void spyOnSnape() {
			System.out.println("Harry sees Professor Snape doing nefarious things.");
		}

		public static void main(String[] args) {
			harryPotter h1 = new harryPotter();
			h1.makeInvisible(true);
			
			h1.spyOnSnape();
			h1.makeInvisible(false);
			h1.castSpell("stupefy");
			// 1. make harry potter
			// 2. become invisible
			// 3. spy on professor snape
			// 4. become visible again
			// 5. cast a “stupefy” spell
		
		}

	}







