package user;

import game.Game;
import game.GameManager;

public class User {

    public void play(GameManager gameManager , Game game ){
        gameManager.execute(game);
    }
}
