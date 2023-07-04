package bufferGenerics.PrimeirosExemplosGenerics;

public class Main {


    public static void main(String[] args) {
        //Type erasure é um conceito em programação
        // que envolve a remoção de informações específicas sobre os tipos de dados em tempo de execução
        //internamente ao receber um generics o java faz o gerenciamento do tipo em um processo de cast
        UsingGenericsHolder<String> h1 = new UsingGenericsHolder<>("Ra");
        String s1 = h1.getObj();
       // String s1 = (String) h1.getObj();
        System.out.println(s1);

        //Ao usar o generics ganhamos a protecao do tipo de dado em tempo de compilacao
        UsingGenericsHolder<Integer> h2 = new UsingGenericsHolder<>(10);
        Integer s2 = h2.getObj();
        System.out.println(s2);

        //Conhecido na literatura com açucar sintatico, pq assim que é gerado o bytecode, essa informacao é cortada
        //e a jvm não exerga o generics.
    }
}
