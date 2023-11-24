import java.util.Scanner; // Importa a classe Scanner do pacote java.util, que é usada para obter a entrada do usuário.

public class Inverte {
    public static void main(String args[]){ // Método principal que é executado quando o programa é iniciado.
        FilaDeInteiros f1 = new FilaDeInteiros(4); // Cria uma nova instância da classe FilaDeInteiros com capacidade para 4 elementos.
        PilhaDeInteiros p1 = new PilhaDeInteiros(4); // Cria uma nova instância da classe PilhaDeInteiros com capacidade para 4 elementos.

        Scanner sc = new Scanner(System.in); // Cria uma nova instância da classe Scanner para ler a entrada do usuário.
        int valor;
        try{ // Início de um bloco try-catch.
            // Enquanto a fila não estiver cheia, preenche-a com os valores digitados.
            while(!f1.cheia()){
                System.out.println("Digite um número: ");
                valor = sc.nextInt();
                f1.adiciona(valor);
            }
            // Enquanto a pilha não estiver cheia, remove um elemento da fila e o empilha.
            while(!p1.cheia()){
                valor = f1.remove();
                p1.empilha(valor);            
            }
            // Enquanto a pilha não estiver vazia, desempilha um elemento e o adiciona à fila.
            while(!p1.vazia()){
                valor=p1.desempilha();
                f1.adiciona(valor);
            }
            System.out.println("Elementos: " + f1.toString()); // Imprime a representação em string da fila.
        }catch(Exception e){ // Caso ocorra uma exceção no bloco try...
            System.out.println(e.getMessage()); // ...imprime a mensagem da exceção.
        }
    }
}
