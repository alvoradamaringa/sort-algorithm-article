package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.ReadFactory;
import patterns.WriteFactory;

public class InsertionSortFactory implements Factory {
	public String[] time = new String[5];
	int cont = 0;

	public double getStart() {
		double start = System.nanoTime();
		return start;
	}

	public int[] structure(int[] value) {
		int i;
		int j;
		int eleito;

		for (i = 0; i < value.length; i++) {
			eleito = value[i];
			for (j = i; (j > 0) && (value[j - 1] > eleito); j--) {
				value[j] = value[j - 1];
			}
			value[j] = eleito;
		}

		return value;
	}

	/** Calculo do tempo final do processo */
	public double getEndTime() {
		double endStart = System.nanoTime();
		return endStart;
	}

	/** calcula o tempo de execução 
	 * @return */
	public String[] getDifferenceTime(double endTime, double start) {
		double difference = (endTime - start) / 1000000000;

		String resultado = String.format("%.5f", difference);
		time[cont] = resultado;
		cont++;
		
		return time;
	}


	/** le os arquivos com os dados */
	public int[] toReader(String path) {
		ReadFactory read = new ReadFactory();
		return read.converts(read.read(path + ".txt"));
	}
}
