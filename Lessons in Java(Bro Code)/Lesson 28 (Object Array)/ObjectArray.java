public class ObjectArray{
   public static void main (String [] args){
   
   Food [] mainCourse = new Food [3];
   
   mainCourse[0] = new Food ("Pizza");
   mainCourse[1] = new Food ("Hamburger");
   mainCourse[2]= new Food ("Hotdog");
   
   // //FORMAT: Class (userDefinedaName) = new Instantiation
   
   // mainCourse[0] = food1;
   // mainCourse[1] = food2;
   // mainCourse[2] = food3;
   
   for (Food h : mainCourse){
      // System.out.println(h);
      h.checkInfo();
   }//For each (h is the order in the array)
   
   // System.out.println(mainCourse[0].name);
   //Solo printing
   //Array[x], x is the order in the array.
   
   }
}