package by.mrbregovich.partition;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */

import by.mrbregovich.helperPackage.ArrayHelper;

import java.util.Arrays;;

class Task2 {
	public static void main(String[] args) {
		ArrayHelper arrHelper = new ArrayHelper();
		int size = 4;
		int[] nums = arrHelper.getRandomIntArray(size, 10, 30);
		System.out.println(Arrays.toString(nums));
		System.out.println("Наибольший общий делитель: " + gcdOfNums(nums));
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return Math.abs(a);
		return gcd(b, a % b);
	}

	private static int gcdOfNums(int... nums) {
		if (nums.length == 1)
			return nums[0];
		else if (nums.length == 2)
			return gcd(nums[0], nums[1]);
		int curGCD = gcd(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			curGCD = gcd(curGCD, nums[i]);
		}
		return curGCD;
	}

}
