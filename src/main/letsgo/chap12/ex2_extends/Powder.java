package main.letsgo.chap12.ex1_generics_ex1_baisc;

public class Powder extends Material {

    @Override
    public void doPrinting(){
        System.out.println("밀가루 재료로 출력");
    }

    @Override
    public String toString() {
        return "재료는 밀가루{}";
    }
}
