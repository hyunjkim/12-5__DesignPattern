package nyc.c4q.hyunjookim;

/**
 * Created by Hyun on 12/5/16.
 */
public class ClassToBeBuilt {

    private final String mA;
    private final String mB;
    private final int mC;
    private final int mD;
    private final double mE;
    private final Class mF;

    public ClassToBeBuilt(
            String a,
            String b,
            int c,
            int d,
            double e,
            Class<?> f) {
        mA = a;
        mB = b;
        mC = c;
        mD = d;
        mE = e;
        mF = f;
    }

    public static class Builder {

        public Builder() {
        }

        public Builder setmA(String mA) {
            this.mA = mA;
            return this;
        }

        public Builder setmB(String mB) {
            this.mB = mB;
            return this;
        }

        public Builder setmC(int mC) {
            this.mC = mC;
            return this;
        }

        public Builder setmD(int mD) {
            this.mD = mD;
            return this;
        }

        public Builder setmE(double mE) {
            this.mE = mE;
            return this;
        }

        public Builder setmF(Class mF) {
            this.mF = mF;
            return this;
        }

        public ClassToBeBuilt build() {
            return new ClassToBeBuilt(mA, mB, mC, mD, mE, mF);
        }

        private String mA = "a";
        private String mB = "b";
        private int mC = 1;
        private int mD = 2;
        private double mE = 5.0;

        private Class<?> mF = int.class;
    }
}
