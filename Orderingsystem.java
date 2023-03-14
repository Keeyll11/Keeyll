/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurtl;





  
   import java.util.Scanner;
public class Orderingsystem {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           TINDIHAN NI JEVANLOYD          ");
    System.out.println("\t\t\t\t   1.  Shampoo            Php. 10.00");
    System.out.println("\t\t\t\t   2.  Hansel              Php. 12.00");
    System.out.println("\t\t\t\t   3. Toothpaste            Php. 10.00");
    System.out.println("\t\t\t\t   4.  Fundador light           Php.430.00");
    System.out.println("\t\t\t\t   5.  Tanduay Select           Php.130.00");
    System.out.println("\t\t\t\t   6. CANCEL                         ");
    System.out.println("\t\t\t\t+====================================+");
    }
    
    public static void order(){
    System.out.println("Press 1 to Shampoo , Press 2 to Hansel , Press 3 to Toothpaste , Press 4 to Fundador light , Press 5 Tanduay Select Press 6 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
        //conditions
        switch (choose) {
            case 1:
                System.out.println("You choose Shampoo");
                System.out.print("How many Tapsilog you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*45);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 2:
                System.out.println("You choose Hansel");
                System.out.print("How many Tocilog you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*40);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 3:
                System.out.println("You choose Toothpaste");
                System.out.print("How many Longsilog you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                 case 4:
                System.out.println("You choose Fundador light");
                System.out.print("How many Longsilog you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
                case 5:
                System.out.println("You choose Tanduay Select");
                System.out.print("How many Longsilog you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println("You want to buy again? ");
                System.out.println("Press Y for Yes and N for N : ");
                again = input.next();
                if(again.equalsIgnoreCase("Y")){
                    order();//call the method you to create
                }else{
                    System.out.println("Enter a payment ");
                    pay = input.nextDouble();
                    if(pay <=total){
                        System.out.println("Not enough payment");
                    }else{
                        System.out.println("Total price is " + total);
                        total = pay-total;
                        System.out.println("The change is " + total);
                    }
                }       break;
            case 6:
                System.exit(0);//close program
            default:
                System.out.println("Choose 1 to 4 only!");
                order();
                break;
        }
    }
    public static void main(String[] args) {
       menu();
       order();
 
}

}
    
    

