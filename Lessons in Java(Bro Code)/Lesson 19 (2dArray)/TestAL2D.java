import java.util.*;

public class TestAL2D{

   public static void main (String [] args){
   
   ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
   
   ArrayList<String> bakeryList = new ArrayList<String>();
   bakeryList.add("pasta");
   bakeryList.add("bread");
   bakeryList.add("croissant");
   bakeryList.add("donuts");
   
   ArrayList<String> produceList = new ArrayList<String>();
   produceList.add("apple");
   produceList.add("orange");
   produceList.add("banana");
   produceList.add("okra");
   produceList.add("eggplant");
   produceList.add("liverspread");
   produceList.add("waken");
   
   ArrayList<String> drinksList = new ArrayList<String>();
   drinksList.add("Wine");
   drinksList.add("Red Horse");
   drinksList.add("Dutchmill");
   drinksList.add("Yakult");
   
   groceryList.add(produceList);
   groceryList.add(bakeryList);
   groceryList.add(drinksList);
   
   for(String i : drinksList){
      System.out.print(i + " ");
   }
   
   //For-each, Iterates through all of the elements inside an array
   
   }

}