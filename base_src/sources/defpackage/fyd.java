package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
final class fyd implements fet {
    final /* synthetic */ fyr a;
    private final /* synthetic */ int b;

    public fyd(fyr fyrVar, int i) {
        this.b = i;
        this.a = fyrVar;
    }

    @Override // defpackage.fet
    public final /* synthetic */ void a(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                try {
                    this.a.v.join();
                    break;
                } catch (InterruptedException e) {
                    ((oug) ((oug) ((oug) fyr.b.b()).h(e)).G((char) 1980)).o("photoSpherePreviewWriter interrupted.");
                }
                this.a.B.sendEmptyMessage(R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                return;
            case 1:
                this.a.B.sendEmptyMessage(R.styleable.AppCompatTheme_textAppearanceListItemSmall);
                return;
            case 2:
                fyr fyrVar = this.a;
                if (fyrVar.p == 0) {
                    fyrVar.O = SystemClock.elapsedRealtime();
                    this.a.A();
                }
                this.a.t.h();
                fyr fyrVar2 = this.a;
                fyrVar2.p++;
                fyrVar2.B.sendEmptyMessage(R.styleable.AppCompatTheme_switchStyle);
                this.a.e.b(com.google.android.GoogleCameraEngR18F1.R.raw.panorama_single_photo_shutter_sound);
                fyr fyrVar3 = this.a;
                if (fyrVar3.o) {
                    return;
                }
                fyrVar3.o = true;
                hhl hhlVar = fyrVar3.d;
                synchronized (hhlVar.b) {
                    synchronized (hhlVar.b) {
                        z = hhlVar.g == 1 || !hhlVar.c.isEmpty();
                        break;
                    }
                    if (z) {
                        hhlVar.a.b("Not able to suspend processing.");
                        return;
                    } else {
                        hhlVar.a.b("Suspend processing");
                        hhlVar.e = true;
                        return;
                    }
                }
            case 3:
                this.a.B.post(new fyl(this, null));
                return;
            default:
                this.a.B.post(new fym(this, null));
                return;
        }
    }
}
