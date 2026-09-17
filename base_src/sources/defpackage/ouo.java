package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ouo extends ovv {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(ovd ovdVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(ovdVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ovv
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ovv
    public final ovd c(int i) {
        if (i < this.b) {
            return (ovd) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ovv
    public final Object d(ovd ovdVar) {
        int iA = a(ovdVar);
        if (iA != -1) {
            return ovdVar.d(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.ovv
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
