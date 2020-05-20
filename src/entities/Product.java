package entities;


public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.4f",price) +
                '}';
    }

    // Método obrigatório p/ ser implementado.
    @Override
    public int compareTo(Product o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }



}
