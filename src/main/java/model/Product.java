package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private int cost;


    public String toString() {
        return "name = " + this.name + ", id = " + this.id;
    }



}
