package HW07.HomeWork2;

abstract class Passengers {
    private int passegers;

    public Passengers() {
        this.passegers = 0;
    }

    public Passengers(int passegers) {
        this.passegers = passegers;
    }

    public int getPassegers() {
        return passegers;
    }

    public void setPassegers(int passegers) {
        this.passegers = passegers;
    }
}
