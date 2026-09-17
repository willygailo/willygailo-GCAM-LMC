package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class jap {
    public final Context a;
    final /* synthetic */ EduImageView b;
    int c;
    private final String d;
    private final String e;
    private lie f;
    private final iuz g;

    public jap(EduImageView eduImageView, Context context, String str, String str2, iuz iuzVar) {
        this.b = eduImageView;
        this.a = context;
        this.d = str;
        this.e = str2;
        this.g = iuzVar;
    }

    public final void a() {
        this.b.a.setContentDescription(this.e);
        iuz iuzVar = this.g;
        if (iuzVar != null) {
            iva ivaVar = iuzVar.a;
            LinearLayout linearLayout = iuzVar.b;
            EduImageView eduImageView = iuzVar.c;
            linearLayout.setVisibility(0);
            if (ivaVar.x) {
                eduImageView.a();
                eduImageView.setBackgroundColor(mip.aH(R.dimen.gm_sys_elevation_level1, eduImageView.getContext()));
            }
        }
    }

    public final void b(boolean z) {
        this.b.a.setOnClickListener(null);
        this.b.b.setVisibility(8);
        lie lieVar = this.f;
        if (lieVar != null) {
            lieVar.close();
            this.f = null;
        }
        Context context = this.b.getContext();
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        int iEf = mip.ef(context);
        this.c = iEf;
        try {
            TrafficStats.setThreadStatsTag(256);
            if (iEf == 3 || z) {
                ((ayk) axv.c(context).d(this.d).l()).a(new jan(this, 1)).j(this.b.a);
            } else if (iEf == 2) {
                ((ayk) ((ayk) ((ayk) axv.c(context).d(this.d).G()).F()).l()).a(new jan(this, 0)).j(this.b.a);
            } else {
                ((ayk) ((ayk) ((ayk) axv.c(context).d(this.d).G()).F()).l()).a(new jan(this, 2)).j(this.b.a);
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void c() {
        final jal jalVar = new jal(this);
        lie lieVar = this.f;
        if (lieVar != null) {
            lieVar.close();
        }
        Context context = this.a;
        final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.getClass();
        obr.aQ(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        connectivityManager.registerDefaultNetworkCallback(jalVar, new Handler(Looper.getMainLooper()));
        this.f = new lie() { // from class: jtp
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                connectivityManager.unregisterNetworkCallback(jalVar);
            }
        };
    }
}
