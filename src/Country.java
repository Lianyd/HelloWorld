//作为继承类
public class Country {
    String name;
    String capitalcity;
    int area;
    int population;

    public void showinfo(){
        System.out.println("The country: " + name);
        System.out.println("The capital city of this country is: " + capitalcity);
        System.out.println("The area is: " + area);
        System.out.println("The population is: " + population);
    }
}
