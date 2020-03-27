public class Gerbil extends Rodent {

    public Gerbil (String s){
        this.eats(s);
    }

    @Override
    public void eats(String s) {
        this.setFoodSource(s);
    }

    @Override
    public String getType() {
        return "Gerbil";
    }

    @Override
    public boolean gnaws() {
        return true;
    }

    @Override
    public boolean isAPet() {
        return true;
    }
}
