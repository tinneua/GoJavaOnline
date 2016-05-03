package Module1;

public class Row {

    public Object s1;
    public Object s2;
    public Object s3;
    public Object s4;
    public Object s5;
    public Object s6;
    public Object s7;
    public Object s8;


    public Row(Object n1, Object n2, Object n3, Object n4, Object n5, Object n6, Object n7, Object n8) {
        this.s1 = n1;
        this.s2 = n2;
        this.s3 = n3;
        this.s4 = n4;
        this.s5 = n5;
        this.s6 = n6;
        this.s7 = n7;
        this.s8 = n8;

    }


    @Override
    public String toString() {

        return String.format("%15s %15s %15s %15s %15s %15s %15s %15s %n", s1, s2, s3,s4,s5,s6,s7,s8);
    }
}
