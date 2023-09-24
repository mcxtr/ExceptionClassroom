public class Car implements AutoCloseable{

    public void meth(){
        System.out.println("машина журуп жатат");
    }


    @Override
    public void close() {
        System.out.println("машина очту");
    }
}
