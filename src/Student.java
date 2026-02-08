package src;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }


    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }


	public String toString() {
		return this.name + " (Grade " + this.grade + ")"; 
	}
}
