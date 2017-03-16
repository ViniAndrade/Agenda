package com.example.agenda2017;

/**
 * Created by -Vinícius on 16/03/2017.
 */

//
public class ControllerEditar {
    private static ControllerEditar INSTANCE = null;

    private String value;

    private ControllerEditar(){}

    public static ControllerEditar getInstance ()
    {
        if (INSTANCE == null)
            INSTANCE = new ControllerEditar();
        return INSTANCE;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}


