package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qls implements Serializable, qlh, qlv {
    private final qlh completion;

    public qls(qlh qlhVar) {
        this.completion = qlhVar;
    }

    public qlh create(Object obj, qlh qlhVar) {
        qlhVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public qlh create(qlh qlhVar) {
        qlhVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.qlv
    public qlv getCallerFrame() {
        qlh qlhVar = this.completion;
        if (true != (qlhVar instanceof qlv)) {
            qlhVar = null;
        }
        return (qlv) qlhVar;
    }

    public final qlh getCompletion() {
        return this.completion;
    }

    @Override // defpackage.qlv
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strB;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        qlw qlwVar = (qlw) getClass().getAnnotation(qlw.class);
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (qlwVar == null) {
            return null;
        }
        int iA = qlwVar.a();
        if (iA > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iA + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.getClass();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception e) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? qlwVar.e()[iIntValue] : -1;
        qlx qlxVar = qly.b;
        if (qlxVar == null) {
            try {
                qlx qlxVar2 = new qlx(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                qly.b = qlxVar2;
                qlxVar = qlxVar2;
            } catch (Exception e2) {
                qlxVar = qly.a;
                qly.b = qlxVar;
            }
        }
        if (qlxVar != qly.a && (method = qlxVar.a) != null && (objInvoke = method.invoke(getClass(), new Object[0])) != null && (method2 = qlxVar.b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = qlxVar.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            str = (String) (true == (objInvoke3 instanceof String) ? objInvoke3 : null);
        }
        if (str == null) {
            strB = qlwVar.b();
        } else {
            strB = str + '/' + qlwVar.b();
        }
        return new StackTraceElement(strB, qlwVar.d(), qlwVar.c(), i);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // defpackage.qlh
    public final void resumeWith(Object obj) {
        qls qlsVar = this;
        while (true) {
            qlh qlhVar = qlsVar.completion;
            qlhVar.getClass();
            try {
                obj = qlsVar.invokeSuspend(obj);
                if (obj == qlp.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = qmd.L(th);
            }
            qlsVar.releaseIntercepted();
            if (!(qlhVar instanceof qls)) {
                qlhVar.resumeWith(obj);
                return;
            }
            qlsVar = (qls) qlhVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
