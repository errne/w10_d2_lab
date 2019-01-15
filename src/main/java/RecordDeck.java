public class RecordDeck extends Component {

    private int playSpeed;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.playSpeed = 0;
    }

    public int setPlaySpeed (int speed) {
        this.playSpeed = speed;
        return playSpeed;
    }


    public int getPlaySpeed() {
        return playSpeed;
    }
}
