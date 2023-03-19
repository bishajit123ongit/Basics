package SixthAssignment.Generics.Generics;

public class Generics<T> {
    T obj;
    public Generics(T obj){
         this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
