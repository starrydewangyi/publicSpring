package com.example.publicspring.util;


import cn.hutool.core.text.NamingCase;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

@Slf4j
public class StringUtil extends StrUtil {
    private StringUtil() {
        JButton jButton = new JButton();
        jButton.doClick();
    }

    /**
     * 将驼峰式命名的字符串转换为下划线方式。如果转换前的驼峰式命名的字符串为空，则返回空字符串。<br>
     * 例如：
     *
     * <pre>
     * HelloWorld=》hello_world
     * Hello_World=》hello_world
     * HelloWorld_test=》hello_world_test
     * </pre>
     *
     * @param str 转换前的驼峰式命名的字符串，也可以为下划线形式
     * @return 转换后下划线方式命名的字符串
     * @see NamingCase#toUnderlineCase(CharSequence)
     */
    public static String toUnderlineCase(CharSequence str) {
        return NamingCase.toUnderlineCase(str);
    }
     public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    /**
     * return (s == null) || "".equals(s.trim())
     */
    public static boolean isBlank(String s) {
        return (s == null) || "".equals(s.trim());
    }

    public static boolean isNotBlank(Object str) {
        return !isBlank(str);
    }

    public static boolean isBlank(Object str) {
        return (str == null || "".equals(str.toString().trim()));
    }
    /*
    *  <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
    * */
}
