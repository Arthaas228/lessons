package lesson8.zad2;



public class Main {

    public static void main(String[] args) {
        Demo demo = new Demo();
        var theHighestParent = demo.createHighestParent("Doris" , "Lewicki", 322, null);
        var theLowestParent = demo.createLowestParent("Boris", "Johnson", 453, null,
                3253487, "bjohn@gmail.com", "college234", 5, 32532);
        System.out.println(theHighestParent);
        System.out.println(theLowestParent);
    }

}
