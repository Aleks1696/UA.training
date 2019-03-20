package self_education.patterns.visitor;

public class FinancialDepartment implements Department {

    public void getReport(Employee employee) {
        employee.createReport(this);
    }
}
