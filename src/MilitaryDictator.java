public class MilitaryDictator extends Leader implements PowerActions{
    String militaryRank;

    public MilitaryDictator(String militaryRank, String name, String country, int yearsInPower) {
        this.militaryRank = militaryRank;
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    public String giveSpeech(){
        return "Gives a military speech";
    }

    public void implementPolicy(String policy){
        System.out.println(policy);

    }
    public void repressOpposition(){
        System.out.println("Repressing opposition with military power");

    }
    public void holdParade(){
        System.out.println("Holding a military parade");

    }
    public void printDetails(){
        super.printDetails();
        System.out.println(militaryRank);
    }

}
