package src;

import java.util.ArrayList;

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
}
