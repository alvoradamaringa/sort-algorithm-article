package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.WriteFactory;

public class QuickSort implements Factory {
	public String[]time = new String[4];
	int cont=0;

	public int[] structure(int[] value) {
		long start = System.nanoTime();
		new QuickSort().ordenar(value, 0, value.length - 1);
		

		double difference = (System.nanoTime() - start)/1000000;
		String resultado = String.format("%.5f", difference);
		time[cont]=resultado;
		cont++;
		System.out.println("tempo de execução"+difference);
		System.out.println(cont +"cont");
		System.out.println(Arrays.toString(time) +" atual tempo");
		
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
	
	public void write(){
		WriteFactory write = new WriteFactory();
		write.write(time);
	}

}
