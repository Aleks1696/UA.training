package self_education.patterns.builder;

public class SmartPhone {
    private String brand;
    private Double size;
    private Integer ram;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartPhone{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", size=").append(size);
        sb.append(", ram=").append(ram);
        sb.append('}');
        return sb.toString();
    }
}
