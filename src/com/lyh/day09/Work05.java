package com.lyh.day09;


import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 */
public class Work05 {
    public static void main(String[] args) {
        System.out.println("请输入你想删除的文件或目录：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File file = new File(s);
        boolean delete = file.delete();
        if(delete){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
