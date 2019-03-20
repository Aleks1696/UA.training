package self_education.patterns.visitor;

public class Banker implements Employee{

    public void createReport(ITDepartment department) {
        System.out.println("Available costs for IT department: 160 000");
    }

    public void createReport(AuditDepartment department) {
        System.out.println("Available costs for audit department: 79 000");
    }

    public void createReport(FinancialDepartment department) {
        System.out.println("Available costs for financial department: 60 000");
    }
}
