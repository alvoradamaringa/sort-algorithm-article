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
	
	
	public void imprimir(StringBuilder teste){
		System.out.println(teste);
	}
	

	public void html(String[][]ordenado,int cont) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("<html>");
		builder.append("<head>");
		builder.append("<meta charset='utf-8'>");
		builder.append("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
		builder.append("</head>");
		builder.append("<body>");
		builder.append("<h1>Sort algorithm - Teste de eficiencia</h1>");
		builder.append("<p>");
		builder.append("Estrutura feita, para defesa do artigo, na disciplina de");
		builder.append("<strong>");
		builder.append("ESTRUTURA DE DADOS II.");
		builder.append("</strong>");
		builder.append("</p>");
		builder.append("<p>");
		builder.append("Com intuito de testar a eficiencia dos algoritmos de ornação");
		builder.append("</p>");
		builder.append("<p>");
		builder.append("<i>");
		builder.append("Professor Ministrador: Altieres de Mattos");
		builder.append("</i>");
		builder.append("</p>");
		builder.append("<h2>");
		builder.append("Algoritmos utilizados");
		builder.append("</h2>");
		builder.append("<li>");
		builder.append("Bubble Sort");
		builder.append("</li>");
		builder.append("<li>");
		builder.append("Selection Sort");
		builder.append("<li>");
		builder.append("Insert Sort");
		builder.append("</li>");
		builder.append("<li>");
		builder.append("Quick Sort");
		builder.append("</li>");
		builder.append("</ul>");
		builder.append("<h2>");
		builder.append("Informações extras");
		builder.append("</h2>");
		builder.append("<p>");
		builder.append("Os Teste foram executados em um maquina com processador Core i3, com 4 gigas de memória.");
		builder.append("<br>");
		builder.append("Todos os teste foram calculados em Mille segundo, o tempo pode sofrer alterações dependendo das configurações do computador, que está sendo utiliado.");
		builder.append("</p>");
		builder.append("<p>");
		builder.append("Os Métodos de leitura de arquivo e gravação desconsiderados do calculo no tempo de execução");
		builder.append("</p>");
		builder.append("<h2>");
		builder.append("Resultados dos testes de desempenhos");
		builder.append("</h2>");
		
		/**tabela ordenado*/
		if(cont == 0){
		builder.append("<table>");
		builder.append("<caption>");
		builder.append("Arquivos Ordenados");
		builder.append("</caption>");
		builder.append("<thead>");
		
		builder.append("<tr>");
		builder.append("<th></th>");
		builder.append("<th>10</th>");
		builder.append("<th>100</th>");
		builder.append("<th>1000</th>");
		builder.append("<th>10000</th>");
		builder.append("<th>100000</th>");
		builder.append("</tr>");
		
		builder.append("</thead>");
		builder.append("<tbody>");
		
		builder.append("<tr>");
		builder.append("<td>Bubble Sort</td>");
		
	
		builder.append("<td>"+ordenado[0][0]+"</td>");
		builder.append("<td>"+ordenado[0][1]+"</td>");
		builder.append("<td>"+ordenado[0][2]+"</td>");
		builder.append("<td>"+ordenado[0][3]+"</td>");
		builder.append("<td>"+ordenado[0][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Selection Sort</td>");
		builder.append("<td>"+ordenado[1][0]+"</td>");
		builder.append("<td>"+ordenado[1][1]+"</td>");
		builder.append("<td>"+ordenado[1][2]+"</td>");
		builder.append("<td>"+ordenado[1][3]+"</td>");
		builder.append("<td>"+ordenado[1][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Insert Sort</td>");
		builder.append("<td>"+ordenado[2][0]+"</td>");
		builder.append("<td>"+ordenado[2][1]+"</td>");
		builder.append("<td>"+ordenado[2][2]+"</td>");
		builder.append("<td>"+ordenado[2][3]+"</td>");
		builder.append("<td>"+ordenado[2][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Quick Sort</td>");
		builder.append("<td>"+ordenado[3][0]+"</td>");
		builder.append("<td>"+ordenado[3][1]+"</td>");
		builder.append("<td>"+ordenado[3][2]+"</td>");
		builder.append("<td>"+ordenado[3][3]+"</td>");
		builder.append("<td>"+ordenado[3][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("</tbody>");
		builder.append("</table>");

		}
		
		/**tabela desordenado*/
		if(cont==1){
		builder.append("<table>");
		builder.append("<caption>");
		builder.append("Arquivos Desordenado");
		builder.append("</caption>");
		builder.append("<thead>");
		
		builder.append("<tr>");
		builder.append("<th></th>");
		builder.append("<th>10</th>");
		builder.append("<th>100</th>");
		builder.append("<th>1000</th>");
		builder.append("<th>10000</th>");
		builder.append("<th>100000</th>");
		builder.append("</tr>");
		
		builder.append("</thead>");
		builder.append("<tbody>");
		
		builder.append("<tr>");
		builder.append("<td>Bubble Sort</td>");
		
		builder.append("<td>"+ordenado[0][0]+"</td>");
		builder.append("<td>"+ordenado[0][1]+"</td>");
		builder.append("<td>"+ordenado[0][2]+"</td>");
		builder.append("<td>"+ordenado[0][3]+"</td>");
		builder.append("<td>"+ordenado[0][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Selection Sort</td>");
		builder.append("<td>"+ordenado[1][0]+"</td>");
		builder.append("<td>"+ordenado[1][1]+"</td>");
		builder.append("<td>"+ordenado[1][2]+"</td>");
		builder.append("<td>"+ordenado[1][3]+"</td>");
		builder.append("<td>"+ordenado[1][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Insert Sort</td>");
		builder.append("<td>"+ordenado[2][0]+"</td>");
		builder.append("<td>"+ordenado[2][1]+"</td>");
		builder.append("<td>"+ordenado[2][2]+"</td>");
		builder.append("<td>"+ordenado[2][3]+"</td>");
		builder.append("<td>"+ordenado[2][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Quick Sort</td>");
		builder.append("<td>"+ordenado[3][0]+"</td>");
		builder.append("<td>"+ordenado[3][1]+"</td>");
		builder.append("<td>"+ordenado[3][2]+"</td>");
		builder.append("<td>"+ordenado[3][3]+"</td>");
		builder.append("<td>"+ordenado[3][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("</tbody>");
		builder.append("</table>");
		}
		
		/**tabela inversa*/
		if(cont==2){
		builder.append("<table>");
		builder.append("<caption>");
		builder.append("Arquivos ao inverso");
		builder.append("</caption>");
		builder.append("<thead>");
		
		builder.append("<tr>");
		builder.append("<th></th>");
		builder.append("<th>10</th>");
		builder.append("<th>100</th>");
		builder.append("<th>1000</th>");
		builder.append("<th>10000</th>");
		builder.append("<th>100000</th>");
		builder.append("</tr>");
		
		builder.append("</thead>");
		builder.append("<tbody>");
		
		builder.append("<tr>");
		builder.append("<td>Bubble Sort</td>");
		
		builder.append("<td>"+ordenado[0][0]+"</td>");
		builder.append("<td>"+ordenado[0][1]+"</td>");
		builder.append("<td>"+ordenado[0][2]+"</td>");
		builder.append("<td>"+ordenado[0][3]+"</td>");
		builder.append("<td>"+ordenado[0][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Selection Sort</td>");
		builder.append("<td>"+ordenado[1][0]+"</td>");
		builder.append("<td>"+ordenado[1][1]+"</td>");
		builder.append("<td>"+ordenado[1][2]+"</td>");
		builder.append("<td>"+ordenado[1][3]+"</td>");
		builder.append("<td>"+ordenado[1][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Insert Sort</td>");
		builder.append("<td>"+ordenado[2][0]+"</td>");
		builder.append("<td>"+ordenado[2][1]+"</td>");
		builder.append("<td>"+ordenado[2][2]+"</td>");
		builder.append("<td>"+ordenado[2][3]+"</td>");
		builder.append("<td>"+ordenado[2][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Quick Sort</td>");
		builder.append("<td>"+ordenado[3][0]+"</td>");
		builder.append("<td>"+ordenado[3][1]+"</td>");
		builder.append("<td>"+ordenado[3][2]+"</td>");
		builder.append("<td>"+ordenado[3][3]+"</td>");
		builder.append("<td>"+ordenado[3][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("</tbody>");
		builder.append("</table>");
		}
		/**tabela left*/
		
		if(cont==3){
		builder.append("<table>");
		builder.append("<caption>");
		builder.append("Arquivos desordenado 10% a direita");
		builder.append("</caption>");
		builder.append("<thead>");
		
		builder.append("<tr>");
		builder.append("<th></th>");
		builder.append("<th>10</th>");
		builder.append("<th>100</th>");
		builder.append("<th>1000</th>");
		builder.append("<th>10000</th>");
		builder.append("<th>100000</th>");
		builder.append("</tr>");
		
		builder.append("</thead>");
		builder.append("<tbody>");
		
		builder.append("<tr>");
		builder.append("<td>Bubble Sort</td>");
		
		builder.append("<td>"+ordenado[0][0]+"</td>");
		builder.append("<td>"+ordenado[0][1]+"</td>");
		builder.append("<td>"+ordenado[0][2]+"</td>");
		builder.append("<td>"+ordenado[0][3]+"</td>");
		builder.append("<td>"+ordenado[0][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Selection Sort</td>");
		builder.append("<td>"+ordenado[1][0]+"</td>");
		builder.append("<td>"+ordenado[1][1]+"</td>");
		builder.append("<td>"+ordenado[1][2]+"</td>");
		builder.append("<td>"+ordenado[1][3]+"</td>");
		builder.append("<td>"+ordenado[1][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Insert Sort</td>");
		builder.append("<td>"+ordenado[2][0]+"</td>");
		builder.append("<td>"+ordenado[2][1]+"</td>");
		builder.append("<td>"+ordenado[2][2]+"</td>");
		builder.append("<td>"+ordenado[2][3]+"</td>");
		builder.append("<td>"+ordenado[2][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Quick Sort</td>");
		builder.append("<td>"+ordenado[3][0]+"</td>");
		builder.append("<td>"+ordenado[3][1]+"</td>");
		builder.append("<td>"+ordenado[3][2]+"</td>");
		builder.append("<td>"+ordenado[3][3]+"</td>");
		builder.append("<td>"+ordenado[3][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("</tbody>");
		builder.append("</table>");
		}
		/**tabela right*/
		
		if(cont ==4){
		builder.append("<table>");
		builder.append("<caption>");
		builder.append("desordenado 10% a esquerda");
		builder.append("</caption>");
		builder.append("<thead>");
		
		builder.append("<tr>");
		builder.append("<th></th>");
		builder.append("<th>10</th>");
		builder.append("<th>100</th>");
		builder.append("<th>1000</th>");
		builder.append("<th>10000</th>");
		builder.append("<th>100000</th>");
		builder.append("</tr>");
		
		builder.append("</thead>");
		builder.append("<tbody>");
		
		builder.append("<tr>");
		builder.append("<td>Bubble Sort</td>");
		
		builder.append("<td>"+ordenado[0][0]+"</td>");
		builder.append("<td>"+ordenado[0][1]+"</td>");
		builder.append("<td>"+ordenado[0][2]+"</td>");
		builder.append("<td>"+ordenado[0][3]+"</td>");
		builder.append("<td>"+ordenado[0][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Selection Sort</td>");
		builder.append("<td>"+ordenado[1][0]+"</td>");
		builder.append("<td>"+ordenado[1][1]+"</td>");
		builder.append("<td>"+ordenado[1][2]+"</td>");
		builder.append("<td>"+ordenado[1][3]+"</td>");
		builder.append("<td>"+ordenado[1][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Insert Sort</td>");
		builder.append("<td>"+ordenado[2][0]+"</td>");
		builder.append("<td>"+ordenado[2][1]+"</td>");
		builder.append("<td>"+ordenado[2][2]+"</td>");
		builder.append("<td>"+ordenado[2][3]+"</td>");
		builder.append("<td>"+ordenado[2][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("<tr>");
		builder.append("<td>Quick Sort</td>");
		builder.append("<td>"+ordenado[3][0]+"</td>");
		builder.append("<td>"+ordenado[3][1]+"</td>");
		builder.append("<td>"+ordenado[3][2]+"</td>");
		builder.append("<td>"+ordenado[3][3]+"</td>");
		builder.append("<td>"+ordenado[3][4]+"</td>");
		builder.append("<td>s</td>");
		builder.append("</tr>");
		
		builder.append("</tbody>");
		builder.append("</table>");
		builder.append("<p><i><strong>Observações:</strong>significado <strong>Estouro de memória </strong>: (não conseguiu calcular)</i>");
		builder.append("<p>Todos os calculos são feitos em segundos e com 5 casas decimais após a vircula, número acima de 5 casas, significa que estão abaixo de segundos para executar</p>");
		builder.append("</p>");
		builder.append("</body>");
		builder.append("</html>");
		}
		
		
		

		if(cont==3){
			imprimir(builder);
		}
		
	}
}
