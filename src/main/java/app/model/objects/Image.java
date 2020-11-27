package app.model.objects;

import app.model.attributes.Width;
import app.interfaces.DrawingAdapterI;
import app.model.attributes.Height;
import app.model.attributes.Source;

public class Image extends Objects {

    public static final String DEFAULT_SOURCE = "src/main/resources/alfa.png";
    public static final String DEFAULT_WIDTH = "100";
    public static final String DEFAULT_HEIGHT = "100";

    public Image(String x, String y, String source, String width, String height) {
        super(x, y, ObjectType.IMAGE.getType());
        addAttribute(new Source(source));
        addAttribute(new Width(width));
        addAttribute(new Height(height));
    }

    public Image(String x, String y) {
        this(x, y, DEFAULT_SOURCE, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    @Override
    public boolean locatedAt(double x, double y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void draw(DrawingAdapterI drawingAdapter) {
        // TODO Auto-generated method stub

    }
}

