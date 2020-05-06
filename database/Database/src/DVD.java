public class DVD extends Item {
    private String director;

    public DVD(String title,String director,
              int playingTime,String comment){
       super(title,playingTime,false,comment);
//        setTitle("x");
        this.director = director;
    }

    public void print(){
        System.out.print("DVD: ");
        super.print();
        System.out.print(director);
        System.out.println();
    }
    public static void main(String[] args){
        DVD dvd = new DVD("a","b",1,"..");
        dvd.print();
    }
}
