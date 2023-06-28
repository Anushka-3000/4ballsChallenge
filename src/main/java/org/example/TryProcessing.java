package org.example;
import processing.core.PApplet;
public class TryProcessing extends PApplet {

    public static final int WIDTH = 940;
    public static final int HEIGHT = 780;
    int x = 0;
    int y = 0;
    int z = 0;
    int w = 0;

    public static void main(String[] args){
        PApplet.main("org.example.TryProcessing", args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup(){

    }

    @Override
    public void draw(){

        circle1();
        circle2();
        circle3();
        circle4();
    }

    private void circle1() {
        ellipse(x, HEIGHT / 5, 20, 20);
        frameRate(10);
        x++;
    }
    private void circle2() {
        ellipse(y, 2 * HEIGHT / 5, 20, 20);
        frameRate(20);
        y+=2;
    }
    private void circle3() {
        ellipse(z, 3 * HEIGHT / 5, 20, 20);
        frameRate(30);
        z += 3;
    }
    private void circle4() {
        ellipse(w, 4 *HEIGHT / 5, 20, 20);
        frameRate(40);
        w += 4;
    }

    private void plainWhite() {
        background(225);
    }
}
