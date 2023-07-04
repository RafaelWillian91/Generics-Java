package bufferGenerics.ExercicioFechandoListas;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Objestosclose objestosclose = new Objestosclose();
        Objestosclose objestosclose1 = new Objestosclose();
        Objestosclose objestosclose2 = new Objestosclose();
        Objestosclose objestosclose3 = new Objestosclose();

        List <Objestosclose> listObj = List.of(new Objestosclose(),
         new Objestosclose(),
         new Objestosclose(),
         new Objestosclose());

        closeAll(listObj);

    }

    public static<T extends Closeable> void closeAll( List<T> closeable) {

        closeable.forEach(o -> {
            try {
                o.close();
                System.out.println("Fechou");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
