package nyc.c4q.hyunjookim;

/**
 * Created by Hyun on 12/5/16.
 */
public class ObserverMain {

    //    public static void main(String[] args) {
//
//        Observable<String> stringPublisher = new Observable<>();
//        stringPublisher.addObserver(new Observer<String>() {
//            @Override
//            public void accept(String data) {
//                System.out.println("Publisher1 Saw" + data);
//            }
//        });
//        stringPublisher.addObserver(new Observer<String>() {
//            @Override
//            public void accept(String data) {
//                System.out.println("Publisher1 Saw" + data);
//            }
//        });
//        stringPublisher.publish("hello");
//    }


    public static void main(String[] args) {

        Observable<String> stringPublisher = new Observable<>();
        Observer<String> mObser1;
        mObser1 = new Observer<String>() {
            @Override
            public void accept(String data) {
                System.out.println("Publisher1 Saw" + data);
            }
        };
        stringPublisher.addObserver(mObser1);
        stringPublisher.addObserver(data -> System.out.println("Publisher1 Saw" + data));
        stringPublisher.publish("hello");
        stringPublisher.removeObserver(mObser1);
        stringPublisher.publish("goodbye");
    }
}
