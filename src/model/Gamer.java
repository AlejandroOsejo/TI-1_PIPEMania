package model;

public class Gamer {
    private String nickname;
    private int points;

    private Gamer right;
    private Gamer left;

    public String getNickname() {return nickname;}
    public void setNickname(String nickname) {this.nickname = nickname;}

    public int getPoints() {return points;}
    public void setPoints(int points) {this.points = points;}

    public Gamer getRight() {return right;}
    public void setRight(Gamer right) {this.right = right;}

    public Gamer getLeft() {return left;}
    public void setLeft(Gamer left) {this.left = left;}
}
