package by.mrbregovich.multyArrays;

/*
 * —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
 */

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task5 {
	public static void main(String[] args) {
		int n = 10;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				matrix[i][j] = i + 1;
			}
		}

		new MatrixPrinter().print(matrix);
	}

}
