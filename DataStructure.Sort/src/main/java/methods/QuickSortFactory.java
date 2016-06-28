package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.ReadFactory;
import patterns.WriteFactory;

public class QuickSortFactory implements Factory {
	public String[] time = new String[5];
	int cont = 0;

	/** m�todo para iniciar o calculo de tempo */
	public double getStart() {
		double start = System.nanoTime();
		return start;
	}
	
	public int[] structure(int[] value) {
		new QuickSortFactory().ordenar(value, 0, value.length - 1);
		return value;
	}

	public void ordenar(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separa(vetor, inicio, fim);
			ordenar(vetor, inicio, posicaoPivo - 1);
			ordenar(vetor, posicaoPivo + 1, fim);
		}
	}

	public int separa(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];

		for (int i = inicio + 1; i <= fim;) {
			if (vetor[i] <= pivo) {
				i++;
			} else if (pivo < vetor[fim]) {
				fim--;
			} else {
				int troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
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
