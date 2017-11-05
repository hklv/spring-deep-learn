package com.lhk.IOC;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 20:44
 */
public class FileSourceExample {
    public static void main(String[] args) {
        try {
            String filePath = "D:/project/spring/spring-learn/src/main/java/com/lhk/IOC/file1.txt";
            Resource res1 = new FileSystemResource(filePath);
            //Resource res2 = new ClassPathResource("target/classes/com/lhk/IOC/file1.txt");
            InputStream ins1 = res1.getInputStream();
           // InputStream ins2 = res2.getInputStream();
            System.out.println("res1" + res1.getFilename());
           // System.out.println("res2" + res2.getFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
