import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada para obter a entrada do usuário.

public class TestePilha { // Declaração da classe TestePilha.
  
  public static void main(String args[]){ // Método principal que é executado quando o programa é iniciado.
    
    PilhaDeInteiros f1 = new PilhaDeInteiros(4); // Cria uma nova instância da classe PilhaDeInteiros com capacidade para 4 elementos.
    
    int op, valor; // Declara duas variáveis inteiras, op e valor.
    
    Scanner sc = new Scanner(System.in); // Cria uma nova instância da classe Scanner para ler a entrada do usuário.
    
    do{ // Início de um loop do-while.
      
      // Imprime as opções do menu no console.
      System.out.println("1-Adicionar");
      System.out.println("2-Remover");
      System.out.println("3-Consultar a Pilha"); 
      System.out.println("99-Sair"); 
      
      op=sc.nextInt(); // Lê a próxima entrada do usuário como um inteiro e a atribui à variável op.
      
      try{ // Início de um bloco try-catch.
        
        switch(op){ // Início de uma instrução switch que toma diferentes ações dependendo do valor de op.
          
          case 1: // Caso em que op é 1.
            System.out.println("Valor? "); 
            valor = sc.nextInt(); // Lê a próxima entrada do usuário como um inteiro e a atribui à variável valor.
            f1.empilha(valor); // Adiciona o valor à pilha.
            break; 
            
          case 2: // Caso em que op é 2.
            valor= f1.desempilha(); // Remove o valor do topo da pilha e o atribui à variável valor.
            System.out.println("Elemento removido "+valor); // Imprime o valor removido.
            break; 
            
          case 3: // Caso em que op é 3.
            if (f1.vazia()){ // Se a pilha estiver vazia...
              System.out.println("Não há elementos na lista"); // ...imprime uma mensagem informando que a pilha está vazia.
            } else { 
              System.out.println("Pilha: " + f1.toString()); // Caso contrário, imprime os elementos da pilha.
            } 
            break; 
            
          case 99: // Caso em que op é 99.
            System.out.println("Saindo.... "); // Imprime uma mensagem informando que o programa está saindo.
            break; 
            
          default: // Caso em que op não é 1, 2, 3 ou 99.
            System.out.println("Opção Inválida"); // Imprime uma mensagem informando que a opção é inválida.
        } 
        
      } catch(Exception e){ // Caso ocorra uma exceção no bloco try...
        System.out.println(e.getMessage()); // ...imprime a mensagem da exceção.
      } 
      
    } while(op != 99); // Fim do loop do-while. O loop continua enquanto op não for igual a 99.
  }
}
