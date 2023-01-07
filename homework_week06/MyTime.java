public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public boolean isValidTime(int hour, int minute, int second) {
        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59;
    }

    public MyTime(int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)) throw new IllegalArgumentException("Invalid hour, minute, or second!");
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)) throw new IllegalArgumentException("Invalid hour, minute, or second!");
        else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) {
                    this.setTime(0, 0, 0);
                } else {
                    this.setTime(this.hour + 1, 0, 0);
                }
            } else {
                this.minute--;
                this.second = 0;
            }
        } else {
            this.second++;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            if (hour == 23) {
                this.hour = 0;
                this.minute = 0;
            } else {
                this.hour++;
                this.minute = 0;
            }
        } else {
            this.minute++;
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second == 0) {
            if (minute == 0) {
                if (hour == 0) {
                    this.setTime(23, 59, 59);
                } else {
                    this.setTime(this.hour - 1, 59, 59);
                }

            } else {
                this.minute--;
                this.second = 59;
            }
        } else {
            this.second--;
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute == 0) {
            if (hour == 0) {
                this.hour = 23;
                this.minute = 59;
            } else {
                this.hour--;
                this.minute = 59;
            }
        } else {
            this.minute--;
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }
        return this;
    }
}
