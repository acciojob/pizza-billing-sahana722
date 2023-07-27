package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean topping=false,cheese=false,takeaway=false, isBill=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        this.price=0;
        // your code goes here
        if(isVeg) price += 300;
        else price += 400;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            price+=80;
            cheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!topping){
            if(isVeg) price += 70;
            else price+=120;
            topping=true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            price+=20;
            takeaway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isBill) return this.bill;
        isBill =true;
        if(isVeg){
            bill+="Base Price Of The Pizza: 300"+"\n";
        }
        else{
            bill+="Base Price Of The Pizza: 400"+"\n";
        }
        if(cheese){bill+="Extra Cheese Added: 80"+"\n";}
        if(topping) {
            if (isVeg) {
                bill+="Extra Toppings Added: 70"+"\n";
            }else {
                bill+="Extra Toppings Added: 120"+"\n";
            }
        }
        if(takeaway){bill+="Paperbag Added: 20"+"\n";}
        bill+="Total Price: "+getPrice() + "\n";
        return this.bill;
    }
}