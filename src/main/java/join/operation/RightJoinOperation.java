package join.operation;
import join.data.DataRow;
import join.data.JoinedDataRow;
import java.util.ArrayList;
import java.util.Collection;

public class RightJoinOperation implements JoinOperation<DataRow, DataRow, JoinedDataRow> {

    @Override
    public Collection<JoinedDataRow> join(Collection<DataRow> leftCollection, Collection<DataRow> rightCollection) {
        boolean skip = true;
        ArrayList<JoinedDataRow> joinedDataRows = new ArrayList<>();
        for (DataRow objRght : rightCollection
                ) {
            skip = true;
            for (DataRow objLft : leftCollection) {
                if ((objLft.getKey() == objRght.getKey())) {
                    JoinedDataRow elem = new JoinedDataRow(objLft.getKey(), objLft.getTitle(), objRght.getTitle());
                    joinedDataRows.add(elem);
                    skip = false;
                }
            }
            if (skip) {
                JoinedDataRow elem = new JoinedDataRow(objRght.getKey(), null, objRght.getTitle());
                joinedDataRows.add(elem);
                skip = false;
            }
        }
        for (JoinedDataRow elem : joinedDataRows) {
            System.out.println(elem);
        }
        return joinedDataRows;
    }
}