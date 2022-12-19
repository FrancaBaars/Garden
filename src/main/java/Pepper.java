public class Pepper extends Vegetable {
    public static final int sizeDone = 5;

    public Pepper() {
        super(Colour.Red, 0.000001, 0.0015);
    }

    @Override
    public void grow(int Lux, int rain, int days) {
        if (this.status == Status.Growing) {
            if (days >= 6 && rain > 48) {
                this.status = Status.Dead;
            } else {
                if (Lux >= 7398) {
                    this.size += growFactorSun * Lux + growFactorWater * rain;
                }
            }
        }
        this.checkGrowth(sizeDone);
    }
}
