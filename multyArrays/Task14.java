package by.mrbregovich.multyArrays;

/*
 * ������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ ������� �����
 * ������ ����� ������ �������
 */
import java.util.Random;

import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;
import by.mrbregovich.helperPackage.UserInputHelper;

class Task14 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		MatrixPrinter mxPrinter = new MatrixPrinter();
		MatrixHelper mxHelper = new MatrixHelper();
		int rows = 0;
		int cols = 0;
		while (rows <= 0 || cols <= 0) {
			System.out.println("������� ���������� ����� � �������� ������� (������ ����)");
			rows = usrInput.getIntValue("���������� �����: ");
			cols = usrInput.getIntValue("���������� ��������: ");
		}
		int[][] matrix = mxHelper.getRandomIntMatrix(rows, cols, 0, 1);
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows && i < j; i++) {
				matrix[i][j] = 1;
			}
		}

		for (int j = 0; j < cols; j++) {
			shuffle(matrix, j);
		}

		mxPrinter.print(matrix);
	}

	private static void shuffle(int[][] matrix, int colIndex) {
		final Random rand = new Random();
		for (int i = 1; i < matrix.length; i++) {
			int randomRowIndex = rand.nextInt(matrix.length - i) + i;
			int temp = matrix[i - 1][colIndex];
			matrix[i - 1][colIndex] = matrix[randomRowIndex][colIndex];
			matrix[randomRowIndex][colIndex] = temp;
		}

	}

}
