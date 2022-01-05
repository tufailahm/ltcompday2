package day2.inheritdemo;

public class Marks {
	private int regNo;
	private int marksInEng;
	private int marksInMaths;
	private int marksInScience;
	
	//setter and getter and cons and tostring
	
	public Marks() {
		// TODO Auto-generated constructor stub
	}

	public Marks(int regNo, int marksInEng, int marksInMaths, int marksInScience) {
		super();
		this.regNo = regNo;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getMarksInEng() {
		return marksInEng;
	}

	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}

	public int getMarksInMaths() {
		return marksInMaths;
	}

	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}

	public int getMarksInScience() {
		return marksInScience;
	}

	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}

	@Override
	public String toString() {
		return "Marks [regNo=" + regNo + ", marksInEng=" + marksInEng + ", marksInMaths=" + marksInMaths
				+ ", marksInScience=" + marksInScience + "]";
	}
	
	
}
