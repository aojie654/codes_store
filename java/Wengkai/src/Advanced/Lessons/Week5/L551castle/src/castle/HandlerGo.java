package Advanced.Lessons.Week5.L551castle.src.castle;

public class HandlerGo extends Handler {
    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void doCMD(String word) {
        game.goRoom(word);
    }
}
