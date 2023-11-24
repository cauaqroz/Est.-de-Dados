public class ListaLigada {
 // Aqui está somente o metodo pedido no estudo

    public boolean removeElement(int e) {
        if (inicio == null) {
            return false; // A lista está vazia, então o elemento não pode ser encontrado.
        } else if (inicio.dado == e) {
            inicio = inicio.prox; // O elemento a ser removido é o primeiro da lista.
            return true;
        } else {
            No atual = inicio;
            while (atual.prox != null && atual.prox.dado != e) {
                atual = atual.prox; // Percorre a lista até encontrar o elemento ou chegar ao final.
            }
            if (atual.prox != null) {
                atual.prox = atual.prox.prox; // Desvincula o nó da lista.
                return true;
            } else {
                return false; // O elemento não foi encontrado na lista.
            }
        }
    }

}
