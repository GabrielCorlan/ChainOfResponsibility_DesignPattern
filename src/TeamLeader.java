public class TeamLeader extends Employee {

    private final int MAX_DAYS_AUTHORITY = 10;

    @Override
    public void checkAuthority(String employeeName, int numberOfDays) {
        if (numberOfDays <= MAX_DAYS_AUTHORITY) {
            grantVacationDays(employeeName, numberOfDays);
        } else {
            supervisor.checkAuthority(employeeName, numberOfDays);
        }
    }

    @Override
    public void grantVacationDays(String employeeName, int numberOfDays) {
        System.out.printf("Team Leader approved %d days for employee %s.\n", numberOfDays, employeeName);
    }
}
