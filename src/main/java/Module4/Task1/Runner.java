package Module4.Task1;


/**
 * Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга
 */
public class Runner {
  public static void main(String[] args) {
      Triangle triangle = new Triangle();
      triangle.setSide(3);
      triangle.setHeight(2.5);
      System.out.println("Side is:"+triangle.getSide());
      System.out.println("Height is:"+triangle.getHeight());
      System.out.println("Triangle square is:"+triangle.getSquare());

      Rectangle rectangle = new Rectangle();
      rectangle.setSideA(3.75);
      rectangle.setSideB(1.2);
      System.out.println("SideA is:"+rectangle.getSideA());
      System.out.println("SideB is:"+rectangle.getSideB());
      System.out.println("Rectangle square is:"+rectangle.getSquare());

      Circle circle = new Circle();
      circle.setRadius(5);
      System.out.println("Radius is:"+circle.getRadius());
      System.out.println("Circle square is:"+circle.getSquare());
  }

}
