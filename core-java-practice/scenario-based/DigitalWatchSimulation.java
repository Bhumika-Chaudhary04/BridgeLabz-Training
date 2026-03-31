package scenario_based;
public class DigitalWatchSimulation {
    public static void main(String[] args) {
        // Loop for hours (0 to 23)
    	System.out.println("Digital Watch Simulation\n");
    	System.out.println("HH:MM");
        for (int hour=0;hour<24;hour++) {
            // Loop for minutes (0 to 59)
            for (int minute=0;minute<60;minute++) {
                if (hour==13 && minute==0) {
                    System.out.println("Power cut! Watch stopped at 13:00");
                    break;
                }
                System.out.printf("%02d:%02d\n", hour, minute);
            }
            // Break outer loop after power cut
            if (hour == 13) {
                break;
            }
        }
    }
}
