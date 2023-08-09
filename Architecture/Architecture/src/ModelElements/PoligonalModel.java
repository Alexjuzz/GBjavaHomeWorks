package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligone> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligons = new ArrayList<>();
    }


}
