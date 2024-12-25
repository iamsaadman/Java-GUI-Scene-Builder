package ArrayOfObject;


class Student{
    private String name;
    private int id;
    private char GL;
    public Student(String name,int id,char GL){
        this.name = name;
        this.id = id;
        this.GL = GL;
    }
    public double CalGP(){
        double x;
        if(GL=='A') {
            x=4.0;
        }
        else if(GL=='B') {
            x=3.0;
        }
        if(GL=='C') {
            x=2.0;
        }
        else {
            x = 0.0;
        }
        return  x;
}
public class Main {
    public static void main(String[] args) {
        Student s[] = new Student[5];
        s[0]= new Student("A",100,'A');
        s[1]= new Student("B",100,'B');
        s[2]= new Student("C",100,'C');
        s[3]= new Student("D",100,'D');
        s[4]= new Student("E",100,'E');

    }
}
}
