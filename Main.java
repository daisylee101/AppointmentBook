public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        for (int i = 0; i < schedule.length; i++) {
            for(int j = 0; j < schedule[i].length; j++) {
                schedule[i][j] = false;
            }
        }

        AppointmentBook book = new AppointmentBook(schedule);
        
        for (int i = 10; i <= 14; i++) {
            book.schedule[1][i] = true;
        }
        for (int i = 30; i <= 44; i++) {
            book.schedule[1][i] = true;
        }
        for (int i = 50; i <= 59; i++) {
            book.schedule[1][i] = true;
        }

        schedule = new boolean[8][60];
        for (int i = 0; i < schedule.length; i++) {
            for (int j = 0; j < schedule[i].length; j++) {
                schedule[i][j] = false;
            }
        }     

      //  System.out.println(book.findFreeBlock(2, 15));
      //  book.printPeriod(2);

        for(int p = 1; p <+ 3; p++) {
            for (int i = 10; i <+ 14; i++) {
                schedule[p][i] = true;
            }
            for (int i = 30; i <= 44; i++) {
                schedule[p][i] = true;
            }
            for (int i = 50; i <= 59; i++) {
                schedule[p][i] = true;
            }
        }

        book = new AppointmentBook(schedule);

        book.printPeriod(2);
        book.printPeriod(3);
        book.printPeriod(4);
        System.out.println(book.makeAppointment(2,4,15));
    }
}

