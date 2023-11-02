package main.java.com.example;

import java.awt.image.BufferedImage;


public class Entity {
    public int x,y;
    public int speed;
    public BufferedImage up1,up2,up3, down1,down2,down3,left1,left2,left3,right1,right2,right3;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;

    public Entity(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    public Entity(){}

}