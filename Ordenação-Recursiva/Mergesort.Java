public static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
        int middle = (left + right) / 2;
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
    }
}

public static void merge(int[] array, int left, int middle, int right) {
    int[] temp = new int[array.length];
    for (int i = left; i <= right; i++) {
        temp[i] = array[i];
    }
    int i = left;
    int j = middle + 1;
    int k = left;
    while (i <= middle && j <= right) {
        if (temp[i] <= temp[j]) {
            array[k] = temp[i];
            i++;
        } else {
            array[k] = temp[j];
            j++;
        }
        k++;
    }
    while (i <= middle) {
        array[k] = temp[i];
        k++;
        i++;
    }
}
