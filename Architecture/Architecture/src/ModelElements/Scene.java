package ModelElements;

import Source.Type;

import java.util.List;

public class Scene {
    public int id = 1 ;
    List<Flash> flashes;
    List<PoligonalModel> models;
    List<Camera> cameras;



    public Scene(List<Flash> flashes, List<PoligonalModel> models,List<Camera> cameras) {
        this.flashes = flashes;
        this.models = models;
        this.cameras = cameras;
        id++;
    }

    public Type method1(Type t, Type t2){
        Type t3 =null;
        return t3;
    }
    public Type method1(Type t){
        return t;
    }
}
