package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.WriteFactory;

public class InsertionSort implements Factory {
	public String[]time = new String[5];
	int cont=0;

	public int[] structure(int[] value) {
		int i;
		int j;
		int eleito;
		
		double start= System.nanoTime();
		for (i = 0; i < value.length; i++) {
			eleito = value[i];
			for (j = i;(j>0)&&(value[j-1]>eleito);j--) {
				value[j]=value[j-1];
			}
			value[j]= eleito;
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
