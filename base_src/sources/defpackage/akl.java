package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class akl extends ga {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public akl() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public akl(akl aklVar, wy wyVar) {
        akm akjVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = aklVar.c;
        this.d = aklVar.d;
        this.e = aklVar.e;
        this.f = aklVar.f;
        this.g = aklVar.g;
        this.h = aklVar.h;
        this.i = aklVar.i;
        int[] iArr = aklVar.l;
        this.l = null;
        String str = aklVar.m;
        this.m = str;
        int i = aklVar.k;
        this.k = 0;
        if (str != null) {
            wyVar.put(str, this);
        }
        matrix.set(aklVar.j);
        ArrayList arrayList = aklVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof akl) {
                this.b.add(new akl((akl) obj, wyVar));
            } else {
                if (obj instanceof akk) {
                    akjVar = new akk((akk) obj);
                } else {
                    if (!(obj instanceof akj)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    akjVar = new akj((akj) obj);
                }
                this.b.add(akjVar);
                Object obj2 = akjVar.n;
                if (obj2 != null) {
                    wyVar.put(obj2, akjVar);
                }
            }
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    @Override // defpackage.ga
    public final boolean h() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((ga) this.b.get(i)).h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ga
    public final boolean i(int[] iArr) {
        boolean zI = false;
        for (int i = 0; i < this.b.size(); i++) {
            zI |= ((ga) this.b.get(i)).i(iArr);
        }
        return zI;
    }

    public final void k() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            k();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            k();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            k();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            k();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            k();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            k();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            k();
        }
    }
}
