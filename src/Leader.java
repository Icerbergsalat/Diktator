public abstract class Leader {
    String name;
    String country;
    int yearsInPower;

    public abstract String giveSpeech();

    public void printDetails(String name, String country, int yearsInPower){
        System.out.println(name + "\n" + country + "\n" + yearsInPower);
    }
}