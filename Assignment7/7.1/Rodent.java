public abstract class Rodent {

    private String foodSource;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodSource() {
        return foodSource;
    }

    public void setFoodSource(String foodSource) {
        this.foodSource = foodSource;
    }

    //Constructors
    public Rodent () {
        this.name = "stray rodent";
        this.foodSource = "anything";
    }
    public Rodent (String name) {
        this.name = name;
        this.foodSource = "Cakes";
    }
    public Rodent(String s, String name) {
        this.foodSource = s;
        this.name = name;
    }

    public boolean isRodent(){
        return true;
    }
    public abstract void eats(String s);
    public abstract String getType();
    public abstract boolean gnaws();
    public abstract boolean isAPet();

    @Override
    public String toString() {
        String s = "Name: "+name+"\nFoodSource: "+foodSource;
        return s;
    }
}
