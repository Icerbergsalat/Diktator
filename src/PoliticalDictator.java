public class PoliticalDictator extends Leader implements PowerActions{
    String partyName;

    public PoliticalDictator(String partyName, String name, String country, int yearsInPower) {
        this.partyName = partyName;
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    public String giveSpeech(){
        return "Gives a political speech";
    }

    public void implementPolicy(String policy){
        System.out.println(policy);

    }
    public void repressOpposition(){
        System.out.println("Represses opposition with political power");

    }
    public void holdParade(){
        System.out.println("Holding a political parade");

    }
    public void printDetails() {
        super.printDetails();
        System.out.println(partyName);
    }
}
