/**
 * Created by -Vinícius on 16/03/2017.
 */

public class ControllerNome {
    private static ControllerNome INSTANCE = null;

    private int layoutConfig;

    private ControllerNome(){}

    public static ControllerNome getInstance ()
    {
        if (INSTANCE == null)
            INSTANCE = new ControllerCoordinator();
        return INSTANCE;
    }

    public int getLayoutConfig() {
        return layoutConfig;
    }

    public void setLayoutConfig(int layoutConfig) {
        this.layoutConfig = layoutConfig;
    }
}
