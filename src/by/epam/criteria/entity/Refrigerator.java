package by.epam.criteria.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private double height;
    private double width;
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Refrigerator{");
        sb.append("height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", powerConsumption=").append(powerConsumption);
        sb.append(", weight=").append(weight);
        sb.append(", freezerCapacity=").append(freezerCapacity);
        sb.append(", overallCapacity=").append(overallCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0 &&
                powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                freezerCapacity == that.freezerCapacity &&
                Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, powerConsumption, weight, freezerCapacity, overallCapacity);
    }
}
