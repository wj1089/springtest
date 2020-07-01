package com.test.web.domains;

/**
 * @FileName : Article.java
 * @Project : 회원전용 게시판
 * @Date : 2020. 7. 1. 
 * @작성자 : wj1089@naver.com
 * @변경이력 :
 * @프로그램 설명 :
 * articleNumber : 
 * fileNumber : 
 * userid : 
 * comment : 
 * message : 
 * rating :
 * boardtype : 
 * title :
 * context :
 */

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int artSeq, imageSeq;
	private String userid, comments, message, rating, boardType, title, content; 
}