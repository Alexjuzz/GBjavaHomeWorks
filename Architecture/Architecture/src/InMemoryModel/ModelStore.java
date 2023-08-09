package InMemoryModel;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

//Задание 1. На основе Диаграмы классов ModelElements,
// разработать классы: Model Store, PoligonalModel (Texture, Poligon), Flash, Camera, Scene

public class ModelStore {

        public List<PoligonalModel> models;
        public List<Scene> scenes;
        public List<Flash> flashes;
        public List<Camera> cameras;

    public ModelStore(List<IModelChangedObserver> changeObservers) {
        this.changeObservers = changeObservers;
        models = new ArrayList<>();
        scenes  = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();

    }

    private List<IModelChangedObserver> changeObservers;

    public void NotifyChange(IModelChanger iModelChanger){};
    public Scene GetScena(int number){
        return null;
    }
}
