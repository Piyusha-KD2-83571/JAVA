import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Program1 {

	public static void main(String[] args) 
	{
		List<Student> list1 = new LinkedList<>();
		list1.add(new Student(1,"Disha","Ichalkaranji",95));
		list1.add(new Student(3,"Swarupa","Islampur",91));
		list1.add(new Student(2,"Atharv","Gadhinglaj",92));
		list1.add(new Student(4,"Mrunal","Ajra",94));
		list1.add(new Student(6,"Rohit","Tasgaon",96));
		list1.add(new Student(5,"Lavanya","Kolhapur",90));
		
		
		System.out.println("The List Of Student Before Sorting :");
		for(Student element:list1)
			System.out.println(element);
		
		System.out.println("-----------------------------------------------");
		System.out.println("The List After Sorting :");
		Collections.sort(list1);
	//As collection's  sort method to does calls for compare to method thus we implements Compareto method in Students class
		for(Student e:list1)
			System.out.println("The Natural Ordering For Student List is :"+e);
		System.out.println("-------------------------------------------------------");
		
		//Sorting on Student Name 
		class StudentName implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int studentName  = o1.getName().compareTo(o2.getName());
				return studentName;
			}
		}
		
		Comparator<Student> obj = new StudentName();
		Collections.sort(list1,obj);
		
		for (Student student : list1) 
		{
			System.out.println("The List Sorted On Based Of Names:"+student);
			
		}
		System.out.println("--------------------------------------------------"); 
		
		
		//Sorting On Based Of cityName
		
		System.out.println("The List Sorted On City Name :");
		class cityName implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int cityName = o1.getCity().compareTo(o2.getCity());
				return cityName;
			}
		}
		
		Comparator<Student> obj1 = new cityName();
		
		Collections.sort(list1,obj1);
		
		for (Student student : list1) {
			System.out.println(student);
			
		}
		System.out.println("--------------------------------------------------------");
		
		//Sorting Based On Marks
		
		System.out.println("Sorting Carried Out On Based Of Marks");
		
		class StudentMarks implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				
				return Double.compare(o1.getMarks(),o2.getMarks());
			}
			
		}
		Comparator<Student> obj2 = new StudentMarks();
		
		Collections.sort(list1,obj2);
		
		for (Student student : list1) {
			System.out.println(student);
		}
		
		//Finding The Particular Student into the list

		Student s = new Student();
		s.setRollNo(2);
		if(list1.contains(s))
		{
			System.out.println("Student Exist In The List");
		}
		else
		{
			System.out.println("Student Does Not Exist In The List");
		}
		
		
			
		
		
		
		
		
		

	}

}
