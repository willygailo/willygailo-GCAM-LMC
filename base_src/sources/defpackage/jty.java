package defpackage;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jty {
    private static final lzi a = lzi.a();
    private final Vibrator b;
    private final boolean c;

    public jty(Context context, ddf ddfVar) {
        this.b = (Vibrator) context.getSystemService("vibrator");
        this.c = ddfVar.k(ddl.aZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context) {
        if (!((bpx) context).a().k(ddl.aZ) || a.j) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(VibrationEffect.createPredefined(2));
    }

    public static void e(View view) {
        view.performHapticFeedback(6);
    }

    public final void a() {
        if (!a.j && this.c) {
            d(VibrationEffect.createPredefined(2));
        }
    }

    public final void c(int i) {
        d(VibrationEffect.createPredefined(i));
    }

    public final void d(VibrationEffect vibrationEffect) {
        if (this.b.hasVibrator()) {
            this.b.vibrate(vibrationEffect);
        }
    }
}
