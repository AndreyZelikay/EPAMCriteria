package by.epam.criteria.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VacuumCleaner{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", filterType='").append(filterType).append('\'');
        sb.append(", bagType='").append(bagType).append('\'');
        sb.append(", wandType='").append(wandType).append('\'');
        sb.append(", motorSpeedRegulation=").append(motorSpeedRegulation);
        sb.append(", cleaningWidth=").append(cleaningWidth);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                motorSpeedRegulation == that.motorSpeedRegulation &&
                cleaningWidth == that.cleaningWidth &&
                filterType.equals(that.filterType) &&
                bagType.equals(that.bagType) &&
                wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
