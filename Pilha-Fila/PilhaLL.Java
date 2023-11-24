public class PilhaLL{
    private No topo; // Declaração do nó topo da pilha.

    public PilhaLL(){ // Construtor da classe PilhaLL.
        topo=null; // Inicializa o nó topo como nulo.
    }

    public void empilha(int e){ // Método para empilhar um elemento na pilha.
        No novo = new No(e); // Cria um novo nó com o elemento.
        novo.prox=topo; // Define o próximo nó do novo nó como o nó topo atual.
        topo = novo; // Define o novo nó como o nó topo.
    }

    public boolean vazia(){ // Método para verificar se a pilha está vazia.
        return topo == null; // Retorna verdadeiro se o topo for nulo, o que significa que a pilha está vazia.
    }

    public int desempilha() throws Exception{ // Método para desempilhar um elemento da pilha.
        if (vazia()) // Se a pilha estiver vazia...
            throw new Exception("ERRO! Pilha Vazia!"); // ...lança uma exceção.
        else{ // Se a pilha não estiver vazia...
            int r = topo.dado; // ...obtém o dado do nó topo.
            topo = topo.prox; // Move o topo para o próximo nó, efetivamente removendo o nó topo.
            return r; // Retorna o dado do nó removido.
        }
    }

    public String toString(){ // Método para converter a pilha em uma string.
        String r = ""; // Inicializa a string de resultado como vazia.
        No aux=topo; // Cria um nó auxiliar e o define como o topo.
        while (aux != null){ // Enquanto o nó auxiliar não for nulo...
            r = r + "\t" + aux.dado; // ...adiciona o dado do nó auxiliar à string de resultado.
            aux = aux.prox; // Move o nó auxiliar para o próximo nó.
        }
        return r; // Retorna a string de resultado.
    }
}
