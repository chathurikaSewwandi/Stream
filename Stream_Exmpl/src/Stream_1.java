import java.util.ArrayList;
import java.util.List;

public class Stream_1 {
    public static void main(String[] args) {
        List<Integer> salaryL = new ArrayList<>();
        salaryL.add(2000);
        salaryL.add(1500);
        salaryL.add(5000);
        salaryL.add(7000);

        int x = 0;
        for(Integer salary : salaryL){
            if(salary > 2000){
                x++;
            }
        }
        System.out.println(x);
    }
}



