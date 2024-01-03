public class WeekdaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] days = {"sun", "mon", "tus", "wend", "thur", "fri"};
        for(int i =0; i < days.length; i++){
            if (i>=5) break;
            System.out.println(days[i]);

        }
        

    }
}
