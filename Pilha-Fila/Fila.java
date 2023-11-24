// Define uma classe chamada FilaDeInteiros
public class FilaDeInteiros {
    // Declara dois atributos privados chamados dados e tamanho, que são um vetor de inteiros e um inteiro, respectivamente
    private int dados[];
    private int tamanho;
    // Define um construtor da classe, que recebe um inteiro capMax como parâmetro
    public FilaDeInteiros(int capMax){
        // Inicializa o vetor dados com o tamanho capMax
        dados = new int[capMax];
        // Inicializa o inteiro tamanho com zero
        tamanho=0;
    }
    // Define um método público chamado adiciona, que recebe um inteiro e como parâmetro e não retorna nada, mas pode lançar uma exceção
    public void adiciona (int e)throws Exception{
        // Verifica se a fila não está cheia, chamando o método cheia
        if (!cheia()) {
            // Se não está cheia, insere o elemento e na posição tamanho do vetor dados
            dados[tamanho] = e;
            // Incrementa o inteiro tamanho em um
            tamanho = tamanho + 1;
        } else {
            // Se está cheia, lança uma exceção com a mensagem "ERRO! Lista Cheia"
            throw new Exception("ERRO! Lista Cheia");
        }
    }
    // Define um método público chamado cheia, que não recebe nenhum parâmetro e retorna um valor booleano
    public boolean cheia(){
        // Retorna verdadeiro se o inteiro tamanho é igual ao comprimento do vetor dados, ou falso caso contrário
        return tamanho == dados.length;
    }
    // Define um método público chamado toString, que não recebe nenhum parâmetro e retorna uma string
    public String toString(){
        // Declara uma variável s do tipo string e inicializa com a string "Elementos: "
        String s = "Elementos: ";
        // Percorre o vetor dados com um laço for, usando a variável i como contador
        for (int i = 0; i<tamanho; i++){
            // Concatena a variável s com um espaço em branco e o valor na posição i do vetor dados
            s = s + " " + dados[i];
        }
        // Concatena a variável s com uma quebra de linha e a string "Tamanho: " seguida do valor do inteiro tamanho
        s = s + "\nTamanho: " + tamanho;
        // Retorna a variável s
        return s;
    }
    // Define um método público chamado obtemPrimeiro, que não recebe nenhum parâmetro e retorna um inteiro, mas pode lançar uma exceção
    public int obtemPrimeiro() throws Exception{
        // Verifica se a fila está vazia, chamando o método vazia
        if(vazia())
            // Se está vazia, lança uma exceção com a mensagem "ERRO! Lista Vazia"
            throw new Exception("ERRO! Lista Vazia");
        else
            // Se não está vazia, retorna o valor na posição zero do vetor dados, que é o primeiro elemento da fila
            return dados[0];
    }
    // Define um método público chamado vazia, que não recebe nenhum parâmetro e retorna um valor booleano
    public boolean vazia(){
        // Retorna verdadeiro se o inteiro tamanho é igual a zero, ou falso caso contrário
        return tamanho == 0;
    }
    // Define um método público chamado remove, que não recebe nenhum parâmetro e retorna um inteiro, mas pode lançar uma exceção
    public int remove() throws Exception{
        // Verifica se a fila está vazia, chamando o método vazia
        if (vazia())
            // Se está vazia, lança uma exceção com a mensagem "ERRO! Lista Vazia"
            throw new Exception("ERRO! Lista Vazia");
        else{
            // Se não está vazia, guarda o valor na posição zero do vetor dados na variável r, que é o elemento que será removido
            int r = dados[0];
            // Percorre o vetor dados com um laço for, usando a variável i como contador
            for(int i=0;i<tamanho-1;i++){
                // Move cada elemento uma posição à esquerda, sobrescrevendo o elemento anterior
                dados[i]=dados[i+1];
            }
            // Decrementa o inteiro tamanho em um, para ajustá-lo à quantidade de elementos na fila
            tamanho--;
            // Retorna o valor da variável r, que é o elemento que foi removido
            return r;
        }
    }
}
