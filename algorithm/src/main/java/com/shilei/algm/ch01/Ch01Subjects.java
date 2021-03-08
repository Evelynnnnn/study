package com.shilei.algm.ch01;

import com.shilei.algm.utils.StdOut;
import org.junit.Test;

import javax.servlet.http.PushBuilder;
import java.util.Scanner;

public class Ch01Subjects {

    private static String getType(Object a) {
        return a.getClass().toString();

    }

    @Test
    public void sub01(){
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true && false || true && true);
    }

    @Test
    public void sub02(){
        System.out.println( ( 1 + 2.236) / 2 + " " + getType(( 1 + 2.236) / 2 ));
        System.out.println( 1 + 2 + 3 + 4.0 + " " + getType(1 + 2 + 3 + 4.0));
        System.out.println( 4.1 >= 4 );
        System.out.println(getType( 4.1 >= 4));
        System.out.println( 1 + 2 + "3" + " " + getType(1 + 2 + "3"));
    }

    @Test
    public void sub03(){
        //Junit can not be used Class Scanner
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a == b && a == c);
    }

    @Test
    public void sub04(){
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void sub05(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }


    public static String exR1(int n){
        if (n <= 0){
            return "";
        }
        return exR1(n - 3 ) + n + exR1(n - 2) + n;
    }

    @Test
    public void sub06(){
        System.out.println(exR1(6));
        System.out.println(exR2(6));
    }

    public static String exR2(int n){
        String s = exR2(n - 3 ) + n + exR2(n - 2) + n;
        if (n <= 0){
            return "";
        }
        return s;
    }
}
