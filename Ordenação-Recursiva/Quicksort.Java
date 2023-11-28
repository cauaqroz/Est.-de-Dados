// Este método implementa o algoritmo de ordenação QuickSort para ordenar um array de inteiros.
public static void quick(int vet[], int ini, int fim) {
    // Verifica se o índice inicial é menor que o índice final para evitar sobreposição.
    if (ini < fim) {
        // Chama a função 'separa' para obter o elemento pivô de tal forma que os elementos menores que o pivô estão à esquerda, os elementos maiores que o pivô estão à direita.
        int div = separa(vet, ini, fim);
        
        // Chama recursivamente 'quick' para os elementos antes e depois do pivô separadamente.
        quick(vet, ini, div - 1);
        quick(vet, div + 1, fim);
    }
}

// Este método separa o array em duas metades com base em um elemento pivô e retorna o índice deste pivô após a ordenação parcial do array.
public static int separa(int vet[], int ini, int fim) {
    // Escolhendo o último elemento como pivô inicialmente.
    int pivo = vet[fim];
    
    // Inicializando variáveis para iteração através do segmento do array.
    int i = ini;
    int f = fim - 1;
    
    // Variável temporária para trocar elementos no array durante o processo de partição.
    int aux;

    // Itera até que os índices se sobreponham ou se cruzem. 
    while (i <= f) {
        
        // Incrementa 'i' enquanto os elementos são menores que o pivô para encontrar um elemento maior ou igual ao pivô do lado esquerdo do segmento do array. 
        while (i < fim && pivo > vet[i]) { ++i; }
        
        // Decrementa 'f' enquanto os elementos são maiores ou iguais para encontrar um elemento menor ou igual ao do lado direito do segmento do array. 
        while (f >= ini && pivo <= vet[f]) { --f; }

        // Troca esses dois elementos encontrados se os índices ainda não se sobrepuseram. 
        if (i < f) {
            aux = vet[i];
            vet[i] = vet[f];
            vet[f] = aux;
            
            ++i;
            --f;
        }
        
     }

     /* Após todas as trocas e quando os índices se sobrepõem,
      * coloca o pivô escolhido inicialmente em sua posição correta no array parcialmente ordenado
      * de modo que todos os elementos menores estão à sua esquerda e todos os maiores estão à sua direita.*/
     if (fim != i){
         vet[fim] = vet[i];
         vet[i] = pivo;
     }

     return i;
}
