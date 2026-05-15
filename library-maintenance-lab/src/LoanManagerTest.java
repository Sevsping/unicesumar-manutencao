import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LoanManagerTest {

    @Test
    void deveFalharAoDevolverEmprestimoInexistente() {
        LoanManager loanManager = new LoanManager();

        assertThrows(RuntimeException.class, () -> {
            loanManager.returnBook(9999, "2026-05-15", "WEB", 0, "RETURN", "admin");
        });
    }
}
