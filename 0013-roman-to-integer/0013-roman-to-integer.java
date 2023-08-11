import java.util.HashMap;
import java.util.Map;
class Solution {

    public int romanToInt(String s) {
        Map <Character,Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I',1);
        romanNumerals.put('V',5);
        romanNumerals.put('X',10);
        romanNumerals.put('L',50);
        romanNumerals.put('C',100);
        romanNumerals.put('D',500);
        romanNumerals.put('M',1000); 

        int total=0;
        int pre_value=0;
        for(int i =s.length()-1; i>=0 ;i--)
        {
            char currentchar =s.charAt(i);
            int currentvalue=romanNumerals.get(currentchar);

            if(currentvalue< pre_value){
                total -=currentvalue;
            }
            else{
                total+=currentvalue;
            }
            pre_value=currentvalue;
        }      
        return total;
    }
}