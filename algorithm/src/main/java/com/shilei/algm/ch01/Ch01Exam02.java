package com.shilei.algm.ch01;

import com.shilei.algm.utils.*;
import lombok.Data;
import org.junit.Test;

import java.awt.*;

@Data
public class Ch01Exam02 {

    double total;
    int N;

    public static void main(String[] args) {
        String[] arg = new String[]{"0.1","0.9","0.3","0.4","2000"};
//        Interval2D(arg);
        int T = Integer.parseInt(arg[4]);
        Ch01Exam02 ch01Exam02 = new Ch01Exam02(T,0.5);
        for (int i = 0; i < T; i++) {
            ch01Exam02.addDataValue(StdRandom.random() / 2);
            StdOut.println(ch01Exam02);
        }
    }

    /**
     * 生成一个以arg[1]-arg[0]为长，arg[3]-arg[2]为宽的长方形
     * 生成arg[4]个点
     * 如果这个长方形包括这些点，则计数器加一
     * @param arg
     */
    public static void Interval2D(String [] arg){
        double xlo = Double.parseDouble(arg[0]);
        double xhi = Double.parseDouble(arg[1]);
        double ylo = Double.parseDouble(arg[2]);
        double yhi = Double.parseDouble(arg[3]);
        int T = Integer.parseInt(arg[4]);

        Interval1D xInterval = new Interval1D(xlo,xhi);
        Interval1D yInterval = new Interval1D(ylo,yhi);
        Interval2D box = new Interval2D(xInterval,yInterval);
        box.draw();

        Counter c = new Counter("hits");
        for (int i = 0; i < T; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x,y);
            if (box.contains(p)){
                c.increment();
            }else{
                p.draw();
            }
        }
        System.out.println(c);
        System.out.println(box.area());
    }

    public Ch01Exam02(int trials,double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double value){
        N++;
        total += value;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }

}
