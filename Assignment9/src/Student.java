
public class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private String city;
	private double marks;
	
	
	public Student() {} //parameterless constructor 

    //parameterized constructor
	public Student(int rollNo, String name, String city, double marks) {
		this.rollNo = rollNo;
		this.setName(name);
		this.city = city;
		this.marks = marks;
	}
 
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + getName() + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.rollNo, o.rollNo);
	}

	
	//getter-setter for name field
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//getter-setter for city name field
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	//getter-setter for marks
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		
		this.marks = marks;
	}
	
	//getter-setter for rollNo

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	
	
	
	
	
	
	
	
	
	

}
