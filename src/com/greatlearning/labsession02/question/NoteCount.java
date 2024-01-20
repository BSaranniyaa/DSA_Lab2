package com.greatlearning.labsession02.question;

public class NoteCount {

	public void counting(int[] currency, int paymentAmount) {
		int notes[] = new int[currency.length];

		// int sum = 0;
		for (int i = 0; i < notes.length; i++) {
			notes[i] = paymentAmount / currency[i];
			paymentAmount = paymentAmount % currency[i];
			// sum+= notes[i];
		}
		System.out.println("Your payment approach in order to give min no of notes will be ");
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != 0)
				System.out.println(currency[i] + ":" + notes[i]);
		}

	}

}
