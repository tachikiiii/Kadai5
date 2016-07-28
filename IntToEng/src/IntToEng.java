
import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
	String[] digit1 = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] digit2 = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	if(n==100) return "one hundred";
	if (n<20) return digit1[n];
	if (n>=20 && n<100) {
	    int m1,m2;
	    m1 = n/10;
	    m2 = n%10;
	    if (m2==0) digit1[0]="";
	    String m = digit2[m1]+digit1[m2];
	    return m;
	} return "";
    }
}
