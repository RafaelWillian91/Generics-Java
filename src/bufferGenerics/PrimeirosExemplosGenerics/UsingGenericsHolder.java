package bufferGenerics.PrimeirosExemplosGenerics;

//Generics é uma característica da programação orientada a objetos que permite criar classes,
// interfaces e métodos parametrizados. O objetivo principal do uso de generics é fornecer um mecanismo
// para criar componentes de software que possam ser reutilizados com diferentes tipos de dados,
// enquanto ainda fornecem segurança de tipos em tempo de compilação.
public class UsingGenericsHolder<T>{

    private final T obj;

    public UsingGenericsHolder(T objP){
        this.obj = objP;
    }


    public T getObj() {
        return obj;
    }
}
