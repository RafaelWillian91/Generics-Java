package bufferGenerics.PrimeirosExemplosGenerics;

import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

//bufferGenerics.PrimeirosExemplosGenerics.Buffer é um conjunto de dados organizados em uma fila. os primeiros que entram, sao os primeiros a sairem.
//O Tipo T definido na classe é flexivel para criar o tipo em atributos, construtor e métodos
public class Buffer <T>{//parametrizando o bufferGenerics.PrimeirosExemplosGenerics.Buffer

    private final LinkedList<T> list;//Minha lista é de acordo com o generics

    public Buffer(){

        this(new LinkedList<>());
    }
    public Buffer(LinkedList<T> elements){

        list = elements;
    }
    public void add(T element){

        list.addLast(element);
    }

    public Optional <T> remove(){
        if(!list.isEmpty()) {
            return Optional.of(list.removeFirst());
        }
        return Optional.empty();
    }

    public void interacao(){
        for (var s: list) {
            System.out.println(s);
        }
    }

    //O tipo k não é reconhecido fora do contexto do método transformer
    public <k> Buffer tranformer(Function<T, k> function){
        return new Buffer<>(new LinkedList<>(list.stream().map(function).toList()));
    }

}
