public class Mountains extends Location{
    String[] placeDescription = new String[] {"эти"};
    int length = placeDescription.length;

    Mountains(String name) {
        super(name);
    }

    protected void describe(){
        for(int i = 0; i < length; i++) {
            System.out.print(placeDescription[i]);
        }
    }
}
