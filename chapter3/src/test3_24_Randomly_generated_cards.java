public class test3_24_Randomly_generated_cards {
    public static void main(String[] args){
        int x = (int)(12 * Math.random());
        int y = (int)(3 * Math.random());
        String x1 = "";
        String y1 = "";
        switch (x){
            case 0: x1 = "Ace";break;
            case 10: x1 = "Jack";break;
            case 11: x1 = "Queen";break;
            case 12: x1 = "King";break;
            default: x1 = x + 1 + "";
        }
        switch (y){
            case 0: y1 = "Clubs";break;
            case 1: y1 = "Diamonds";break;
            case 2: y1 = "Hearts";break;
            case 3: y1 = "Spades";break;
        }
        System.out.println("The card you picked is " + x1 + " of " + y1);
    }
}
