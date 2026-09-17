package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class oii implements Iterator, j$.util.Iterator {
    final CharSequence b;
    final boolean c;
    private Object f;
    public int a = 2;
    int d = 0;
    int e = Integer.MAX_VALUE;

    protected oii(ojq ojqVar, CharSequence charSequence) {
        this.c = ojqVar.b;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int iA;
        obr.aQ(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return true;
            case 1:
            default:
                this.a = 4;
                int i3 = this.d;
                while (true) {
                    int i4 = this.d;
                    if (i4 != -1) {
                        int iB = b(i4);
                        if (iB == -1) {
                            iB = this.b.length();
                            this.d = -1;
                            iA = -1;
                        } else {
                            iA = a(iB);
                            this.d = iA;
                        }
                        if (iA == i3) {
                            int i5 = iA + 1;
                            this.d = i5;
                            if (i5 > this.b.length()) {
                                this.d = -1;
                            }
                        } else {
                            if (i3 < iB) {
                                this.b.charAt(i3);
                            }
                            if (i3 < iB) {
                                this.b.charAt(iB - 1);
                            }
                            if (this.c && i3 == iB) {
                                i3 = this.d;
                            } else {
                                int i6 = this.e;
                                if (i6 == 1) {
                                    iB = this.b.length();
                                    this.d = -1;
                                    if (iB > i3) {
                                        this.b.charAt(iB - 1);
                                    }
                                } else {
                                    this.e = i6 - 1;
                                }
                                string = this.b.subSequence(i3, iB).toString();
                            }
                        }
                    } else {
                        this.a = 3;
                    }
                }
                this.f = string;
                if (this.a == 3) {
                    return false;
                }
                this.a = 1;
                return true;
            case 2:
                return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
