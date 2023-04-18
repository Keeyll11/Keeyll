/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Keeyll;

import java.util.Scanner;

public class Keeyll {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int discount=1;
    public static int choose,quantity=1;
    public static double total=0,pay;
    
    public static void menu(){
   
    System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t        Don Macha Restaurant MENU     ");
    System.out.println("\t\t\t\t   1. Crispy Pata          Php. 230.00");
    System.out.println("\t\t\t\t   2. Chicken Fillet       Php. 180.00");
    System.out.println("\t\t\t\t   3. Baby Back Ribs       Php. 380.00");
    System.out.println("\t\t\t\t   4. Calamares            Php. 200.00");
    System.out.println("\t\t\t\t   5. Chopsuey             Php. 250.00");
    System.out.println("\t\t\t\t+=========================================+");
        System.out.println("");
    System.out.println("\t\t\t\t   AVAIL OUR PROMO NOW!");
    System.out.println("\t\t   - Total order of Php 500.00 or more to get 1 Free Chicken Fillet!");
    System.out.println("\t\t   - Total order of Php 1300.00 or more get 1 Free Baby Back Ribs!!!");
    System.out.println("\t\t    Note: Can avail both promos at the same time.");
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     Code 1 - Couple discount ( 11% off )");
    System.out.println("\t\t\t\t     Code 2 - Birthday discount ( 18% off )");
    System.out.println("\t\t\t\t     Note: Discounts cannot be stacked");
    }
    
     public static void list1() {    
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " Crispy Pata");
            case 2 -> System.out.println("\t" + quantity + " Chicken Fillet");
            case 3 -> System.out.println("\t" + quantity + " Baby Back Ribs");
            case 4 -> System.out.println("\t" + quantity + " Calamares");
            case 5 -> System.out.println("\t" + quantity + " Chopsuey ");
            default -> {
            }
        }
  }
    public static void list2(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " Crispy Pata");
            case 2 -> System.out.println("\t" + quantity + " Chicken Fillet");
            case 3 -> System.out.println("\t" + quantity + " Baby Back Ribs");
            case 4 -> System.out.println("\t" + quantity + " Calamares");
            case 5 -> System.out.println("\t" + quantity + " Chopsuey ");
            default -> {
            }
        }
    }
    public static void list3(){
        switch (choose) {
           case 1 -> System.out.println("\t" + quantity + " Crispy Pata");
            case 2 -> System.out.println("\t" + quantity + " Chicken Fillet");
            case 3 -> System.out.println("\t" + quantity + " Baby Back Ribs");
            case 4 -> System.out.println("\t" + quantity + " Calamares");
            case 5 -> System.out.println("\t" + quantity + " Chopsuey ");
            default -> {
            }
        }
    }
    public static void list4(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " Crispy Pata");
            case 2 -> System.out.println("\t" + quantity + " Chicken Fillet");
            case 3 -> System.out.println("\t" + quantity + " Baby Back Ribs");
            case 4 -> System.out.println("\t" + quantity + " Calamares");
            case 5 -> System.out.println("\t" + quantity + " Chopsuey ");
            default -> {
            }
        }
    }
    public static void list5(){
        switch (choose) {
            case 1 -> System.out.println("\t" + quantity + " Crispy Pata");
            case 2 -> System.out.println("\t" + quantity + " Chicken Fillet");
            case 3 -> System.out.println("\t" + quantity + " Baby Back Ribs");
            case 4 -> System.out.println("\t" + quantity + " Calamares");
            case 5 -> System.out.println("\t" + quantity + " Chopsuey ");
            default -> {
            }
        }
    }
    
    public static void order(){
        System.out.println("");
        System.out.println("Enter 6: CANCEL");     
        System.out.println("Enter the Number of your order: "); choose = input.nextInt();
        System.out.println("");                
         
        switch (choose) {
 
            case 1:
                System.out.println("You chose Crispy Pata");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();   
                total = total +(quantity*230);
      break;
            
            case 2:
                System.out.println("You chose Chicken Fillet");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();         
                total = total +(quantity*180);        
       break;
           
            case 3:
                System.out.println("You chose Baby Back Ribs");
                System.out.println("Enter the quantity of your order: "); quantity =input.nextInt();               
                total = total +(quantity*380);
       break;
            
            case 4:
                System.out.println("You chose is Calamares");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*200);
      break;
            
            case 5:
                System.out.println("You chose Chopsuey");
                System.out.println("Enter the quantity of your order: ");
                quantity =input.nextInt();
                total = total +(quantity*250);
      break;
            
            case 6:
                System.exit(0);
            
            default:
                System.out.println("Choose 1 to 6 only!");
                order();
        break;
        }
        
                if(total >=500){
                    System.out.println("You have 1 Free Chicken Fillet !");
                }       
                if( total >=1300){
                    System.out.println("You have 1 Free Baby Back Ribs!!!");
                }
                              
                System.out.println("");
                System.out.println("Add more?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();                
                }
                else{
                    System.out.println("\t---Discount List---");
                    System.out.println(" We also offer discount to the following:");
                System.out.println(" Code 1 - Couple discount ( 11% off )");
                System.out.println(" Code 2 - Birthday discount ( 18% off )");
                System.out.println(" Note: Discounts cannot be stacked");
                    System.out.println("");
                    System.out.println("Enter 3 if neither applicable");
                    System.out.println("Enter your Code: "); discount = input.nextInt();
                    if(discount ==1){
                        total = total*0.55;
                    }
                    if(discount ==2){
                        total = total*0.50;
                    }
                    if(discount==3){
                        System.out.println("No discount applicable");
                        total = total - 0;
                    }                                                               
                    System.out.println("");
                    System.out.println("The bill is Php " + total + "0");
                    System.out.println("Enter Cash: "); pay = input.nextDouble();
                    
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }  
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("Enter Cash: "); pay = input.nextDouble();
                    }
                    if(pay <total){
                        System.out.println("---Input sufficient cash amount---");
                        System.out.println("3 Consecutive input invalid cash amount");
                    }
                    else{
                        total = pay-total;
                        System.out.println("The change is Php " + total + "0");
                      }
                    }                            
                System.out.println("Order again?");
                System.out.println("Enter 1 for Yes and 2 for No: ");
                        choose = input.nextInt();
                        if(choose==1){
                            System.out.println("\t\t\t\t+=========================================+");
    System.out.println("\t\t\t\t           Jamielicious MENU          ");
    System.out.println("\t\t\t\t  1. Crispy Pata          Php. 230.00");
    System.out.println("\t\t\t\t   2. Chicken Fillet       Php. 180.00");
    System.out.println("\t\t\t\t   3. Baby Back Ribs       Php. 380.00");
    System.out.println("\t\t\t\t   4. Calamares            Php. 200.00");
    System.out.println("\t\t\t\t   5. Chopsuey             Php. 250.00");
    System.out.println("\t\t\t\t+=========================================+");
        System.out.println("");
    System.out.println("\t\t\t\t   AVAIL OUR PROMO NOW!");
    System.out.println("\t\t   - Total order of Php 700.00 or more to get 1 Free of chicken Fillet!");
    System.out.println("\t\t   - Total order of Php 1500.00 or more get 1 Free Baby Back Ribs!!!");
    System.out.println("\t\t    Note: Can avail both promos at the same time.");
        System.out.println("");
    System.out.println("\t\t\t\t   We also offer discounts on the following:");
    System.out.println("\t\t\t\t     Code 1 - Couple discount ( 11% off )");
    System.out.println("\t\t\t\t     Code 2 - Birthday discount ( 18% off )");
    System.out.println("\t\t\t\t     Note: Discounts cannot be stacked");
    total=total-total;
                            order();}
                        else{System.exit(0);}    
    }     
   
    public static void main(String[] args) {    
       menu();
       order();       
    }
    
}