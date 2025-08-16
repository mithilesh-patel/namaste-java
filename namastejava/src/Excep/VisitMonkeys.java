package Excep;

public class VisitMonkeys {

	public static void main(String[] args) throws Exception {

		try {
			seeAnimal();

		} catch (MonkeysOutForWalk e) {
			// TODO: handle exception
			System.out.println("Try again later");
		} catch (ExhibitClosedForLunch e) {
			System.out.println("Try again later");

		} catch (ExhibitClosed e) {
			// TODO: handle exception
			System.out.println("Try again tomorrow");
		}

	}

	static void seeAnimal() {
		boolean ExhibitClosed = false;
		boolean MonkeysVisible = false;
		int TotalNumberOfMonkeys = 4;
		int NumberOfMonkeysOutForWalk = 2;
		int NumberOfMonkeysInTheCage = TotalNumberOfMonkeys - NumberOfMonkeysOutForWalk;

		
		
		if (NumberOfMonkeysInTheCage <= 0) {

			throw new MonkeysOutForWalk();
		}

		if (NumberOfMonkeysInTheCage > 0 && MonkeysVisible) {

			throw new ExhibitClosedForLunch();
		}



		System.out.println("See these are the monkeys");
	}
}

class MonkeysOutForWalk extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class ExhibitClosed extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class ExhibitClosedForLunch extends ExhibitClosed {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
