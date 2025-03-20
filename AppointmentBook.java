public class AppointmentBook {
    private boolean[][]schedule;
    public AppointmentBook(boolean[][] schedule) {
        this.schedule = schedule;
    }
    
    public void printPeriod(int period) {
        for(int i = 9; i < schedule[period -1].length; i++)
        System.out.println(i + " " + schedule[period - 1][i]);
    }
   
    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }

    private void reserveBlock(int period, int startMinute, int duration) {

     }

    public int findFreeBlock(int period, int duration) {
        return 0;
    }


    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        return false;
     }

}