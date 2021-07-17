package com.lyh.day09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Work06 {
    public static void main(String[] args) {
        File file = new File(".");  //获取并输出当前目录下所有文件的名字
        File[] files = file.listFiles();  //创建一个数组列表文件
        for (int i = 0; i <files.length ; i++) {
            if (files[i].isFile()){    //判断是否是文件，是的话就输出
                System.out.println(files[i].getName());
            }
        }
    }
}
