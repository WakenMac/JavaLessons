public class Box extends Rectangle{
    
    int height;

    Box (int length, int width, int height){
        super(length, width);
        this.height = height;
    }

    Box (){
        super();
        this.height = 0;
    }

    public int volume (){
        return this.length * this.width * this.height;
    }

    @Override
    public String toString (){
        return super.toString() + "\nHeight: " + this.height;
    }

}
