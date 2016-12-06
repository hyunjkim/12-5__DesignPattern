package nyc.c4q.hyunjookim;

/**
 * Created by Hyun on 12/5/16.
 */
public interface Observer<T> {
    void accept(T data);
}
