package patterns.structural.adapter.adapters;

import patterns.structural.adapter.employees.EmployeeCSV;
import patterns.structural.adapter.interfaces.Employee;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getId() + "";
    }

    public String getFirstName() {
        return instance.getFirstName();
    }

    public String getLastName() {
        return instance.getLastName();
    }

    public String getEmail() {
        return instance.getEmailAddress();
    }
}