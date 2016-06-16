package patterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Roadme {

	@SuppressWarnings("resource")
	public StringBuilder read() {
		FileReader fr;
		StringBuilder html= new StringBuilder();
		try {
			File file = new File(
					"F:/workspace/sort-algorithm-article/README.md");
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			
			
			 String line;

	            while( (line = reader.readLine()) != null ) {
	            	html.append(line);
	            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return html;

	}

	public void html() {
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
		builder.append("<\\html>");
		System.out.println(builder);
	}

	public static void main(String[] args) {
		new Roadme().html();
		System.out.println(new Roadme().read());
		
	}
}
