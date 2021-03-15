package kg.megacom;

public class Animals implements Comparable<Animals>{
    private String name;
    private int lifeLength;

    public Animals(String name, int lifeLength) {
        this.name = name;
        this.lifeLength = lifeLength;
    }

    @Override
    public int compareTo(Animals other) {
        return this.lifeLength - other.lifeLength;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", lifeLength=" + lifeLength +
                '}';
    }
}
