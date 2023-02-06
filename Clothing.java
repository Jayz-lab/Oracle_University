/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author JJ
 */
public class Clothing implements Comparable<Clothing> {//Exercise 8-2
//public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    
    //Exercise 5-1: Apply encapsulation
    //Add two constants to Clothing Class
    //minimum price and tax rate
    //private final double minPrice = 10.0;
    //private final double tax = 0.2;
    
    //Exercise 6-3: Use Static Constants
    public final static double minPrice = 10.0;
    public final static double tax = 0.2;
    
    //Exercise 5-1: Apply encapsulation
    /*
    //right click select insert code: Getter & Setter plus encapsulate
    //netBeans will replace all direct Clothing & Customer variable references 
    //in the main method of the ShopApp classn with corresponding set & get method invocations.
    */

    //Exercise 6-1: Add Customer Constructor
    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize; //instead of using this.size = size; since the Variable is named differently
    }
  
   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        //add logic to the getPrice method to automatically add tax
        return price + (price*tax);
    }

    public void setPrice(double price) {
        //this.price = price;
        //add logic to setPrice method that ensures price is never smaller than the minimum value
        this.price = (price > minPrice)? price : minPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    //Exercise 8-1: Override the 'toString' Method
    //toString method: prodeuces text value for the object.
    @Override
    public String toString (){
        return getDescription()+ ", " + getSize() + "," + getPrice();
    }
    //Exercise 8-2
    //Interface Comparable<T>
    //method CompareTo(T 0)
    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }
    
}
