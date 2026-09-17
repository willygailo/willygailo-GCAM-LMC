package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class doo implements oiu {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ doo(boolean z, boolean z2, int i) {
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                return Boolean.valueOf(this.a && this.b && ((htf) obj) != htf.OFF);
            case 1:
                return Boolean.valueOf(this.a && this.b && ((htf) obj) != htf.OFF);
            case 2:
                boolean z = this.a;
                boolean z2 = this.b;
                Integer num = (Integer) obj;
                if (z) {
                    return (htf.a(num.intValue()) == htf.OFF || !z2) ? htf.a(num.intValue()) : htf.DEBUG_MAX;
                }
                return htf.OFF;
            default:
                return Boolean.valueOf(this.a && this.b && ((Integer) obj).intValue() != hls.e(1));
        }
    }
}
