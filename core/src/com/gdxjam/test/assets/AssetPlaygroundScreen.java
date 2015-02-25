package com.gdxjam.test.assets;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.math.Vector2;
import com.gdxjam.Assets;
import com.gdxjam.EntityManager;
import com.gdxjam.GameManager;
import com.gdxjam.screens.AbstractScreen;
import com.gdxjam.systems.NormalMapRendererSystem;
import com.gdxjam.utils.EntityFactory;

public class AssetPlaygroundScreen extends AbstractScreen {

	private EntityManager engine;
	Entity entity;

	@Override
	public void show() {
		super.show();
		engine = GameManager.initEngine();

		entity = EntityFactory.createMothership(new Vector2(32, 18));
		engine.addSystem(new NormalMapRendererSystem(entity,
				Assets.mothership.ship, Assets.mothership.normal));
		createWorld();
		// Gdx.input.setInputProcessor(new DefaultInputProcessor());
	}

	public void createWorld() {
		// EntityFactory.createMothership(new Vector2(32, 18));
	}

	@Override
	public void render(float delta) {
		super.render(delta);

		engine.update(delta);
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		engine.getSystem(NormalMapRendererSystem.class).resize(width, height);
	}
}
