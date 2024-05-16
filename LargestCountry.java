import java.util.*;
import java.io.*;

public class LargestCountry{

    public static void main() throws FileNotFoundException {

        File f = new File("countrydata.txt");
        Scanner a=new Scanner(f);

        ArrayList<Country> list=readCountry("countrydata.txt");//list set to the arraylist returned from readCountry()

        Country p=countryWithLargestPop(list);//p is set to the Country returned by countryWithLargestPop(list)
        System.out.println("Country with largest population: ");
        p.printCountry();//printCountry() method used for Country p

        Country m=countryWithLargestArea(list);//m is set to the Country returned by countryWithLargestArea(list)
        System.out.println("Country with largest area: ");
        m.printCountry();//printCountry() method used for Country m

        Country d=countryWithLargestDensity(list);//d is set to the Country returned by countryWithLargestDensity(list)
        System.out.println("Country with largest Density: ");
        d.printCountry();//printCountry() method used for Country d

    }

    public static ArrayList<Country> readCountry(String fileName)
    throws FileNotFoundException
    {
        File f = new File("countrydata.txt");
        Scanner in = new Scanner(f);

        in.nextLine();// This line is is necessary because the first line of the file contains 3 strings-
        //-so I don't want to read that line into a Country

        //System.out.println("first line"+in.nextLine());//For testing only
        // System.out.println("first string: "+in.next());//For testing only
        // System.out.println("first int: "+in.nextInt());//For testing only
        // System.out.println("second int: "+in.nextInt());//For testing only

        ArrayList<Country> list = new ArrayList<Country>();

        while (in.hasNextLine()){
            Country a =new Country(in.next(),in.nextInt(),in.nextInt());
            //System.out.println("getName: "+a.getName());//THESE 3 LINE WORK //For testing
            //System.out.println("getPop: "+a.getPop());//For testing only
            //System.out.println("getArea: "+a.getArea());//For testing only

            list.add(a);

        }

        //System.out.println("list: "+list);//For testing only //Doesn't do what I expected but my code works regardless
        return list;
    }

    /** @return the country with the largest Population
     */
    public static Country countryWithLargestPop(
    ArrayList<Country> countries)
    {
        int bigPop=0;//variable will be used to determine whether the next country's pop is bigger than bigPop's current value
        Country a= new Country();
        int c=0;//variable used so that method returns the correct country from the array list
        for (int i=0;i<countries.size();i++){//loop executes for each element in the arraylist
            a=countries.get(i);
            if (a.getPop()> bigPop){//if current country's pop greater than bigPop
                bigPop=a.getPop();//bigPop set to the current country's pop
                c=i;//c is set to the current arraylist position
            }

        }
        a=countries.get(c);//a is set to the country at countries ArrayList position c

        //System.out.println("cwith largest:" + a.getName()+" Population: "+a.getPop()+ " Area:"+a.getArea());//For testing only

        return a;
    }

    //Comments on this method are nearly identical to the comments on countryWithLargestPop()
    /** @return the country with the largest area
     */
    public static Country countryWithLargestArea(
    ArrayList<Country> countries)
    {
        int bigAR=0;//variable will be used to determine whether the next country's pop is bigger than bigAR's current value
        Country a= new Country();
        int c=0;//variable used so that method returns the correct country from the array list
        for (int i=0;i<countries.size();i++){//loop executes for each element in the arraylist
            a=countries.get(i);
            if (a.getArea()> bigAR){//if current country's area greater than bigAR
                bigAR=a.getArea();//bigDen set to the current country's pop
                c=i;//c is set to the current arraylist position
            }

        }
        a=countries.get(c);//a is set to the country at countries ArrayList position c

        //System.out.println("country with largest area:" + a.getName()+" Population: "+a.getPop()+ " Area:"+a.getArea());//For testing only
        return a;
    }

    //Comments on this method are nearly identical to the comments on countryWithLargestPop()
    /** @return the country with the largest Density
     */
    public static Country countryWithLargestDensity(
    ArrayList<Country> countries)
    {
        int bigDen=0;//variable will be used to determine whether the next country's pop is bigger than bigDen's current value
        Country a= new Country();
        int c=0;//variable used so that method returns the correct country from the array list
        for (int i=0;i<countries.size();i++){//loop executes for each element in the arraylist
            a=countries.get(i);
            if (a.getDensity()> bigDen){//if current country's density greater than bigDen
                bigDen=a.getDensity();//bigDen set to the current country's pop
                c=i;//c is set to the current arraylist position
            }

        }
        a=countries.get(c);//a is set to the country at countries ArrayList position c

        //System.out.println("country with largest area:" + a.getName()+" Population: "+a.getPop()+ " Area:"+a.getArea());//For testing only
        return a;
    }
}

