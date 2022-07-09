package model;


import java.util.HashMap;

public class Cart {

    HashMap<Integer, String> map = new HashMap<>();



    public void add(int id, Product product) {
        map.put(id, String.valueOf(product));
    }



    public void remove(Integer id) {
        map.remove(id);
    }




    public void print() {
        System.out.println(map);
    }



}
