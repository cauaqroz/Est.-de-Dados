public static void mergeSort(int[] array, int left, int right) {
    // Se o índice à esquerda for menor que o índice à direita, então ainda há elementos para serem ordenados
    if (left < right) {
        // Encontra o ponto médio da matriz
        int middle = (left + right) / 2;
        // Ordena a primeira metade da matriz
        mergeSort(array, left, middle);
        // Ordena a segunda metade da matriz
        mergeSort(array, middle + 1, right);
        // Combina as duas metades ordenadas
        merge(array, left, middle, right);
    }
}

public static void merge(int[] array, int left, int middle, int right) {
    // Cria uma matriz temporária e copia os elementos da matriz original para ela
    int[] temp = new int[array.length];
    for (int i = left; i <= right; i++) {
        temp[i] = array[i];
    }
    // Inicializa os índices para a primeira metade, a segunda metade e a matriz resultante
    int i = left;
    int j = middle + 1;
    int k = left;
    // Enquanto houver elementos em ambas as metades
    while (i <= middle && j <= right) {
        // Se o elemento na primeira metade for menor ou igual ao elemento na segunda metade
        if (temp[i] <= temp[j]) {
            // Copia o elemento da primeira metade para a matriz resultante
            array[k] = temp[i];
            i++;
        } else {
            // Caso contrário, copia o elemento da segunda metade para a matriz resultante
            array[k] = temp[j];
            j++;
        }
        k++;
    }
    // Copia os elementos restantes da primeira metade, se houver
    while (i <= middle) {
        array[k] = temp[i];
        k++;
        i++;
    }
}
