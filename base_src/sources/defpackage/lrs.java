package defpackage;

import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: loaded from: classes2.dex */
public final class lrs implements lmp {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;
    public MeteringRectangle[] k;

    public lrs(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.i = meteringRectangleArr;
        this.j = meteringRectangleArr2;
        this.k = meteringRectangleArr3;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
    }

    public static lrs b(lmq lmqVar) {
        return new lrs(lmqVar.d(), lmqVar.b(), lmqVar.a(), lmqVar.c(), lmqVar.e(), lmqVar.g(), lmqVar.f(), lmqVar.h(), false, false, false);
    }

    public static lrs c(lrt lrtVar) {
        lrs lrsVarB = b(lrtVar);
        lrsVarB.f = lrtVar.a;
        lrsVarB.g = lrtVar.b;
        lrsVarB.h = lrtVar.c;
        return lrsVarB;
    }

    @Override // defpackage.lmp
    public final /* bridge */ /* synthetic */ lmq a() {
        throw null;
    }

    public final lrt d() {
        return new lrt(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j, this.k);
    }
}
