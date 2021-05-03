package com.company.Main;

import java.util.ArrayList;

public class Location {
    public int location_id;
    public String location_name;

    public Location(int location_id, String location_name) {
        this.location_id = location_id;
        this.location_name = location_name;
    }

    //IMPLEMENT FUNCTION TO RETURN AN ARRAY OF LOCATIONS @PERRY
    public int getLocation_id() {
        return location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public static ArrayList<Location> getLocationList(){
        SelectRecords sr = new SelectRecords();
        return sr.retrieveLocationList();
    }
    public  static void displayLocationList()
    {
        ArrayList<Location> locations = getLocationList();
        for(int i = 0 ; i < locations.size() ; i++)
        {
            System.out.println("[" + (i+1) + "] " + locations.get(i).location_name);
        }
        System.out.println("__________________________________");
    }
}