package twenty_days.day9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Hs
 * @Date 2021/10/10 20:02
 *
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 *
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
 *
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
 *
 * 最后返回经过上色渲染后的图像。
 *
 * 思路：深度优先搜索：使用x，y两个数组模拟4个方向,从给定的初始节点开始，
 * 对相邻的每一个数组位置进行更改。判断是否相邻的条件是其值是否与初始节点值相等
 */
public class tuxiangxuanran733 {

    int[] dx={1,0,-1,0};//四个方向 右，上，左，下
    int[] dy={0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color=image[sr][sc];
        if(color!=newColor){
            dfs(image,sr,sc,color,newColor);
        }
        return image;
    }
    void dfs(int[][] image,int sr,int sc,int color,int newColor){
        if(image[sr][sc]==color){
            image[sr][sc]=newColor;
        for(int i=0;i<4;i++) {
            int mx = sr + dx[i], my = sc + dy[i];
            if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
                dfs(image, mx, my, color, newColor);
            }
        }
        }
    }
}
