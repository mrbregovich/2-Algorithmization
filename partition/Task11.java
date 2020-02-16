package by.mrbregovich.partition;
/*
 *  �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.
 */

class Task11 {
	public static void main(String[] args) {
		int a = 123456;
		int b = 1234567;
		findLongerNum(a, b);

	}

	private static int getLen(int num) {
		int count = 1;
		while ((num /= 10) != 0)
			count++;
		return count;
	}

	private static void findLongerNum(int firstNum, int secondNum) {
		int firstNumLen = getLen(firstNum);
		int secondNumLen = getLen(secondNum);
		if (firstNumLen > secondNumLen)
			System.out.println("����� " + firstNum + " �������� ������ ����, ��� " + secondNum);
		else if (firstNumLen < secondNumLen)
			System.out.println("����� " + secondNum + " �������� ������ ����, ��� " + firstNum);
		else
			System.out.println("���������� ���� � ����� ������ ���������");

	}
}
