package by.epam.criteria.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String OS;
    private int memoryRom;
    private int systemMemory;
    private double CPU;
    private int displayInches;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", OS='").append(OS).append('\'');
        sb.append(", memoryRom=").append(memoryRom);
        sb.append(", systemMemory=").append(systemMemory);
        sb.append(", CPU=").append(CPU);
        sb.append(", displayInches=").append(displayInches);
        sb.append('}');

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memoryRom == laptop.memoryRom &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                displayInches == laptop.displayInches &&
                OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInches);
    }
}
