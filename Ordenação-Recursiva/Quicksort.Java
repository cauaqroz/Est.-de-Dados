public static void quickSort(int[] array, int left, int right) {
    // Se o índice à esquerda for menor que o índice à direita, então ainda há elementos para serem ordenados
    if (left < right) {
        // Escolhe um pivô e particiona a matriz em torno do pivô
        int pivotIndex = partition(array, left, right);
        // Ordena recursivamente os elementos antes da partição e depois da partição
        quickSort(array, left, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, right);
    }
}

public static int partition(int[] array, int left, int right) {
    // Escolhe o elemento mais à direita como pivô
    int pivot = array[right];
    // Índice de um elemento menor
    int i = left - 1;
    // Percorre cada elemento do array
    for (int j = left; j < right; j++) {
        // Se o elemento atual é menor que o pivô
        if (array[j] < pivot) {
            // incrementa o índice do elemento menor
            i++;
            // troca o elemento atual com o elemento no índice i
            swap(array, i, j);
        }
    }
    // troca o pivô com o elemento no próximo índice do último elemento menor encontrado
    swap(array, i + 1, right);
    // retorna o índice do pivô
    return i + 1;
}

public static void swap(int[] array, int i, int j) {
    // Troca os elementos nos índices i e j
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
