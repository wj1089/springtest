/**
 * 
 */
package com.test.web.tests;

import org.springframework.stereotype.Component;

/**
  * @FileName : ConsolePrinter.java
  * @Project : test
  * @Date : 2020. 7. 2. 
  * @작성자 : bit23
  * @변경이력 :
  * @프로그램 설명 :
  */
@Component("conPrinter")
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}