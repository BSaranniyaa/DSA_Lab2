package com.greatlearning.labsession02.question;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of currency denominations");
		int size = sc.nextInt();

		System.out.println("Please enter the currency denominations value");
		int currencyValues[] = new int[size];

		for (int i = 0; i < currencyValues.length; i++) {
			currencyValues[i] = sc.nextInt();
		}

		// System.out.println("Before Sorting " + Arrays.toString(currencyValues));

		CurrencyInsertionSort is = new CurrencyInsertionSort();
		is.sort(currencyValues);

		// System.out.println("After Sorting " + Arrays.toString(currencyValues));

		System.out.println("Please enter the amount you want to pay");
		int paymentAmount = sc.nextInt();

		System.out.println("");
		NoteCount nc = new NoteCount();
		nc.counting(currencyValues, paymentAmount);

		sc.close();
	}

}
