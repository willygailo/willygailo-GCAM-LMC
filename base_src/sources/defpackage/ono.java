package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ono extends oli {
    final Object a;
    int b;
    final /* synthetic */ onu c;

    public ono(onu onuVar, int i) {
        this.c = onuVar;
        this.a = onuVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            onu onuVar = this.c;
            if (i <= onuVar.c && obr.bc(onuVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.oli, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.b[i];
        if (obr.bc(obj2, obj)) {
            return obj;
        }
        this.c.j(this.b, obj, false);
        return obj2;
    }
}
