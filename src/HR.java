public class HR extends Employee{

    private final int MAX_DAYS_AUTHORITY = 30;
    @Override
    public void checkAuthority(String employeeName, int numberOfDays) {
        if (numberOfDays < MAX_DAYS_AUTHORITY){
            grantVacationDays(employeeName, numberOfDays);
        }else{
            System.out.println("We're sorry, but the limit is 30 days.");
        }
    }

    @Override
    public void grantVacationDays(String employeeName, int numberOfDays) {
        System.out.printf("HR approved %d days for employee %s.\n", numberOfDays, employeeName);
    }
}
