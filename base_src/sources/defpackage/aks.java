package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class aks {
    final xf a;
    final xf b;
    final xf c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public aks(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new xf(), new xf(), new xf());
    }

    private aks(Parcel parcel, int i, int i2, String str, xf xfVar, xf xfVar2, xf xfVar3) {
        this.a = xfVar;
        this.b = xfVar2;
        this.c = xfVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    private final Class v(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        return !s(i) ? parcelable : this.d.readParcelable(getClass().getClassLoader());
    }

    public final akt c() {
        String strN = n();
        if (strN == null) {
            return null;
        }
        aks aksVarM = m();
        try {
            Method declaredMethod = (Method) this.a.get(strN);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strN, true, aks.class.getClassLoader()).getDeclaredMethod("read", aks.class);
                this.a.put(strN, declaredMethod);
            }
            return (akt) declaredMethod.invoke(null, aksVarM);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        return !s(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(akt aktVar) {
        if (aktVar == null) {
            r(null);
            return;
        }
        try {
            r(v(aktVar.getClass()).getName());
            aks aksVarM = m();
            try {
                Class<?> cls = aktVar.getClass();
                Method declaredMethod = (Method) this.b.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = v(cls).getDeclaredMethod("write", cls, aks.class);
                    this.b.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, aktVar, aksVarM);
                aksVarM.o();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(aktVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public final boolean l(boolean z, int i) {
        if (s(i)) {
            return this.d.readInt() != 0;
        }
        return z;
    }

    protected final aks m() {
        Parcel parcel = this.d;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new aks(parcel, iDataPosition, i, this.h + "  ", this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.e.get(i);
            int iDataPosition = this.d.dataPosition();
            this.d.setDataPosition(i2);
            this.d.writeInt(iDataPosition - i2);
            this.d.setDataPosition(iDataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            int i3 = this.d.readInt();
            this.k = this.d.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    public final akt t(akt aktVar) {
        return !s(1) ? aktVar : c();
    }

    public final void u(akt aktVar) {
        p(1);
        k(aktVar);
    }
}
