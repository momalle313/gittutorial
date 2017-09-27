package calculator;

public class SimpleCalculator implements ICalculator {

	@Override
	public double add(double a, double b) {
		
		double answer = a+b;
		
		return answer;
	}

	@Override
	public double sub(double a, double b) {

		double answer = a-b;

		return answer;
	}

	@Override
	public double div(double a, double b) {
		
		double answer = a/b;
		
		return answer;
	}

	@Override
	public double mult(double a, double b) {
		
		double answer = a*b;
		
		return answer;
	}

}
