package by.mrbregovich.partition;

import by.mrbregovich.helperPackage.UserInputHelper;

/*
 * ���� ����� X, Y, Z, � � ����� ������ ����������������. �������� �����(������) ���������� ��� �������, 
 * ���� ���� ����� ��������� ������ X � Y� ������.
 */

class Task9 {
	public static void main(String[] args) {
		UserInputHelper usrInput = new UserInputHelper();
		double a, b, c, d;
		do {
			a = usrInput.getDoubleValue("������� ����� ������� a > 0\n");
		} while (a <= 0);
		do {
			b = usrInput.getDoubleValue("������� ����� ������� b > 0\n");
		} while (b <= 0);
		do {
			c = usrInput.getDoubleValue("������� ����� ������� c > 0\n");
		} while (c <= 0);
		do {
			d = usrInput.getDoubleValue("������� ����� ������� d > 0\n");
		} while (d <= 0);
		System.out.println("������� ��������������� �� ��������� " + a + ", " + b + ", " + c + " � " + d + " ����� "
				+ getRectAreaBySydes(a, b, c, d));
	}

	private static double getRectAreaBySydes(double a, double b, double c, double d) {
		double p = (a + b + c + d) / 2;
		return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
	}

}
