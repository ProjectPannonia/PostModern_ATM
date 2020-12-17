package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] currencies = {20_000, 10_000, 5_000, 2_000, 1_000, 500, 200, 100, 50, 20, 10, 5};
	    int[] needed = new int[12];
	    Scanner sc = new Scanner(System.in);
	    int moneyAmount;

	    do {
            System.out.println("Kérlek add meg mennyi pénzt szeretnél kivenni(0-ra vagy 5-re végződjön): ");
	        moneyAmount = sc.nextInt();
	        if(moneyAmount < 0) {
				System.out.println("Kérlek csak pozitív egész számot adj meg!");
	        }else if(moneyAmount % 5 != 0) {
				System.out.println("Kérlek az összeg 0-ra vagy 5-re végződjön!");
			}
        } while (moneyAmount < 0 ||moneyAmount % 5 != 0);

	    int currencyNeeded;

	    for(int i = 0; i < currencies.length; i++) {
	        currencyNeeded = moneyAmount / currencies[i];
	        needed[i] = currencyNeeded;
			moneyAmount = moneyAmount - (currencyNeeded * currencies[i]);
        }
		System.out.println("A kért összeg a következő címletekben kerül kiadásra: ");
	    for (int i = 0; i < currencies.length; i++) {
			System.out.println(currencies[i] + " Ft-os: " + needed[i] + " db.");
		}
    }
}
