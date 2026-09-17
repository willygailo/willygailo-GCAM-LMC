package defpackage;

import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes2.dex */
class owx extends owo {
    @Override // defpackage.owo
    public ous a(Class cls, int i) {
        return ous.a;
    }

    @Override // defpackage.owo
    public String b(Class cls) {
        StackTraceElement stackTraceElementA;
        if (owz.a) {
            try {
                if (cls.equals(owz.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable th) {
            }
        }
        if (!owz.b || (stackTraceElementA = oyb.a(cls)) == null) {
            return null;
        }
        return stackTraceElementA.getClassName();
    }
}
