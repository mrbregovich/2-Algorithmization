package by.mrbregovich.multyArrays;

/*
 * —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
 */

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task6 {
	public static void main(String[] args) {
		int n = 10;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i; j++) {
				matrix[i][j] = 1;
			}
		}
		for (int i = n / 2; i < n; i++) {
			for (int j = n - 1 - i; j < i + 1; j++) {
				matrix[i][j] = 1;
			}
		}
		new MatrixPrinter().print(matrix);
	}
}
