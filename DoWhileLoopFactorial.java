/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurtl;





  
   import java.util.Scanner;
public class DoWhileLoopFactorial {
    
       Scanner input = new Scanner(System.in); 
         
        
       
       int a = 1;
       int fact= 1;
        int  i= 1;
       
       System.out.println( a);
       
         
         do {
          
             
                a=a+1  ;
               
             
 
             
                
                
       
           
       if (a %2==0) {  System.out.println( a +" (even)");  do {   
                
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the given number " +a +" ! is " + fact);}
             
      
                else  {  System.out.println(a +" (odd)  ");
                
              do {   
                 
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the given number " +a +" ! is " + fact);
        
      
              
     
       
       
       }  
               
   }  while(a <17);  
     
     
      
  
              
          
     
         
         
         

    }
       
         
    
         
         
      
      
        
           
           
           }
    
    

