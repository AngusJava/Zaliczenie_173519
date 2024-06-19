// Napisz program, który odwraca tablicę z wartościami całkowitymi:
// - Program powinien wczytać tablicę liczb całkowitych wprowadzoną przez użytkownika.
//- Odwrócić kolejność elementów w tablicy.
//- Wyświetlić odwróconą tablicę.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner tablica = new Scanner(System.in);
    System.out.println("Podaj liczbe elementow tablicy: ");
    int n = tablica.nextInt();
    int[] tab = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Podaj element tablicy: " + (i + 1));
      tab[i] = tablica.nextInt();
    }
    for (int i = 0; i < n / 2; i++) {
      int temp = tab[i];
      tab[i] = tab[n - i - 1];
      tab[n - i - 1] = temp;
    }
    System.out.println("Odwrocona tablica: ");
    for (int i = 0; i < n; i++) {
      System.out.println(tab[i]);
    }
  }
}