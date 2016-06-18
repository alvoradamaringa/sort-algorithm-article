package patterns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteFactory{
	FileWriter file;
	BufferedWriter buf;
	int value = 0;

	public void write(String[] collection) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe o nome do arquivo deseja gerar");
		String name = scanner.next();
		try {
			file = new FileWriter(name + ".txt");
			buf = new BufferedWriter(file);
			for (int i = 0; i < collection.length; i++) {
				buf.write(collection[i]);
				buf.write(",");
			}
			buf.close();
			System.out.println("Pronto esta salvo:");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
