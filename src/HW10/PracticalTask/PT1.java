package HW10.PracticalTask;

public class PT1 {
    /*
    Enter the two variables of type String.
    Determine whether the first variable substring second.
    For example, if you typed «IT» and «IT Academy» you must receive true.
    */
    public static void main(String[] args) {
        String str1 = "caem";
        String str2 = "IT Academy";
        System.out.println("String '" + str2 + "'" + (str2.indexOf(str1)>=0?"":" doesn't ")+ " contains the substring '" + str1+"'");
    }
}
