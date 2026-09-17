package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ota extends oli {
    public final orj a;
    public final Object b;

    public ota(orj orjVar, Object obj) {
        this.a = orjVar;
        this.b = obj;
    }

    final omr a() {
        return this.a.b;
    }

    final omr b() {
        return this.a.c;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }
}
