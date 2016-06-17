package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.WriteFactory;

public class BubbleSort implements Factory {
	public String[]time = new String[5];
	int cont=0;

	public int[] structure(int[] value) {
		int aux;
		double start= System.nanoTime();
		for (int i = value.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (value[j] > value[j + 1]) {
					aux = value[j];
					value[j] = value[j + 1];
					value[j + 1] = aux;
				}
			}
		}
		

		double difference = (System.nanoTime() -start) /1000000000;
		
		String resultado = String.format("%.5f", difference);
		
		time[cont]=resultado;
		cont++;
		System.out.println("tempo de execução"+difference);
		System.out.println(cont +"cont");
		System.out.println(Arrays.toString(time) +" atual tempo");
		return value;
	}
	
	public void write(){
		WriteFactory write = new WriteFactory();
		write.write(time);
	}
	
}
