package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class iwx extends ihr {
    public iwx(ixj ixjVar) {
        final eah eahVar = ixjVar.i;
        eahVar.getClass();
        a(mip.eO("CameraUi.Photos"), new iib() { // from class: iww
            @Override // defpackage.iib
            public final lie a() {
                final eah eahVar2 = eahVar;
                eahVar2.b();
                return new lie() { // from class: eae
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        eahVar2.a();
                    }
                };
            }
        });
    }

    @Override // defpackage.ihr
    public void b() {
    }
}
