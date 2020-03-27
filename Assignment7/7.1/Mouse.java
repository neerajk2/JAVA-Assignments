public class Mouse extends Rodent {

    public Mouse (String name){
        super(name);
    }
    public Mouse(String s, String name) {
        super(s, name);
    }

    @Override
    public void eats(String s) {
        this.setFoodSource(s);
    }

    @Override
    public String getType() {
        return "Mouse";
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
