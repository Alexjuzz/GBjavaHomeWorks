package ModelElements;

import Source.Angle3D;
import Source.Color;
import Source.Point3D;

public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    float power;

    public void Rotate(Angle3D angle){

    }
    public void Move(Point3D point){

    }
}
