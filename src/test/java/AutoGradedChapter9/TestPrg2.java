package AutoGradedChapter9;

public class TestPrg2 {
    public static void main(String[] args) {
        RegularPolygon[] polygons = {
                new RegularPolygon(),
                new RegularPolygon(6, 4),
                new RegularPolygon(10, 4, 5.6, 7.8)
        };

        System.out.printf("%.1f\n", polygons[0].getPerimeter());
        System.out.printf("%.3f\n", polygons[0].getArea());
        System.out.printf("%.1f\n", polygons[1].getPerimeter());
        System.out.printf("%.1f\n", Math.floor(polygons[1].getArea() * 10) / 10);
        System.out.printf("%.1f\n", polygons[2].getPerimeter());
        System.out.printf("%.1f\n", Math.floor(polygons[2].getArea() * 10) / 10);
    }
}

