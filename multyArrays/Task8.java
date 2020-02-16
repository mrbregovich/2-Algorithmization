package by.mrbregovich.multyArrays;
/*
 * � �������� ������� �������� ������� ��� ����� �������, �. �. ��� �������� ������ ������� 
 * ��������� �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. 
 * ������ �������� ������ ������������ � ����������.
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
			System.out.println("\n������� ������ ���� �������� ��� ������������ � ��������� �� 0 �� " + (cols - 1)
					+ " ������������");
			col1 = usrInput.getIntValue("����� ������� �������: ");
			col2 = usrInput.getIntValue("����� ������� �������: ");
		}
		for (int i = 0; i < matrix.length; i++) {
			int temp = matrix[i][col1];
			matrix[i][col1] = matrix[i][col2];
			matrix[i][col2] = temp;
		}
		System.out.println("������� ����� ������������");
		mxPrinter.print(matrix);
	}

}
