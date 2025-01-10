public class Rectangle {
    
    protected int length, width;

    Rectangle (){
        this.length = 10;
        this.width = 5;
    }

    Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    @Override
    public String toString (){
        return "Length: " + this.length + "\nWidth: " + this.width;
    }
}
