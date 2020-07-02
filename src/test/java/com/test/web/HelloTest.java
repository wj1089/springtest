package com.test.web;

import static org.junit.Assert.*;

import org.junit.Test;
import com.test.web.tests.Hello;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
/**
  * @FileName : HelloTest.java
  * @Project : test
  * @Date : 2020. 7. 2. 
  * @작성자 : bit23
  * @변경이력 :
  * @프로그램 설명 :
  */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/*-context.xml")
public class HelloTest {

	@Autowired Hello hello;

	@Test
	public void helloBean() {
		// 값 비교 (Junit)
		Assert.assertEquals("Hello 조성훈", hello.sayHello());
		hello.print();
	
	}

}
