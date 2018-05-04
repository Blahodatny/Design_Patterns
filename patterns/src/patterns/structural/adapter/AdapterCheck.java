package patterns.structural.adapter;

import patterns.structural.adapter.employees.EmployeeCSV;
import patterns.structural.adapter.employees.EmployeeDB;
import patterns.structural.adapter.employees.EmployeeLdap;
import patterns.structural.adapter.interfaces.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class AdapterCheck {
    public static void check() {
        List<IEmployee> employees = new ArrayList<>();
        employees.add(new EmployeeDB("1", "George", "Michael", "email@email.com"));
        employees.add(new patterns.structural.adapter.adapters.EmployeeLdapAdapter(
                new EmployeeLdap("chewie", "John", "Mike", "ldap@email.com")));
        employees.add(new patterns.structural.adapter.adapters.EmployeeCSVAdapter(
                new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com")));
        System.out.println(employees);
    }
}