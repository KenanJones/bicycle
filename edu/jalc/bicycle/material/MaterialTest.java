package edu.jalc.bicycle.material;

public class MaterialTest{
   public static void main(String... args){
      System.out.println("Testing Material . . .");
      testGetDensity();
      testGetStrength();
      testGetName();
      System.out.println("Material tests passed.");
   }

   static void testGetDensity(){
      System.out.println("testing getDesity");
      Material material = new Material(null,10.0,0);
      assert(material.getDensity() == 10.0);
   }

   static void testGetStrength(){
      System.out.println("testing getStrength");
      Material material = new Material(null,0,10.0);
      assert(material.getStrength() == 10.0);
   }

   static void testGetName(){
      System.out.println("testing getName");
      Material material = new Material("steel",0,0);
      assert(material.getName() == "steel");
   }
}
