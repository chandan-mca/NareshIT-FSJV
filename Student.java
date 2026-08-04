import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String sname;
	private String course;
	private double fee;

	transient private String username;
	transient private String password;
	
	private double height;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	static {
		System.out.println("\nStudent class is loaded");
	}
	
	public Student() {
		System.out.println("no param constructor is executed");
		System.out.println("Student object is created\n");
	}

	public Student(int sno, String sname, String course, double fee) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
		System.out.println("param constructor is executed");
		System.out.println("Student object is created\n");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Student(" + sno + ", " + sname + ", " + course + ", " + fee + ", " + username + ", " + password + ", "
				+ height + ")";
	}

	
}
