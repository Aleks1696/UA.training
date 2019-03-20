package self_education.patterns.visitor;

public interface Employee {
    void createReport(ITDepartment department);
    void createReport(AuditDepartment department);
    void createReport(FinancialDepartment department);
}
