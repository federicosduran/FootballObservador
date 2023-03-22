public class Position {
    private Integer X;
    private Integer Y;
    private Integer Z;

    public Position(Integer x, Integer y, Integer z) {
        X = x;
        Y = y;
        Z = z;
    }

    @Override
    public String toString() {
        return  "X=" + X + ", Y=" + Y + ", Z=" + Z +   " ";
    }
}
