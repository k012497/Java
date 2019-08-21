package chapter05.test;

public class Student {
		private String name ;
		private int studentNo;
		private String sex;
		private double rate;
		
		public Student() {
			this.name = null;
			this.studentNo = 0;
			this.sex = null;
			this.rate = 0.0;
		}
		
		public Student(String name, int studentNo, String sex, double rate) {
			this.name = name;
			this.studentNo = studentNo;
			this.sex = sex;
			this.rate = rate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getStudentNo() {
			return studentNo;
		}

		public void setStudentNo(int studentNo) {
			this.studentNo = studentNo;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public double getRate() {
			return rate;
		}

		public void setRate(double rate) {
			this.rate = rate;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", studentNo=" + studentNo + ", sex=" + sex + ", rate=" + rate + "]";
		}
		
		public void print() {
			System.out.println(name + "의 평점 : " + rate);
		}
	
		
		
}
