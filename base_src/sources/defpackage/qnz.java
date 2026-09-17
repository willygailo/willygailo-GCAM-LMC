package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qnz implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public qnz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qlb iterator() {
        return new qlb(this.a, this.b, 1);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof qnz) {
            if (b() && ((qnz) obj).b()) {
                return true;
            }
            qnz qnzVar = (qnz) obj;
            if (this.a == qnzVar.a && this.b == qnzVar.b) {
                int i = qnzVar.c;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
