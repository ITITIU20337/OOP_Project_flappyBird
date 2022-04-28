
import java.awt.Rectangle;
import pkg2dgamesframework.Objects;

public class Bird extends Objects {
    private float vt = 0.0F;
    private boolean isFlying = false;
    private Rectangle rect;
    private boolean isLive = true;

    public Bird(int x, int y, int w, int h) {
        super((float)x, (float)y, (float)w, (float)h);
        this.rect = new Rectangle(x, y, w, h);
    }

    public void setLive(boolean b) {
        this.isLive = b;
    }

    public boolean getLive() {
        return this.isLive;
    }

    public Rectangle getRect() {
        return this.rect;
    }

    public void setVt(float vt) {
        this.vt = vt;
    }

    public void update(long deltaTime) {
        this.vt += FlappyBirds.g;
        this.setPosY(this.getPosY() + this.vt);
        this.rect.setLocation((int)this.getPosX(), (int)this.getPosY());
        if (this.vt < 0.0F) {
            this.isFlying = true;
        } else {
            this.isFlying = false;
        }

    }

    public void fly() {
        this.vt = -3.0F;
    }

    public boolean getIsFlying() {
        return this.isFlying;
    }
}
