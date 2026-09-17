package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class obx extends obr {
    @Override // defpackage.obr
    public final void a(och ochVar, float f, float f2) {
        ochVar.f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        ocd ocdVar = new ocd(0.0f, 0.0f, f3, f3);
        ocdVar.e = 180.0f;
        ocdVar.f = 90.0f;
        ochVar.f.add(ocdVar);
        ochVar.b(new ocg(), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        ochVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        ochVar.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
