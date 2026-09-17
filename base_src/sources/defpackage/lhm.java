package defpackage;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lhm implements lvq {
    public final vm a;
    private final lvx b;
    private final lzh c;
    private final lis d;
    private final ljf e;

    public lhm(vm vmVar, lvx lvxVar, lzh lzhVar, lis lisVar, ljf ljfVar) {
        lzhVar.getClass();
        ljfVar.getClass();
        this.a = vmVar;
        this.b = lvxVar;
        this.c = lzhVar;
        this.d = lisVar;
        this.e = ljfVar;
    }

    @Override // defpackage.lvq
    public final lvp a(lvs lvsVar) {
        lvsVar.getClass();
        vo voVarA = this.a.a(mip.bw(lvsVar));
        Set setB = voVarA.b();
        HashSet hashSet = new HashSet();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            hashSet.add(lvs.b(((ve) it.next()).a));
        }
        return new lvo(lvsVar, new lho(voVarA), hashSet, this.c, this.e, this.d);
    }

    @Override // defpackage.lvq
    public final lvs b() {
        return (lvs) qmd.t(f());
    }

    @Override // defpackage.lvq
    public final lvs c(int i) {
        return d(String.valueOf(i));
    }

    @Override // defpackage.lvq
    public final lvs d(String str) {
        str.getClass();
        Object obj = null;
        Iterator itA = new qom(new lhl(this, null)).a();
        while (itA.hasNext()) {
            Object next = itA.next();
            if (qno.c(((lvs) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (lvs) obj;
    }

    @Override // defpackage.lvq
    public final lvs e(lwd lwdVar) {
        Object next;
        lwdVar.getClass();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (lhp.a(this.a.a(mip.bw((lvs) next))) == lwdVar) {
                return (lvs) next;
            }
        }
        next = null;
        return (lvs) next;
    }

    public final List f() {
        List listA = this.b.a();
        listA.getClass();
        return listA;
    }

    @Override // defpackage.lvq
    public final List g() {
        return f();
    }

    @Override // defpackage.lvq
    public final List h(lwd lwdVar) {
        lwdVar.getClass();
        List listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (lhp.a(this.a.a(mip.bw((lvs) obj))) == lwdVar) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.lvq
    public final boolean i() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras <= 0) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return false;
                }
                if (i2 >= numberOfCameras) {
                    return true;
                }
                i = i2;
            } catch (RuntimeException e) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002e A[RETURN] */
    @Override // defpackage.lvq
    public final boolean j(lwd lwdVar) {
        lwdVar.getClass();
        for (Object obj : f()) {
            if (lhp.a(this.a.a(mip.bw((lvs) obj))) == lwdVar) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[RETURN] */
    @Override // defpackage.lvq
    public final boolean k() {
        for (Object obj : f()) {
            vm vmVar = this.a;
            String str = ((lvs) obj).a;
            str.getClass();
            vo voVarA = vmVar.a(str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) voVarA.a(key);
            if (iArr == null) {
                iArr = lhp.a;
            }
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                if (iArr[i] == 9) {
                    if (i < 0) {
                        break;
                    }
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
