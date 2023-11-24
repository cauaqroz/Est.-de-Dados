// Define uma classe chamada TabelaDeEspalhamentoSimples
public class TabelaDeEspalhamentoSimples{
    // Declara um atributo privado chamado tabela, que é um vetor de inteiros
    private int tabela[];
    // Define um construtor da classe, que recebe um inteiro capMax como parâmetro
    public TabelaDeEspalhamentoSimples(int capMax){
        // Inicializa o vetor tabela com o tamanho capMax
        tabela = new int[capMax];
    }
    // Define um método público chamado fEspalha, que recebe um inteiro chave como parâmetro e retorna um inteiro
    public int fEspalha(int chave){
        // Retorna o valor de chave menos um, que é a função de espalhamento usada nessa implementação
        return chave-1;
    }
    // Define um método público chamado adiciona, que recebe dois inteiros chave e quantidade como parâmetros e não retorna nada, mas pode lançar uma exceção
    public void adiciona (int chave, int quantidade) throws Exception{
        // Chama o método fEspalha com a chave e armazena o resultado na variável indice
        int indice = fEspalha(chave);
        // Verifica se o indice é válido, ou seja, se está entre zero e o tamanho do vetor tabela
        if (indice>=0 && indice<tabela.length){
            // Atribui o valor de quantidade na posição indice do vetor tabela
            tabela[indice] = quantidade;
        }else{
            // Lança uma exceção com a mensagem "Código de Produto Inválido"
            throw new Exception("Código de Produto Inválido");
        }
    }
    // Define um método público chamado remove, que recebe um inteiro chave como parâmetro e retorna um inteiro, mas pode lançar uma exceção
    public int remove(int chave) throws Exception{
        // Chama o método fEspalha com a chave e armazena o resultado na variável indice
        int indice = fEspalha(chave);
        // Verifica se o indice é válido, ou seja, se está entre zero e o tamanho do vetor tabela
        if (indice>=0 && indice<tabela.length){
            // Armazena o valor na posição indice do vetor tabela na variável r
            int r = tabela[indice];
            // Atribui zero na posição indice do vetor tabela
            tabela[indice] = 0;
            // Retorna o valor de r
            return r;
        }else{
            // Lança uma exceção com a mensagem "Código de Produto Inválido"
            throw new Exception("Código de Produto Inválido");
        }
    }
    // Define um método público chamado toString, que não recebe nenhum parâmetro e retorna uma string
    public String toString(){
        // Declara uma variável s do tipo string e inicializa com uma string vazia
        String s="";
        // Percorre o vetor tabela com um laço for, usando a variável i como contador
        for (int i=0; i<tabela.length; i++){
            // Concatena a variável s com um caractere de tabulação e o valor na posição i do vetor tabela
            s = s + "\t" + tabela[i];
        }
        // Retorna a variável s
        return s;
    }
}
