package main.letsgo.chap12.ex1_baisc;

public class GenericPrinterTest {
    public static void main(String[] args) {
        //플라스틱
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        Plastic returnedPlastic = plasticPrinter.getMaterial();
        returnedPlastic.doPrinting();
        System.out.println(plasticPrinter);

        //밀가루
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderGenericPrinter.setMaterial(powder);
        Powder meterial1 = powderGenericPrinter.getMaterial();
        meterial1.doPrinting();
        System.out.println(meterial1);

        //굳이 각각 안만들어도 됨

    }
}
