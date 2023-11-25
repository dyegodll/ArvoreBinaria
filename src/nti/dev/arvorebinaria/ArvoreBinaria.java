package nti.dev.arvorebinaria;

public class ArvoreBinaria {

	No raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor); //instacia a raiz
    }
    
    private No inserirRec(No no, int valor) {
        // Se o nó atual é nulo, um novo nó é criado com o valor informado
        if (no == null) {
            no = new No(valor);
            return no;
        }

        // Se o valor a ser inserido é menor que o valor do nó atual,
        // então recursivamente inserimos o valor na sub-arvore esquerda.
        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor);
        } 
        // Se o valor a ser inserido é maior que o valor do nó atual,
        // então recursivamente inserimos o valor na sub-arvore direita.
        else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor);
        }

        // Se o valor a ser inserido já existe na árvore, ignoramos a inserção.
        // nó atualizado.
        return no;
    }

    
    public void percorrerEmOrdemRec(No no) {
        // Se o nó atual não for nulo, continuamos o percurso.
        if (no != null) {
            // Recursivamente percorremos a subárvore esquerda.
            percorrerEmOrdemRec(no.esquerda);
            
            // Imprimimos o valor do nó atual.
            System.out.print(no.valor + " ");
            
            // Recursivamente percorremos a subárvore direita.
            percorrerEmOrdemRec(no.direita);
        }
    }

	
}
