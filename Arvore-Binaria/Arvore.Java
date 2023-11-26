public class Arvore{	
	private NoArvore raiz; // Raiz da árvore

	public Arvore ( ){
		raiz=null; // Inicializa a raiz como nula
	}

	public void adicionaElemento(int e){
		NoArvore novo = new NoArvore(e); // Cria um novo nó com o elemento
		if(raiz == null) // Se a árvore estiver vazia
			raiz = novo; // O novo nó se torna a raiz
		else{
			NoArvore aux1=raiz, aux2=raiz;
			while(aux1 != null && aux1.elemento!=e){ // Procura a posição correta para o novo nó
				aux2=aux1;
				if(e<aux1.elemento)
					aux1=aux1.esquerda;
				else if(e>aux1.elemento)
					aux1=aux1.direita;
			}
			if(aux1 != null && e == aux1.elemento) 
           System.out.println("Elemento já existe"); // Se o elemento já existir, imprime uma mensagem
			else{
				if(e < aux2.elemento) aux2.esquerda = novo; // Se o elemento for menor, adiciona à esquerda
				if(e > aux2.elemento) aux2.direita = novo; // Se o elemento for maior, adiciona à direita
				System.out.println("Elemento Incluído "+novo.elemento); // Imprime uma mensagem de sucesso
			}
		} 
	}
	
	public NoArvore removeMinimo(NoArvore node) {
            if (node == null) {
                System.out.println("ERRO"); // Se o nó for nulo, imprime uma mensagem de erro
            } else if (node.esquerda != null) {
                node.esquerda = removeMinimo(node.esquerda); // Se o nó tiver um filho à esquerda, chama a função recursivamente
                return node;
            } else {
                return node.direita; // Se o nó não tiver um filho à esquerda, retorna o filho à direita
            }
            return null;
        }

        public NoArvore encontraMinimo(NoArvore node) {
            if (node != null) {
                while (node.esquerda != null) { // Enquanto o nó tiver um filho à esquerda
                    node = node.esquerda; // Vai para o filho à esquerda
                }
            }
            return node; // Retorna o nó com o menor elemento
        }    

   public void remove (int e){
       if (raiz == null) {
                System.out.println("Arvore vazia "); // Se a árvore estiver vazia, imprime uma mensagem
            } else
       if (raiz.elemento == e){
            if (raiz.esquerda != null && raiz.direita != null){ // Se a raiz tiver dois filhos
                System.out.println("Removeu No com o elemento " + raiz.elemento); // Imprime uma mensagem de sucesso
                raiz.elemento = encontraMinimo(raiz.direita).elemento; // Substitui o elemento da raiz pelo menor elemento à direita
                raiz.direita = removeMinimo(raiz.direita); // Remove o menor elemento à direita
            }
            else {
                System.out.println("Removeu No com a matricula " + raiz.elemento); // Imprime uma mensagem de sucesso
                raiz = (raiz.esquerda != null) ? raiz.esquerda : raiz.direita; // Substitui a raiz pelo filho à esquerda ou à direita, se houver
            }
       }else        remover(raiz, e);
           
       
       
   }

    public NoArvore remover(NoArvore node, int e) {

            if (node == null) {
                System.out.println("Arvore vazia "); // Se a árvore estiver vazia, imprime uma mensagem
            }else
            if (e < node.elemento) {
                node.esquerda = remover(node.esquerda, e); // Se o elemento for menor, chama a função recursivamente à esquerda
            }
            else if (e > node.elemento) {
                node.direita = remover(node.direita, e); // Se o elemento for maior, chama a função recursivamente à direita
            }
            else if (node.esquerda != null && node.direita != null){ // Se o nó tiver dois filhos
                System.out.println("Removeu No com o elemento " + node.elemento); // Imprime uma mensagem de sucesso
                node.elemento = encontraMinimo(node.direita).elemento; // Substitui o elemento do nó pelo menor elemento à direita
                node.direita = removeMinimo(node.direita); // Remove o menor elemento à direita
            }
            else {
                System.out.println("Removeu No com a matricula " + node.elemento); // Imprime uma mensagem de sucesso
                node = (node.esquerda != null) ? node.esquerda : node.direita; // Substitui o nó pelo filho à esquerda ou à direita, se houver
            }
            return node;
        }
   
   
	public void profundidade(NoArvore n){
	       if (n!=null){
			    System.out.print(" "+n.elemento); // Imprime o elemento do nó
				 profundidade(n.esquerda); // Chama a função recursivamente à esquerda
				 profundidade(n.direita); // Chama a função recursivamente à direita
			 }
	}

	public void ordemSimetrica(NoArvore n){
	       if (n!=null){
				 ordemSimetrica(n.esquerda); // Chama a função recursivamente à esquerda
			    System.out.print(" "+n.elemento); // Imprime o elemento do nó
				 ordemSimetrica(n.direita); // Chama a função recursivamente à direita
			 }
	}
	
	public void posOrdem(NoArvore n){
	       if (n!=null){
				 posOrdem(n.esquerda); // Chama a função recursivamente à esquerda
				 posOrdem(n.direita); // Chama a função recursivamente à direita
			    System.out.print(" "+n.elemento); // Imprime o elemento do nó
			 }
	}
   
   public int soma(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = soma(n.esquerda)+ // Soma os elementos à esquerda
				 soma(n.direita)+ n.elemento; // Soma os elementos à direita e o elemento do nó
			 }
          return resp; // Retorna a soma
	}
   
   public int conta(NoArvore n){
          int resp=0;
	       if (n!=null){
				 resp = conta(n.esquerda)+ // Conta os nós à esquerda
				 conta(n.direita)+ 1; // Conta os nós à direita e o nó atual
			 }
          return resp; // Retorna a contagem
	}
   
public double media (){
     int s=soma (raiz); // Soma todos os elementos da árvore
     double c=conta (raiz); // Conta todos os nós da árvore
     return s/c; // Retorna a média
}
			 public NoArvore obtemRaiz(){
			    return raiz; // Retorna a raiz da árvore
			 }}
