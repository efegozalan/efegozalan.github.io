import java.util.Scanner;

public class RobotBuildInstructions {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // robot kodunu kullanıcıdan alıyoruz
        String robot = input.nextLine();
        // block letters alıyoruz
        String blocks = "" + robot.charAt(0) + robot.charAt(3)  + robot.charAt(6) + robot.charAt(9) + robot.charAt(12);
        // cıkıntı numbers substringle
        String cıkıntı1 = robot.substring(1, 3);
        String cıkıntı2 = robot.substring(4, 6);
        String cıkıntı3 = robot.substring(7, 9);
        String cıkıntı4 = robot.substring(10, 12);
        String cıkıntı5 = robot.substring(13, 15);
        // CIKINTILARı  birleştiriyoruz
        String cıkıntılar = cıkıntı1 + "-" + cıkıntı2 + "-" + cıkıntı3 + "-" + cıkıntı4 + "-" + cıkıntı5;
    }

}
