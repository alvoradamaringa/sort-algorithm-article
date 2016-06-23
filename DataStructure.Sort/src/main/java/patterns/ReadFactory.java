package patterns;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFactory {
 /**método para ler os arquivos gerados*/
	public String[] read(String path) {
		String[] group = null;
		try {
			Path byway = Paths.get(path);
			byte[] bytes = Files.readAllBytes(byway);
			String orderly = new String(bytes);
			group = orderly.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return group;

	}

	/**converte os métodos de String para inteiro*/
	public int[] converts(String[] group) {

		int[] entire = new int[group.length];
		for (int i = 0; i < entire.length; i++) {
			entire[i] = Integer.parseInt(group[i]);
		}
		return entire;
	}

}
