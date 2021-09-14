package join;

import java.util.ArrayList;
import java.util.Collection;

public class MainTest {
    public static void main(String[] args) {
        DataRow kiev = new DataRow(1, "Kiev");
        DataRow stam = new DataRow(2, "Stambul");
        DataRow london = new DataRow(3, "London");
        DataRow ny = new DataRow(5, "New-York");
        DataRow reservecity = new DataRow(7, null);


        DataRow ua = new DataRow( 1, "Ukraine");
        DataRow trk = new DataRow(2, "Turkey");
        DataRow usa = new DataRow(5, "USA");
        DataRow mex = new DataRow(6, "Mexico");
        DataRow reservecountry = new DataRow(7, null);

        ArrayList<DataRow> leftCollection = new ArrayList<>();
        leftCollection.add(kiev);
        leftCollection.add(stam);
        leftCollection.add(london);
        leftCollection.add(ny);
        leftCollection.add(kiev);
        leftCollection.add(reservecity);

        ArrayList<DataRow> rightCollection = new ArrayList<>();
        rightCollection.add(ua);
        rightCollection.add(trk);
        rightCollection.add(usa);
        rightCollection.add(mex);
        rightCollection.add(reservecountry);
        InnerJoinOperation test = new InnerJoinOperation();
        test.join(leftCollection, rightCollection);
        test.toString();
        System.out.println(" ");
        System.out.println( " left ");
        LeftJoinOperation testleft = new LeftJoinOperation();
        testleft.join(leftCollection, rightCollection);
        testleft.toString();
        System.out.println(" ");
        System.out.println( " right ");
        RightJoinOperation testrigth = new RightJoinOperation();
        testrigth.join(leftCollection, rightCollection);
        testrigth.toString();
    }
}
