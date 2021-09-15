import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import join.data.DataRow;
import join.data.JoinedDataRow;
import join.operation.RightJoinOperation;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RightJoinOperationTest {
    private RightJoinOperation operation = new RightJoinOperation();
    @Test
    void join(){
        Collection<JoinedDataRow> result = new ArrayList<>();
        JoinedDataRow one = new JoinedDataRow(1, "Kiev", "Ukraine");
        JoinedDataRow three = new JoinedDataRow(1, null, "Turkey");
        result.add(one);
        result.add(three);
        Collection<DataRow> left = Arrays.asList (new DataRow(1, "Kiev"));
        Collection<DataRow> right = Arrays.asList (new DataRow(1, "Ukraine"), (new DataRow(3, "Turkey")));
        assertEquals(result, operation.join(left, right));
    }
}

