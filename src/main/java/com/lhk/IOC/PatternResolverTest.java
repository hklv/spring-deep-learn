package com.lhk.IOC;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 21:23
 */
public class PatternResolverTest {
    public static void main(String[] args) throws Exception {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("file:spring-learn/src/main/java/com/lhk/IOC/file.txt");
        for (Resource resource : resources) {
            System.out.println(resource.getDescription());
        }
    }
}
