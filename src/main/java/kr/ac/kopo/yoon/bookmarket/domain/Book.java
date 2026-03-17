package kr.ac.kopo.yoon.bookmarket.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Setter
@Getter
public class Book {
    private String bookId; //도서 ID
    private String bookName; //도서 이름
    private BigDecimal bookPrice; //도서 가격
    private String bookAuthor; //저자
    private String bookInfo; //설명
    private String bookPublisher; //출판사
    private String category; //분류
    private long unitsInStock; //재고수
    private String releaseDate; //출판일
    private String bookCondition; //신규도서, 중고도서, E-Book
}
