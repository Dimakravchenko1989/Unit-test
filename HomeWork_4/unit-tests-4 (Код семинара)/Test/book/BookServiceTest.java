package book;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class BookServiceTest {
    
    @Mock
    private BookRepository bookRepository;
    private BookService bookService;
    
    @Before
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        String id = "1";
        Book book = new Book(id, "Book1", "Author1");
        when(bookRepository.findById(id)).thenReturn(book);
        Book result = bookService.findBookById(id);
        verify(bookRepository).findById(id);
        assertEquals(book, result);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> result = bookService.findAllBooks();
        verify(bookRepository).findAll();
        assertEquals(books, result);
    }
}