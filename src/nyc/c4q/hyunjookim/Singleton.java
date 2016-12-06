package nyc.c4q.hyunjookim;

/**
 * Created by Hyun on 12/5/16.
 */
public class Singleton {

    private static Singleton sInstance;

    public static Singleton getInstance(){
        if(sInstance == null){
            sInstance = new Singleton();
        }
        return sInstance;
    }
    private Singleton(){

    }

}
