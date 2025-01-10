public class MyGenericClass <T extends Number, U extends Number>{
    
    private T obj1;
    private U obj2;

    public MyGenericClass(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getTValue(){
        return this.obj1;
    }

    public U getUValue(){
        return this.obj2;
    }
}
