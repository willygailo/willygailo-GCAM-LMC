package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class ncg {
    public final float a;
    public final Random b;

    public ncg(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        obr.aG(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
