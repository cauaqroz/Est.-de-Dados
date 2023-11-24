public class FilaLL{
    private No inicio; // Declaração do nó inicial da fila.

    public FilaLL(){ // Construtor da classe FilaLL.
        inicio = null; // Inicializa o nó inicial como nulo.
    }

    public boolean vazia(){ // Método para verificar se a fila está vazia.
        return inicio == null; // Retorna verdadeiro se o início for nulo, o que significa que a fila está vazia.
    }

    public void adiciona(int e){ // Método para adicionar um elemento à fila.
        if(vazia()){ // Se a fila estiver vazia...
            inicio = new No(e); // ...cria um novo nó com o elemento e o define como o início.
        }else { // Se a fila não estiver vazia...
            No aux = inicio; // ...cria um nó auxiliar e o define como o início.
            while(aux.prox!=null){ // Enquanto o próximo nó não for nulo...
                aux=aux.prox; // ...move o nó auxiliar para o próximo nó.
            }
            aux.prox=new No(e); // Cria um novo nó com o elemento e o adiciona ao final da fila.
        }
    }

    public int remove() throws Exception{ // Método para remover um elemento da fila.
        if (vazia()){ // Se a fila estiver vazia...
            throw new Exception("ERRO! Fila Vazia"); // ...lança uma exceção.
        }else{ // Se a fila não estiver vazia...
            int r = inicio.dado; // ...obtém o dado do nó inicial.
            inicio=inicio.prox; // Move o início para o próximo nó, efetivamente removendo o nó inicial.
            return r; // Retorna o dado do nó removido.
        }
    }

    public String toString(){ // Método para converter a fila em uma string.
        String r=""; // Inicializa a string de resultado como vazia.
        No aux = inicio; // Cria um nó auxiliar e o define como o início.
        while(aux!=null){ // Enquanto o nó auxiliar não for nulo...
            r = r + "\t" + aux.dado; // ...adiciona o dado do nó auxiliar à string de resultado.
            aux = aux.prox; // Move o nó auxiliar para o próximo nó.
        }
        return r; // Retorna a string de resultado.
    }
}
