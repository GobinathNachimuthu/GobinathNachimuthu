package week1.day2;

public class Test {
	public static void main(String[] args) {
		int num = 151;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println(" SOWMI IS A FRAUD");
		else
			System.out.println("SOWMI IS NOT A FRAUD");
	}

}