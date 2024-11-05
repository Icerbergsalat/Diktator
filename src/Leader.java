public abstract class Leader {
    String name;
    String country;
    int yearsInPower;

    public abstract String giveSpeech();

    public void printDetails(){
        System.out.println(name + "\n" + country + "\n" + yearsInPower);
    }
}