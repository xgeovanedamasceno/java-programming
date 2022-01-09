public class Obj extends ObjTree<Obj> {
    Integer myData;

    public Obj(Integer data) {
        this.myData = data;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || this.getClass() != ob.getClass()) return false;

        Obj obj = (Obj) ob;
        return Objects.equals(this.myData, obj.myData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myData);
    }

    @Override
    public int compareTo(Obj other) {
        int i = 0;

        if (this.myData > other.myData) {
            i = 1;
        } else if (this.myData < other.myData) {
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return this.myData.toString();
    }
}