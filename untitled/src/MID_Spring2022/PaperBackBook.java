package MID_Spring2022;

public class PaperBackBook extends Book{
    void description(){
        System.out.println("Paperback books are good for your eyes!");
    }
    void putPageMarker(int pageNo){
        System.out.println("Page marker was "+"put on page no: "+pageNo);
    }
}
