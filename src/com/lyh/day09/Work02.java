package com.lyh.day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 */
public class Work02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件名：");
        String s = sc.nextLine();
        String b = ".txt";
        String s1 = s.substring(0,s.indexOf(b));  //截取前面的名字，用于后面创建副本
        File file = new File(s);
        boolean exists = file.exists();   //判断文件是否存在
        if (!exists){
            boolean newFile = file.createNewFile();  //如果不存在创建新的文件
        }else {
            System.out.println("文件已存在");    //如果存在，打印文件已存在
            int a = 0;
            while (exists){
                a++;
                file = new File(s1+"_副本"+a+".txt");
                System.out.println("file = " + file);
                exists = file.exists();    //判断文件副本是否已存在
            }
            file.createNewFile();   //当文件不存在，跳出循环，然后创建新文件副本
        }
        System.out.println("创建文件的名字："+file.getName());
    }
}
