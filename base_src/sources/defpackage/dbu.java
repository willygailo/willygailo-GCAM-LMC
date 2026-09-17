package defpackage;

import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class dbu implements View.OnClickListener {
    final /* synthetic */ dbv a;
    private final /* synthetic */ int b;

    public dbu(dbv dbvVar, int i) {
        this.b = i;
        this.a = dbvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                obr.aQ(this.a.h.g());
                this.a.d.a();
                ((dbw) this.a.h.c()).a();
                break;
            default:
                Intent intent = new Intent();
                intent.setClassName(this.a.a, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
                ((dbw) this.a.h.c()).a();
                this.a.b.g(intent);
                break;
        }
    }
}
