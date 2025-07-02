package github_learning;

public class CalculatorApp {
	private int a;
	private int b;
	
	public CalculatorApp(int a, int b) {
		this.a =a;
		this.b = b;
	}
	
	
	//toplama methodu
	public int add(int a, int b) {
		return a+b;
	}
	// çıkarma methodu
	public int subtract(int a, int b) {
		return a-b;
	}
	//çarpma methodu
	public int multiply(int a, int b) {
		return a*b;
	}
	//bölme methodu
	public double divide(int a, int b) {
		return a/b;
	}
	

}

