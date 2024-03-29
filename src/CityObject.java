public class CityObject {
    public float size;
    public String name;
    public String location;

    public CityObject(float size, String name, String location) {
        this.size = size;
        this.name = name;
        this.location = location;
    }

    public CityObject(float size, String name) {
        this.size = size;
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public CityObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CityObject{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public String toStringWithoutLoc() {
        return "CityObject{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }
} class PublicObject extends CityObject{
    protected String material;
    private String design;

    public PublicObject(float size, String name, String location,String design, String material) {
        super(size, name, location);
        this.material = material;
        this.design = design;
    }

    public PublicObject(float size, String name, String location) {
        super(size, name, location);
    }

    public PublicObject(float size, String name) {
        super(size, name);
    }

    public PublicObject(float size, String name, String material, String design) {
        super(size, name);
        this.material = material;
        this.design = design;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getMaterial() {
        return material;
    }

    public String getDesign() {
        return design;
    }

    @Override
    public String toStringWithoutLoc() {
        return super.toStringWithoutLoc();
    }
}
