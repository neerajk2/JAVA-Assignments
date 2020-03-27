public class RodentMain {
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[5];

        rodents[0] = new Mouse("Cheese, seeds and grains", "ratatouille");
        rodents[1] = new Gerbil("grasses, bulbs and a range of leaves and herbs");
        rodents[2] = new Hamster();
        rodents[3] = new Gerbil("seeds, grain and grasses as well as some insects");
        rodents[4] = new Mouse("Jerry");

        for(Rodent r : rodents){
            System.out.println(r);
        }
    }
}
