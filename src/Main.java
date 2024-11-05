

public class Main {

    public static void main(String[] args) {
        MilitaryDictator KimJongUn = new MilitaryDictator("Supreme leader","Kim Jong Un", "North Korea", 13);

        PoliticalDictator DonaldTrump = new PoliticalDictator("Republican", "Donald Trump", "USA", 4);

        Leader[] Leaders = {KimJongUn, DonaldTrump};

        for (Leader leader : Leaders){
            leader.printDetails();
            System.out.println(leader.giveSpeech());

            if (leader instanceof PowerActions) {
                PowerActions actions = (PowerActions) leader;
                actions.implementPolicy("New policy");
                actions.repressOpposition();
                actions.holdParade();
            }
            System.out.println();
        }

    }

}