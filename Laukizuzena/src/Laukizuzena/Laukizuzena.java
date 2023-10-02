package Laukizuzena;
import java.util.Scanner;

public class Laukizuzena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Laukizuzenaren alde bat (m): ");
		int aldea1 = sc.nextInt();
		System.out.println("Laukizuzenaren bigarren aldea (m): ");
		int aldea2 = sc.nextInt();
		int azalera = aldea1 * aldea2;
		System.out.println("Azalera: " + azalera + " m2");
	}

}

