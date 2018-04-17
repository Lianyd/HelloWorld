//这个类中运用了继承、接口
public class test extends Country implements Pet,Children {
    int name;
    public void showinfo() {
        System.out.println(name);
    }

    public void showtest() {
        super.name = "China";
        super.capitalcity = "Beijing";
        super.area = 1000;
        super.population = 5000;
        super.showinfo();
        this.name = 555;
        this.showinfo();
    }

    @Override
    public void showpet() {
        System.out.println("My pet is a pretty dog.");
    }

    @Override
    public void showchildren() {
        System.out.println("My children is a little boy.");
    }
}


