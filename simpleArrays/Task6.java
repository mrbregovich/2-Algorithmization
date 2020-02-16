package by.mrbregovich.simpleArrays;

/*
 * ������ ������������������ N ������������ �����. ��������� ����� �����, ���������� ������ �������
 * �������� �������� �������.
 */
import java.util.Arrays;
import by.mrbregovich.helperPackage.ArrayHelper;

class Task6 {
	public static void main(String[] args) {
		ArrayHelper helper = new ArrayHelper();
		// ���������� ������ ������������������
		int n = 30;
		double[] arr = helper.getRandomDoubleArray(n, 0, 100);
		System.out.println(Arrays.toString(arr));

		// ������ ��� ������� � ������� ������
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++)
			isPrime[i] = true;

		for (int i = 2; i * i < n; i++) {
			if (isPrime[i])
				// ����� ������� i �� �������
				for (int j = i; j * i < n; j++)
					isPrime[i * j] = false;
		}

		// ��������� ��������, ��� ������� - ������� �����
		double sum = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i])
				sum += arr[i];
		}

		System.out.println("����� ����� " + sum);
	}

}
