import org.junit.Test;

public class BookManagerTest {

    @Test(expected = IllegalStateException.class)
    public void deveFalharQuandoNaoExistemLivros() {
        BookManager manager = new BookManager();
        LegacyDatabase.getBooks().clear();

        BookManager manager = new BookManager();
        manager.listBooksSimple();
    
}

@Test
public void deveListarLivrosComSucesso() {
     LegacyDatabase.getBooks().clear();

    BookManager manager = new BookManager();
    manager.registerBook("Livro Teste", "Autor Teste", 2024, "GERAL", 1, 1, "A1", "ISBN-001");

    manager.listBooksSimple();
    }
}
