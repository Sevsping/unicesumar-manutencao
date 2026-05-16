import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReportGeneratorTest {

    @Test
    public void deveGerarTotalizadoresCorretosNoRelatorioSimples() {
        LegacyDatabase.getLoans().clear();

        Map<String, Object> loan1 = new HashMap<String, Object>();
        loan1.put("status", "OPEN");

        Map<String, Object> loan2 = new HashMap<String, Object>();
        loan2.put("status", "CLOSED");

        LegacyDatabase.getLoans().add(loan1);
        LegacyDatabase.getLoans().add(loan2);

        ReportGenerator generator = new ReportGenerator();

        String report = generator.generateSimpleReport("Teste Bug 03", 0, "manager", "helper", 0, "");

        System.out.println(report);

        assertFalse(report.contains("Loans: 3"));
        assertTrue(report.contains("Loans: 2"));
        assertTrue(report.contains("Open loans: 1"));
        assertTrue(report.contains("Closed loans: 1"));
    }
}
