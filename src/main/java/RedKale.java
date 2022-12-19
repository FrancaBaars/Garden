public class RedKale extends Vegetable {
    public static final int sizeDone = 29;

    public RedKale() {
        super(Colour.Pink, 0.001800, 0.0260);
    }

    @Override
    public void grow(int Lux, int rain, int days) {
        if (this.status == Status.Growing) {
            if (days == 6 && rain < 23) {
                this.status = Status.Dead;
            } else {
                this.size += growFactorSun * Lux + growFactorWater * rain;
            }
        }
        this.checkGrowth(sizeDone);
    }
}
