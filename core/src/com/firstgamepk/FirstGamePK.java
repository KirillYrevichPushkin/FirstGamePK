package com.firstgamepk;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.firstgamepk.screen.MenuScreen;

public class FirstGamePK extends Game {
	public void create() {
		//setScreen( new MenuScreen());
		setScreen( new MenuScreen(this));
	}
}
