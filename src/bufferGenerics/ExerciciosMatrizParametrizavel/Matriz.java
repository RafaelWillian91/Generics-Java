package bufferGenerics.ExerciciosMatrizParametrizavel;

import java.util.ArrayList;
import java.util.List;

public class Matriz <T>{

    private static final int SIZE = 3;
    private final List<List<T>> elements = new ArrayList<>();

    public Matriz(){
        for (int i = 0; i< SIZE; i++){
            List<T> row = new ArrayList<>();
            for (int j =0; j < SIZE; j ++){
                row.add(null);
            }
            elements.add(row);
            System.out.println("----------------");
            System.out.println(elements);
        }
    }

    public void print() {

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                System.out.print(elements.get(i).get(j) + " ");
                //Saida: [[null, null, null], [null, null, null], [null, null, null]]
            }
            System.out.println();

        }
    }

}
