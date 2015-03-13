/**
 * Created by c4q-vanice on 3/12/15.
*/

public class Method {
/**
    //Example 1
    public static void speak(){
        System.out.println("hello");
    }
    public static void shoutOut(String name){
        //System.out.println("Hey, " + name);
        speak();
    }
    public static void main (String[] args){
        shoutOut("Von Neumann");
        shoutOut("Grace Hopper");
    }
}
    //Example 2
    public static int add(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String [] args){
        int num =add(1,2);
        System.out.println(num);
    }
}

*/  //Example 3
    public static int subt(int a, int b) {
        int result = a - b;
        return result;
    }
    public static void main(String[] args){
        System.out.println(subt(10,5));
    }
}