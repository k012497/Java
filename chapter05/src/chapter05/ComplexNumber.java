package chapter05;

public class ComplexNumber {
	private double real = 0.0;
	private double imaginary = 0.0;
	
	public ComplexNumber() {
		this.real = 0.0;
		this.imaginary = 0.0;
	}
	
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public void print() {
		System.out.println(real +"+"+imaginary+"i");
	}
	
}
