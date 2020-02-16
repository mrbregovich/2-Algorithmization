package by.mrbregovich.sorting;

/*
 * ���� ����� p1/q1, p2/q2, ... pn/qn ( pi, qi - �����������). ��������� ���������, ������� �������� ��� ����� � ������
 * ����������� � ������������� �� � ������� �����������
 */

import by.mrbregovich.helperPackage.matrix.*;

class Task8 {
	public static void main(String[] args) {
		// ����� ������������ �������� �� 2 ��������� ���� int[] fr, ��� fr[0] -
		// ���������, fr[1] - �����������
		// ������� frArr[][] - ������ �� 10 ������
		MatrixHelper mxHelper = new MatrixHelper();
		int[][] frArr = mxHelper.getRandomIntMatrix(10, 2, 1, 11);
		for (int[] fr : frArr) {
			printFr(fr);
		}
		sortFr(frArr);
		System.out.println("����� ���������� �� �����������");
		for (int[] fr : frArr) {
			printFr(fr);
		}
	}

	private static void printFr(int[] fr) {
		System.out.println(fr[0] + "/" + fr[1]);
	}

	private static void sortFr(int[][] frArr) {
		int outer, inner;
		int[] temp;
		for (outer = 1; outer < frArr.length; outer++) {
			temp = frArr[outer];
			inner = outer;
			while (inner > 0 && isGreater(frArr[inner - 1], temp)) {
				frArr[inner] = frArr[inner - 1];
				inner--;
			}
			frArr[inner] = temp;
		}
	}

	private static boolean isGreater(int[] fr1, int[] fr2) {
		if (fr1[0] * fr2[1] > fr2[0] * fr1[1])
			return true;
		return false;
	}
}
