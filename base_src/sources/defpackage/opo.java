package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class opo extends oom {
    final /* synthetic */ opp a;

    public opo(opp oppVar) {
        this.a = oppVar;
    }

    @Override // defpackage.ood
    public final boolean gI() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
