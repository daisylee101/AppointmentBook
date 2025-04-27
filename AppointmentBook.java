public class AppointmentBook {
    boolean[][] schedule = new boolean[8][60];

    public AppointmentBook(boolean[][] schedule) {
        this.schedule = schedule;
    }
    public void printPeriod(int period) {
        for (int i = 0; i < schedule[period - 1].length; i++)
            System.out.println(i + " " + schedule[period - 1][i]);
    }

    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }

    private void reserveBlock(int period, int startMinute, int duration) {
        for (int i = startMinute; i < startMinute + duration; i++) {
            schedule[period - 1][i] = false;
        }

    }

    public int findFreeBlock(int period, int duration) {
        // return 0;
        int block = 0;
        for (int i = 0; i < 60; i++) {
            if (isMinuteFree(period, i)) {
                block++;
                if (block >= duration) {
                    return i - duration + 1;
                }
            }
            else {
                block = 0;
            }
        }
        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        //return false;
        for(int period = startPeriod; period <= endPeriod; period++) {
            int start = findFreeBlock(period, duration);
            if (start != -1) {
                reserveBlock(period, start, duration);
                return true;
            }
        }
        return false;
        }
    }