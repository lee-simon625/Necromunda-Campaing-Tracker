package objects;

import objects.gangs.Gang;
import objects.territories.Territories;

import java.util.HashMap;
import java.util.Scanner;

public class Campaign {

    private HashMap<Integer, Territories> territories = new HashMap();
    private HashMap<Integer, Gang> gangs = new HashMap<>();


    public void createGang(String player, String name, String gangType, int totalValue) {
        int id = gangs.size() + 1;
        gangs.put(id, new Gang(player, name, gangType, totalValue));
        System.out.println("New gang Created with ID "+id);


    }

    public void removeGang(int id) {

        gangs.remove(id);

    }

    public int countGangs() {

        return gangs.size();
    }

    public String gangsToString() {
        String compiledString = "";


        for (Gang gang : gangs.values()) {
            compiledString += gang.toString();
        }


        return compiledString;

    }

    public void createTerritory(String name, String income, String recruit, String equipment, String special, int reputation) {
        int id = territories.size() + 1;
        territories.put(id, new Territories(name, income, recruit, equipment, special, reputation));
        System.out.println("New territory Created with ID "+id);

    }

    public void removeTerritory(int id) {

        territories.remove(id);

    }

    public int countTerritories() {

        return territories.size();

    }

    public String territoriesToString(){
        String compiledString = "";

        for (Territories territories : territories.values()) {
            compiledString += territories.toString();
        }

        return compiledString;
    }

    public void campaignInfo() {
        System.out.println("There are :\n " +"  "+ countGangs() + " gangs \n" +
                "   "+ countTerritories() + " territories");
    }

    public void gangInfo(){
        System.out.println(gangsToString());
    }

    public void territoryInfo(){
        System.out.println(territoriesToString());
    }

    public void addTerritoryToGang() {



    }
}
    /*
todo also have a second fancy print for the whole campaign with status of each gang and what territories they have
     */