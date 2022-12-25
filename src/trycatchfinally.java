// when an try block statement occured exception & catch block occured exception then finally block alwyas executed,
public class trycatchfinally {

    public static void main(String[] args) {

        System.out.println("hii");

        String s="abcd";

        try{

            System.out.println("hi1");

            System.out.println("hi2");

            System.out.println(s.charAt(100));// excection ocuuerd in this line so remaining try block cannot be run and goes tho catch block

            System.out.println("hi3");

        }
        catch (Exception n)
        {
            System.out.println("Something is Wrong");
        }


        finally {
            System.out.println("tiger abhi zinda hai");
        }

        System.out.println("hello Nikhil");
    }
}
