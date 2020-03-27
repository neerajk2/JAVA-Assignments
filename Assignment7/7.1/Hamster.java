public class Hamster extends Rodent{
    @Override
    public void eats(String s) {
        this.setFoodSource(s);
    }

    @Override
    public String getType() {
        return "Hamster";
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
