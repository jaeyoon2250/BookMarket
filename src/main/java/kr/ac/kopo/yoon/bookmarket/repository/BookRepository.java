package kr.ac.kopo.yoon.bookmarket.repository;

import kr.ac.kopo.yoon.bookmarket.domain.Book;
import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
