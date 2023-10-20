public class Main {
    public static void main(String[] args) {

        TeamLeader teamLeader = new TeamLeader();
        ProjectManager projectManager = new ProjectManager();
        HR hr = new HR();

        teamLeader.setNextSupervisor(projectManager);
        projectManager.setNextSupervisor(hr);

        teamLeader.checkAuthority("Tudor", 7);
        teamLeader.checkAuthority("Radu", 15);
        teamLeader.checkAuthority("Andreea", 23);
        teamLeader.checkAuthority("Raluca", 40);
    }
}
