package by.mrbregovich.multyArrays;

/*
 * ������������� ������ ������� �� ����������� � �������� �������� ���������
 */
import by.mrbregovich.helperPackage.matrix.MatrixHelper;
import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task12 {
	public static void main(String[] args) {
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int[][] matrix = new MatrixHelper().getRandomIntMatrix(10, 20, -10, 11);
		System.out.println("\t������� �� ����������:");
		mxPrinter.print(matrix);

		for (int i = 0; i < matrix.length; i++) {
			sortRowAsc(matrix[i]);
		}
		System.out.println("\t������� ����� ���������� ����� �� �����������:");
		mxPrinter.print(matrix);

		for (int i = 0; i < matrix.length; i++) {
			sortRowDesc(matrix[i]);
		}
		System.out.println("\t������� ����� ���������� ����� �� ��������:");
		mxPrinter.print(matrix);
	}

	private static void sortRowAsc(int[] row) {
		for (int i = 0; i < row.length - 1; i++) {
			int minInd = i;
			for (int j = i + 1; j < row.length; j++) {
				if (row[j] < row[minInd]) {
					minInd = j;
				}
			}
			swap(row, i, minInd);
		}
	}

	private static void sortRowDesc(int[] row) {
		for (int i = 0; i < row.length - 1; i++) {
			int maxInd = i;
			for (int j = i + 1; j < row.length; j++) {
				if (row[j] > row[maxInd]) {
					maxInd = j;
				}
			}
			swap(row, i, maxInd);
		}
	}

	private static void swap(int[] row, int leftInd, int rightInd) {
		int temp = row[leftInd];
		row[leftInd] = row[rightInd];
		row[rightInd] = temp;
	}

}
