
import java.util.*;
import java.io.*;
public class Country
{
    private String name;
    private int pop;// population
    private int area;

    int density;

    //constructors
    public Country()//default constructor
    {

    }

    public Country(String n, int p, int a) {//constructor expecting variables
        name= n;
        pop= p;
        area= a;

    }

    // getter methods
    //methods can be used to get a certain value within a country
    public String getName() {
        return name;
    }

    public int getPop() {
        return pop;
    }

    public int getArea() {
        return area;
    }

    public int getDensity() {
        density= pop/area;
        return density;
    }

    // setter methods
    //methods can be used to set a certain value within a country
    public void setName(String n) {
        name = n;
    }

    public void setPop(int p) {
        pop = p;
    }

    public void setArea(int a) {
        area = a;
    }

    public void printCountry() {//used to display a Country's info
        //System.out.println("--------------------");
        System.out.println("Name: " +name+"  Population: "+ pop+ "   Area: "+area);

        System.out.println("--------------------");
    }
}
