package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.WriteFactory;

public class SelectionSort implements Factory{
	public String[]time = new String[5];
	int cont=0;

	public int[] structure(int[] value) {
		double start= System.nanoTime();
		for (int fixo = 0; fixo < value.length-1; fixo++) {
			int menor = fixo;
			for (int i = fixo+1; i < value.length; i++) {
				if (value[i] < value[menor]) {
					menor = i;
				}
			}
			if (menor!= fixo) {
				int aux = value[fixo];
				value[fixo] = value[menor];
				value[menor] = aux;
			}
		}

		double difference = (System.nanoTime() - start)/1000000;
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
