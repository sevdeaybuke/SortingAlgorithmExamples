package Elements;

public class Element {
    private int id;

    public Element(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compareTo(Element element) {
        int res = 0;
        if (this.id < element.getId()) {
            res = -1;
        }
        if (this.id > element.getId()) {
            res = 1;
        }
        return res;
    }

}
