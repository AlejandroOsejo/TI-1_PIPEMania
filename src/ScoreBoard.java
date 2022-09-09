public class ScoreBoard {
    private Gamer points;//
    private Gamer player;


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
        }else if (p.getPoints() > current.getPoints()){
            if (current.getRight() != null){
                addPoint(p, current.getRight());
            }else {
                current.setRight(p);
            }
        }

    }
}
