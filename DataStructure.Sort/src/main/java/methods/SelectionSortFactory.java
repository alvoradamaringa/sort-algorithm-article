package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.ReadFactory;
import patterns.WriteFactory;

public class SelectionSortFactory implements Factory {
	public String[] time = new String[5];
	int cont = 0;

	/** m�todo para iniciar o calculo de tempo */
	public double getStart() {
		double start = System.nanoTime();
		return start;
	}

	public int[] structure(int[] value) {
		for (int fixo = 0; fixo < value.length - 1; fixo++) {
			int menor = fixo;
			for (int i = fixo + 1; i < value.length; i++) {
				if (value[i] < value[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int aux = value[fixo];
				value[fixo] = value[menor];
				value[menor] = aux;
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
		return read.converts(read.read(path + ".txt"));
	}
}
