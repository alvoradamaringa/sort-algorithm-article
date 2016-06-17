package patterns;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import methods.Create;

public class WriteFactory extends Create {
	FileWriter file;
	BufferedWriter buf;
	int value = 0;

	// public void collection(int size) {
	// while (size <= 1000000) {
	// int[] sequence = orderly(size);
	// transform(sequence);
	// size = size * 10;
	//
	// }
	//
	// }
//	public void transform(String[] value) {
//		String[] convert = new String[value.length];
//		for (int i = 0; i < value.length; i++) {
//			convert[i] = String.valueOf(value[i]);
//		}
//		this.value = this.value + 1;
//		write(convert);
//	}

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
