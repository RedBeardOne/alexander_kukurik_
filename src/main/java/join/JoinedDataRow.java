package join;

public class JoinedDataRow extends DataRow{
    String total;
    JoinedDataRow(int key, String title, String total){
        super(key, title);
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "key = " + getKey() + " title "+ getTitle() + " total " + getTotal();
    }
}
