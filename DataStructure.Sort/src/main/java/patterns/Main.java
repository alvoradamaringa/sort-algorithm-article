package patterns;

import java.util.Arrays;

import methods.BubbleSortFactory;
import methods.InsertionSortFactory;
import methods.QuickSortFactory;
import methods.SelectionSortFactory;

/**
 * Mótodo que inicia a aplicação e ciclo de calculo de desempenho
 * 
 * @author BmLeonardo
 *
 */
public class Main {
	boolean condition = true;
	String[] a = null;
	String[] b = null;
	String[] c = null;
	String[] d = null;

	public void start(String file,int forQuick) {
		while (condition) {
			Factory bubble = new BubbleSortFactory();
			for (int i = 1; i < 6; i++) {
				try {
					double start = bubble.getStart();
					bubble.structure(bubble.toReader(file + i));
					double endTime = bubble.getEndTime();

					a = bubble.getDifferenceTime(endTime, start);

				} catch (StackOverflowError e) {
					System.out.println("Estouro de memória");
				}
			}

			Factory selection = new SelectionSortFactory();
			for (int i = 1; i < 6; i++) {
				try {
					double start = selection.getStart();
					selection.structure(selection.toReader(file + i));
					double endTime = selection.getEndTime();
					b = selection.getDifferenceTime(endTime, start);

				} catch (StackOverflowError e) {
					System.out.println("Estouro de memória");
				}
			}

			Factory insert = new InsertionSortFactory();
			for (int i = 1; i < 6; i++) {
				try {
					double start = insert.getStart();
					insert.structure(insert.toReader(file + i));
					double endTime = insert.getEndTime();
					c = insert.getDifferenceTime(endTime, start);

				} catch (StackOverflowError e) {
					System.out.println("Estouro de memória");
				}
			}

			Factory quick = new QuickSortFactory();
			for (int i = 1; i < forQuick; i++) {
				try {
					double start = quick.getStart();
					insert.structure(quick.toReader(file + i));
					double endTime = quick.getEndTime();
					d = quick.getDifferenceTime(endTime, start);

				} catch (StackOverflowError e) {
					System.out.println("Estouro de memória");
				}
			}

			
			System.out.println(Arrays.toString(d));
			WriteFactory write = new WriteFactory();
			write.revert(a, b, c, d);
			
			
			System.out.println("chegou ao fim da linha");
			this.condition = false;
		}
	}

	public static void main(String[] args) {
		new Main().start("orderly",6);
	}
}
