package src;

import java.util.ArrayList;

import src.Department;

public class School {

    private String name;
    private ArrayList<Department> departments;

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
    	return this.departments;
    }

    public String getName() {
        return this.name;
    }

	public String toString() {
		String result = "School: " + this.name + "\nDepartments: ";

		for (Department department : departments) {
			result += department.getName() + ", ";
		}

		result = result.substring(0, result.length() - 2);
		result += "\n";


		for (Department department : departments) {
			result += department;
		}

		return result;
	}
    
}
