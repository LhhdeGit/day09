package com.lyh.day09;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 */
public class Work04 {
    public static void main(String[] args) {
        File file = new File("aa");
        File[] files = file.listFiles();   //列出目录下所有的文件
        for (File f : files) {
            System.out.println("所有文件："+f.getName());
        }
        System.out.println("目录名字："+ file.getName());
    }
}
