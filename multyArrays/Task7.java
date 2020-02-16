package by.mrbregovich.multyArrays;

/*
 * —формировать квадратную матрицу пор€дка N по правилу:
 * A[I, J] = sin( (I^2-J^2)/N ) 
 * и подсчитать количество положительных элементов в ней
 */

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task7 {
	public static void main(String[] args) {
		int n = 10;
		int counter = 0;
		double[][] matrix = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Math.sin((i * i - j * j) / n);
				if (matrix[i][j] > 0) {
					counter++;
				}
			}
		}
		new MatrixPrinter().print(matrix);
		System.out.println(" оличество положительных элементов матрицы: " + counter);
	}
}
