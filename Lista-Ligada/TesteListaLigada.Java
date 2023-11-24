public class TesteListaLigada {
    public static void main(String args[]){ // Método principal que é executado quando o programa é iniciado.
        ListaLigada lista1 = new ListaLigada(); // Cria uma nova instância da classe ListaLigada.
        try{ // Início de um bloco try-catch.
            lista1.adicionaFinal(15); // Adiciona o número 15 ao final da lista.
            System.out.println("Removido"+lista1.removeFinal()); // Remove o último elemento da lista e imprime o valor removido.
            lista1.adicionaFinal(10); // Adiciona o número 10 ao final da lista.
            lista1.adicionaFinal(100); // Adiciona o número 100 ao final da lista.
            System.out.println("Removido"+lista1.removeFinal()); // Remove o último elemento da lista e imprime o valor removido.
            lista1.adicionaFinal(101); // Adiciona o número 101 ao final da lista.
            lista1.adicionaFinal(1001); // Adiciona o número 1001 ao final da lista.
            lista1.adicionaFinal(15); // Adiciona o número 15 ao final da lista.
            lista1.adicionaFinal(150); // Adiciona o número 150 ao final da lista.
            System.out.println("Removido"+lista1.removeFinal()); // Remove o último elemento da lista e imprime o valor removido.
            System.out.println(lista1.toString()); // Imprime a representação em string da lista.
        }catch(Exception e){ // Caso ocorra uma exceção no bloco try...
            System.out.println(e.getMessage()); // ...imprime a mensagem da exceção.
        }
    }
}
