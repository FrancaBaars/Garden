public class Carrot extends Vegetable {

    public static final int sizeDone = 29;

    public Carrot() {
        //zo is het goed als je het gaat setten dan in de super zo invullen
        super(Colour.Pink, 0.000010, 0.0096);
    }

    @Override
    public void grow(int Lux, int rain, int days) {
        //hier misschien een aparte mehtode maken om de checks te doen.
        if(this.status == Status.Growing) {
            if (days <= 10 && rain > 34) {
                this.status = Status.Dead;
            } else {
                this.size += growFactorSun * Lux + growFactorWater * rain;
            }
        }
        this.checkGrowth(sizeDone);
    }
}
