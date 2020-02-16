package by.mrbregovich.simpleArrays;

/*
 * ��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������,
 * ������������� � ������� ���������
 */
import java.util.Arrays;

import by.mrbregovich.helperPackage.*;

class Task3 {
	public static void main(String[] args) {

		UserInputHelper inputHelp = new UserInputHelper();
		ArrayHelper arrHelp = new ArrayHelper();
		// ������ �������
		int n = 0;
		// ������� ������������� ���������
		int negCounter = 0;
		// ������� ������������� ���������
		int posCounter = 0;
		// ������� ���������, ������ ����
		int zeroCounter = 0;

		while (n <= 0) {
			n = inputHelp.getIntValue("������� ������ �������: ");
		}

		int[] arr = arrHelp.getRandomIntArray(n, -100, 100);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				negCounter++;
			else if (arr[i] > 0)
				posCounter++;
			else
				zeroCounter++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("���������� ������������� ���������: " + negCounter);
		System.out.println("���������� ������������� ���������: " + posCounter);
		System.out.println("���������� ���������, ������ ����: " + zeroCounter);
	}
}
