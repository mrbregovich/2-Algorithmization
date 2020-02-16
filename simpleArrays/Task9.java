package by.mrbregovich.simpleArrays;

/*
 * � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. ���� �����
 * ����� ���������, �� ���������� ���������� �� ���
 */

import by.mrbregovich.helperPackage.*;
import java.util.Arrays;

class Task9 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		UserInputHelper usrInput = new UserInputHelper();
		int n = 0;
		System.out.println("������� ������ ������� n ������ ����");
		while (n <= 0) {
			n = usrInput.getIntValue("n: ");
		}
		int[] arr = arrHelper.getRandomIntArray(n, 0, 5);
		System.out.println(Arrays.toString(arr));

		// ������ popular[] ������ ���������� ���������� ������� ����������� ����� �
		// �������.
		// ���� ����� �����������, �� 2 � ��� ����������� ���������� ��� -1 � �������
		// popular[]
		int[] popular = new int[n];
		for (int i = 0; i < n; i++) {
			// -1 ��� ���� ��� �����, ������� ��� ����������� � �������������� ����������
			// ����� => ����������
			if (popular[i] == -1)
				continue;
			// �� -1, ������ ����� ����� => ���������� ������ ���������� ��������� � ������,
			// ������� ������� -1
			for (int j = i; j < n; j++)
				if (arr[j] == arr[i]) {
					popular[i]++;
					popular[j] = -1;
				}
		}

		// ����� ����� ���������� �����. ���� �� ���������, ����� �����������
		int num = arr[0];
		int maxFrequency = popular[0];
		for (int i = 1; i < n; i++) {
			if (popular[i] > maxFrequency) {
				num = arr[i];
				maxFrequency = popular[i];
			} else if ((popular[i] == maxFrequency) && (arr[i] < num)) {
				num = arr[i];
			}
		}

		System.out.println("�������� ����������� ����� (�����������): " + num);

	}

}
