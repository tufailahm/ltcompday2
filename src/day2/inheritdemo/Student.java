package day2.inheritdemo;

public class Student {
		private int regNo;
		private String studentName;
		//any other properties
		
		//cons
		//getter and setter and tostring
		
		public Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(int regNo, String studentName) {
			super();
			this.regNo = regNo;
			this.studentName = studentName;
		}

		public int getRegNo() {
			return regNo;
		}

		public void setRegNo(int regNo) {
			this.regNo = regNo;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		@Override
		public String toString() {
			return "Student [regNo=" + regNo + ", studentName=" + studentName + "]";
		}
		
		
}
