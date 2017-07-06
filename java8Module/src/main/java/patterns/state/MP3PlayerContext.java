package patterns.state;

/**
 * Created by aleks on 29.06.17.
 */
public class MP3PlayerContext {
    private State state;
    private MP3PlayerContext(State state) {
        this.state= state;
    }
    public void play() {
        state.pressPlay(this);
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public static void main (String[] args) {
        MP3PlayerContext ctx = new MP3PlayerContext(new StandbyState());
        int i = 0;
        while (true) {
            ctx.play();

            if (++i == 100000) break;
        }
    }
}
