

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="">
</head>
<body>
	<h1>Sort algorithm - Teste de eficiencia</h1>
	<p>
		Estrutura feita, para defesa do artigo, na disciplina de <strong>ESTRUTURA DE DADOS II.</strong>
	</p>
	<p>Com intuito de testar a eficiencia dos algoritmos de ornação</p>
	<p><i>Professor Ministrador: Altieres de Mattos</i></p>
	<h2>Algoritmos utilizados</h2>
	<ul>
		<li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/bubble-sort.php">Bubble Sort</a></li>
		<li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/selection-sort.php">Selection Sort</a></li>
		<li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/insertion-sort.php">Insert Sort</a></li>
		<li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/quick-sort.php">Quick Sort</a></li>
	</ul>
	<h2>Informações extras</h2>
	<p>Os Teste foram executados em um maquina com processador Core i3, com 4 gigas de memória.<br>
		Todos os teste foram calculados em Mille segundo, o tempo pode sofrer alterações dependendo das configurações do computador, que está sendo utiliado.</p>
		<p>Os Métodos de leitura de arquivo e gravação desconsiderados do calculo no tempo de execução</p>
		<h2>Resultados dos testes de desempenhos</h2>
		<table>
			<caption>Arquivos Ordenados</caption>
			<thead>
				<tr>
					<th></th>
					<th>10</th>
					<th>100</th>
					<th>1000</th>
					<th>10000</th>
					<th>100000</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Bubble Sort</td>
					<td>0,000001</td>
					<td>0,00012</td>
					<td>0,00612</td>
					<td>0,00612</td>
					<td>4,12629</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Select Sort</td>
					<td>0,00302</td>
					<td>0,12920</td>
					<td>6,93254</td>
					<td>47,40001</td>
					<td>2635,21014</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Insert Sort</td>
					<td>0,00121</td>
					<td>0,00604</td>
					<td>0,06279</td>
					<td>0,67738</td>
					<td>6,28535</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Quick Sort</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>5,00000</td>
					<td>90,00000</td>
					<td>"Estouro de memória"</td>
					<td>s</td>
				</tr>
			</tbody>
		</table>
		<table>
			<caption>Arquivos Desordenados</caption>
			<thead>
				<tr>
					<th></th>
					<th>10</th>
					<th>100</th>
					<th>1000</th>
					<th>10000</th>
					<th>100000</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Bubble Sort</td>
					<td>0,000001</td>
					<td>0,00025</td>
					<td>0,01104</td>
					<td>0,14632</td>
					<td>24,96530</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Select Sort</td>
					<td>0,00362</td>
					<td>0,13704</td>
					<td>7,70047</td>
					<td>65,49355</td>
					<td>5344,26452</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Insert Sort</td>
					<td>0,00181</td>
					<td>0,08875</td>
					<td>5,51379</td>
					<td>97,40267</td>
					<td>1793,59958</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Quick Sort</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>2,00000</td>
					<td>18,00000</td>
					<td>s</td>
				</tr>
			</tbody>
		</table>
		<table>
			<caption>Arquivos Decrescente</caption>
			<thead>
				<tr>
					<th></th>
					<th>10</th>
					<th>100</th>
					<th>1000</th>
					<th>10000</th>
					<th>100000</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Bubble Sort</td>
					<td>0,000001</td>
					<td>0,00036</td>
					<td>0,01296</td>
					<td>0,05177</td>
					<td>10,23093</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Select Sort</td>
					<td>0,00362</td>
					<td>0,13403</td>
					<td>7,79767</td>
					<td>192,25401</td>
					<td>5557,18514</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Insert Sort</td>
					<td>0,00362</td>
					<td>0,21976</td>
					<td>9,17899</td>
					<td>155,63103</td>
					<td>4017,62324</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Quick Sort</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>4,00000</td>
					<td>98,00000</td>
					<td>"Estouro de memória</td>
					<td>s</td>
				</tr>
			</tbody>
		</table>
		<table>
			<caption>Arquivos Desordenados 10% a direita</caption>
			<thead>
				<tr>
					<th></th>
					<th>10</th>
					<th>100</th>
					<th>1000</th>
					<th>10000</th>
					<th>100000</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Bubble Sort</td>
					<td>0,000001</td>
					<td>0,00019</td>
					<td>0,00791</td>
					<td>0,14407</td>
					<td>6,09551</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Select Sort</td>
					<td>0,00362</td>
					<td>0,12799</td>
					<td>9,49232</td>
					<td>797,27709</td>
					<td>5299,86682</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Insert Sort</td>
					<td>0,00121</td>
					<td>0,01630</td>
					<td>1,69706</td>
					<td>24,65841</td>
					<td>1100,33495</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Quick Sort</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>1,00000</td>
					<td>6,00000</td>
					<td>22,00000</td>
					<td>s</td>
				</tr>
			</tbody>
		</table>
		<table>
			<caption>Arquivos Desordenados 10% a esquerda</caption>
			<thead>
				<tr>
					<th></th>
					<th>10</th>
					<th>100</th>
					<th>1000</th>
					<th>10000</th>
					<th>100000</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Bubble Sort</td>
					<td>0,000001</td>
					<td>0,00016</td>
					<td>0,00911</td>
					<td>0,07533</td>
					<td>9,60795</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Select Sort</td>
					<td>0,00362</td>
					<td>0,18172</td>
					<td>9,29068</td>
					<td>66,00491</td>
					<td>5462,92424</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Insert Sort</td>
					<td>0,00181</td>
					<td>0,02173,1</td>
					<td>60530</td>
					<td>22,21877</td>
					<td>940,62215</td>
					<td>s</td>
				</tr>
				<tr>
					<td>Quick Sort</td>
					<td>0,000001</td>
					<td>0,000001</td>
					<td>1,00000</td>
					<td>7,00000</td>
					<td>44,00000</td>
					<td>s</td>
				</tr>
			</tbody>
		</table>
		<p><i><strong>Observações:</strong>significado <strong>Estouro de memória </strong>: (não conseguiu calcular)</i>
			<p>Todos os calculos são feitos em segundos e com 5 casas decimais após a vircula, número acima de 5 casas, significa que estão abaixo de segundos para executar</p>
			</p>
	</body>
	</html>



