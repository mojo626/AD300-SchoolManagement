package src;

class Main {
	public static void main(String[] args) {
		School school = new School("Lincoln");

		Department mathDepartment = new Department("Math Department");
		Department englishDepartment = new Department("English Department");

		school.addDepartment(mathDepartment);
		school.addDepartment(englishDepartment);

		Teacher mathTeacher1 = new Teacher("teacher", "Geometry");
		Teacher mathTeacher2 = new Teacher("teacher", "Calculus");

		mathDepartment.addTeacher(mathTeacher1);
		mathDepartment.addTeacher(mathTeacher2);

		Student mathStudent1 = new Student("Jim", 10);
		Student mathStudent2 = new Student("Nancy", 12);

		mathDepartment.addStudent(mathStudent1);
		mathDepartment.addStudent(mathStudent2);
		
		System.out.print(mathDepartment);
    }
}
