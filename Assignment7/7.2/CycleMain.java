public class CycleMain {
    public static void main(String[] args) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();

        //upcasting of subclasses to the superclasses
        Cycle[] cyc = new Cycle[3];
        cyc[0] =(Cycle) uni;
        cyc[1] =(Cycle) bi;
        cyc[2] =(Cycle) tri;

        //As method balance() is not available in cycle,
        // the following access of balance() in Unicycle,Bicycle
        // and Tricycle gives error.
        cyc[0].balance();
        cyc[1].balance();
        cyc[2].balance();

        //downcasting of subclasses to the superclasses
        Cycle downCyc1 = new Unicycle();
        Cycle downCyc2 = new Bicycle();
        Cycle downCyc3 = new Tricycle();

        Unicycle downUnic = (Unicycle) downCyc1;
        Bicycle downBic = (Bicycle) downCyc2;
        Tricycle downTric = (Tricycle) downCyc3;

        downUnic.balance();
        downBic.balance();
        downTric.balance(); //Tricycle don't contain balance so it gives error
    }
}
