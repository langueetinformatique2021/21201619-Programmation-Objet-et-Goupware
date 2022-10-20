package TP5;

import TP5.Date;

/**
 * calcul du nombre de jours avant le 14 juillet 2023
 * 
 * @author isha
 *
 */

public class Ex1 {

	public static void main(String[] args) {
			Date today = new Date(20, 10, 2022);
			Date fete14 = new Date(14, 7, 2023);

			int nJours = 0;
			do {
				today.Incrementer();
				nJours++;
			} while (today.CompareTo(fete14));
			
			System.out.println(nJours);
		}

	}