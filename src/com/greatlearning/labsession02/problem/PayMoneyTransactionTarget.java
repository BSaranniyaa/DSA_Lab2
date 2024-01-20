package com.greatlearning.labsession02.problem;

import java.util.Scanner;

public class PayMoneyTransactionTarget {

	static int dayAchieved;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of transaction");
		int transactionSize = sc.nextInt();

		int transactionValues[] = new int[transactionSize];
		System.out.print("Please enter the value of transactions");

		for (int i = 0; i < transactionValues.length; i++) {
			transactionValues[i] = sc.nextInt();
		}

		System.out.println("Please enter the total no of targets that needs to be achieved");
		int totalTargets = sc.nextInt();

		for (int i = 1; i <= totalTargets; i++) {

			System.out.println("Please enter the values of target" + i);
			int target = sc.nextInt();

			if (targetAchieved(transactionValues, target)) {
				System.out.println("Target achieved after " + dayAchieved + " transactions");
				System.out.println();
			} else {
				System.out.println("Given target is not achieved");
				System.out.println();
			}
		}
		sc.close();
	}

	private static boolean targetAchieved(int[] transactionValues, int target) {
		int sum = 0;
		boolean flag = false;
		for (int d = 0; d < transactionValues.length; d++) {
			sum += transactionValues[d];
			if (sum >= target) {
				dayAchieved = d + 1;
				flag = true;
				break;
			}
		}
		return flag;

	}

}