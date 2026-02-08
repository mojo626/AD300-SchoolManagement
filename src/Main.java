package src;

class Main {
	public static void main(String[] args) {
		School school = new School("Lincoln");

		Department mathDepartment = new Department("Math");
		Department englishDepartment = new Department("English");

		school.addDepartment(mathDepartment);
		school.addDepartment(englishDepartment);

		Teacher mathTeacher1 = new Teacher("teacher", "Geometry");
		Teacher mathTeacher2 = new Teacher("teacher", "Calculus");

		mathDepartment.addTeacher(mathTeacher1);
		mathDepartment.addTeacher(mathTeacher2);
    }
}
