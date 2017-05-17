public class Sqrt {
	public static void main(String[] args) {
		int in = 3, b = 0, c = 3, sqrt = 0;
		if (c < in) {
			for (int i = 0; c < in; i++) {
				c = i * i;
				b = i;
				sqrt = in - c;
			}
			if (sqrt < 0) {
				b--;
				c = b * b;
				sqrt = in - c;
			}
			if (sqrt == 0) {
				System.out.println("Корень из числа " + in + " = " + b);
			} else
				System.out.println("Корень из числа " + in + " = " + b + " и неизвлекаемый остаток " + sqrt);
		} else if (in <= 3) {
			for (int i = 0; i <= 3; i++) {
				b = i;
			}
			System.out.println("Корень из " + in + " = " + b);
		}
	}
}
