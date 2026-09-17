package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class opi extends ooq {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public opi(opj opjVar) {
        super(opjVar);
        this.a = opjVar.comparator();
    }

    @Override // defpackage.ooq
    public final /* bridge */ /* synthetic */ oon a(int i) {
        return new oph(this.a);
    }
}
