package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class osw implements Iterator, j$.util.Iterator {
    osx a;
    oqv b;
    final /* synthetic */ osz c;
    private final /* synthetic */ int d;

    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    public osw(osz oszVar, int i) {
        osx osxVarE;
        this.d = i;
        this.c = oszVar;
        Object obj = oszVar.b.a;
        if (obj == null) {
            osxVarE = null;
        } else {
            onn onnVar = oszVar.c;
            if (onnVar.d) {
                Object obj2 = onnVar.e;
                osxVarE = ((osx) obj).d(((olr) oszVar).a, obj2);
                if (osxVarE == null) {
                    osxVarE = null;
                } else if (oszVar.c.g == 1 && ((olr) oszVar).a.compare(obj2, osxVarE.a) == 0) {
                    osxVarE = osxVarE.e();
                }
            } else {
                osxVarE = oszVar.d.e();
            }
            if (osxVarE == oszVar.d || !oszVar.c.c(osxVarE.a)) {
                osxVarE = null;
            }
        }
        this.a = osxVarE;
        this.b = null;
    }

    public osw(osz oszVar, int i, byte[] bArr) {
        osx osxVarG;
        this.d = i;
        this.c = oszVar;
        Object obj = oszVar.b.a;
        osx osxVar = null;
        if (obj != null) {
            onn onnVar = oszVar.c;
            if (onnVar.b) {
                Object obj2 = onnVar.c;
                osxVarG = ((osx) obj).c(((olr) oszVar).a, obj2);
                if (osxVarG != null) {
                    if (oszVar.c.f == 1 && ((olr) oszVar).a.compare(obj2, osxVarG.a) == 0) {
                        osxVarG = osxVarG.g();
                    }
                }
            } else {
                osxVarG = oszVar.d.g();
            }
            if (osxVarG != oszVar.d && oszVar.c.c(osxVarG.a)) {
                osxVar = osxVarG;
            }
        }
        this.a = osxVar;
    }

    public final oqv a() {
        switch (this.d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                osx osxVar = this.a;
                osxVar.getClass();
                oqv oqvVarU = this.c.u(osxVar);
                this.b = oqvVarU;
                if (this.a.e() == this.c.d) {
                    this.a = null;
                } else {
                    this.a = this.a.e();
                }
                return oqvVarU;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                osz oszVar = this.c;
                osx osxVar2 = this.a;
                osxVar2.getClass();
                oqv oqvVarU2 = oszVar.u(osxVar2);
                this.b = oqvVarU2;
                if (this.a.g() == this.c.d) {
                    this.a = null;
                } else {
                    this.a = this.a.g();
                }
                return oqvVarU2;
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.d) {
            case 0:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
            default:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                osx osxVar = this.a;
                if (osxVar == null) {
                    return false;
                }
                if (!this.c.c.e(osxVar.a)) {
                    return true;
                }
                this.a = null;
                return false;
            default:
                osx osxVar2 = this.a;
                if (osxVar2 == null) {
                    return false;
                }
                if (!this.c.c.d(osxVar2.a)) {
                    return true;
                }
                this.a = null;
                return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.d) {
            case 0:
                break;
        }
        return a();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                obr.aR(this.b != null, "no calls to next() since the last call to remove()");
                this.c.x(this.b.b());
                this.b = null;
                break;
            default:
                obr.aR(this.b != null, "no calls to next() since the last call to remove()");
                this.c.x(this.b.b());
                this.b = null;
                break;
        }
    }
}
