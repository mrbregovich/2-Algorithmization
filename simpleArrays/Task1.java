package by.mrbregovich.simpleArrays;
/*
 * � ������ A[n] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� k.
 */

import java.util.Arrays;

import by.mrbregovich.helperPackage.ArrayHelper;
import by.mrbregovich.helperPackage.UserInputHelper;

class Task1 {
	public static void main(String[] args) {
		// ��������� ������ �� ������������
		UserInputHelper usrInput = new UserInputHelper();
		int n = 0;
		while (n <= 0) {
			n = usrInput.getIntValue("������� ������ ������� ������ ����: ");
		}
		int k = 0;
		while (k < 1 || k > 10) {
			k = usrInput.getIntValue("������� ����� k �� 1 �� 10 ������������: ");
		}

		// �������� �������
		ArrayHelper arrHelper = new ArrayHelper();
		int[] arr = arrHelper.getRandomIntArray(n, -100, 100);
		System.out.println("������ �� " + n + " ��������� ����� �� -100 �� 100");
		System.out.println(Arrays.toString(arr));

		// ����� �����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0)
				sum += arr[i];
		}
		System.out.println("����� ��������� �������, ������� " + k + ", ����� " + sum);
	}
}
