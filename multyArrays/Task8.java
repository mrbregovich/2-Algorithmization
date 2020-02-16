package by.mrbregovich.multyArrays;
/*
 * В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца 
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */

import by.mrbregovich.helperPackage.UserInputHelper;

import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task8 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		MatrixHelper mxHelper = new MatrixHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int rows = 5;
		int cols = 10;
		int[][] matrix = mxHelper.getRandomIntMatrix(rows, cols, 0, 101);
		mxPrinter.print(matrix);
		int col1 = -1;
		int col2 = -1;
		while (col1 < 0 || col1 > cols - 1 || col2 < 0 || col2 > cols - 1) {
			System.out.println("\nВведите номера двух столбцов для перестановки в диапазоне от 0 до " + (cols - 1)
					+ " включительно");
			col1 = usrInput.getIntValue("Номер первого столбца: ");
			col2 = usrInput.getIntValue("Номер второго столбца: ");
		}
		for (int i = 0; i < matrix.length; i++) {
			int temp = matrix[i][col1];
			matrix[i][col1] = matrix[i][col2];
			matrix[i][col2] = temp;
		}
		System.out.println("Матрица после перестановки");
		mxPrinter.print(matrix);
	}

}
