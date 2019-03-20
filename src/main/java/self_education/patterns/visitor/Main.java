package self_education.patterns.visitor;

public class Main {
    public static void main(String[] args) {
        Department itDepartment = new ITDepartment();
        itDepartment.getReport(new Accountant());
        itDepartment.getReport(new Banker());

        Department auditDepartment = new AuditDepartment();
        auditDepartment.getReport(new Accountant());
        auditDepartment.getReport(new Banker());
    }
}
