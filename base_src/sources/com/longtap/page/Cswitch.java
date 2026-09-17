package com.longtap.page;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.Helper;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;

/* JADX INFO: renamed from: com.longtap.page.switch, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class Cswitch {
    static final Application INSTANCE;
    static Context app_context = null;

    static {
        try {
            INSTANCE = (Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public static Context getContext() {
        return app_context == null ? INSTANCE.getApplicationContext() : app_context;
    }

    public static void setLongClickListener(View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.longtap.page.switch.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                if (Helper.getValue("pref_switchaction_key") == 0) {
                    Cswitch.getContext();
                    new Helper().OpenPreference0("pref_screen_patcher");
                    return true;
                }
                Context context = Cswitch.getContext();
                Intent intent = new Intent(context, (Class<?>) CameraSettingsActivity.class);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return true;
            }
        });
    }
}
