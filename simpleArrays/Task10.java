package by.mrbregovich.simpleArrays;

/*
 * ��� ������������� ������ � ����������� ��������� �. ����� ������, �������� �� ���� ������ ������
 * ������� (�������������� �������� ��������� ������). ����������. �������������� ������ �� ������������.
 */

import by.mrbregovich.helperPackage.*;
import java.util.Arrays;

class Task10 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		UserInputHelper usrInput = new UserInputHelper();
		int n = 0;
		System.out.println("������� ������ ������� n ������ ����");
		while (n <= 0) {
			n = usrInput.getIntValue("n: ");
		}
		int[] arr = arrHelper.getRandomIntArray(n, 0, 100);
		System.out.println(Arrays.toString(arr));

		// ����� ������
		for (int i = 2, j = 1; i < n; i += 2) {
			arr[j++] = arr[i];
		}
		// �������� ������� ������� � ������� midInd
		int midInd = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		for (int i = midInd; i < n; i++) {
			arr[i] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}

}
