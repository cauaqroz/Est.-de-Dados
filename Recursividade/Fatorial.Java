public int fatorialR(int N) {
    if (N > 1) {
        return fatorialR(N - 1) * N;
    }
    return 1;
}
