package main.letsgo.chap12.ex1_basic;

import main.letsgo.chap12.ex2_extends.Material;

public class GenericPrinter<T extends Material> {
    private T material;


    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
