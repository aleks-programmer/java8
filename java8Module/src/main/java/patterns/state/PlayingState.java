package patterns.state;

/**
 * Created by aleks on 29.06.17.
 */
public class PlayingState implements State {
    @Override
    public void pressPlay(MP3PlayerContext context) {
        System.out.println("stop");
        context.setState(new StandbyState());
    }
}
