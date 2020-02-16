package by.mrbregovich.partition;

/*
 * �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ����
 * ����������� �����:
 */

import by.mrbregovich.helperPackage.UserInputHelper;

class Task1 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		int a, b;
		do {
			System.out.println("������� ��� ����� ����� ������ ����");
			a = usrInput.getIntValue("a: ");
			b = usrInput.getIntValue("b: ");
		} while (a <= 0 || b <= 0);
		System.out.println("���������� ����� ������� ����� " + a + " � " + b + " ����� " + lcm(a, b));
	}

	// ���������� ���
	private static int gcd(int a, int b) {
		if (b == 0)
			return Math.abs(a);
		return gcd(b, a % b);
	}

	// ���������� ����������� ������ ��������
	private static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
}
