package com.shilei.algm.ch01;

import com.shilei.algm.utils.Counter;
import com.shilei.algm.utils.Interval1D;
import com.shilei.algm.utils.Interval2D;
import com.shilei.algm.utils.Point2D;
import org.junit.Test;

import java.awt.*;

public class Ch01Exam02 {

    public static void main(String[] args) {
        String[] arg = new String[]{"0.1","0.9","0.3","0.4","1000"};
        Interval2D(arg);
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
}
