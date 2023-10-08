package monero.lwc.schema;

import org.json.JSONObject;

import java.awt.List;

public abstract class Schema {
    public abstract JSONObject toJSON();
    public static <T extends Schema> T fromJSON(JSONObject object){ return null;};

}
