package MID_Fall_2021;

public class Area {
    private int length;
    private int width;

    public Area(int length, int width) {
        this.length = length;
        this.width = width;

    }

    int returnArea() {
        int returnArea = length * width;
        return returnArea;
    }

    void print(){
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is \n" +
                "the width.");
    }

    public static void main(String[] args) {
        Area a = new Area(5,2);
        a.print();
        System.out.println(a.returnArea());
    }
}