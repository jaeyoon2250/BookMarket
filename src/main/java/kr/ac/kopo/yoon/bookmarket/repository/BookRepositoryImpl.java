package kr.ac.kopo.yoon.bookmarket.repository;


import kr.ac.kopo.yoon.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setName("해저2만리");
        book1.setUnitPrice(new BigDecimal(17100));
        book1.setAuthor("쥘 베른");
        book1.setDescription("1866년, 언제부터인가 정체불명의 거대한 물체가 세계 곳곳의 바다에서 기괴한 해난 사고를 일으키고 있다는 소문이 미국과 유럽 등지에 떠돌게 되었습니다. 여러 척의 기선이 대양 한가운데서 정체를 알 수 없는 괴물과 부딪쳤고, 해양학자인 아로낙스 박사는 그 괴물이 지금까지 밝혀지지 않은 엄청난 크기의 고래 같다고 하며, " +
                "'일각고래(외뿔고래)'라는 판정을 내립니다. 그리고 아로낙스 박사는 그이 충직한 조수 콩세유와 함께 미국 정부의 '에이브러햄 링컨호'에 승선합니다. 그곳에서 박사는 캐나다인 네드랜드를 만나게 됩니다. 그들은 정체 모를 괴물을 찾아 바다를 항해합니다. 드디어 일본 근해에서 아로낙스 박사 일행은 '일각고래'라는 괴물을 발견하고 공격하지만, 그 괴물은 끄떡도 하지 않았습니다. 오히려 공격했던 포탄이 되돌아와 '에이브러햄 링컨호'에 부딪치자, 아로낙스 박사 일행은 망망대해로 떨어져 죽을 고비에 이릅니다.  ");
        book1.setPublisher("비룡소");
        book1.setCategory("소설");
        book1.setUnitsInStock(5);
        book1.setReleaseDate("2011-02-10");
        book1.setCondition("신규상품");

        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setName("데이터베이스 개론");
        book2.setUnitPrice(new BigDecimal(29000));
        book2.setAuthor("김연희");
        book2.setDescription("데이터베이스로 첫 항해를 떠나는 이들에게 지도와 돛이 되어주는 책입니다.\n" +
                "마인드맵으로 생소한 개념 간의 관계를 한눈에 보여주고,\n" +
                "친근한 예와 비유를 들어 명료하게 풀어내, 데이터베이스 기본기를 탄탄히 다져줍니다.\n" +
                "3판에서는 빅데이터 표현 기술이 더 추가되었고\n" +
                "다양한 시험의 최신 기술 경향에 맞게 연습문제를 보강하였습니다.\n" +
                "또한 부록을 통해 최신 버전의 오라클뿐만 아니라 설치하지 않아도 사용할 수 있는\n" +
                "Live SQL을 활용해 데이터베이스를 직접 구축해볼 수 있게 안내하였습니다.\n");
        book2.setPublisher("한빛아카데미");
        book2.setCategory("컴퓨터/IT");
        book2.setUnitsInStock(5);
        book2.setReleaseDate("2022-01-15");
        book2.setCondition("신규상품");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setName("리눅스마스터 2급 한권으로 끝내기");
        book3.setUnitPrice(new BigDecimal(23400));
        book3.setAuthor("박성업");
        book3.setDescription("이 책은 국가공인 리눅스마스터 2급 자격시험을 대비하기 위한 수험서이다. 최근 5년간 출제 기준을 반영하여 시험에 반드시 나오는 핵심 이론을 총 3개 파트, 12개 챕터, 29개 섹션으로 정리하였다. " +
                "또한, 다양한 문제를 풀어보며 출제 유형을 익힐 수 있도록 챕터별 900개 이상의 예상문제와 23, 24년 기출문제 4회분, 최신 출제 경향을 분석해 구성한 실전 모의고사 3회분을 수록하였다. 마지막으로 리눅스마스터 2급 학습을 점검하고 빠르게 마무리하기 위한 핵심 이론 요약집과 주요 명령어 별지를 수록하였다.");
        book3.setPublisher("시대고시기획");
        book3.setCategory("컴퓨터/IT");
        book3.setUnitsInStock(5);
        book3.setReleaseDate("2026-03-10");
        book3.setCondition("신규상품");
        
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
