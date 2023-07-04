package bufferGenerics.RegrasAtribuicaoGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCardExtendsObject {

    public static void main(String[] args) {

        List <String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");

        List<? extends Object> objectList= new ArrayList<String>();
        //Nesse caso, a atribuição é permitida porque você está usando o curinga delimitado ? extends Object
        // na declaração da lista objectList. Isso indica que objectList pode ser uma lista de qualquer tipo
        // específico ou subtipo de Object.



        //não é permitido porque o tipo exato das listas não corresponde.
        //Por mais que String seja um Object o compilador nao permite a atribuicao
        //List<Object> objectList2= new ArrayList<String>();

        //Praticamente é a mesma coisa que <? extends Object>.
        List<?> objects = new ArrayList<>();


        //Operacao permitida
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        List<? extends CharSequence> charSequences;

       // List<? extends CharSequence> charSequences = strings; // Atribuição permitida
        charSequences = strings;
        CharSequence seq = charSequences.get(0); // Operação de leitura permitida
        System.out.println(seq);

    }

}
