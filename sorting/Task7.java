package by.mrbregovich.sorting;

/*
 * ����� ���� ��� ����������� ������������������ �������������� ����� a1 <= a2 <=...<= an � b1 <=b2 <=...<= bm .
 * ��������� ������� �� �����, �� ������� ����� ��������� �������� ������������������ b1 <= b2 <=...<= bm � ������
 * ������������������ ���, ����� ����� ������������������ ���������� ������������
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;

class Task7 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 10;
		int[] arrA = arrHelper.getRandomIntArray(size, -10, 10);
		Arrays.sort(arrA);
		int[] arrB = arrHelper.getRandomIntArray(size, -10, 10);
		Arrays.sort(arrB);
		System.out.println("������ arr� ����������� �����");
		System.out.println(Arrays.toString(arrA));
		System.out.println("������ arrB ����������� �����");
		System.out.println(Arrays.toString(arrB));
		int indA = 0;
		int indB = 0;
		// ������� ������������������ B, ������� ����������� � ������ ������������������
		// �
		while (indB < arrB.length && arrB[indB] < arrA[indA]) {
			indB++;
		}
		if (indB > 0) {
			System.out.println("����� ��������� arr�[" + indA + "]:" + arrA[indA] + " ����������� " + " ��������:");
			for (int i = 0; i < indB; i++) {
				System.out.print("arrB[" + i + "]:" + arrB[i] + "  ");
			}
			System.out.println();
		}
		// ������� � �������� ������������������ �
		while (indA < arrA.length && indB < arrB.length) {
			if (arrB[indB] < arrA[indA]) {
				System.out.println("�������� ������� arrB[" + indB + "]:" + arrB[indB] + " ����� ��������� arrA[" + indA
						+ "]:" + arrA[indA]);
				indB++;
			} else {
				indA++;
			}
		}
		// ��������� ���������� �������� � ������������������ arrB
		if (indA == arrA.length) {
			System.out.println("� ����� ������������������ arrA �������� ��������:");
			for (int i = indB; i < arrB.length; i++) {
				System.out.print("arrB[" + i + "]:" + arrB[i] + "  ");
			}
		}
	}

}
