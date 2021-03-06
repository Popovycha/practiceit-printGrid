package com.gmail.mybmcc22;

/**
 * Write a method named printGrid that accepts two integer parameters rows and
 *  * cols. The output is a comma-separated grid of numbers where the first
 *  * parameter (rows) represents the number of rows of the grid and the second
 *  * parameter (cols) represents the number of columns. The numbers count up
 *  * from 1 to (rows x cols). The output are displayed in column-major order,
 *  * meaning that the numbers shown increase sequentially down each column and
 *  * wrap to the top of the next column to the right once the bottom of the
 *  * current column is reached. Assume that rows and cols are greater than 0.
 */
public class Main {

    public static void main(String[] args) {
	printGrid(3, 6);
	printGrid(5, 3);
	printGrid(4, 1);
    }
    static void printGrid(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            int end = i + rows * (cols - 1);
            for (int j = i; j <= end; j += rows) {
                System.out.print(j);
                if (j != end) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
