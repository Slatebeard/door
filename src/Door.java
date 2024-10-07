public class Door {

    private boolean isOpen;
    private boolean isClosed;
    private boolean isLocked;
    public static String[] doorColors = {"Oak", "Black", "Silver", "Transparent"};
    private Material doorMaterial;
    private String color;
    private double depth;
    private double height;
    private double width;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Door(boolean isOpen, boolean isClosed, boolean isLocked, Material doorMaterial, String color, double depth, double height, double width) {
        this.isOpen = isOpen;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
        this.doorMaterial = doorMaterial;
        this.color = color;
        this.depth = depth;
        this.height = getWeight();
        this.width = width;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }


    public String[] getColor() {
        return doorColors;
    }

    public void setColor(String[] color) {
        this.doorColors = color;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight(){
        return height*width*depth*doorMaterial.getDensity();
    }

    public void printALl(){
        System.out.println("Material: " + this.doorMaterial.getName());
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Depth: " + this.depth);
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Colour: " + this.color);
    }


}
