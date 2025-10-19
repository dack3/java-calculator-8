package calculator;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input = Console.readLine();
        int num = parNum(input);
    }
    public static int parNum(String input){
        //contains는 booelan 반환
        if(!input.contains("/")){
            input.replaceAll("[;.]","");
            int num = Integer.valueOf(input);
            return num;
        } else{
            String del = String.valueOf(input.charAt(2));
            input.replace(del,"");
            int num = Integer.valueOf(input);
            return num;
        }
    }

}
