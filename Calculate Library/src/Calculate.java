/**
 * 
 */

/**
 * @author kyleliang
 *Calculate Library
 *8/30/16
 */
public class Calculate {
	public static double square(double number) {
		double answer;
		answer = number * number;
		return answer;
	}
	public static double cube(double number) {
		double answer;
		answer = number * number * number;
		return answer;
	}
	public static double average(double number1, double number2) {
		double answer;
		answer = number1 * number2 / 2;
		return answer;
	}
	public static double average(double number1, double number2, double number3) {
		double answer;
		answer = number1 * number2 * number3 / 3;
		return answer; 
	}
	public static double toDegrees(double number) {
		double answer;
		answer = (number * 3.14159) / 180;
		return answer;
	}
	public static double toRadians(double number) {
		double answer;
		answer = (number * 180) / 3.14159;
		return answer;
	}
	public static double discriminant(double numberA, double numberB, double numberC) {
		double bVal;
		double scndPart = 4 * numberA * numberC;
		return (bVal - scndPart);
	}
	public static String toImproperFrac(int number, int denom, int numer){
		int impropernumber = denom * number + numer;		
		return (impropernumber + "/" + denom);
	}
	public static String toMixedNum(int imprpNumer, int denom) {
		int numer = imprpNumer % denom;
		int wholeNum = imprpNumer / denom;
		return (wholeNum + numer + "/" + denom);			
	}
	public static String foil( int number1, int number2, int number3, int number4) {
		int a2 = number1 * number3;
		int b = (number1 * number4) + (number2 * number3);
		int c = (number1 * number4);
		return (a2 +"x^2" + b + "x" + c);
	}
}
		
		
		