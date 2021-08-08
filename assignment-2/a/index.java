// a) Write a program to calculate the average of {4,7,2,9} using for each in Java
// b) Given a list of 10 numbers, print the numbers which are not multiples of 4
// c) Given a list of 10 numbers, print first 5 numbers which are multiples of 3
// d) Accept the name and two marks of a student. Compute the average and print the
// result as follows
// If avg<40 , "fail"
// If avg>40 and <60, "first class"
// Else "distinction"

import java.util.Scanner;

public class index {
    public static void main(String[] args){
        
        // A
        System.out.println("A.");
        int a[] = {4,7,2,9};
        float avg = 0;
        
        for (int marks: a){
            avg += marks;
        }
        System.out.println("average: " + avg/4);
        
        // B
        System.out.println("\nB.");
        int b[] = {4,10,26,14,56,32,8,16,5,16};

        for (int i: b){
            if(!(i%4 == 0)){
                System.out.println(i);
            }
        }

        // C
        System.out.println("\nC.");
        int c[] = {9,10,54,21,14,33,32,8,15,5,30,99,69,54};
        int count = 0;

        for(int i = 0; i < c.length && count < 5; i++){
            if(i%3 == 0 && count < 5){
                System.out.println(i);
                count++;
            }
        }

        // C
        System.out.println("\nD.");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Marks: ");
        int marks[]= new int[2];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        sc.close(); 

        float avg2 = (marks[0] + marks[1])/2;
        if(avg2 < 40)
            System.out.println(name + " has FAILED");
        else if(avg2 < 60)
            System.out.println(name + " scored FIRST CLASS");
        else 
            System.out.println(name + " scored DISTINCTION");
    }    
}
