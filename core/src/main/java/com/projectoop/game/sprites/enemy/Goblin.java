package com.projectoop.game.sprites.enemy;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.projectoop.game.GameWorld;
import com.projectoop.game.screens.PlayScreen;

public class Goblin extends GroundEnemy{
    @Override
    public void draw(Batch batch) {
        super.draw(batch);
    }

    @Override
    public void dispose() {

    }

    public Goblin(PlayScreen screen, float x, float y) {
        super(screen, x, y, 7, 1.2f, 10);

    }

    @Override
    protected void prepareAnimation() {
        atlasWalking = new TextureAtlas("E_Goblin/Pack/Walk.pack");
        atlasAttacking = new TextureAtlas("E_Goblin/Pack/Attack.pack");
        atlasDieing = new TextureAtlas("E_Goblin/Pack/Death.pack");
        atlasHurting = new TextureAtlas("E_Goblin/Pack/Hurt.pack");

        walkAnimation = new Animation<TextureRegion>(0.3f, atlasWalking.getRegions());
        attackAnimation = new Animation<TextureRegion>(0.1f, atlasAttacking.getRegions());
        dieAnimation = new Animation<TextureRegion>(0.2f, atlasDieing.getRegions());
        hurtAnimation = new Animation<TextureRegion>(0.3f, atlasHurting.getRegions());
    }


}
