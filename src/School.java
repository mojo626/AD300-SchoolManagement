package src;

import java.util.ArrayList;

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
    
}
