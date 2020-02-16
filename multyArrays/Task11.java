package by.mrbregovich.multyArrays;

/*
 * ������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������ �����, �
 * ������� ����� 5 ����������� ��� � ����� ���.
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
				System.out.println("� ������� � �������� " + j + " ����� 5 ����������� " + counter
						+ ((counter == 3 || counter == 4) ? " ����" : " ���"));
		}
	}

}
