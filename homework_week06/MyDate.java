public class MyDate {
    private int year;
    private int month;
    private int day;
    private final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int centuryNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int yearNumber = lastTwoDigitsOfYear / 4;
        int monthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        return (centuryNumber + lastTwoDigitsOfYear
                + yearNumber + monthNumber + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        } else {
            this.year = year;
        }
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        } else {
            this.month = month;
        }
    }

    public void setDay(int day) {
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day < 1 || day > monthDays) {
            throw new IllegalArgumentException("Invalid day!");
        } else {
            this.day = day;
        }
    }

    @Override
    public String toString() {
        int d = getDayOfWeek(year, month, day);
        return DAYS[d] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day == monthDays) {
            if (month == 12) {
                setDate(this.year + 1, 1, 1);
            } else {
                setMonth(this.month + 1);
                setDay(1);
            }
        } else {
            setDay(this.day + 1);
        }
        return this;
    }

    public MyDate nextMonth() {
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day == monthDays) {
            if (month == 12) {
                setYear(this.year + 1);
                setMonth(1);
            } else {
                setMonth(this.month + 1);
                setDay(DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0));
            }
        } else {
            setMonth(this.month + 1);
        }
        return this;
    }

    public MyDate nextYear() {
        if (month == 2 && day == 29) {
            setDay(28);
        }
        setYear(this.year + 1);
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            if (month == 1) {
                setDate(this.year - 1, 12, 31);
            } else {
                setMonth(this.month - 1);
                setDay(DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0));
            }
        } else {
            setDay(this.day - 1);
        }
        return this;
    }

    public MyDate previousMonth() {
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day == monthDays) {
            if (month == 1) {
                setYear(this.year - 1);
                setMonth(12);
            } else {
                setMonth(this.month - 1);
                setDay(DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0));
            }
        } else {
            setMonth(this.month - 1);
        }
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29) {
            setDay(28);
        }
        setYear(this.year - 1);
        return this;
    }
}
