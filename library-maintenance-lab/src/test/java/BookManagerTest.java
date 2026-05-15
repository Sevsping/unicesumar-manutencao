import org.junit.Test;

public class BookManagerTest {

    @Test(expected = RuntimeException.class)
    public void deveFalharQuandoNaoExistemLivros() {
        BookManager manager = new BookManager();

        manager.listBooksSimple();
    }
}
