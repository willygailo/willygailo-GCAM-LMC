package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public final class qvb extends qnp implements qmu {
    final /* synthetic */ Constructor a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvb(Constructor constructor, int i) {
        super(1);
        this.b = i;
        this.a = constructor;
    }

    @Override // defpackage.qmu
    public final /* synthetic */ Object a(Object obj) {
        Object objL;
        Object objL2;
        Object objL3;
        Object objL4;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                try {
                    Object objNewInstance = this.a.newInstance(th);
                    if (objNewInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    objL = (Throwable) objNewInstance;
                    return (Throwable) (true != (objL instanceof qkm) ? objL : null);
                } catch (Throwable th2) {
                    objL = qmd.L(th2);
                }
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                try {
                    Object objNewInstance2 = this.a.newInstance(th3.getMessage(), th3);
                    if (objNewInstance2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    objL2 = (Throwable) objNewInstance2;
                    return (Throwable) (true != (objL2 instanceof qkm) ? objL2 : null);
                } catch (Throwable th4) {
                    objL2 = qmd.L(th4);
                }
                break;
            case 2:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                try {
                    Object objNewInstance3 = this.a.newInstance(th5.getMessage());
                    if (objNewInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    Throwable th6 = (Throwable) objNewInstance3;
                    th6.initCause(th5);
                    objL3 = th6;
                    return (Throwable) (true != (objL3 instanceof qkm) ? objL3 : null);
                } catch (Throwable th7) {
                    objL3 = qmd.L(th7);
                }
                break;
            default:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                try {
                    Object objNewInstance4 = this.a.newInstance(new Object[0]);
                    if (objNewInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    Throwable th9 = (Throwable) objNewInstance4;
                    th9.initCause(th8);
                    objL4 = th9;
                    return (Throwable) (true != (objL4 instanceof qkm) ? objL4 : null);
                } catch (Throwable th10) {
                    objL4 = qmd.L(th10);
                }
                break;
        }
    }
}
