package model;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        Cart cart = new Cart();
        productRepository.init();
        productRepository.findAll();
        Object obj = productRepository.findById(1);
        System.out.println(obj);


    }


}
