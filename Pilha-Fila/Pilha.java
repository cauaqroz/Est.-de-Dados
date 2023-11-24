// Define uma classe chamada PilhaDeInteiros
public class PilhaDeInteiros {
    // Declara dois atributos privados chamados dados e topo, que são um vetor de inteiros e um inteiro, respectivamente
    private int dados[];
    private int topo;
    // Define um construtor da classe, que recebe um inteiro capMax como parâmetro
    public PilhaDeInteiros(int capMax){
        // Inicializa o vetor dados com o tamanho capMax
        dados = new int[capMax];
        // Inicializa o inteiro topo com -1, que indica que a pilha está vazia
        topo = -1;
    }
    // Define um método público chamado cheia, que não recebe nenhum parâmetro e retorna um valor booleano
    public boolean cheia(){
        // Retorna verdadeiro se o inteiro topo é igual ao comprimento do vetor dados menos um, ou falso caso contrário
        return topo == dados.length-1;
    }
    // Define um método público chamado vazia, que não recebe nenhum parâmetro e retorna um valor booleano
    public boolean vazia(){
        // Retorna verdadeiro se o inteiro topo é igual a -1, ou falso caso contrário
        return topo == -1;
    }
    // Define um método público chamado empilha, que recebe um inteiro e como parâmetro e não retorna nada, mas pode lançar uma exceção
    public void empilha(int e) throws Exception{
        // Verifica se a pilha está cheia, chamando o método cheia
        if (cheia())
            // Se está cheia, lança uma exceção com a mensagem "ERRO! Pilha Cheia"
            throw new Exception("ERRO! Pilha Cheia");
        else{
            // Se não está cheia, incrementa o inteiro topo em um e insere o elemento e na posição topo do vetor dados
            dados[++topo]=e;
        }
    }
    // Define um método público chamado desempilha, que não recebe nenhum parâmetro e retorna um inteiro, mas pode lançar uma exceção
    public int desempilha() throws Exception{
        // Declara uma variável r do tipo inteiro e inicializa com -1, que é o valor padrão para indicar um erro
        int r = -1;
        // Verifica se a pilha está vazia, chamando o método vazia
        if (vazia()){
            // Se está vazia, lança uma exceção com a mensagem "ERRO! Pilha Vazia"
            throw new Exception("ERRO! Pilha Vazia");
        } else{
            // Se não está vazia, guarda o valor na posição topo do vetor dados na variável r, que é o elemento que será removido
            r = dados[topo];
            // Decrementa o inteiro topo em um, para indicar que a pilha tem um elemento a menos
            topo--;
        }
        // Retorna o valor da variável r, que é o elemento que foi removido
        return r;
    }
    // Define um método público chamado toString, que não recebe nenhum parâmetro e retorna uma string
    public String toString(){
        // Declara uma variável s do tipo string e inicializa com uma string vazia
        String s="";
        // Percorre o vetor dados com um laço for, usando a variável i como contador
        for(int i=0; i<=topo; i++)
            // Concatena a variável s com um caractere de tabulação e o valor na posição i do vetor dados
            s = s + "\t" + dados[i];
        // Retorna a variável s
        return s;
    }
}
