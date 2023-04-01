import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

            int guessNum=0;
            guessNum = (int) ((Math.random()*100)+1);
            int max=100,min=1;
            Scanner input = new Scanner(System.in);

            while (true){
                System.out.println("請輸入數字：");
                int inputNum = input.nextInt();
                if(inputNum<1||inputNum>100){
                    System.out.println("請輸入1-100任一數字");
                }
                else if (guessNum > inputNum) { //guestNum =80 input = 50
                    System.out.println("太小了");
                    System.out.println((inputNum)+"到"+max);
                    min=inputNum;
                } else if (guessNum < inputNum) {
                    System.out.println("太大了");
                    System.out.println(min+"到"+(inputNum));
                    max=inputNum;
                }else {
                    System.out.println("恭喜猜到正確數字");
                }
            }
    }
}
