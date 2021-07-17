package com.lyh.day09;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 */
public class Work03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目录名：");
        String s = sc.nextLine();
        File file = new File("aa");   //使用路径构造File对象（在当前目录下创建aa）
        boolean exists = file.exists();  //判断文件是否存在  如果不存在就创建新目录
        if (!exists){
            file.mkdir();   //创建新目录
        }else{
            //如果存在，就创建名为：aa_副本1的文件，如果副本1也存在就创建副本2
            int a = 0;
            while (exists){
                a++;
                file = new File("aa_副本"+a);
               exists = file.exists();  //判断文件是否存在，不存在跳出循环
            }
            file.mkdir();
        }
        System.out.println("目录名为："+file.getName());
    }
}
