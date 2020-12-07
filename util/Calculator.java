package util;

public class Calculator {
	/*
	 * o "final" indica uma constante (valor que nunca muda) e o nome deve ser
	 * sempre com letras maiúsculas; caso tenha mais de uma palavra deve ser
	 * separado por underline EX: NET_SALARY
	 */

	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
