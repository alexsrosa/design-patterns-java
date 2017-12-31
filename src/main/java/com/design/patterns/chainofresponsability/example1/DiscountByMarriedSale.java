package com.design.patterns.chainofresponsability.example1;

import java.util.ArrayList;
import java.util.List;

public class DiscountByMarriedSale implements Discount {

    private Discount next;

    public double toDiscount(Budget budget) {

        List<String> listFindItems = new ArrayList<String>();

        listFindItems.add("PEN");
        listFindItems.add("PENCIL");

        if(this.exist(listFindItems, budget.getItems())){
            return budget.getValue() * 0.05;
        }else{
            return next.toDiscount(budget);
        }
    }

    public void setNext(Discount discount) {
        this.next = discount;
    }

    public boolean exist(List<String> listFindItems, List<Item> items){

        for (Item item : items) {
            for (String findItem : listFindItems){
                if(item.getName().equals(findItem)) return true;
            }
        }
        return false;
    }
}
