package by.mrbregovich.multyArrays;

/*
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
 */

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;
import by.mrbregovich.helperPackage.matrix.MatrixHelper;

class Task13 {
	public static void main(String[] args) {
		MatrixPrinter mxPrinter = new MatrixPrinter();
		final int rows = 10;
		final int cols = 20;
		int[][] matrix = new MatrixHelper().getRandomIntMatrix(rows, cols, -10, 11);
		System.out.println("\tМатрица до сортировки:");
		mxPrinter.print(matrix);

		for (int j = 0; j < cols; j++) {
			sortColAsc(matrix, j);
		}
		System.out.println("\tМатрица после сортировки столбцов по возрастанию:");
		mxPrinter.print(matrix);

		for (int j = 0; j < cols; j++) {
			sortColDesc(matrix, j);
		}
		System.out.println("\tМатрица после сортировки столбцов по убыванию:");
		mxPrinter.print(matrix);

	}

	/**
	 * Сортирует один столбец заданной матрицы по возрастанию
	 * 
	 * @param m      матрица для сортировки
	 * @param colInd индекс столбца матрицы для сортировки
	 */
	private static void sortColAsc(int[][] m, int colInd) {
		for (int i = 0; i < m.length - 1; i++) {
			int minInd = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][colInd] < m[minInd][colInd]) {
					minInd = j;
				}
			}
			swap(m, i, minInd, colInd);
		}
	}

	/**
	 * Сортирует один столбец заданной матрицы по убыванию
	 * 
	 * @param m      матрица для сортировки
	 * @param colInd индекс столбца матрицы для сортировки
	 */
	private static void sortColDesc(int[][] m, int colInd) {
		for (int i = 0; i < m.length - 1; i++) {
			int maxInd = i;
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][colInd] > m[maxInd][colInd]) {
					maxInd = j;
				}
			}
			swap(m, i, maxInd, colInd);
		}
	}

	private static void swap(int[][] matrix, int leftInd, int rightInd, int colIndex) {
		int temp = matrix[leftInd][colIndex];
		matrix[leftInd][colIndex] = matrix[rightInd][colIndex];
		matrix[rightInd][colIndex] = temp;
	}

}
