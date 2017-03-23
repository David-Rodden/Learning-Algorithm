package com.mygdx.learning;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by David on 3/22/2017.
 */
public class GameScreen implements Screen {
    private Platformer platformer;
    private Texture testTexture;
    private OrthographicCamera camera;
    private Viewport port;
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public GameScreen(final Platformer platformer) {
        this.platformer = platformer;
        testTexture = new Texture("Test_Image.png");
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        port = new FitViewport(0, 0);   //will need to fit correct game dimensions
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("generic_map.tmx");   //will need tmx file once configured
        renderer = new OrthogonalTiledMapRenderer(map);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        renderer.setView(camera);
        renderer.render();
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
