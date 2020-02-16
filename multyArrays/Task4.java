package by.mrbregovich.multyArrays;

/*
 * —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 */

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task4 {
	public static void main(String[] args) {
		int n = 10;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = j + 1;
			}
		}
		for (int i = 1; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = n - j;
			}
		}
		new MatrixPrinter().print(matrix);
	}
}
