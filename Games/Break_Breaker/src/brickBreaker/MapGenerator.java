package brickBreaker;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int breakWidth;
    public int breakHeight;
    public MapGenerator(int row,int col){
        map=new int [row][col];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j]=1;

            }

        }
        breakWidth=540/col;
        breakHeight=150/row;

    }
    public void draw(Graphics2D g){
        for(int i=0;i<map.length;i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j]>0){
                    g.setColor(Color.WHITE);
                    g.fillRect(j*breakWidth+80,i*breakHeight+50,breakWidth,breakHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*breakWidth+80,i*breakHeight+50,breakWidth,breakHeight);
                }
            }
        }



    }
    public  void setBreakValue(int value,int row,int col){
        map[row][col]=value;
    }




}
