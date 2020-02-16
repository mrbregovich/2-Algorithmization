package by.mrbregovich.multyArrays;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */
import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task11 {
	public static void main(String[] args) {
		final int rows = 10;
		final int cols = 20;
		int[][] matrix = new MatrixHelper().getRandomIntMatrix(rows, cols, 0, 16);
		new MatrixPrinter().print(matrix);

		for (int j = 0; j < cols; j++) {
			int counter = 0;
			for (int i = 0; i < rows; i++) {
				if (matrix[i][j] % 10 == 5)
					counter++;
			}
			if (counter >= 3)
				System.out.println("В столбце с индексом " + j + " цифра 5 встречается " + counter
						+ ((counter == 3 || counter == 4) ? " раза" : " раз"));
		}
	}

}
