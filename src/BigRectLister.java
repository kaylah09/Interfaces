import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;


public class BigRectLister {

    public static void main(String[] args) {

 List <Rectangle> rects = new ArrayList<>();
 rects.add(new Rectangle(4,2));
 rects.add(new Rectangle(1,1));
 rects.add(new Rectangle(2,3));
 rects.add(new Rectangle(2,2));
 rects.add(new Rectangle(3,6));
 rects.add(new Rectangle(5,2));
 rects.add(new Rectangle(1,4));
 rects.add(new Rectangle(7,3));
 rects.add(new Rectangle(4,9));
 rects.add (new Rectangle(2,1));




Filter filter= new BigRectangleFilter();

        System.out.println("Rectangles with a perimeter greater than 10 is: ");
        int count = 0;

        for (Rectangle r : rects)
        { int perimeter = 2 * (r.width + r.height);
            if (filter.accept(r))
            {
                count++;
            }

        }

        System.out.println( count + "/" + rects.size());

}
}
