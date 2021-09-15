import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import join.data.DataRow;
import join.data.JoinedDataRow;
import join.operation.LeftJoinOperation;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class LeftJoinOperationTest {
    private LeftJoinOperation operation = new LeftJoinOperation();
    @Test
    void join(){
        Collection<JoinedDataRow> result = new ArrayList<>();
        JoinedDataRow one = new JoinedDataRow(1, "Kiev", "Ukraine");
        JoinedDataRow two = new JoinedDataRow(1, "London", null);
        result.add(one);
        result.add(two);
        Collection<DataRow> left = Arrays.asList ((new DataRow(1, "Kiev")), (new DataRow(2, "London")));
        Collection<DataRow> right = Arrays.asList (new DataRow(1, "Ukraine"));
        assertEquals(result, operation.join(left, right));
    }
}

