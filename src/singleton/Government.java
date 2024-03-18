package singleton;

public class Government {
    private static Government instance;

    private Government(){}

    public static Government getInstance(){
        if(instance == null){
            synchronized (Government.class){
                if(instance == null){
                    return new Government();
                }
            }
        }
        return instance;
    }

    public void getText(){
        System.out.println("text from Government");
    }
}
