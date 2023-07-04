package bufferGenerics.PrimeirosExemplosGenerics;

public class mainBuffer {

    public static void main(String[] args) {
        //Se eu nao passar o generics o padrão é Object, mesmo com a parametrizacao.
        //Buffer<> b1 = new Buffer();
        Buffer<String> b1 = new Buffer<>();
        b1.add("R");
        b1.add("A");
        b1.add("F");
        b1.add("A");

        System.out.println(b1.remove());
        System.out.println(b1.remove());
        System.out.println(b1.remove());
        System.out.println(b1.remove());
        System.out.println(b1.remove());

        Buffer<Boolean> b2 = new Buffer<>();
        b2.add(true);
        b2.add(true);
        b2.add(false);
        b2.add(true);

        System.out.println(b2.remove());
        System.out.println(b2.remove());
        System.out.println(b2.remove());
        System.out.println(b2.remove());
        System.out.println(b2.remove().orElse(null));
    }
}
