package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.0));
        list.add(new Product("Notebook",900.0));
        list.add(new Product("Tablet",900.0));

        // Para poder utilizar Collections.sort é necessário implementar na classe Product
        // public class Product implements Comparable<T>{
        Collections.sort(list);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
