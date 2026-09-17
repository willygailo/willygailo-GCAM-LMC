package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bhb {
    public static final bhb a = new bgz();
    public static final bhb b = new bgx();
    public static final bhb c;
    public static final bhb d;
    public static final bhb e;
    public static final azs f;
    static final boolean g;

    static {
        bgy bgyVar = new bgy();
        c = bgyVar;
        d = new bha();
        e = bgyVar;
        f = azs.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bgyVar);
        g = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
