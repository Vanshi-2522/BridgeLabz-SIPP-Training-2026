package oops.Polymorphis;

abstract class RescueTeam {

    String teamId;
    String location;

    public RescueTeam(
            String teamId,
            String location) {

        this.teamId = teamId;
        this.location = location;
    }

    abstract void performDuty();
}

class MedicalTeam extends RescueTeam {

    public MedicalTeam(
            String id,
            String location) {

        super(id, location);
    }

    void performDuty() {
        System.out.println(
                teamId +
                        " providing treatment");
    }
}

class FireRescueTeam extends RescueTeam {

    public FireRescueTeam(
            String id,
            String location) {

        super(id, location);
    }

    void performDuty() {
        System.out.println(
                teamId +
                        " extinguishing fire");
    }
}

class FoodSupplyTeam extends RescueTeam {

    public FoodSupplyTeam(
            String id,
            String location) {

        super(id, location);
    }

    void performDuty() {
        System.out.println(
                teamId +
                        " distributing food");
    }
}

public class DisasterRescueManagementSystem {

    static void findTeamByLocation(
            RescueTeam[] teams,
            String loc) {

        for (RescueTeam t : teams) {

            if (t.location.equalsIgnoreCase(loc)) {

                System.out.println(
                        "Found: " + t.teamId);
            }
        }
    }

    public static void main(String[] args) {

        RescueTeam[] teams = {

                new MedicalTeam(
                        "M101",
                        "Delhi"),

                new FireRescueTeam(
                        "F101",
                        "Mumbai"),

                new FoodSupplyTeam(
                        "FS101",
                        "Delhi")
        };

        int medical = 0;
        int fire = 0;
        int food = 0;

        for (RescueTeam t : teams) {

            t.performDuty();

            if (t instanceof MedicalTeam)
                medical++;

            else if (t instanceof FireRescueTeam)
                fire++;

            else
                food++;
        }

        System.out.println(
                "Medical Teams = "
                        + medical);

        System.out.println(
                "Fire Teams = "
                        + fire);

        System.out.println(
                "Food Teams = "
                        + food);

        findTeamByLocation(
                teams,
                "Delhi");
    }
}