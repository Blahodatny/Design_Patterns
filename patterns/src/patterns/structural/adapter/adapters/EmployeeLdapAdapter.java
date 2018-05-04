package patterns.structural.adapter.adapters;

import patterns.structural.adapter.employees.EmployeeLdap;
import patterns.structural.adapter.interfaces.IEmployee;

public class EmployeeLdapAdapter implements IEmployee {
    private EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getGivenName();
    }

    public String getLastName() {
        return instance.getSurname();
    }

    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "id='" + instance.getCn() + '\'';
    }
}