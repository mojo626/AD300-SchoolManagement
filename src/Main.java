package src;


class Main {
	public static void main(String[] args) {
		School school = new School("Lincoln");

		Department mathDepartment = new Department("Math");
		Department englishDepartment = new Department("English");

		school.addDepartment(mathDepartment);
		school.addDepartment(englishDepartment);

		//Math department
		Teacher mathTeacher1 = new Teacher("Mr. Smith", "Geometry");
		Teacher mathTeacher2 = new Teacher("Mrs. Jones", "Calculus");

		mathDepartment.addTeacher(mathTeacher1);
		mathDepartment.addTeacher(mathTeacher2);

		Student mathStudent1 = new Student("Jim", 10);
		Student mathStudent2 = new Student("Nancy", 12);
		Student mathStudent3 = new Student("Ann", 9);

		mathDepartment.addStudent(mathStudent1);
		mathDepartment.addStudent(mathStudent2);
		mathDepartment.addStudent(mathStudent3);
	

		//English department
		Teacher englishTeacher1 = new Teacher("Mr. White", "English");
		Teacher englishTeacher2 = new Teacher("Ms. Black", "English");

		englishDepartment.addTeacher(englishTeacher1);
		englishDepartment.addTeacher(englishTeacher2);

		Student englishStudent1 = new Student("Dave", 11);
		Student englishStudent2 = new Student("Jen", 11);
		Student englishStudent3 = new Student("Jimmy", 10);

		englishDepartment.addStudent(englishStudent1);
		englishDepartment.addStudent(englishStudent2);
		englishDepartment.addStudent(englishStudent3);


		System.out.print(school);
    }
}
