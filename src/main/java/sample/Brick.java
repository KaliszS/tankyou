package sample;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Brick extends Rectangle{

	private int Speed=5;

	public Brick(int x, int y,int width, int height, Color color ){
            super(width, height, color);
            setTranslateX(x);
            setTranslateY(y);
	}
        
        void MoveDown(){
           setTranslateY(getTranslateY()+50);
        }
	public void finalize() throws Throwable {

	}

	public void Destroy(){

	}

}