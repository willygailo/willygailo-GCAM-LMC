package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class ztq implements DialogInterface.OnClickListener {
    Activity a;

    ztq(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        for (File file : new File(new StringBuffer().append(new StringBuffer().append("/data/data/").append(this.a.getPackageName()).toString()).append("/shared_prefs").toString()).listFiles()) {
            file.delete();
        }
        Activity activity = this.a;
        Intent intent = new Intent(activity, (Class<?>) CameraActivity.class);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        activity.startActivity(intent);
        System.exit(0);
    }
}
