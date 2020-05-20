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
        /*
        Comparator<Product> comp = new Comparator<Product>() {
            // Dentro das chaves, fazer a implementação da classe anonima
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
             }
        }; // Necessário colocar ;
         */

        // Fazendo com expressão lambida
        // o1,o2 são parametros
        // Arrow Funciont = flexinha -> é o que será executado
        // Não precisa declarar o tipo das variáveis de parametro
        Comparator<Product> comp = (o1,o2) -> {
            return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        };
        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }

        // ainda posso melhorar e deixar mais enxuto (usei - para ficar decrescente)
        Comparator<Product> comp2 = (o1,o2) -> -o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        System.out.println("--------------------------");
        list.sort(comp2);

        for (Product p : list) {
            System.out.println(p);
        }

        System.out.println("--------------------------");
        list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName()));

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
