package by.mrbregovich.helperPackage.matrix;

public class MatrixPrinter {
	public MatrixPrinter() {
	}

	/**
	 * Выводит матрицу целых чисел на консоль
	 * 
	 * @param matrix матрица для вывода на консоль
	 */
	public void print(int[][] matrix) {
		if (matrix == null)
			return;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("%6d", matrix[i][j]);
			System.out.println();
		}
	}

	/**
	 * Выводит матрицу дробных чисел на консоль
	 * 
	 * @param matrix матрица для вывода на консоль
	 */
	public void print(double[][] matrix) {
		if (matrix == null)
			return;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.printf("%10.3f", matrix[i][j]);
			System.out.println();
		}
	}

}
