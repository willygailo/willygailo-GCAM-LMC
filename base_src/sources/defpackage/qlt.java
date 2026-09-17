package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qlt implements qlh {
    public static final qlt a = new qlt();

    private qlt() {
    }

    @Override // defpackage.qlh
    public final qln getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // defpackage.qlh
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
