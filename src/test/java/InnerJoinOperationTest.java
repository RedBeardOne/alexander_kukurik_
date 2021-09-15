import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import join.data.DataRow;
import join.data.JoinedDataRow;
import join.operation.JoinOperation;
import join.operation.InnerJoinOperation;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class InnerJoinOperationTest {
    private JoinOperation operation = new InnerJoinOperation();
    @Test
    void join(){
        Collection<JoinedDataRow> result = new ArrayList<>();
        JoinedDataRow fin = new JoinedDataRow(1, "Kiev", "Ukraine");
        result.add(fin);
        Collection<DataRow> left = Arrays.asList (new DataRow(1, "Kiev"));
        Collection<DataRow> right = Arrays.asList (new DataRow(1, "Ukraine"));
        assertEquals(result, operation.join(left, right));
    }
}
