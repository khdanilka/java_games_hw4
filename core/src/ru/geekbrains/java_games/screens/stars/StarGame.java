package ru.geekbrains.java_games.screens.stars;


import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import static com.badlogic.gdx.Input.Keys.M;

public class StarGame extends Star {

    public StarGame(TextureRegion region, float vx, float vy, float height) {
        super(region, vx, vy, height);
    }

    public void update(float deltaTime, Vector2 vM) {
        if (vM.x < 0 ) v.setAngle(-45);
        else if (vM.x > 0 ) v.setAngle(-135);
        else v.setAngle(-90f);
        super.update(deltaTime);
    }
}
