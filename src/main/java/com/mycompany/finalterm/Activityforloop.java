/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Activityforloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        String[] subjects = {"Computing","Physics","Algebra","History","Programming"};
       
        //Prompt user to enter grade
        System.out.println("Please enter the grades of the following subjects: ");
        for(int i = 0; i < subjects.length; i++){
            //System.out.print(subjects[i] + " : " );
            //grades[i] = scanner.nextDouble();
            double grade;
            do{
                System.out.print(subjects[i] + " : ");
                while (!scanner.hasNextDouble()){
                    System.out.println("Invalid input. Please enter a numeric value ");
                    scanner.next(); //clear invalid input        
                }
                grade = scanner.nextDouble();
                if (grade < 65 || grade > 100 ){
                    System.out.println("Invalid grade. Please enter a value between 0  and 100.");
                }
            }while(grade < 65 || grade > 100);
            grades[i] = grade;
            
              
                  
        }
        System.out.println("\nGrades of the subject:");
        for (int i = 0; i  < subjects.length;  i++){
            System.out.println(subjects[i] + " : " + grades[i]);
            
               
        }
        System.out.println("Total No. of Subject: " + grades.length);
       
        int totalgrade = 0;
       
        for (int i = 0; i <  grades.length; i++){
           totalgrade += grades [i];
           
       }
        double average = (double)totalgrade / grades.length;
       
       System.out.println("The average grade is: " + average);
       
       System.out.println("\nGrade Classification: ");
       for(int i = 0; i < grades.length; i++){
        char gradesClassification;
           if(grades[i] >= 90) {
               gradesClassification = 'A';    
           } else if (grades[i] >= 80){
               gradesClassification = 'B';  
           } else if (grades[i] >= 70) {
               gradesClassification = 'C';  
           } else if (grades[i] >= 60){
               gradesClassification = 'D';
           } else {
               gradesClassification = 'F';
           }
           System.out.println(subjects[i] + ":" + grades[i] + " -> " + gradesClassification);
           
       }
       
//     check for the subjects below 75
       System.out.println("\nSubjects with grades below 75: ");
       
       // Identify the highest and lowest grades
       double maxGrade = grades[0];
       double minGrade = grades[0];
       String maxSubject = subjects[0];
       String minSubject = subjects[0];
       
       for (int i = 1; i < grades.length; i++){
           if (grades[i] > maxGrade){
               maxGrade = grades[i];
               maxSubject = subjects[i];
           }
           
           if (grades[i] < minGrade){
               minGrade = grades[i];
               minSubject = subjects[i];
               
           }
       }
        System.out.println("\nHighest grdae: " + maxSubject + " : " + maxGrade);
        System.out.println("\nLowest grade : " + minSubject + " : " + minGrade);
        
        
       
                
    }
    
}
