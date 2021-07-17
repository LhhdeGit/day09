package com.lyh.day09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 */
public class Work01 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");  //使用路径构造File对象
        boolean exists = file.exists();
        //输出文件名字
        if (exists){
            System.out.println("文件已存在，boolean值="+exists);
        }else {
            System.out.println("文件不存在，boolean值="+exists);
            boolean create = file.createNewFile();
            System.out.println("文件创建成功"+create);
        }
        String name = file.getName();
        System.out.println("项目目录下的文件名字为"+name);
        //输出文件的大小
        long l = file.length();
        System.out.println("文件的大小为"+l);
        //输出文件最后的修改时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();     //创建日历类
        long l1 = file.lastModified();
        cal.setTimeInMillis(11);
        System.out.println(sdf.format(cal.getTime()));
    }
}
