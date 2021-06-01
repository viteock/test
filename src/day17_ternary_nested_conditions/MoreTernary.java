package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50.55;
        String goal = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("goal = " + goal);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim/Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);
        
        boolean isEligibleToDrive = true;
        String driving;
        driving = (isEligibleToDrive) ? "have DL and can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);

    }
}
