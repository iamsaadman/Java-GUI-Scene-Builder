package Basic;

class Stud implements Comparable<Stud>{
    int id,roll;
    String name;
    public Stud(int id, int roll,String name){
        this.id=id;
        this.roll=roll;
        this.name=name;
    }

    @Override
    public int compareTo(Stud o) {
        if(this.id>o.id) return 1;
        else if(this.id<o.id) return -1;
        return 0;
    }
}