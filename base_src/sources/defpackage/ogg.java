package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ogg extends ogh {
    static final ogh a;

    static {
        ogg oggVar = new ogg(new xf(0));
        if (oggVar.b) {
            throw new IllegalStateException("Already frozen");
        }
        oggVar.b = true;
        a = oggVar;
    }

    private ogg(xf xfVar) {
        super(xfVar);
    }
}
