package apiEngine;

public class Route {
 
    public static String pets(){ 
     return  "/pet/findByStatus";
    }
 
    public static String pet(){ 
     return  "/pet";
    }
 
    public static String updatePet(int petId){
     return "/pet" + "/" + petId;
    }
}
