public abstract class Employee {

    // camp care reprezinta urmatorul element din lant
    protected Employee supervisor;

    public void setNextSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void checkAuthority(String employeeName, int numberOfDays);

    public abstract void grantVacationDays(String employeeName, int numberOfDays);
}
