package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bfl implements bfg {
    public static final bfl a = new bfl(2, null);
    private final /* synthetic */ int b;

    public bfl(int i) {
        this.b = i;
    }

    @Deprecated
    public bfl(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.bfg
    public final bff a(Object obj, int i, int i2, azt aztVar) {
        switch (this.b) {
            case 0:
                return null;
            case 1:
                return new bff(new blo(obj), new beo(obj.toString()));
            default:
                return new bff(new blo(obj), new bfr(obj));
        }
    }

    @Override // defpackage.bfg
    public final boolean b(Object obj) {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
