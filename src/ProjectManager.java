public class ProjectManager extends Employee{

    private final int MAX_DAYS_AUTHORITY = 20;

    @Override
    public void checkAuthority(String employeeName, int numberOfDays) {
        if (numberOfDays < MAX_DAYS_AUTHORITY){
            grantVacationDays(employeeName, numberOfDays);
        }else{
            supervisor.checkAuthority(employeeName, numberOfDays);
        }
    }

    @Override
    public void grantVacationDays(String employeeName, int numberOfDays) {
        System.out.printf("Project Manager approved %d days for employee %s.\n", numberOfDays, employeeName);
    }
}
