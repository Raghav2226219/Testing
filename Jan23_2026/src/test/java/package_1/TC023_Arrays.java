package package_1;

import java.util.Arrays;

public class TC023_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		int[] a = {1,2,3,4,5};
		
		int[][] arr2 = new int[2][2];
		
		int[] num;
		String[] name;
		
//		Static initialization
		
		int[] numbers1 = {10,20,30,40,50};
		System.out.println(numbers1[3]);
		System.out.println();
		System.out.println("Length of numbers1: " + numbers1.length);
		System.out.println();
		for(int i=0; i<numbers1.length; i++) {
			System.out.print(numbers1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int val : numbers1) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		System.out.println();
		
//		Dynamic initialization
		
		int[] number2 = new int[5];
		number2[0] = 100;
		
		
		
		int[][] matrix = {{1,2,3},{4,5,6}};
		
		System.out.println(matrix[1][2]);
		
		System.out.println();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] arr3 = {34,22, 65, 55, 54,44,54};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

	}

}