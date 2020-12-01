public class J3_2 {
    public static void main(String[] args) {
        int adding = 21000;
        int customerAccount = 1000;
        int bonus;
        if (adding >= 1100) {
            bonus = adding / 100;
        } else {
            bonus = 0;
        }
        int conclusion = adding + bonus + customerAccount ;
        System.out.println(conclusion);
    }
}
