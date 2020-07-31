package Reverse;

public class Reverse_01 {

    public static void Reverse_01(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);


        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Reverse_01("words");
    }
}
