package app.interfaces;

/**
 * adapter interface for drawing objects on presentation mode
 */

public interface DrawingAdapterI {
    void setStrokeColor(String color);

    void setFillColor(String color);

    void setFont(String font);

    void setLineWidth(double width);

    void getTransform();

    void transform();

    void drawCamera(double x, double y, double width, double height);
    
    void drawRectangle(double x, double y, double width, double height);

    void drawCircle(double x, double y, double radius);

    void drawLine(double start_x, double start_y, double end_x, double end_y);

    void drawText(double x, double y, double text);

    void drawTextArea();

    void drawImage();
}