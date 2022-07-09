package model;

import java.util.ArrayList;
import java.util.List;


public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void init() {
        products.add(new Product(1, "Apple1", 1));
        products.add(new Product(2, "Apple2", 2));
        products.add(new Product(3, "Apple3", 3));
        products.add(new Product(4, "Apple4", 4));
        products.add(new Product(5, "Apple5", 5));
    }



    public List<Product> findAll() {
        System.out.println(products);
        return products;

    }



    public Object findById(Integer id) {
        Object obj;
        obj = products.get(id);
        System.out.println("id = " + id);
        return obj;
    }


}
