

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

public class FlappyBirds extends GameScreen {
    private BufferedImage birds;
    private Animation bird_anim;
    public static float g = 0.1F;
    private Bird bird;
    private int Point = 0;
    private int BEGIN_SCREEN = 0;
    private int GAMEPLAY_SCREEN = 1;
    private int GAMEOVER_SCREEN = 2;
    private int CurrentScreen;

    public FlappyBirds() {
        super(800, 600);
        this.CurrentScreen = this.BEGIN_SCREEN;

        try {
            this.birds = ImageIO.read(new File("src/image/bird_sprite.png"));
        } catch (IOException var2) {
        }

        this.bird_anim = new Animation(70L);
        AFrameOnImage f = new AFrameOnImage(0, 0, 60, 60);
        this.bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        this.bird_anim.AddFrame(f);
        f = new AFrameOnImage(120, 0, 60, 60);
        this.bird_anim.AddFrame(f);
        f = new AFrameOnImage(60, 0, 60, 60);
        this.bird_anim.AddFrame(f);
        this.bird = new Bird(350, 250, 50, 50);
        this.BeginGame();
    }

    public static void main(String[] args) {
        new FlappyBirds();
    }

    private void resetGame() {

    }

    public void GAME_UPDATE(long deltaTime) {

    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {

    }

    public void GAME_PAINT(Graphics g2) {

    }

    public void KEY_ACTION(KeyEvent e, int Event) {
    }
}


