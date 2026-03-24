package main.letsgo.chap12.ex1_baisc;

public class Plastic {
    public void doPrinting(){
        System.out.println("플라스틱 재료로 출력");
    }

    @Override
    public String toString() {
        return "재료는 플라스틱{}";
    }


}
