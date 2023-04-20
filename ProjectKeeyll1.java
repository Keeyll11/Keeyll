/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.keeyll1;

/**
 *
 * @author Student
 */
public class ProjectKeeyll1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          double A[ ]={1.0,3.0,4.0,5.0,20.0,21.0,89.0,23.0};
          double sum=0;
             
          for (int i =0; i < A.length; i++){
              sum+=A[i];
              
          }
          double average = sum/A.length;
          System.out.println("Sum of array is:" + sum);
          System.out.println("Average of array is:" + average);
          
    }
    
}
