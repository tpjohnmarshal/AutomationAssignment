package apiEngine;

/*
 * REST Route class is used to configure the routes of each end points
 * In case of any modification in Route, we won’t have to make changes everywhere. 
 * Instead just at a single place in the Routes class
 */
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
