package com.geektext.GeekText.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.geektext.GeekText.entities.Book;
import java.util.List;



public interface BookRepository extends JpaRepository<Book, String> {
    @Query("Select b FROM Book b WHERE b.authorID.authorID = ?1")
    List<Book> findByAuthorID(int authorid);

    @Query("Select book from Book book order by book.ranking")
    List<Book> getByRanking();
}
