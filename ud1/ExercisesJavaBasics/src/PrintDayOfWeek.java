public class PrintDayOfWeek {
    public static void main(String[] args) {
        int dayOfWeek = 4;

        switch(dayOfWeek){
            case 1:
                System.out.println("ASTELEHENA");
                break;
            case 2:
                System.out.println("MARTITZENA");
                break;
            case 3:
                System.out.println("EGUAZTENA");
                break;
            case 4:
                System.out.println("EGUENA");
                break;
            case 5:
                System.out.println("BARIKUA");
                break;
            case 6:
                System.out.println("ZAPATUA");
                break;
            case 7:
                System.out.println("DOMEKA");
                break;
            default:
                System.out.println("DEAULT SWITCH STATEMENT");
                break;
        }
        System.out.println("DONE");
    }
}
