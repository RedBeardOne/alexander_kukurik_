package join;

import java.util.ArrayList;
import java.util.Collection;

public class InnerJoinOperation implements JoinOperation <DataRow, DataRow, JoinedDataRow>{

    @Override
    public Collection<JoinedDataRow> join(Collection<DataRow> leftCollection, Collection<DataRow> rightCollection) {
        ArrayList <JoinedDataRow> joinedDataRows = new ArrayList<>();
        for (DataRow objLft :leftCollection){
            for (DataRow objRght :rightCollection) {
                if (objLft.getKey() == objRght.getKey() && objLft.getTitle() != null && objRght.getTitle() != null) {
                    JoinedDataRow elem = new JoinedDataRow(objLft.getKey(), objLft.getTitle(), objRght.getTitle());
                        joinedDataRows.add(elem);
                }
            }
            }
        for (JoinedDataRow elem: joinedDataRows) {
            System.out.println(elem);
        };
        return joinedDataRows;
    }

}

