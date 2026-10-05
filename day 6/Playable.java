/   Day 6  4th Question   Interface Playable

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar: strumming the strings");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano: pressing the keys");
    }
}

public class PlayableDemo {
    public static void main(String[] args) {
        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        p1.play();
        p2.play();
    }
}