package com.goit.Luhn;


public class verifAlg {

    public verifAlg(int cardNum[]) {
        int len = cardNum.length;
        System.out.println(len+ "is len");
        int j = 1;
        int[] reversearray = new int[len+1];
        for (int i = cardNum.length -1; i>=0; i--){
            reversearray[j++] = cardNum[i];
        }
        reduceNumber(reversearray, len);
        }
    public static void reduceNumber(int reversearray[], int len) {
        len = len + 1;
        System.out.println("len is " +len);
        int odds = 0;
        int evens = 0;
        for (int i =0; i < len; i++)
        {   System.out.println("Reverse array "+ i+ " : "+reversearray[i]);
            if ((i % 2) == 0 ) {
                if ((reversearray[i] * 2) > 9) {
                    int intDigit = 0;
                    int iNumberIn = reversearray[i] * 2;
                    intDigit += iNumberIn % 10;
                    System.out.println("intDiggit "+ intDigit);
                    iNumberIn /= 10;
                    System.out.println("iNumber "+ iNumberIn);
                    reversearray[i] = intDigit + iNumberIn;
                    evens += reversearray[i];
                    System.out.println("Evens " + evens);
                }
                else {evens += reversearray[i]*2;}
                }
             else {
                System.out.println("Odds");
                odds += reversearray[i];
                System.out.println("Odds"+ odds);
            }
        }
        if ((odds + evens) % 10==0){
            System.out.println("Verification completed successfully!");}
            else {
                System.out.println("Verificaiton is not successfull!");
            }
    }
}
