package MC;

import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.Helper;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* JADX INFO: loaded from: classes4.dex */
public class Utils {
    public static SharedPreferences mySharedPreferences;

    public Utils() {
        getContext();
    }

    public static void ShowToastDirect(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Toast.makeText(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext(), str, 1).show();
    }

    public static Context getContext() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
    }

    public static SharedPreferences getSharedPreference(Context context) {
        if (mySharedPreferences != null) {
            return mySharedPreferences;
        }
        mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return mySharedPreferences;
    }

    public static void onRestart() throws InterruptedException {
        if (Helper.sHdr_process != 0) {
            ShowToastDirect("HDR is processing. Try again shortly.");
            return;
        }
        Thread.sleep(500L);
        AppGlobals.getInitialApplication();
        Context context = getContext();
        Intent intent = new Intent(context, (Class<?>) CameraActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        intent.addFlags(65536);
        Helper.GetEachModeIndividually(intent);
        context.startActivity(intent);
        System.exit(0);
    }

    public static void putBool(String str, boolean z) {
        SharedPreferences.Editor editorEdit = getSharedPreference(getContext()).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public static boolean staticMenuValueBB(String str) {
        return getSharedPreference(getContext()).getBoolean(str, false);
    }
}
