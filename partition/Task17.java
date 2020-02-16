package by.mrbregovich.partition;

/*
 * �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. ������� ����� 
 * �������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ ������������.
 */

class Task17 {
	public static void main(String[] args) {
		int number = 1758;
		int count = 0;
		while (number > 0) {
			number -= getSumOfDigits(number);
			count++;
		}
		System.out.println(count);
	}

	private static int getSumOfDigits(int num) {
		int sum = num % 10;
		while ((num = num / 10) != 0)
			sum += num % 10;
		return sum;
	}
}
