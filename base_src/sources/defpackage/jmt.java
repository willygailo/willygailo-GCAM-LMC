package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.WindowManager;
import com.Fix.Pref;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class jmt implements jni {
    private static final ouj a = ouj.h("com/google/android/apps/camera/ui/viewfinder/DefaultViewfinderSizeSelector");
    private final lig b;
    private final ddf c;
    private final String d;

    public jmt(WindowManager windowManager, ddf ddfVar) {
        Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        this.b = new lig(point.x, point.y);
        this.c = ddfVar;
        this.d = "video/avc";
    }

    final lig a(List list, double d) {
        list.getClass();
        obr.aF(!list.isEmpty());
        lig ligVar = this.b;
        int iMin = Math.min(ligVar.a, ligVar.b);
        int i = -1;
        int i2 = -1;
        double d2 = Double.MAX_VALUE;
        for (int i3 = 0; i3 < list.size(); i3++) {
            lig ligVar2 = (lig) list.get(i3);
            double d3 = ligVar2.a;
            double d4 = ligVar2.b;
            Double.isNaN(d3);
            Double.isNaN(d4);
            if (Math.abs((d3 / d4) - d) <= 0.02d) {
                double dAbs = Math.abs(ligVar2.b - iMin);
                if (dAbs < d2 || (dAbs == d2 && ligVar2.b < iMin)) {
                    d2 = dAbs;
                    i2 = i3;
                }
            }
        }
        if (i2 == -1) {
            ((oug) ((oug) a.c()).G((char) 3442)).r("No preview size match the aspect ratio. available sizes: %s", list);
            double dAbs2 = Double.MAX_VALUE;
            for (int i4 = 0; i4 < list.size(); i4++) {
                lig ligVar3 = (lig) list.get(i4);
                if (Math.abs(ligVar3.b - iMin) < dAbs2) {
                    dAbs2 = Math.abs(ligVar3.b - iMin);
                    i = i4;
                }
            }
            i2 = i;
        }
        obr.aQ(i2 >= 0);
        return (lig) list.get(i2);
    }

    @Override // defpackage.jni
    public lig b(List list, double d, lwd lwdVar, jrl jrlVar, lvs lvsVar) {
        MediaCodecInfo mediaCodecInfo;
        list.getClass();
        obr.aF(!list.isEmpty());
        if (jrlVar != jrl.VIDEO && jrlVar != jrl.VIDEO_INTENT) {
            String strI = lwdVar == lwd.FRONT ? this.c.i(ddl.S) : this.c.i(ddl.R);
            strI.getClass();
            list = mip.eU(list, strI);
        }
        boolean zK = this.c.k(ddm.X);
        int iMax = Pref.MenuValue("pref_vfres_key") == 0 ? 480 : 1080;
        if (zK) {
            ojc ojcVarA = this.c.a(ddm.p);
            this.c.d();
            if (ojcVarA.g()) {
                iMax = ((Integer) ojcVarA.c()).intValue();
            }
            iMax = Math.max(iMax, 0);
        }
        ArrayList<lig> arrayList = new ArrayList();
        for (lig ligVar : list) {
            int i = ligVar.b;
            if (i <= iMax) {
                arrayList.add(new lig(ligVar.a, i));
            }
        }
        String str = this.d;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i2 = 0;
        loop1: while (true) {
            if (i2 >= length) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = codecInfos[i2];
            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                if (str2.equals(str) && mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                    break loop1;
                }
            }
            i2++;
        }
        if (mediaCodecInfo == null) {
            ((oug) ((oug) a.c()).G((char) 3444)).r("No codec info found for codec '%s'! Will not filter preview sizes!", str);
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
            ArrayList arrayList2 = new ArrayList();
            for (lig ligVar2 : arrayList) {
                if (videoCapabilities.isSizeSupported(ligVar2.a, ligVar2.b)) {
                    arrayList2.add(ligVar2);
                }
            }
            arrayList = arrayList2;
        }
        return a(arrayList, d);
    }
}
