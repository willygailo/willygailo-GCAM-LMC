package defpackage;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
final class akk extends akm {
    public int[] a;
    dy b;
    float c;
    dy d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public akk() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    public akk(akk akkVar) {
        super(akkVar);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = akkVar.a;
        this.a = null;
        this.b = akkVar.b;
        this.c = akkVar.c;
        this.e = akkVar.e;
        this.d = akkVar.d;
        this.o = akkVar.o;
        this.f = akkVar.f;
        this.g = akkVar.g;
        this.h = akkVar.h;
        this.i = akkVar.i;
        this.j = akkVar.j;
        this.k = akkVar.k;
        this.l = akkVar.l;
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.d.b;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.b.b;
    }

    float getStrokeWidth() {
        return this.c;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    @Override // defpackage.ga
    public final boolean h() {
        return this.d.c() || this.b.c();
    }

    @Override // defpackage.ga
    public final boolean i(int[] iArr) {
        return this.b.d(iArr) | this.d.d(iArr);
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.d.b = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.b.b = i;
    }

    void setStrokeWidth(float f) {
        this.c = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }
}
