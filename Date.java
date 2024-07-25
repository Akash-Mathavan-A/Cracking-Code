public class Date{

    /*
     * Given two dates, find the total number of days between them.
     */
    static int[] month = {31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31, 30 , 31};

    public static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        long year1 = countDaysInYear(d1 , m1 , y1);
        long year2 = countDaysInYear(d2 , m2 , y2);
        return (int)(Math.abs(year1 - year2));
    }

    public static int countDaysInYear(int day , int mon , int year){
        int countDays = 0;
        countDays += (365 * (year - 1));
        countDays += countLeapYears(year - 1);
        for(int i = 0; i < mon - 1; i++){
            countDays += month[i];
            if(i == 1 && leapYear(year)){
                countDays += 1;
            }
        }
        return countDays + day;
    }

    public static boolean leapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int countLeapYears(int year){
        int countLeap = 0;
        countLeap += (year / 4);
        countLeap -= (year / 100);
        countLeap += (year / 400);
        return countLeap; 
    }

    public static void main(String[] args){
       int d1 = 10, m1 = 2, y1 = 2014;
       int d2 = 10, m2 = 3, y2 = 2015;
       int resultDays = noOfDays(d1, m1, y1, d2, m2, y2);
       System.out.println("No of Days : " + resultDays);
    }
}