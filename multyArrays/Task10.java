package by.mrbregovich.multyArrays;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы
 */
import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task10 {
	public static void main(String[] args) {
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int n = 15;
		int[][] matrix = mxHelper.getRandomIntMatrix(n, n, -20, 21);
		mxPrinter.print(matrix);

		System.out.println("\nПоложительные элементы главной диагонали матрицы:");
		for (int i = 0; i < n; i++) {
			if (matrix[i][i] > 0)
				System.out.print(matrix[i][i] + "  ");
		}
	}

}
