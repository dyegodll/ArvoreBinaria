package nti.dev.arvorebinaria;

public class Main {

	public static void main(String[] args) {
		
        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int i = 1; i <= 5; i++) {
            arvore.inserir(i);
        }

        System.out.println("Percorrendo a árvore em ordem:");
        arvore.percorrerEmOrdemRec(arvore.raiz);
    }
		
}
