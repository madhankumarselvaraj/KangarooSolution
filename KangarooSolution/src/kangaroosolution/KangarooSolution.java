/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroosolution;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class KangarooSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1 = 0, v1 = 2, x2 = 5, v2 = 3;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println("" + result);
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int noOfMeterToJumbFirst = 0;
        int noOfMeterToJumbSecond = 0;
        int noOfTimeJumpFirstKangaroo = 0;
        int noOfTimeJumpSecondKangaroo = 0;
        String returnValue = "NO";
        for (int i = 0; i < 10000; i++) {
            if (i == 0) {
                noOfMeterToJumbFirst = x1 + v1;
                noOfMeterToJumbSecond = x2 + v2;
                noOfTimeJumpFirstKangaroo = i;
                noOfTimeJumpSecondKangaroo = i;
            } else {
                noOfMeterToJumbFirst += v1;
                noOfMeterToJumbSecond += v2;
                noOfTimeJumpSecondKangaroo = i;
                noOfTimeJumpFirstKangaroo = i;
            }
            if (noOfMeterToJumbFirst == noOfMeterToJumbSecond) {
                if (noOfTimeJumpFirstKangaroo == noOfTimeJumpSecondKangaroo) {
                    returnValue = "YES";
                    break;
                } else {
                    returnValue = "NO";
                    break;
                }
            }
        }
        return returnValue;
    }

}
