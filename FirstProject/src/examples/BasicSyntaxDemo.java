package examples;
class BasicSyntaxDemo {

	// main method
	public static void main(String[] args) {
		int[] months = { 1, 2, 3, 4 };

		System.out.println("If block");
		for (int i = 0; i < months.length; i++) {
			// Demonstrates if block
			if (months[i] == 1) {
				System.out.println("	January");
			} else if (months[i] == 2) {
				System.out.println("	February");
			} else if (months[i] == 3) {
				System.out.println("	March");
			} else {
				System.out.println("	April");
			}
		}// i

		System.out.println("switch command");
		for (int j = 0; j < months.length; j++) {
			switch (months[j]) {
			case 1:
				System.out.println("	January");
				break;
			case 2:
				System.out.println("	February");
				break;
			case 3:
				System.out.println("	March");
				break;
			default:
				System.out.println("	April");
			}
		}

	}// main

}// class
