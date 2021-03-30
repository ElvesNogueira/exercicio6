package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("How many rooms will be rented? ");
		
		do {
		n =sc.nextInt();
		}while(!(n>=1 && n<=10));
		
		Rent[] vect= new Rent[10];
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n",i+1);
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Email: ");
			String email=sc.nextLine();
			System.out.print("Room: ");
			int room=sc.nextInt();
			vect[room]=new Rent(name,email);
			
		}
		
		System.out.println("Busy rooms:");
		for(int i=0;i<vect.length;i++) {
			if (vect[i]!=null) {
				System.out.println(i+": "+vect[i]);
			}
			
		}
		
		sc.close();
	}

}
