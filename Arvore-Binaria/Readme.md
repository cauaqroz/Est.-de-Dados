# Arvore-Binaria
<p>Em estrutura de dados, uma árvore binária é uma estrutura de dados em que cada nó tem no máximo dois filhos, <br>denominados filho esquerdo e filho direito. Existem três maneiras de percorrer uma árvore binária: pré-ordem, em-ordem e pós-ordem</p>

<br>
<br>

<h2>Pré-Ordem</h2>
<P>Na pré-ordem, visitamos o nó raiz primeiro, depois a subárvore esquerda e, por fim,a subárvore direita. <br>Essa estratégia é frequentemente usada para criar uma cópia da árvore</P>

<h2>Em-Ordem</h2>
<p>Na Em-ordem, visitamos a subárvore esquerda, depois o nó raiz e, finalmente, a subárvore direita.<br> Essa estratégia é frequentemente usada para obter uma ordem crescente dos elementos armazenados na árvore
</p>

<h2>Pós-Ordem</h2>
<p>Na pós-ordem, percorremos primeiro as subárvores (esquerda e direita) e, por fim, visitamos o nó raiz.<br> Essa estratégia é frequentemente usada para liberar a memória alocada para a árvore.</p>
<br>
<br>

||esq||raiz|| dir||
|--|--|--|--|--|--|--|
|    |  |   |65||  |   |
|    |41|   |    |    |96|   |
|20|    |54|    |71|    |99|



>[!Important]
>Pre-Ordem: 65, 41, 20, 54, 96, 71, 99 <br>Em-Ordem: 20, 41, 54, 65, 71, 96, 99<br>Pós-Ordem: 20, 54, 41, 65, 71, 99, 96




