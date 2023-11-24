public class ListaLigada {
  private No inicio; 
  //declara um atributo privado do tipo No que representa o primeiro nó da lista
  public ListaLigada(){ 
    //construtor da classe ListaLigada
    inicio = null; 
    //inicializa o atributo inicio com null, indicando que a lista está vazia
  }
  public int removeFinal() throws Exception{ 
    //método que remove e retorna o dado do último nó da lista, lançando uma exceção se a lista estiver vazia
    int r = -1; 
    //declara uma variável inteira para armazenar o resultado
    if (inicio == null){ 
      //verifica se a lista está vazia
      throw new Exception ("ERRO! Lista Vazia!"); 
      //lança uma exceção com uma mensagem de erro
    }else { 
      //se a lista não estiver vazia
      if (inicio.prox==null){ 
        //verifica se a lista tem apenas um nó
        r = inicio.dado; 
        //atribui o dado do primeiro nó à variável r
        inicio = null;
        //atribui null ao atributo inicio, indicando que a lista ficou vazia
      }else{
        //se a lista tem mais de um nó
        No aux = inicio;
        //declara uma variável auxiliar do tipo No e atribui o primeiro nó da lista a ela
        while (aux.prox.prox!=null){ 
          //percorre a lista até chegar no penúltimo nó
          aux = aux.prox; 
          //avança a variável auxiliar para o próximo nó
        }
        r=aux.prox.dado; 
        //atribui o dado do último nó à variável r
        aux.prox=null;
        //desconecta o último nó da lista, atribuindo null ao ponteiro do penúltimo nó
      }
    }
    return r;
    //retorna o resultado
  }
  public void adiciona(int e){ 
    //método que adiciona um dado inteiro na lista de forma ordenada
    if (inicio==null){
      //verifica se a lista está vazia
      inicio = new No(e);
      //cria um novo nó com o dado e atribui ao atributo inicio
    } else {
      //se a lista não estiver vazia
      if (e < inicio.dado){
        //verifica se o dado é menor que o dado do primeiro nó
        adicionaInicio(e);
        //chama o método adicionaInicio para inserir o dado no começo da lista
      }else{
        //se o dado não é menor que o dado do primeiro nó
        No aux = inicio; 
        //declara uma variável auxiliar do tipo No e atribui o primeiro nó da lista a ela
        while(aux.prox != null && aux.prox.dado<e){
          //percorre a lista até encontrar um nó cujo dado seja maior ou igual ao dado a ser inserido, ou até chegar no final da lista
          aux = aux.prox;
          //avança a variável auxiliar para o próximo nó
        }
        if (aux.prox != null){ 
          //verifica se a variável auxiliar não chegou no final da lista
          No novo = new No(e); 
          //cria um novo nó com o dado
          novo.prox = aux.prox;
          //conecta o novo nó ao nó seguinte da variável auxiliar
          aux.prox = novo;
          //conecta a variável auxiliar ao novo nó
        }else{ 
          //se a variável auxiliar chegou no final da lista
          No novo = new No(e); 
          //cria um novo nó com o dado
          aux.prox=novo; 
          //conecta a variável auxiliar ao novo nó
        }
      }
    }
  }
  public void adicionaFinal(int e){
    //método que adiciona um dado inteiro no final da lista
    if (inicio==null){ 
      //verifica se a lista está vazia
      inicio = new No(e); 
      //cria um novo nó com o dado e atribui ao atributo inicio
    }else{ 
      //se a lista não estiver vazia
      No aux = inicio;
      //declara uma variável auxiliar do tipo No e atribui o primeiro nó da lista a ela
      while (aux.prox != null){ 
        //percorre a lista até chegar no último nó
        aux = aux.prox;
        //avança a variável auxiliar para o próximo nó
      }
      No novo = new No(e); 
      //cria um novo nó com o dado
      aux.prox=novo; 
      //conecta a variável auxiliar ao novo nó
    }
  }
  public void adicionaInicio(int e){
    //método que adiciona um dado inteiro no início da lista
    No novo = new No(e); 
    //cria um novo nó com o dado
    novo.prox = inicio;
    //conecta o novo nó ao primeiro nó da lista
    inicio = novo; 
    //atribui o novo nó ao atributo inicio
  }
  public int removeInicio() throws Exception{
    //método que remove e retorna o dado do primeiro nó da lista, lançando uma exceção se a lista estiver vazia
    if (inicio == null)
      //verifica se a lista está vazia
      throw new Exception("ERRO! Lista Vazia"); 
      //lança uma exceção com uma mensagem de erro
    else { 
      //se a lista não estiver vazia
      int r = inicio.dado; 
      //declara uma variável inteira para armazenar o resultado e atribui o dado do primeiro nó a ela
      inicio = inicio.prox;
      //atribui o segundo nó da lista ao atributo inicio, desconectando o primeiro nó da lista
      return r; 
      //retorna o resultado
    }
  }
  public String toString(){
    //método que retorna uma representação em String da lista
    String r = ""; 
    //declara uma variável String para armazenar o resultado e inicializa com uma String vazia
    No aux = inicio; 
    //declara uma variável auxiliar do tipo No e atribui o primeiro nó da lista a ela
    while (aux!=null){ 
      //percorre a lista até chegar no final
      r = r + "\t" + aux.dado;
      //concatena o dado do nó atual à variável r, separando por um tab
      aux = aux.prox; 
      //avança a variável auxiliar para o próximo nó
    }
    return r; 
    //retorna o resultado
  }
}

