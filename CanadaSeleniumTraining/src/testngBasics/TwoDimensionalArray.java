package testngBasics;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size of array");
		int row_size=sc.nextInt();
		System.out.println("Enter column size of array");
		int col_size=sc.nextInt();
		
		//declare a two dimensional array of type string
		
		String[][] data=new String[row_size][col_size];
		System.out.println("Enter "+row_size*col_size+" array values ");
		
		for(int i=0;i<row_size;i++) {
			for(int j=0;j<col_size;j++) {
				data[i][j]=sc.next();
			}
		}
		for(int i=0;i<row_size;i++) {
			for(int j=0;j<col_size;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		/*
		 * int size=sc.nextInt(); 
		 * String[] data=new String[size];
		 * System.out.println("Enter "+size+" array values "); 
		 * for(int i=0;i<data.length;i++) { 
		 * data[i]=sc.next(); 
		 * } 
		 * System.out.println(); 
		 * for (int i = 0; i < data.length; i++) { 
		 * System.out.println(data[i]); 
		 * }
		 */

	}

}
