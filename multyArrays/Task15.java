package by.mrbregovich.multyArrays;

/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */

import by.mrbregovich.helperPackage.matrix.*;

class Task15 {
	public static void main(String[] args) {
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		final int rows = 5;
		final int cols = 10;
		int[][] matrix = mxHelper.getRandomIntMatrix(rows, cols, -10, 11);
		System.out.println("Матрица:");
		mxPrinter.print(matrix);

		// максимальный элемент
		int maxElem = Integer.MIN_VALUE;
		for (int[] arr : matrix) {
			for (int elem : arr) {
				if (elem > maxElem)
					maxElem = elem;
			}
		}
		System.out.println("Наибольший элемент матрицы равен " + maxElem);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] % 2 == 0)
					matrix[i][j] = maxElem;
			}
		}

		System.out.println("Матрица после замены четных элемнтов значением наибольшего элемента");
		mxPrinter.print(matrix);

	}

}
