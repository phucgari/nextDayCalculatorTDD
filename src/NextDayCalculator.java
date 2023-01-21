public class NextDayCalculator {
    public int nextDayOf(int month, int day,int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day==31){
                    return 1;
                }else{
                    return day+1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    return 1;
                }else{
                    return day+1;
                }
            case 2:
                if (isLeapYear(year)){
                    if(day==29){
                        return 1;
                    }else{
                        return day+1;
                    }
                }else{
                    if(day==28){
                        return 1;
                    }else{
                        return day+1;
                    }
                }
        }return 0;
    }
    boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
}
