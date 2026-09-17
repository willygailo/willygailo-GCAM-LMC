package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qov implements Iterator, j$.util.Iterator {
    final /* synthetic */ qow a;
    private int b = -1;
    private int c;
    private int d;
    private qoa e;
    private int f;

    public qov(qow qowVar) {
        this.a = qowVar;
        int iH = qno.h(0, 0, qowVar.a.length());
        this.c = iH;
        this.d = iH;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    private final void a() {
        Object objInvoke;
        int iIntValue;
        int i;
        qoa qoaVar;
        int i2 = this.d;
        if (i2 < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        qow qowVar = this.a;
        int i3 = qowVar.b;
        if (i3 > 0) {
            int i4 = this.f + 1;
            this.f = i4;
            if (i4 >= i3) {
                this.e = new qoa(this.c, qno.k(this.a.a));
                this.d = -1;
            } else if (i2 > qowVar.a.length()) {
                this.e = new qoa(this.c, qno.k(this.a.a));
                this.d = -1;
            } else {
                qow qowVar2 = this.a;
                objInvoke = qowVar2.c.invoke(qowVar2.a, Integer.valueOf(this.d));
                if (objInvoke == null) {
                    this.e = new qoa(this.c, qno.k(this.a.a));
                    this.d = -1;
                } else {
                    qkl qklVar = (qkl) objInvoke;
                    iIntValue = ((Number) qklVar.a).intValue();
                    int iIntValue2 = ((Number) qklVar.b).intValue();
                    i = this.c;
                    if (iIntValue <= Integer.MIN_VALUE) {
                        qoaVar = qoa.d;
                    } else {
                        qoaVar = new qoa(i, iIntValue - 1);
                    }
                    this.e = qoaVar;
                    int i5 = iIntValue + iIntValue2;
                    this.c = i5;
                    this.d = i5 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i2 > qowVar.a.length()) {
            this.e = new qoa(this.c, qno.k(this.a.a));
            this.d = -1;
        } else {
            qow qowVar3 = this.a;
            objInvoke = qowVar3.c.invoke(qowVar3.a, Integer.valueOf(this.d));
            if (objInvoke == null) {
                this.e = new qoa(this.c, qno.k(this.a.a));
                this.d = -1;
            } else {
                qkl qklVar2 = (qkl) objInvoke;
                iIntValue = ((Number) qklVar2.a).intValue();
                int iIntValue3 = ((Number) qklVar2.b).intValue();
                i = this.c;
                if (iIntValue <= Integer.MIN_VALUE) {
                    qoaVar = qoa.d;
                } else {
                    qoaVar = new qoa(i, iIntValue - 1);
                }
                this.e = qoaVar;
                int i6 = iIntValue + iIntValue3;
                this.c = i6;
                this.d = i6 + (iIntValue3 == 0 ? 1 : 0);
            }
        }
        this.b = 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        qoa qoaVar = this.e;
        if (qoaVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        this.e = null;
        this.b = -1;
        return qoaVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
