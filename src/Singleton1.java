/**
 * Created by muller on 2019-05-31.
 */
public class Singleton1 {

    private Singleton1() {
        if( getInstance() != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }

    public static Singleton1 getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private final static Singleton1 instance = new Singleton1();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return getInstance();
    }
}
