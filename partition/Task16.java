package by.mrbregovich.partition;

/*
 * �������� ���������, ������������ ����� n - ������� �����, ���������� ������ �������� �����.
 * ���������� �����, ������� ������ ���� � ��������� �����. ��� ������� ������ ������������ ������������.
 */

class Task16 {
	public static void main(String[] args) {
		int size = 2;
		int sum = getSummOfOddDigitsNums(size);
		System.out.println("����� " + size + "-������� �����, ���������� ������ �������� �����: " + sum);
		int numOfDigits = countDigits(sum);
		System.out.println("���������� ������ ���� � ��������� �����: " + countEvenDigits(sum, numOfDigits));
	}

	private static int countDigits(int num) {
		int count = 1;
		while ((num /= 10) > 0)
			count++;
		return count;
	}

	private static int countEvenDigits(int num, int numOfDigits) {
		int count = 0;
		for (int i = 0; i < numOfDigits; i++) {
			if (num % 10 % 2 == 0)
				count++;
			num /= 10;
		}
		return count;
	}

	private static int getSummOfOddDigitsNums(int numOfDigits) {
		int sum = 0;
		int x = (int) Math.pow(10, numOfDigits - 1);
		for (int i = 1 * x; i < 10 * x; i++) {
			if (countEvenDigits(i, numOfDigits) == 0)
				sum += i;
		}
		return sum;
	}
}
