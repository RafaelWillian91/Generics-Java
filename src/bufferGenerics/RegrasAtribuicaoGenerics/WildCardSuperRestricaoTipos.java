package bufferGenerics.RegrasAtribuicaoGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCardSuperRestricaoTipos {

    public static void main(String[] args) {

        //LowerBOund <? extends Vehicle> daqui pra baixo
        List<? extends Vehicle> l1 = new ArrayList<Vehicle>();
        List<? extends Vehicle> l2 = new ArrayList<Vehicle.Car>();
        List<? extends Vehicle> l3 = new ArrayList<Vehicle.Bus>();

        //UpperBound -> <? super Vehicle.Bus> daqui para cima
        List<? super Vehicle.Bus> l4 = new ArrayList<Vehicle.Bus>();
        List<? super Vehicle.Bus> l5 = new ArrayList<Vehicle>();
        List<? super Vehicle.Bus> l6 = new ArrayList<Object>();

        l4.add(new Vehicle.Bus());
        var a = (Vehicle) l4.get(0);
        a.drive();
    }
}
