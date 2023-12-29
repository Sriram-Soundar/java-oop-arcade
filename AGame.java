package Games;

public abstract class AGame implements IGame, Comparable<AGame>{
    public String name;
    public AGame(String name){
        this.name = name;
    }
    public int compareTo(AGame other) {
        return this.name.compareTo(other.name);
    }
    public abstract void play();
}
