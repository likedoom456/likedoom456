/**
 * Created by Administrator on 2016/6/24.
 */
public class One extends Human {
    String address;
    public One() {

    }

    public One(double height, int age, String gender, boolean isMarried, String name, double weight,String address) {
        super(height, age, gender, isMarried, name, weight);
        this.address=address;
    }


    public void method1() {
        System.out.println(100);
    }
}

class test3 {
    public static void main(String[] args) {
        One he=new One(175,26,"man",false,"hexiaoyu",75,"beijing");
        he.address="suzhou";
        System.out.println(he.address + he.isMarried + he.name);
        he.method0();
        he.method1();

    }

}
