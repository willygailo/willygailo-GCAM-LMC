package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class fyp extends Handler {
    private final WeakReference a;

    public fyp(fyr fyrVar) {
        this.a = new WeakReference(fyrVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fyr fyrVar = (fyr) this.a.get();
        if (fyrVar == null) {
            return;
        }
        switch (message.what) {
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                fyrVar.u();
                return;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                return;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                LocalSessionStorage localSessionStorage = fyrVar.m;
                hsm hsmVar = localSessionStorage.b.d;
                if (hsmVar.b()) {
                    String path = hsmVar.a().getPath();
                    long jA = fyrVar.c.a() / 1000000;
                    boolean z = true;
                    if (!fyrVar.G && fcz.d() > 0) {
                        z = false;
                    }
                    int i = (int) jA;
                    synchronized (fcz.a) {
                        LightCycleNative.FinishCapture(z, path, path, i);
                        fcz.b = false;
                        break;
                    }
                    new fek(localSessionStorage, new fyg(fyrVar, localSessionStorage)).start();
                } else {
                    ((oug) ((oug) fyr.b.b()).G((char) 1998)).o("Could not create temporary mosaic file. Not able to stitch.");
                }
                fyrVar.C();
                return;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                fyrVar.C();
                return;
            default:
                throw new AssertionError(message.what);
        }
    }
}
