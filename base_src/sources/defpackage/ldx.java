package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ldx {
    ENCODING_PCM_8BIT(1),
    ENCODING_PCM_16BIT(2),
    ENCODING_IEC61937(2),
    ENCODING_DEFAULT(2),
    ENCODING_PCM_FLOAT(4);

    public final int f;

    ldx(int i) {
        this.f = i;
    }
}
