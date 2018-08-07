package ServerCommunication;

import java.io.Serializable;


public class GameEvent implements Serializable {
    /**
	 * Default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	public int buttonPressed;

    public GameEvent(int buttonId) {
        this.buttonPressed = buttonId;
    }
}
