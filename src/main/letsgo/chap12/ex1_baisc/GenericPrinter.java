package main.letsgo.chap12.ex1_baisc;

public class GenericPrinter<T> {
    private T material;


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
