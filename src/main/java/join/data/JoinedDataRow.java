package join.data;

public class JoinedDataRow extends DataRow{
    String total;
    public JoinedDataRow(int key, String title, String country){
        super(key, title);
        this.total = country;
    }

    public String getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "key = " + getKey() + " title "+ getTitle() + " total " + getTotal();
    }
}
