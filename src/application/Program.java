package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.0));
        list.add(new Product("Notebook",900.0));
        list.add(new Product("Tablet",900.0));

        // Para poder utilizar Collections.sort é necessário implementar na classe Product
        // public class Product implements Comparable<T>{
        //Collections.sort(list);

        // implementando com Comparator
        //list.sort(new MyComparator());

        // Declaração de Comparator utilizando a sintaxe de classe anonima
        Comparator<Product> comp = new Comparator<Product>() {
            // Dentro das chaves, fazer a implementação da classe anonima
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
             }
        }; // Necessário colocar ;

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
