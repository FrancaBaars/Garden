public abstract class Vegetable {
    protected Colour colour;
    protected double size; // in cm
    protected double growFactorSun; // in cm/lux
    protected double growFactorWater; //in cm/mm
    protected Status status;

    public Vegetable(Colour colour, double growFactorSun, double growFactorWater) {
        this.colour = colour;
        this.size = 0;
        this.growFactorSun = growFactorSun;
        this.growFactorWater = growFactorWater;
        this.status = Status.Growing;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        }
    }

    public double getGrowFactorSun() {
        return growFactorSun;
    }

    public void setGrowFactorSun(double growFactorSun) {
        if (growFactorSun > 0) {
            this.growFactorSun = growFactorSun;
        }

    }

    public double getGrowFactorWater() {
        return growFactorWater;
    }

    public void setGrowFactorWater(double growFactorWater) {
        if (growFactorWater > 0) {
            this.growFactorWater = growFactorWater;
        }

    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void grow(int Lux, int rain, int days) {
    }

    public void checkGrowth(int maxSize) {
        if (this.size >= maxSize) {
            this.status = Status.Ready;
        }
    }
}
