
public class Run {

    public static void main(String[] args) {

        TabelaHash<String> th = new TabelaHashImpl<>(100);
        th.inserir("Valter");
        th.inserir("David");
        th.inserir("Cadilhe");
        th.inserir("Marcos");
        th.inserir("Ana");
        th.inserir("Ana1");
        th.inserir("Ana2");
        th.inserir("Ana3");
        th.inserir("Ana4");
        th.inserir("Ana5");

        // Lista<String> lista = new ListaDupla<>();
        
        // lista.adicionarFim("A");
        // lista.adicionarFim("B");
        // lista.adicionarFim("D");
        // lista.adicionarFim("E");
        // lista.adicionar("C", 2);

        // // lista.remover(0);
        // // lista.remover(1);
        // // lista.remover(2);
        // // lista.remover(3);
        // lista.remover(4);

        // System.out.println("Tamanho: " + lista.tamanho());

        // // System.out.println(lista.buscar(0));
        // // System.out.println(lista.buscar(1));
        // // System.out.println(lista.buscar(2));
        // // System.out.println(lista.buscar(3));
        // // System.out.println(lista.buscar(4));

        System.out.println("Done!");
    }
}