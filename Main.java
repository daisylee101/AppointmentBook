public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        for (int i = 0; i < schedule.length; i++) {
            for(int j = 0; j < schedule[i].length; j++) {
                schedule[i][j] = true;
            }
        }
        
        for (int i = 10; i <= 14; i++) schedule[1][i] = true;
        for (int i = 30; i <= 44; i++) schedule[1][i] = true;
        for (int i = 50; i <= 59; i++) schedule[1][i] = true;


        AppointmentBook a = new AppointmentBook(schedule);
        int period = 2;
        int minute = 0;
        while (minute < 60) {
            System.out.println(minute + " " + schedule[period-1][minute]);
            minute++;
        }
        
        System.out.println(a.findFreeBlock(2,15));

        schedule = new boolean[8][60];
        for (int i = 0; i < schedule.length; i++) {
            for (int j = 0; j < schedule[i].length; j++) {
                schedule[i][j] = true;
            }
        }     

      //  System.out.println(book.findFreeBlock(2, 15));
      //  a.printPeriod(2);

      for (int i = 10; i <= 29; i++) schedule[1][i] = false;
      for (int i = 10; i <= 29; i++) schedule[2][i] = false;
      for (int i = 10; i <= 29; i++) schedule[3][i] = false;


      AppointmentBook b = new AppointmentBook(schedule);
      
      while(period < 5) {
        System.out.println("Period: " + period); 
        b.printPeriod(period);
        period++; }

        System.out.println(b.makeAppointment(2,4, 15));
        b.printPeriod(2);
        b.printPeriod(3);
        b.printPeriod(4);
        b.printPeriod(4);
     }
}

