package src;

public class Teacher {

    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

	public String toString() {
		return this.name + " (" + this.subject + ")";
	}
}
