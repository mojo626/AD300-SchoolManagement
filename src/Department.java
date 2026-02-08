package src;

import java.util.ArrayList;

import src.Student;

public class Department {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public Department(String name) {
        this.name = name;
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
    	return this.students;
    }

    public ArrayList<Teacher> getTeachers() {
    	return this.teachers;
    }
    
    public String getName() {
        return this.name;
    }

	public String toString() {
		String result = this.name + " Department\n- Teachers: ";
		
		for (Teacher teacher : teachers) {
			result += teacher + ", ";
		}

		result = result.substring(0, result.length() - 2);
		result += "\n- Students: ";

		for (Student student : students) {
			result += student + ", ";
		}

		result = result.substring(0, result.length() - 2);
		result += "\n";

		return result;
	}
}
