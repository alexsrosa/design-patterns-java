package com.design.patterns.chainofresponsability.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    private double value;
    private List<Item> items;

    public Budget(double value) {
        this.value = value;
        this.items = new ArrayList<Item>();
    }

    public double getValue() {
        return value;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
