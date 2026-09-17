package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.nio.Buffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class mrd extends mpo {
    private mrd(mpi mpiVar, mnb mnbVar) {
        super(mpiVar, mnbVar);
    }

    public mrd(mpi mpiVar, mnb mnbVar, byte[] bArr) {
        super(mpiVar, mnbVar);
    }

    public mrd(mpi mpiVar, mnb mnbVar, byte[] bArr, byte[] bArr2) {
        super(mpiVar, mnbVar);
    }

    public static mrd b(mpi mpiVar, String str) {
        return g(mpiVar, 35632, str);
    }

    public static mrd g(mpi mpiVar, int i, String str) {
        return new mrd(mpiVar, mpo.d(mpiVar, new mrc(i, str)));
    }

    public static mrd h(mpi mpiVar, String str) {
        return g(mpiVar, 35633, str);
    }

    public static mqm i(mpi mpiVar) {
        return new mqm(mpiVar);
    }

    public static mrd k(mpi mpiVar, EGLImage eGLImage) {
        if (eGLImage.a() != 35 && eGLImage.a() != 34) {
            return new mrd(mpiVar, mpo.d(mpiVar, new mph(mpiVar, eGLImage)), null, null);
        }
        mqg mqgVarB = mqg.b(mpiVar, eGLImage);
        mtu mtuVarG = mwp.g(mrf.h(mqgVarB.b, mqgVarB.g(), ((mrb) mqgVarB.f()).b, ((mrb) mqgVarB.f()).c));
        mpi mpiVar2 = ((mrf) mtuVarG.c()).b;
        return new mpg(mpiVar2, mpo.d(mpiVar2, new mpf(mtuVarG, 0)), mqgVarB);
    }

    public static mrd l(mpi mpiVar, final mtu mtuVar, final mme mmeVar) {
        return new mrd(mpiVar, mpiVar.h().e(new mqj() { // from class: mpb
            @Override // defpackage.mqj
            public final String a() {
                String strValueOf = String.valueOf(mmeVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb.append("createCanvasForSurface(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            }
        }, new mlu() { // from class: mpe
            @Override // defpackage.mlu
            public final Object a(Object obj) {
                mtu mtuVar2 = mtuVar;
                mme mmeVar2 = mmeVar;
                mqq mqqVar = (mqq) obj;
                EGLDisplay eGLDisplayF = mqqVar.f();
                mtv mtvVar = new mtv(new mrm(eGLDisplayF, EGL14.eglCreateWindowSurface(eGLDisplayF, mqqVar.d(), mtuVar2.c(), new int[]{12344}, 0)), Arrays.asList(mtuVar2));
                return new mqs(mqqVar.h(), mqqVar.f(), (EGLSurface) mtvVar.c(), mqqVar.e(), mqqVar.d(), mwp.p(mqqVar.l(), mmeVar2), mqqVar, mtvVar);
            }
        }), null, null);
    }

    public static mrd m(mtu mtuVar) {
        mpi mpiVar = ((mrf) mtuVar.c()).b;
        return new mrd(mpiVar, mpo.d(mpiVar, new mpf(mtuVar, 1)), null, null);
    }

    public static mrd n(mpi mpiVar, moq moqVar) {
        return m(mwp.g(mrf.g(mpiVar, moqVar)));
    }

    public final void j(final mtp mtpVar) {
        e(new mqj() { // from class: mpc
            @Override // defpackage.mqj
            public final String a() {
                String strValueOf = String.valueOf(((mtq) mtpVar).a);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
                sb.append("readCanvasInto(");
                sb.append(strValueOf);
                sb.append(")");
                return sb.toString();
            }
        }, new mlu() { // from class: mpd
            @Override // defpackage.mlu
            public final Object a(Object obj) {
                mtp mtpVar2 = mtpVar;
                mqq mqqVar = (mqq) obj;
                mqqVar.i();
                mtu mtuVarC = ((mtq) mtpVar2).c();
                try {
                    mqqVar.j((Buffer) mtuVarC.c());
                    mtuVarC.close();
                    return mlt.a;
                } catch (Throwable th) {
                    try {
                        mtuVarC.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            }
        });
    }
}
