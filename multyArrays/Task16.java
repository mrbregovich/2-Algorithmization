package by.mrbregovich.multyArrays;

/*
 * ���������� ��������� ������� n ���������� ���������� ������� ������� nxn, ������������ �� ����� 1, 2, 3,...,2n
 * ���, ��� ����� �� ������� �������, ������ ������ � ������ �� ���� ������� ���������� ����� �����
 * �����. ��������� ����� �������
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.matrix.MatrixPrinter;

class Task16 {
	public static void main(String[] args) {
		MatrixPrinter mxPrinter = new MatrixPrinter();
		int n = 3;
		int sum = n * (n * n + 1) / 2;

		// ������ �����
		int[] numbers = getArrayOfNumbers(n * n);

		// ������� � �������� [0; 0]
		for (int a = 0; a < numbers.length; a++) {
			int elem00 = numbers[a];
			int[] arr01 = getNewArr(numbers, elem00);
			// �������� � �������� [0; 1] � [0; 2]
			for (int b = 0; b < arr01.length; b++) {
				int elem01 = arr01[b];
				int elem02 = sum - elem00 - elem01;
				// ������ �� arr01 ������� elem01 � ��������� ���������� �� ������� elem02
				int[] arr02 = getNewArr(arr01, elem01);
				if (!isContainingNum(arr02, elem02))
					continue;
				// �������� � �������� [1; 0] � [2; 0]
				int[] arr10 = getNewArr(arr02, elem02);
				for (int i = 0; i < arr10.length; i++) {
					int elem10 = arr10[i];
					int elem20 = sum - elem00 - elem10;
					// ������ �� arr10 ������� elem10 � ��������� ���������� �� ������� elem20
					int[] arr20 = getNewArr(arr10, elem10);
					if (!isContainingNum(arr20, elem20))
						continue;
					// �������� � �������� [1; 1] � [2; 1] � [1; 2] � [2; 2]
					int[] arr11 = getNewArr(arr20, elem20);
					for (int j = 0; j < arr11.length; j++) {
						int elem11 = arr11[j];
						int elem12 = sum - elem10 - elem11;
						// ������ �� arr11 ������� elem11 � ��������� ���������� �� ������� elem12
						int[] arr12 = getNewArr(arr11, elem11);
						if (!isContainingNum(arr12, elem12))
							continue;
						int elem21 = sum - elem01 - elem11;
						// ������ �� arr12 ������� elem12 � ��������� ���������� �� ������� elem21
						int[] arr21 = getNewArr(arr12, elem12);
						if (!isContainingNum(arr21, elem21))
							continue;
						// �������� �������� elem22
						int[] arr22 = getNewArr(arr21, elem21);
						int elem22 = sum - elem20 - elem21;
						if (!isContainingNum(arr22, elem22))
							continue;
						if (elem20 + elem21 + elem22 != sum)
							continue;

						// ��������� ������� � ���������. ���� ���������� ������� -> ������� �� �����
						int[][] newMatrix = doSquareMatrix(
								new int[] { elem00, elem01, elem02, elem10, elem11, elem12, elem20, elem21, elem22 },
								n);
						if (isMagicSquare(newMatrix)) {
							mxPrinter.print(newMatrix);
							System.out.println();
						}
					}
				}
			}
		}
	}

	private static int[] getArrayOfNumbers(int maxNum) {
		int[] arr = new int[maxNum];
		for (int i = 0; i < maxNum; i++)
			arr[i] = i + 1;
		return arr;
	}

	// ������ ����� ������ �� ����������� �������� � ������������ ���������. ����
	// ������ �������� ���, ������ ���� ������
	private static int[] getNewArr(int[] numbers, int numToExcl) {
		int[] newArr;
		int pos = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == numToExcl)
				pos = i;
		}
		if (pos == -1)
			newArr = Arrays.copyOf(numbers, numbers.length);
		else {
			newArr = new int[numbers.length - 1];
			for (int i = 0; i < pos; i++) {
				newArr[i] = numbers[i];
			}
			for (int i = numbers.length - 1; i > pos; i--) {
				newArr[i - 1] = numbers[i];
			}
		}
		return newArr;
	}

	private static boolean isContainingNum(int[] arr, int num) {
		for (int elem : arr)
			if (elem == num)
				return true;
		return false;
	}

	private static int[][] doSquareMatrix(int[] arr, int size) {
		int[][] mx = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			mx[i / size][i % size] = arr[i];
		}
		return mx;
	}

	private static boolean isMagicSquare(int[][] matrix) {
		int n = matrix.length;
		int sum = n * (n * n + 1) / 2;
		int diag1 = 0;
		for (int i = 0; i < n; i++)
			diag1 += matrix[i][i];
		int diag2 = 0;
		for (int i = 0; i < n; i++)
			diag2 += matrix[n - 1 - i][i];
		return diag1 == sum && diag2 == sum;
	}

}
