public class Hello {
    public static void main(String[] args) {
        String name = "Joe";
        int score = 100;
        int ranked = getRanking(score);
        System.out.println( name + " , you are Ranked " + ranked + " in the leader board." );
        name = "Wilhelm";
        score = 950;
        ranked = getRanking(score);
        System.out.println( name + " , you are Ranked " + ranked + " in the leader board." );
        name = "Rebecca";
        score = 1050;
        ranked = getRanking(score);
        System.out.println( name + " , you are Ranked " + ranked + " in the leader board." );
        name = "Ina";
        score = 20;
        ranked = getRanking(score);
        System.out.println( name + " , you are Ranked " + ranked + " in the leader board." );
    }

    public static int getRanking(int score){
        if(score >= 1000){
            return 1;
        } else if(score >= 500){
            return 2;
        } else {
           return 3;
        }

    }
}


