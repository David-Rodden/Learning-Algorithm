import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by David on 3/22/2017.
 */
public class GameScreen implements Screen {

    private OrthographicCamera camera;
    private Viewport port;
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public GameScreen() {
        camera = new OrthographicCamera();
        port = new FitViewport(0, 0);   //will need to fit correct game dimensions
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("");   //will need tmx file once configured
        renderer = new OrthogonalTiledMapRenderer(map);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
