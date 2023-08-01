package MyException;

public abstract class MyExcpeption extends NumberFormatException {
    protected int size;
    protected int x;
    protected int y;




    public MyExcpeption(String s, int size) {
        super(s + "" + size);
        this.size = size;
    }
    public MyExcpeption(String s,int x,int y){
        super(s+ " " + x+ " " + y);
        this.x = x;
        this.y = y;
    }


}
