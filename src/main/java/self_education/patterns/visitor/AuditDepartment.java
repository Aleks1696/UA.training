package self_education.patterns.visitor;

public class AuditDepartment implements Department {

    public void getReport(Employee employee) {
        employee.createReport(this);
    }
}
