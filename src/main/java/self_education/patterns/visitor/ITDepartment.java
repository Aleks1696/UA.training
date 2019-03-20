package self_education.patterns.visitor;

public class ITDepartment implements Department {

    public void getReport(Employee employee) {
        employee.createReport(this);
    }
}
