package Devoir1;

/** @author Anne Faury */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercice4 {

		public static void main(String[] args) {

			int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
			int p6;
/**
* Obtenir la médiane des variables p1, p2, p3, p4, p5 dans la variable p6.
*/	
				
/**
* Trouver la valeur max
*/
					
			int p7;
			
			if (p1 < p2) {
				p7 = p2;
			}
			else {
				p7 = p1;
			}
			if (p7 < p3) {
				p7 = p3;
			}
			else if (p7 < p4) {
				p7 = p4;

			}
			else if (p7 < p5) {
				p7 = p5;
			}
			
//			System.out.println(p7);		
					
/**
* Trouver la valeur min
*/
			
			int p8;
			
			if (p1 > p2) {
				p8 = p2;
			}
			else {
				p8 = p1;
			}
			if (p8 > p3) {
				p8 = p3;
			}
			else if (p8 > p4) {
				p8 = p4;
			}
			else if (p8 > p5) {
				p8 = p5;
			}
			
//			System.out.println(p8);				
			
/**
* Créer une liste sans les valeurs max et min
*/

			ArrayList p = new ArrayList();
			
			if((p1 != p7) && (p1 != p8)){
//				System.out.println(p1);	
				p.add(p1);
			}

			if ((p2 != p7) && (p2 != p8)) {
				p.add(p2);
			}
			
			if ((p3 != p7) && (p3 != p8)) {	
				p.add(p3);
			}
			
			if ((p4 != p7) && (p4 != p8)) {
				p.add(p4);
			}
			
			if ((p5 != p7) && (p5 != p8)) {	
				p.add(p5);
			}
			

//	        System.out.println(p);


/**
* Trouver la médiane
*/

			p1 = (int) p.get(0);
			p2 = (int) p.get(1);
			p3 = (int) p.get(2);
			
			if (p1 < p2) {
				if (p3 < p1)
					p6 = p1;
				else {
					if (p2 < p3)
						p6 = p2;
					else
						p6 = p1;

				}

			} else {
				if (p3 < p2)
					p6 = p2;
				else {
					if (p1 > p3)
						p6 = p3;
					else
						p6 = p1;

				}

			}
			
			System.out.println(p6);
			
			
		}
	}