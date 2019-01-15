public class Radio extends Component {

    private StationType station;

    public Radio(String make, String model) {
        super(make, model);
    }

    public StationType getStation() {
        return station;
    }

    public String tune(StationType station){
        this.station = station;
        return this.station.getName();
    }
}
