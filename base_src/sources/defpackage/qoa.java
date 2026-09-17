package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qoa extends qnz {
    public static final qoa d = new qoa(1, 0);

    public qoa(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.qnz
    public final boolean b() {
        return this.a > this.b;
    }

    @Override // defpackage.qnz
    public final boolean equals(Object obj) {
        if (obj instanceof qoa) {
            if (b() && ((qoa) obj).b()) {
                return true;
            }
            qoa qoaVar = (qoa) obj;
            if (this.a == qoaVar.a && this.b == qoaVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qnz
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.qnz
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
