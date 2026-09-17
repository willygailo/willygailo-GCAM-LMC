package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class imw implements imr {
    public int a = 1;
    public final Runnable b;
    public final Runnable c;
    private final ims d;
    private final Executor e;
    private final String f;

    public imw() {
    }

    public imw(ims imsVar, Runnable runnable, Runnable runnable2, Executor executor, String str) {
        this.d = imsVar;
        this.b = runnable;
        this.c = runnable2;
        this.e = executor;
        this.f = str;
    }

    public static imv a() {
        return new imv();
    }

    @Override // defpackage.imr
    public final void c(ims imsVar) {
        if (imsVar != ims.UNKNOWN) {
            final int i = 1;
            int i2 = true != imsVar.a(this.d) ? 3 : 2;
            int i3 = this.a;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i2) {
                return;
            }
            if (i2 == 2) {
                this.e.execute(new Runnable(this) { // from class: imu
                    public final /* synthetic */ imw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                imw imwVar = this.a;
                                imwVar.b.run();
                                imwVar.a = 3;
                                break;
                            default:
                                imw imwVar2 = this.a;
                                imwVar2.c.run();
                                imwVar2.a = 2;
                                break;
                        }
                    }
                });
            } else {
                final int i4 = 0;
                this.e.execute(new Runnable(this) { // from class: imu
                    public final /* synthetic */ imw a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                imw imwVar = this.a;
                                imwVar.b.run();
                                imwVar.a = 3;
                                break;
                            default:
                                imw imwVar2 = this.a;
                                imwVar2.c.run();
                                imwVar2.a = 2;
                                break;
                        }
                    }
                });
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imw) {
            imw imwVar = (imw) obj;
            if (this.d.equals(imwVar.d) && this.b.equals(imwVar.b) && this.c.equals(imwVar.c) && this.e.equals(imwVar.e) && this.f.equals(imwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.e);
        String str = this.f;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + length3 + String.valueOf(strValueOf4).length() + String.valueOf(str).length());
        sb.append("TwoStateTemperatureListener{threshold=");
        sb.append(strValueOf);
        sb.append(", onEnable=");
        sb.append(strValueOf2);
        sb.append(", onDisable=");
        sb.append(strValueOf3);
        sb.append(", executor=");
        sb.append(strValueOf4);
        sb.append(", featureName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
