package assingment;

public class student extends department {
	public void studentName() {
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentId() {
		System.out.println("studentID");
	}
	public static void main(String[] args) {
		student a=new student();
		a.collogeName();
		a.collegeCode();
		a.collegeRank();
		a.deptment();
		a.studentName();
		a.studentId();
		a.studentDept();
	}

}
