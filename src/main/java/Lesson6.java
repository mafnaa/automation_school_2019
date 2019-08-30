public class Lesson6 {
    public String isItMyBirthday(int month, int day){
        if (month > 12 || day > 31) return "Error";
        if (month == 12 & day == 1) return "Yes";
        else return "No";
    }
}
