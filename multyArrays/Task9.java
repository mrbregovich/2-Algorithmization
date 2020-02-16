package by.mrbregovich.multyArrays;

/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму
 */
import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task9 {
	public static void main(String[] args) {
		int rows = 7;
		int cols = 20;
		int[][] matrix = new MatrixHelper().getRandomIntMatrix(rows, cols, 0, 101);

		for (int i = 0; i < cols; i++) {
			System.out.printf("%6d", i);
		}
		System.out.println("\n");

		new MatrixPrinter().print(matrix);

		int maxSum = -1;
		int col = -1;
		for (int j = 0; j < cols; j++) {
			int curSumm = 0;
			for (int i = 0; i < rows; i++) {
				curSumm += matrix[i][j];
			}
			if (curSumm > maxSum) {
				maxSum = curSumm;
				col = j;
			}
		}
		System.out.println("\nМаксимальная сумма элементов столбца равна " + maxSum + " в столбце " + col);
	}

}
