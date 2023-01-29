//Exercise 1: Intro to Oracle Cloud and Install NetBeans
//Exercise 2: Creating a New Project and Java Class, completed 19/01/2023
//Exercise 3-1: Using String Variables, completed 19/01/2023
//Exercise 3-2: Using Numeric and Text Variables, completed 20/01/2023
//Exercise 4-1: Using switch Statements, completed 20/01/2023
//Exercise 4-2: Using Array, completed 21/01/2023
//Exercise4 4-3: Using a Loop to Process an Array, completed 23/01/2023
//Exercise 4-4: Using if Statements to Control Flow, completed 23/01/2023
//Exercise 5-1: Apply Encapsulation- encapsulate all variables for Customer & Clothing class, provding accessor methods (getters and setters), completed 29/01/2023
//Exercise 5-2: Overload a Method, completed 29/01/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author JJ
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        //Removed for Exercise 5-1, Apply encapsulation
        //code is now in Clothing class
        double tax = 0.2; //representing 20%

        double total = 0.0;//Exercise4 4-3: Using a Loop to Process an Array

        //Exercise 2: Creating a New Project and Java Class
        //creating an instance of the Customer Class (an object) in memory
        //c1 is a reference/pointer to that object
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        //System.out.println("Customer c1 is " + c1.getName() + "," + c1.getSize());
        //this will output the size to "s" no matter what because the code runs top down
        //to get a different output, prinln should be directly after the code. for example Exercise 5-2.

        //creating new objects of Clothing.java (class)
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        //Exercise 4-2: Using Array
        //Create an array of Clothing (class: CLothing.java) objects and populate it using existingt clothing obj references
        //Arrays are useful in programming because they allow you to store multiple values of the same type in a single variable, which makes it easier to organize and manage large amounts of data.
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};//initializing variables to reference new Clothing objects

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(9.5);
        item2.setSize("S");
        
        //Exercise 4.4
        //add two more items to the clothing array
        //initializing variables to reference new Clothing objects
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");
        
        //System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        //System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
        
        //customer bought 2 t-shirts and a jacket
        //calculate tax
        //Exercise 3-2: Using Numeric and Text Variables
        /*
        double tax1 = item1.price * tax,
                tax2 = item2.price * tax,
                taxTotal = tax1 + (tax2 * 2);
        */

        //Exercise 3-2: Using Numeric and Text Variables
        //calculate total amount for items bought plus tax
        //double total = (item2.price * 2) + (item1.price * 1) + taxTotal;
        
         //total = (item1.price + item2.price + 2) * (1 + tax);//Code commented out as per Exercise 4-3 requirements
        
        int measurement = 3;
        //Exercise 5-2: Overload a method
        //Invoke the newly set version of setSize method, passing a value 0f 3 as an argument/
        c1.setSize(measurement);
        //c1.setSize(8);
        System.out.println("Customer c1 is " + c1.getName() + "," + c1.getSize());

        //Exercise 4-1: Using switch Statements
        //switch statment: is easier to read and maintain 
        //offers better performance vs. 'if else'
        /*
        This code uses a "switch" statement to determine the value of the "size" field of an object "c1" based on the value of the "measurement" variable.
        The "switch" statement compares the value of the "measurement" variable with the values of the "case" statements. 
        If the value of "measurement" matches any of the values of the first case statement (1,2,3), the c1.size will be "S", 
        if the value of "measurement" matches any of the values of the second case statement (4,5,6), the c1.size will be "M", 
        if the value of "measurement" matches any of the values of the third case statement (7,8,9), the c1.size will be "L", 
        and if the value of "measurement" does not match any of the values in the case statements, the value of c1.size will be set to "X" by the default case statement.
        The "break" statement at the end of each case block is used to exit the switch statement once a match has been found. 
        This way, the code execution doesn't continue to the next case statement.
        */
        
        //Exercise 5-2:Overload a method
        //moved this code to Cutomer class into the setSize method(int measurement)
        /*
        switch (measurement) {
            case 1,2,3:
                c1.setSize("S");
                break;
            case 4,5,6:
                c1.setSize("M");
                break;
            case 7,8,9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
        */
        
        //Exercise4 4-3: Using a Loop to Process an Array
        //Types of loops + Loop examples below
        //The purpose of loops is to automate repetitive tasks and to perform operations on a collection of data, like an array or a list.
        //for each loop ie. enhanced for loop
        //clothing is the type, item is the iterator that iterates the array items
        //items points to to the Clothing array
        for(Clothing item : items){
            //if condition that checks if customer size if the same as the clothing size
            //if ci size == item size
            if(c1.getSize().equals(item.getSize())){
                total = total + item.getPrice();
                System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());              
                //code removed for exercise 5-1
                //total = total + total + tax;
                //change logic in the for- each loop to exit the loop when total is >5
                if (total > 15){break;}
            /*
            The System.out.println("Item" + "," + item.description + "," + item.price + "," + item.size);line of code is inside the for loop 
            because it is meant to print information about each individual "Clothing" object as the loop iterates through the array or list.
            This line of code is executed once for every object in the array or list.
            */
            }     
        }
        /*
        The System.out.println("Customer has to pay a total of " + total);
        line of code is outside the for loop because it is meant to print a final statement that summarizes the total cost of all the "Clothing" objects,
        This line of code is executed only once, after the for loop has completed.
        */
        System.out.println("Customer has to pay a total of " + total );
        
        //Code commented out as per Exercise 4-3 requirements
        //System.out.println("Customer has to pay, " + taxTotal + " in tax.");
        //total value + tax
        //System.out.println("Customer has to pay a total of " + total + " for 2 t-shirts and a jacket with tax included.");
        //System.out.println(items);
    }

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Types of loops
//A 'While' loop, repeats while a Boolean expression is true.(not covered in Java Explorer)
//A 'do/while' loop, executes at least once.(not covered in Java Explorer)
//A 'for' loop simply repeats a set number of times. 
//A 'for each' is the enhanced 'for' loop, which automatically iterates through a collection of values. ie. an Array.(collection of values)
/*
        //standard 'for' loop
        //syntax:
        for(<datatype> counter = n; <boolean_expression>; <counter_increment){
            code_block;
        }
        //Example:
        for (int i = 1; i < 5; i++ {
            System.out.println ("i is" + i);
        }
        //output:
        i is 1, i is 2, i is 3, i is 4,
        
        //for each loop (enhanced for loop
        for (<datatype> variable : <array_variable>) {
            System.out.println(variable);
        }
        //Example:
        for (String i :<in> array_variable_name)
            do_this;
        }
        
        //using Break statement to terminate loop
        //Example
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4,6,2,8,12,35,9};
        
        for (int unitScore : scores) {
            if (unitScore >=12) {
            passed = true;
            break;//iteration through loop is terminated when condition is met
           }
        }
        //output:
        //loops through to index 4 = to passmark
        //therefore passmark = true
 */
