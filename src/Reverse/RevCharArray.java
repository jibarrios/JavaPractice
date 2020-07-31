package Reverse;

import javax.imageio.stream.ImageInputStream;

public class RevCharArray {
    public static void RevCharArray(char[] arg){
        for (int i = arg.length-1; i >= 0 ; i--) {
            System.out.print(arg[i]);

        }

    }

    public static void main(String[] args) {
        RevCharArray(new char[]{'h', 'a', 'r', 'u', 'n'});
    }
}
