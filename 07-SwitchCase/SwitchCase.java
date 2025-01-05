
class SwitchCase {

    public static void main(String[] args) {
        int n = 3;

        // updated version of switch
        // no need for break statements
        System.out.println("------ Modern Switch -------");
        switch (n) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tuesday");
            case 3 ->
                System.out.println("Wednesday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            case 6, 7 ->
                System.out.println("Weekend");
            default ->
                System.out.println("Default");
        }
        System.out.println("---------------------------");

        String day = "Sunday";
        String res;

        res = switch (day) {
            case "Saturday", "Sunday" ->
                "6am";
            case "Monday" ->
                "8am";
            default ->
                "7am";
        };

        System.out.println("modern switch return using arrow => " + res);

        res = switch (day) {
            case "Saturday", "Sunday":
                yield "6am";
            case "Monday":
                yield "8am";
            default:
                yield "7am";
        };

        System.out.println("modern switch return using yield => " + res);

        // traditional version of switch
        // need break statements
        System.out.println("------ Traditional Switch -------");
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Default");
                break;
        }
        System.out.println("---------------------------");
    }
}
