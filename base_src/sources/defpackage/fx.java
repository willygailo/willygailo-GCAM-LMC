package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class fx {
    static int a(View view) {
        return view.getImportantForAccessibility();
    }

    static int b(View view) {
        return view.getMinimumHeight();
    }

    static int c(View view) {
        return view.getMinimumWidth();
    }

    static int d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    static void e(View view) {
        view.postInvalidateOnAnimation();
    }

    static void f(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    static void g(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    static void h(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    static void i(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    static boolean j(View view) {
        return view.getFitsSystemWindows();
    }

    static boolean k(View view) {
        return view.hasTransientState();
    }

    public static gy l(gr grVar) {
        gy gyVarL = gy.l(grVar.a.build());
        gyVarL.p(null);
        return gyVarL;
    }

    @Deprecated
    public static void m(el elVar, gr grVar) {
        grVar.a.setSystemWindowInsets(elVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, qrg] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static Object n(aii aiiVar, qlh qlhVar) {
        aim aimVar;
        Object obj;
        ?? r5;
        if (qlhVar instanceof aim) {
            aimVar = (aim) qlhVar;
            int i = aimVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aimVar.d = i - Integer.MIN_VALUE;
            } else {
                aimVar = new aim(qlhVar);
            }
        } else {
            aimVar = new aim(qlhVar);
        }
        Object obj2 = aimVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (aimVar.d) {
            case 0:
                qmd.M(obj2);
                qrj qrjVarZ = qno.z();
                qrg qrgVar = (qrg) aimVar.getContext().get(qrg.c);
                if (qrgVar != null) {
                    qrgVar.o(new ain(qrjVarZ));
                }
                Executor executor = aiiVar.b;
                executor.getClass();
                aimVar.a = aiiVar;
                aimVar.b = qrjVarZ;
                aimVar.d = 1;
                Object objQ = q(executor, qrjVarZ, aimVar);
                if (objQ == qlpVar) {
                    return qlpVar;
                }
                obj = aiiVar;
                r5 = qrjVarZ;
                obj2 = objQ;
                break;
                break;
            case 1:
                Object obj3 = aimVar.b;
                obj = aimVar.a;
                qmd.M(obj2);
                r5 = obj3;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qlj qljVar = (qlj) obj2;
        aiz aizVar = new aiz(r5, qljVar);
        return qljVar.plus(aizVar).plus(new qvu(new Integer(System.identityHashCode(r5)), ((aii) obj).i));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[PHI: r7
      0x0072: PHI (r7v12 java.lang.Object) = (r7v9 java.lang.Object), (r7v1 java.lang.Object) binds: [B:22:0x006f, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [qmu] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static Object o(aii aiiVar, qmu qmuVar, qlh qlhVar) throws Throwable {
        aio aioVar;
        qln qlnVar;
        ?? r6;
        Object obj;
        Object obj2;
        Object obj3;
        if (qlhVar instanceof aio) {
            aioVar = (aio) qlhVar;
            int i = aioVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aioVar.d = i - Integer.MIN_VALUE;
            } else {
                aioVar = new aio(qlhVar);
            }
        } else {
            aioVar = new aio(qlhVar);
        }
        Object objN = aioVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (aioVar.d) {
            case 0:
                qmd.M(objN);
                aiz aizVar = (aiz) aioVar.getContext().get(aiz.c);
                if (aizVar == null) {
                    aioVar.a = aiiVar;
                    aioVar.b = qmuVar;
                    aioVar.d = 1;
                    objN = n(aiiVar, aioVar);
                    if (objN == qlpVar) {
                        obj3 = aiiVar;
                        obj2 = qmuVar;
                        return qlpVar;
                    }
                    obj3 = aiiVar;
                    obj2 = qmuVar;
                    qlnVar = (qln) objN;
                    obj = obj3;
                    r6 = obj2;
                } else {
                    qlnVar = aizVar.a;
                    obj = aiiVar;
                    r6 = qmuVar;
                }
                aip aipVar = new aip((aii) obj, r6, null);
                aioVar.a = null;
                aioVar.b = null;
                aioVar.d = 2;
                objN = qmd.k(qlnVar, aipVar, aioVar);
                if (objN == qlpVar) {
                    return qlpVar;
                }
                return objN;
            case 1:
                Object obj4 = aioVar.b;
                Object obj5 = aioVar.a;
                qmd.M(objN);
                obj2 = obj4;
                obj3 = obj5;
                obj3 = aiiVar;
                obj2 = qmuVar;
                qlnVar = (qln) objN;
                obj = obj3;
                r6 = obj2;
                aip aipVar2 = new aip((aii) obj, r6, null);
                aioVar.a = null;
                aioVar.b = null;
                aioVar.d = 2;
                objN = qmd.k(qlnVar, aipVar2, aioVar);
                if (objN == qlpVar) {
                    return qlpVar;
                }
                return objN;
            case 2:
                qmd.M(objN);
                return objN;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static Object q(Executor executor, qrg qrgVar, qlh qlhVar) {
        qpo qpoVar = new qpo(qmd.c(qlhVar), 1);
        qpoVar.r();
        qpoVar.a(new aij(qrgVar));
        try {
            executor.execute(new ail(qpoVar, qrgVar));
        } catch (RejectedExecutionException e) {
            qpoVar.c(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objG = qpoVar.g();
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        return objG;
    }

    public void p(ajy ajyVar) {
    }
}
