public class Circle35 {

    public Color color;

    public static void main(String[] args) {
        Circle35 circle = new Circle35();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle35() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
