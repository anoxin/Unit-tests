;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

// У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

public class TestBookService {

  @Test
  public void simpleTest() {
    // Создаем мок
    BookRepository bookRepository = mock(BookRepository.class);
    BookService bookService = new BookService(bookRepository);


    // Используем мок
    bookService.findBookById("1");
    bookService.findAllBooks();



    // Проверяем, что методы были вызваны
    verify(bookRepository).findById("1");
    verify(bookRepository).findAll();
  }

}
