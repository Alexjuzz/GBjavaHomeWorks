package InMemoryModel;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

//Задание 1. На основе Диаграмы классов ModelElements,
// разработать классы: Model Store, PoligonalModel (Texture, Poligon), Flash, Camera, Scene

public class ModelStore implements IModelChanger{

        public List<PoligonalModel> models;
        public List<Scene> scenes;
        public List<Flash> flashes;
        public List<Camera> cameras;
        private List<IModelChangedObserver> changeObservers;

    public ModelStore(List<IModelChangedObserver> changeObservers) {
        this.changeObservers = changeObservers;
        models = new ArrayList<>();
        scenes  = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        scenes.add(new Scene(flashes,models,cameras));
        cameras.add(new Camera());





    }



    public void NotifyChange(IModelChanger iModelChanger){};
    public Scene GetScena(int number){
        return scenes.get(number);
    }
}
