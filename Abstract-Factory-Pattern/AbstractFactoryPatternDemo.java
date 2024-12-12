public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // get Shape Factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory1.getShape("RECTANGLE");
        shape1.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory2.getShape("RECTANGLE");
        shape2.draw();
    }
}