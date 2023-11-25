package seminars.fourth.book;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

//import org.junit.jupiter.api.Test;
//        import static org.mockito.Mockito.*;
//
//public class TestBookService {
//    private BookService service = new BookService(mock(BookRepository.class));
//
//    @Test
//    public void testFindById() {
//        int bookId = 1;
//        service.findById(bookId);
//        verify(service.getBookRepository()).findById(bookId);
//    }
//
//    @Test
//    public void testFindAll() {
//        service.findAll();
//        verify(service.getBookRepository()).findAll();
//    }
