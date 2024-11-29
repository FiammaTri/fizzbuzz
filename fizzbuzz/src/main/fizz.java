/* Ciclare tutti i numeri da 1 a 50, e stampare seguendo questa regola:

se il numero è multiplo di 3, stampare la parola "Fizz";
se il numero è multiplo di 5, stampare la parola "Buzz";
se il numero è multiplo sia di 3 che di 5, stampare la parola "FizzBuzz";
se il numero non è multiplo né di 3 né di 5, stampare il numero. */

//Fiamma Trillò

package main;

public class fizz {

	public static void main(String[] args) {
		int num;
		
		for(num=0; num<=50; num++) { 						//Apro la condizione e il ciclo; aumenta num di 1 fino a raggiungere 50
			
			if (num%3==0 && num%5==0) {System.out.println("PariDispari"); // se il resto della divisione per 3 E 5 è 0 stampa FizzBuzz
			} else if (num%3==0) {System.out.println("Pari");   // se il resto della divisione per 3 è 0 stampa Fizz
			} else if (num%5==0) {System.out.println("Dispari");   // se il resto della divisione per 5 è 0 stampa Buzz
			} else {System.out.println(num); // se il resto della divisione è diverso dalle precedenti stampa il numero
			}
		
		}
	}

}
