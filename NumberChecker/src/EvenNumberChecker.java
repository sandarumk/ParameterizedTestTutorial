/**
 * Created by dinu on 11/11/14.
 * To check whether the given number is even or not
 */
public class EvenNumberChecker {
    public boolean checkForEvenNumber(int number){
        boolean isEven=false;
        if(number%2==0){
            System.out.println("Number "+number+" is Even");
            isEven=true;
        }else{
            System.out.println("Number "+number+" is Odd");
            isEven=false;
        }
        return isEven;
    }
}
