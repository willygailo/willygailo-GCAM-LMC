package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class glx implements phh {
    final /* synthetic */ glz a;

    public glx(glz glzVar) {
        this.a = glzVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gls glsVar = (gls) obj;
        glsVar.getClass();
        for (glu gluVar : this.a.a) {
            ArrayList arrayList = new ArrayList();
            Iterator it = gluVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    lis lisVar = gluVar.c;
                    String strValueOf = String.valueOf(arrayList);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 51);
                    sb.append("ImageSaverTrace does not match any valid strategy: ");
                    sb.append(strValueOf);
                    lisVar.d(sb.toString());
                    lis lisVar2 = gluVar.c;
                    String strValueOf2 = String.valueOf(glsVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 8);
                    sb2.append("Trace = ");
                    sb2.append(strValueOf2);
                    lisVar2.d(sb2.toString());
                    if (gluVar.d == dei.RELEASE) {
                        break;
                    }
                    String strValueOf3 = String.valueOf(glsVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 62);
                    sb3.append("Image Saver Trace did not match any valid ImageSaverStrategy: ");
                    sb3.append(strValueOf3);
                    gluVar.b.execute(new glt(new IllegalStateException(sb3.toString()), 0));
                    break;
                }
                gmi gmiVarA = ((glr) it.next()).a(glsVar);
                arrayList.add(gmiVarA);
                if (gmiVarA.b.isEmpty()) {
                    lis lisVar3 = gluVar.c;
                    String str = gmiVarA.a;
                    lisVar3.f(str.length() != 0 ? "Valid image created:".concat(str) : new String("Valid image created:"));
                    break;
                }
            }
        }
    }
}
