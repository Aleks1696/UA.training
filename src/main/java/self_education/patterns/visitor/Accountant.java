package self_education.patterns.visitor;

public class Accountant implements Employee {

    public void createReport(ITDepartment department) {
        System.out.println("Required annual budget for IT department is: 200 000" );
    }

    public void createReport(AuditDepartment department) {
        System.out.println("Required annual budget for audit department is: 60 000" );
    }

    public void createReport(FinancialDepartment department) {
        System.out.println("Required annual budget for financial department is: 98 000" );
    }
}
