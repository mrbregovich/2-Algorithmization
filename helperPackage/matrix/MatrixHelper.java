package by.mrbregovich.helperPackage.matrix;

import java.util.Random;

public class MatrixHelper {
	private final Random rand;

	public MatrixHelper() {
		rand = new Random();
	}

	/**
	 * ¬озвращает матрицу заданного размера, заполненную случайными целыми числами
	 * 
	 * @param rows      количество строк матрицы
	 * @param cols      количество столбцов матрицы
	 * @param lowBound  минимальное значение элемента в матрице inclusive
	 * @param highBound максимальное значение элемента в матрице exclusive
	 */
	public int[][] getRandomIntMatrix(int rows, int cols, int lowBound, int highBound) {
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				matrix[i][j] = rand.nextInt(highBound - lowBound) + lowBound;
		}
		return matrix;
	}

	/**
	 * ¬озвращает матрицу заданного размера, заполненную случайными дробными числами
	 * 
	 * @param rows      количество строк матрицы
	 * @param cols      количество столбцов матрицы
	 * @param lowBound  минимальное значение элемента в матрице inclusive
	 * @param highBound максимальное значение элемента в матрице exclusive
	 */
	public double[][] getRandomDoubleMatrix(int rows, int cols, int lowBound, int highBound) {
		double[][] matrix = new double[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				matrix[i][j] = rand.nextDouble() * (highBound - lowBound) + lowBound;
		}
		return matrix;
	}
	
	
}
