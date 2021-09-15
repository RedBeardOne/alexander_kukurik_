package join.data;

public class DataRow {
    private int key;
    private String title;

   public DataRow(int key, String title) {
        this.key = key;
        this.title = title;
    }

    public int getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }
}
