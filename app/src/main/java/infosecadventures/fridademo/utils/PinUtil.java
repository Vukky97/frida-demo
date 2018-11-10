package infosecadventures.fridademo.utils;

import android.content.Context;

import infosecadventures.fridademo.R;

public class PinUtil {

    public static boolean checkPin(Context context, String pin) {
        return pin.equals(context.getString(R.string.pin));
    }
}
