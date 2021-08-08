// Accept a number X and print the numbers from 1 to X in following patterns
// x = 5

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


import java.util.Scanner;

public class index{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Magic Number: ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("Random Triangle Art - 1 \n");
        for(int i = 1; i <= x ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("\nRandom Triangle Art - 2 \n");
        for(int i = 1, j = 1; i <= x; i++){
            for(int k = 0; k < i; k++, j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}