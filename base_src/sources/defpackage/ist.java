package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.Duration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ist {
    private static final Duration a = Duration.ofSeconds(2);
    private static final ouj b = ouj.h("com/google/android/apps/camera/toast/app/startup/DnDAccessToastController");
    private final WeakReference c;
    private final NotificationManager d;
    private final btt e;
    private final fjs f;
    private final AtomicBoolean g = new AtomicBoolean();
    private final elw h;

    public ist(WeakReference weakReference, NotificationManager notificationManager, btt bttVar, fjs fjsVar, elw elwVar) {
        this.c = weakReference;
        this.d = notificationManager;
        this.e = bttVar;
        this.f = fjsVar;
        this.h = elwVar;
    }

    public final void a() {
        if (this.g.get()) {
            return;
        }
        Activity activity = (Activity) this.c.get();
        if (activity == null) {
            ((oug) ((oug) b.c()).G((char) 3149)).o("Activity reference returns null, skipping");
            return;
        }
        Resources resources = activity.getResources();
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.activity_root_view);
        if (this.d.isNotificationPolicyAccessGranted() || !this.g.compareAndSet(false, true)) {
            return;
        }
        elw elwVar = this.h;
        ish ishVar = new ish();
        ishVar.b = viewGroup;
        ishVar.d = resources.getString(R.string.dnd_access_needed_info);
        ishVar.e = resources.getString(R.string.mode_settings);
        ishVar.a = a;
        ishVar.f = new Runnable() { // from class: iss
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        ishVar.k = 8;
        ishVar.i = this.h;
        elwVar.d(ishVar.a());
        this.f.Z(2);
    }

    public final void b() {
        this.f.Z(3);
        try {
            this.e.o(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        } catch (ActivityNotFoundException e) {
            ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 3151)).o("Failed to launch notification policy access settings");
        }
    }
}
