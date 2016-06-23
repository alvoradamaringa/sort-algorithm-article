package patterns;

public class WriteFactory {
	int cont = 0;
	String[][] arranjo = new String[4][5];
	Roadme roadme = new Roadme();
	Main menu = new Main();

	public void revert(String[] bubble, String[] selection, String[] insert,
			String[] quick) {

		for (int i = 0; i < bubble.length; i++) {
			this.arranjo[0][i] = bubble[i];
		}

		for (int i = 0; i < selection.length; i++) {
			this.arranjo[1][i] = selection[i];
		}

		for (int i = 0; i < insert.length; i++) {
			this.arranjo[2][i] = insert[i];
		}
		for (int i = 0; i < quick.length; i++) {
			this.arranjo[3][i] = quick[i];
		}

		write(this.arranjo);
	}

	public void write(String[][] arranjo) {

		for (int i = 0; i < arranjo.length; i++) {
			System.out.println();
			for (int j = 0; j <= arranjo.length; j++) {
				System.out.print(arranjo[i][j]);
			}
		}
		
	
		cont++;

		roadme.html(arranjo, cont);
		switch (cont) {
		case 1:
			menu.start("disorderly", 6);
			break;
		case 2:
			menu.start("orderReverse", 6);
			break;
		case 3:
			menu.start("percentageLeft", 6);
			break;
		case 4:
			menu.start("percentageRight", 6);
			break;
		}

	}

}
