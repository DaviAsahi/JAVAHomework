package main.letsgo.chap12.ex2_collection.ex0_vector;

import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("1");
        vector.add("12");
        vector.add("123");

        Iterator<String> iter = vector.iterator();
        while (iter.hasNext()) {
            String obj = iter.next();

        }
    }
}
