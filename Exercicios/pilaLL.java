// A classe PilhaL representa uma pilha de elementos do tipo Object
public class PilhaL {
    // Atributo que armazena a referência para o topo da pilha
    private No topo;
    // Construtor que cria uma pilha vazia
    public PilhaL() {
        topo = null; // Inicializa o topo como nulo
    }
    // Método que empilha um elemento na pilha
    public void push(Object x) {
        No novo = new No(); // Cria um novo nó
        novo.setElemento(x); // Atribui o elemento x ao nó
        novo.setProximo(topo); // Faz o nó apontar para o topo atual
        topo = novo; // Atualiza o topo para o novo nó
    }
    // Método que desempilha um elemento da pilha
    public Object pop() {
        if (isEmpty()) { // Verifica se a pilha está vazia
            return null; // Retorna nulo se estiver vazia
        }
        Object x = topo.getElemento(); // Obtém o elemento do topo
        topo = topo.getProximo(); // Atualiza o topo para o próximo nó
        return x; // Retorna o elemento desempilhado
    }
    // Método que verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == null; // Retorna verdadeiro se o topo for nulo
    }
    // Classe interna privada que representa um nó da pilha
    private class No {
        // Atributo que armazena o elemento do nó
        private Object elemento;
        // Atributo que armazena a referência para o próximo nó
        private No proximo;
        // Método que retorna o elemento do nó
        public Object getElemento() {
            return elemento;
        }
        // Método que atribui um elemento ao nó
        public void setElemento(Object elemento) {
            this.elemento = elemento;
        }
        // Método que retorna o próximo nó
        public No getProximo() {
            return proximo;
        }
        // Método que atribui um próximo nó
        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
}
