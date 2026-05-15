import org.junit.Test;

public class LoanManagerTest {

    @Test(expected = RuntimeException.class)
    public void deveFalharAoDevolverEmprestimoInexistente() {
        LoanManager loanManager = new LoanManager();

      
        loanManager.returnBook(9999, "2026-05-15", "WEB", 0, "RETURN", "admin");
        
    }
}
