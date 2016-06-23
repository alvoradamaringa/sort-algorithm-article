package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.ReadFactory;
import patterns.WriteFactory;

public class BubbleSortFactory implements Factory {
	public String[] time = new String[5];
	int cont = 0;

	/** m�todo para iniciar o calculo de tempo */
	public double getStart() {
		double start = System.nanoTime();
		return start;
	}

	/** estrutura de ordenação */
	public int[] structure(int[] value) {
		int aux;
		for (int i = value.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (value[j] > value[j + 1]) {
					aux = value[j];
					value[j] = value[j + 1];
					value[j + 1] = aux;
				}
			}
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
		return read.converts(read.read(path+".txt"));
	}

}
