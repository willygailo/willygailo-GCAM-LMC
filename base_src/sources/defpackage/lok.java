package defpackage;

import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: loaded from: classes2.dex */
public final class lok implements lmp {
    static final Integer a = -1;
    static final MeteringRectangle[] b = new MeteringRectangle[0];
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public MeteringRectangle[] h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;

    private lok(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = num5;
        this.h = meteringRectangleArr;
        this.i = meteringRectangleArr2;
        this.j = meteringRectangleArr3;
    }

    static lok b() {
        Integer num = a;
        MeteringRectangle[] meteringRectangleArr = b;
        return new lok(num, num, num, num, num, meteringRectangleArr, meteringRectangleArr, meteringRectangleArr);
    }

    @Override // defpackage.lmp
    public final lmq a() {
        return new loj(this);
    }
}
