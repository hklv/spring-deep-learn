package com.lhk.IOC;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 21:16
 */
public class EncodedResourceExample {
    public static void main(String[] args) throws Throwable {
        Resource res = new FileSystemResource("D:/project/spring/spring-learn/src/main/java/com/lhk/IOC/file1.txt");
        EncodedResource encodedResource = new EncodedResource(res, "UTF-8");
        String content = FileCopyUtils.copyToString(encodedResource.getReader());
        System.out.println(content);
    }
}
