package bufferGenerics.PrimeirosExemplosGenerics;

public class GenericsComFunctional {

    public static void main(String[] args) {

        Buffer<Integer> b1 = new Buffer();
        b1.add(10);
        b1.add(15);
        b1.add(45);
        b1.add(78);


        Buffer <String> b2 = b1.tranformer(c -> "_" + c + "_");
        b2.interacao();




    }
}
