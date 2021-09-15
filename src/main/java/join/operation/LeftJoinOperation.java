package join.operation;

import join.data.DataRow;
import join.data.JoinedDataRow;

import java.util.ArrayList;
import java.util.Collection;

public class LeftJoinOperation implements JoinOperation<DataRow, DataRow, JoinedDataRow> {

    @Override
    public Collection<JoinedDataRow> join(Collection<DataRow> leftCollection, Collection<DataRow> rightCollection) {
        boolean skip = true;
        ArrayList<JoinedDataRow> joinedDataRows = new ArrayList<>();
        for (DataRow objLft : leftCollection) {
            skip = true;
            for (DataRow objRght : rightCollection) {
                if ((objLft.getKey() == objRght.getKey())) {
                    JoinedDataRow elem = new JoinedDataRow(objLft.getKey(), objLft.getTitle(), objRght.getTitle());
                    joinedDataRows.add(elem);
                    skip = false;
                }
            }
            if (skip) {
                JoinedDataRow elem = new JoinedDataRow(objLft.getKey(), objLft.getTitle(), null);
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