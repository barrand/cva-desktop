package com.bbj.cva;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "cva";
		cfg.useGL20 = false;
		cfg.width = 1280; 
		cfg.height = 720; 
		
		new LwjglApplication(new CheerVArachnids(), cfg);
	}
}
