package src.OOP_Use.project_pokerGame;

import java.util.ArrayList;

public class play {
    public static ArrayList<String> tableCards = new ArrayList<>();

    static {
        String[] cardNum = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♥", "♠", "♣", "♦"};
        for (String s : cardNum) {
            for (String string : color) {
                tableCards.add(string + s);
            }
        }
        tableCards.add("JOKER");
        tableCards.add("joker");
    }

    public static void main(String[] args) {
        ArrayList<String> handCard1 = new ArrayList<>();
        ArrayList<String> handCard2 = new ArrayList<>();
        ArrayList<String> handCard3 = new ArrayList<>();
        Player p1 = new Player(handCard1, "Klee");
        Player p2 = new Player(handCard2, "Lucky");
        Player p3 = new Player(handCard3, "Sushi");
        Player[] playersList = {p1, p2, p3};

        System.out.println("************************************");
        sendCards(tableCards, playersList);
        System.out.println(p1.getHandCards());
        System.out.println(p2.getHandCards());
        System.out.println(p3.getHandCards());


    }

    public static void sendCards(ArrayList<String> tableCards, Player[] playersList) {
        int order = 0;
        for (int i = 0; i < tableCards.size(); i++) {
            int index = (int) (Math.random() * tableCards.size());
            playersList[order].pickCard(tableCards.get(index));
            tableCards.remove(tableCards.get(index));
            i--;
            order++;
            if (order == 3) {
                order = 0;
            }
        }
    }
}
