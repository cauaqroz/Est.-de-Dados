public class ListaDeInteiros {
    private int dados[]; // Array para armazenar os dados da lista
    private int tamanho; // Variável para armazenar o tamanho atual da lista
 
    public ListaDeInteiros(int capMax){
        dados = new int[capMax]; // Inicializa o array com a capacidade máxima fornecida
    }

    public void adicionaFinal (int e)throws Exception{
        if (!cheia()) { // Verifica se a lista está cheia
            dados[tamanho] = e; // Adiciona o elemento no final da lista
            tamanho = tamanho + 1; // Incrementa o tamanho da lista
        } else {
            throw new Exception("ERRO! Lista Cheia"); // Lança uma exceção se a lista estiver cheia
        }
    }

    public boolean cheia(){
        return tamanho == dados.length; // Retorna verdadeiro se a lista estiver cheia
    }

    public String toString(){
        String s = "Elementos: ";
        for (int i = 0; i<tamanho; i++){ // Itera sobre todos os elementos da lista
            s = s + " " + dados[i]; // Adiciona cada elemento à string de saída
        }
        s = s + "\nTamanho: " + tamanho; // Adiciona o tamanho da lista à string de saída
        return s; // Retorna a string de saída
    }

    public int obtemUltimo() throws Exception{
        if(vazia()) // Verifica se a lista está vazia
            throw new Exception("ERRO! Lista Vazia"); // Lança uma exceção se a lista estiver vazia
        else
           return dados[tamanho-1]; // Retorna o último elemento da lista
    }

    public int obtemPrimeiro() throws Exception{
        if(vazia()) // Verifica se a lista está vazia
            throw new Exception("ERRO! Lista Vazia"); // Lança uma exceção se a lista estiver vazia
        else
           return dados[0]; // Retorna o primeiro elemento da lista
    }

    public int removeFinal ( )throws Exception{
        if (!vazia()) { // Verifica se a lista está vazia
            tamanho = tamanho - 1; // Decrementa o tamanho da lista
            return dados[tamanho] ; // Retorna o último elemento da lista
        } else {
            throw new Exception("ERRO! Lista Vazia"); // Lança uma exceção se a lista estiver vazia
        }
    }

    public boolean vazia(){
        return tamanho == 0; // Retorna verdadeiro se a lista estiver vazia
    }

    public int removeInicio() throws Exception{
        if (vazia()) // Verifica se a lista está vazia
            throw new Exception("ERRO! Lista Vazia"); // Lança uma exceção se a lista estiver vazia
        else{
            int r = dados[0]; // Guarda o primeiro elemento que será removido
            for(int i=0;i<tamanho-1;i++){ // Move todos os elementos uma posição para a esquerda
                dados[i]=dados[i+1];
            }
            tamanho--; // Decrementa o tamanho da lista
            return r; // Retorna o elemento que foi removido
        }
    }
}
