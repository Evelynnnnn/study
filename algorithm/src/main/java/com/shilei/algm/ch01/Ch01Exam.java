package com.shilei.algm.ch01;

import com.shilei.algm.utils.StdDraw;
import com.shilei.algm.utils.StdRandom;

import java.util.Arrays;

public class Ch01Exam {

    public static void main(String[] args) {
        //function();
        sortArray();
    }

    //函数值绘图
    public static void function(){
        int n = 1000;
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i < n; i++) {
            //一次函数
            StdDraw.point(i,i);
            //二次函数
            StdDraw.point(i,i*i);
            //对数函数
            StdDraw.point(i,i*Math.log(i));
        }
    }

    //随机数组排序
    public static void sortArray(){
        int n = 500;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = StdRandom.random();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            double x = 1.0 * i / n;
            double y = arr[i] / 2.0;
            double rw = 0.5 / n;
            double rh = arr[i] / 2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
