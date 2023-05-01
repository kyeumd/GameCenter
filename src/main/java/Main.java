import game.Game;
import game.GameManager;
import game.numberbaseball.NumberBaseBall;
import user.User;

public class Main {

    public static void main(String[] args) {

        User user01 = new User();
        Game nbbGame = new NumberBaseBall();
        GameManager gm = new GameManager();
        user01.play(gm,nbbGame);
    }
}
