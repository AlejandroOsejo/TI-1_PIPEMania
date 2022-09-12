package model;

import model.Gamer;

public class ScoreBoard {
    private Gamer points;
    private int position = 0;

    public ScoreBoard(){

    }

    public Gamer getPoints() {return points;}
    public void setPoints(Gamer points) {this.points = points;}

    public int getPosition() {return position;}
    public void setPosition(int position) {this.position = position;}


    public void addPoint(Gamer p){
        if (points == null){
            points = p;
        }else {
            addPoint(p, points);
        }
    }
    private void addPoint(Gamer p, Gamer current){
        if (p.getPoints() < current.getPoints()){ //Izquierda
            if (current.getLeft() != null){
                addPoint(p, current.getLeft());
            }else{
                current.setLeft(p);
            }
        }else if (p.getPoints() > current.getPoints()){ //Derecha
            if (current.getRight() != null){
                addPoint(p, current.getRight());
            }else {
                current.setRight(p);
            }
        }

    }


    public void listPoints(){
        listPoints(points);
    }
    private void listPoints(Gamer current){
        if (current == null){
            return;
        }
        listPoints(current.getLeft());
        System.out.println((position++) + " - " + current.getNickname() + " / " + current.getPoints());
        listPoints(current.getRight());
    }
}
