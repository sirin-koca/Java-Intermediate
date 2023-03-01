package substitution_principle;
/*
 Because of the substitution principle I can add office objects to the list because office is a subtype of building. I
 */

import java.util.List;

//  class Office extends Building
public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);
    }

    static void build(Building building){
        System.out.println("Constructing a new " + building.toString());
    }
    static  void printBuildings(List<Building> buildings){
        for(int i = 0; i < buildings.size(); i++){
            System.out.println(i + 1 + " : " + buildings.get(i).toString());
        }

    }
}
