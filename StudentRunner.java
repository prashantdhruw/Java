import java.util.ArrayList;

public class StudentRunner {

	public static void main(String[] args) {

		Student Ankita = new Student("Ankita", 77, 76, 74);
		Student Surya = new Student("Surya", 79, 75, 78);
		Student Bhola = new Student("Bhola", 67, 79, 78);
		Student Vinay = new Student("Vinay", 70, 78, 75);
		Student Tanya = new Student("Tanya", 80, 89, 88);

		ArrayList<Student> students = new ArrayList<>();

		students.add(Ankita);
		students.add(Surya);
		students.add(Bhola);
		students.add(Vinay);
		students.add(Tanya);

		System.out.println("Student with the highest grade among all students:");

		int max = 0;
		String names = null;
		for (int i = 0; i < students.size(); i++) {
			if (max == students.get(i).getAverage()) {
				names += ", " + students.get(i).name;
			} else if (max < students.get(i).getAverage()) {
				max = students.get(i).getAverage();
				names = students.get(i).name;
			}
		}
		System.out.println(names + " " + "with percentage : " + max + "%");

	}
}