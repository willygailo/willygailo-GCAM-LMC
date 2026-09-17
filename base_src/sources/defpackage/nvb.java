package defpackage;

import android.content.ContentResolver;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import j$.util.DesugarArrays;
import j$.util.function.Consumer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nvb {
    public final Map a;

    public nvb() {
        this.a = new HashMap();
    }

    public nvb(ContentResolver contentResolver) {
        this.a = kzv.d(contentResolver, "camera:");
    }

    public nvb(Map map) {
        this.a = map;
    }

    public nvb(nvb nvbVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = Collections.unmodifiableMap(new HashMap(nvbVar.a));
    }

    public nvb(byte[] bArr) {
        this.a = new TreeMap();
    }

    public nvb(byte[] bArr, byte[] bArr2) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.a = new HashMap();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                if (supportedTypes.length <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                } else {
                    for (String str : supportedTypes) {
                        if (!this.a.containsKey(str)) {
                            this.a.put(str, mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }

    public nvb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public nvb(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new HashMap();
    }

    public nvb(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public nvb(char[] cArr) {
        this.a = new HashMap();
    }

    public nvb(char[] cArr, byte[] bArr) {
        EnumMap enumMap = new EnumMap(cqj.class);
        this.a = enumMap;
        final byte[] bArr2 = null;
        DesugarArrays.stream(cqj.values()).forEach(new Consumer(bArr2, bArr2, bArr2) { // from class: cpq
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                this.a.a.put((cqj) obj, Float.valueOf(1.0f));
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        enumMap.put(cqj.LOCKED, Float.valueOf(2.0f));
    }

    public nvb(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public nvb(short[] sArr) {
        HashMap map = new HashMap();
        this.a = map;
        map.put(gtv.UNKNOWN, pde.UNKNOWN);
        map.put(gtv.TIMER_ZERO_SECONDS, pde.TIMER_ZERO_SECONDS);
        map.put(gtv.TIMER_THREE_SECONDS, pde.TIMER_THREE_SECONDS);
        map.put(gtv.TIMER_TEN_SECONDS, pde.TIMER_TEN_SECONDS);
        map.put(gtv.TIMER_AUTO, pde.TIMER_AUTO);
        map.put(gtv.HDR_AUTO, pde.HDR_AUTO);
        map.put(gtv.HDR_ON, pde.HDR_ON);
        map.put(gtv.HDR_OFF, pde.HDR_OFF);
        map.put(gtv.HDR_READY, pde.HDR_READY);
        map.put(gtv.PHOTO_FLASH_ON, pde.PHOTO_FLASH_ON);
        map.put(gtv.PHOTO_FLASH_OFF, pde.PHOTO_FLASH_OFF);
        map.put(gtv.PHOTO_FLASH_AUTO, pde.PHOTO_FLASH_AUTO);
        map.put(gtv.PHOTO_FLASH_NS, pde.PHOTO_FLASH_NS);
        map.put(gtv.PHOTO_FLASH_GRAYED, pde.PHOTO_FLASH_GRAYED);
        map.put(gtv.PHOTO_FLASH_UNGRAYED, pde.PHOTO_FLASH_UNGRAYED);
        map.put(gtv.VIDEO_FLASH_ON, pde.VIDEO_FLASH_ON);
        map.put(gtv.VIDEO_FLASH_OFF, pde.VIDEO_FLASH_OFF);
        map.put(gtv.MICROVIDEO_ON, pde.MICROVIDEO_ON);
        map.put(gtv.MICROVIDEO_AUTO, pde.MICROVIDEO_AUTO);
        map.put(gtv.MICROVIDEO_OFF, pde.MICROVIDEO_OFF);
        map.put(gtv.MIC_INPUT_EXT_BLUETOOTH, pde.MIC_INPUT_EXT_BLUETOOTH);
        map.put(gtv.MIC_INPUT_EXT_WIRED, pde.MIC_INPUT_EXT_WIRED);
        map.put(gtv.MIC_INPUT_PHONE, pde.MIC_INPUT_PHONE);
        map.put(gtv.FPS_AUTO, pde.FPS_AUTO);
        map.put(gtv.FPS_24, pde.FPS_24);
        map.put(gtv.FPS_30, pde.FPS_30);
        map.put(gtv.FPS_60, pde.FPS_60);
        map.put(gtv.BEAUTIFICATION_ON_LIGHT, pde.BEAUTIFICATION_ON_LIGHT);
        map.put(gtv.BEAUTIFICATION_ON_STRONG, pde.BEAUTIFICATION_ON_STRONG);
        map.put(gtv.BEAUTIFICATION_OFF, pde.BEAUTIFICATION_OFF);
        map.put(gtv.MAKEUP_MAKEUP1, pde.UNKNOWN);
        map.put(gtv.MAKEUP_MAKEUP2, pde.UNKNOWN);
        map.put(gtv.MAKEUP_MAKEUP3, pde.UNKNOWN);
        map.put(gtv.MAKEUP_OFF, pde.UNKNOWN);
        map.put(gtv.AF_ON, pde.AF_ON);
        map.put(gtv.AF_ON_LOCKED, pde.AF_ON_LOCKED);
        map.put(gtv.AF_OFF_NEAR, pde.AF_OFF_NEAR);
        map.put(gtv.AF_OFF_FAR, pde.AF_OFF_FAR);
        map.put(gtv.AF_OFF_INFINITY, pde.AF_OFF_INFINITY);
        map.put(gtv.IMAX_AUDIO_ON, pde.IMAX_AUDIO_ON);
        map.put(gtv.IMAX_AUDIO_OFF, pde.IMAX_AUDIO_OFF);
        map.put(gtv.SELECTED, pde.SELECTED);
        map.put(gtv.UNSELECTED, pde.UNSELECTED);
        map.put(gtv.HORIZONTAL_PHOTO_SPHERE, pde.HORIZONTAL_PHOTO_SPHERE);
        map.put(gtv.VERTICAL_PHOTO_SPHERE, pde.VERTICAL_PHOTO_SPHERE);
        map.put(gtv.WIDE_ANGLE_PHOTO_SPHERE, pde.WIDE_ANGLE_PHOTO_SPHERE);
        map.put(gtv.FISH_EYE_PHOTO_SPHERE, pde.FISH_EYE_PHOTO_SPHERE);
        map.put(gtv.PHOTO_SPHERE, pde.PHOTO_SPHERE);
        map.put(gtv.ASPECT_RATIO_SIXTEEN_BY_NINE, pde.ASPECT_RATIO_SIXTEEN_BY_NINE);
        map.put(gtv.ASPECT_RATIO_FOUR_BY_THREE, pde.ASPECT_RATIO_FOUR_BY_THREE);
        map.put(gtv.ASPECT_RATIO_THREE_BY_FOUR, pde.ASPECT_RATIO_THREE_BY_FOUR);
        map.put(gtv.RES_2160P, pde.RES_2160P);
        map.put(gtv.RES_1080P, pde.RES_1080P);
        map.put(gtv.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE, pde.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE);
        map.put(gtv.VIDEO_ASPECT_RATIO_THREE_BY_FOUR, pde.VIDEO_ASPECT_RATIO_THREE_BY_FOUR);
        map.put(gtv.ASTRO_OFF, pde.ASTRO_OFF);
        map.put(gtv.ASTRO_AUTO, pde.ASTRO_AUTO);
        map.put(gtv.SWISS_OFF, pde.SWISS_OFF);
        map.put(gtv.SWISS_ON, pde.SWISS_ON);
        map.put(gtv.LASAGNA_TR_SMALL, pde.LASAGNA_TR_SMALL);
        map.put(gtv.LASAGNA_TR_MEDIUM, pde.LASAGNA_TR_MEDIUM);
        map.put(gtv.LASAGNA_TR_LARGE, pde.LASAGNA_TR_LARGE);
        map.put(gtv.FLOUNDER_OFF, pde.FLOUNDER_OFF);
        map.put(gtv.FLOUNDER_ON, pde.FLOUNDER_ON);
        map.put(gtv.COCKTAIL_PARTY_OFF, pde.COCKTAIL_PARTY_OFF);
        map.put(gtv.COCKTAIL_PARTY_ON, pde.COCKTAIL_PARTY_ON);
    }

    public nvb(short[] sArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public final synchronized void a(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public final String b(Uri uri, String str, String str2) {
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        if (str != null) {
            String strValueOf = String.valueOf(str2);
            str2 = strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str);
        }
        return (String) map.get(str2);
    }

    public final boolean c() {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.a.get("video/hevc");
        return mediaCodecInfo != null && mediaCodecInfo.isHardwareAccelerated();
    }

    public final void d(IBinder iBinder) {
        kyo kyoVar;
        synchronized (this.a) {
            if (iBinder == null) {
                kyoVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                kyoVar = iInterfaceQueryLocalInterface instanceof kyo ? (kyo) iInterfaceQueryLocalInterface : new kyo(iBinder);
            }
            kzo kzoVar = new kzo();
            for (Map.Entry entry : this.a.entrySet()) {
                kzs kzsVar = (kzs) entry.getValue();
                try {
                    kyoVar.e(kzoVar, new kwx(kzsVar));
                } catch (RemoteException e) {
                    String strValueOf = String.valueOf(entry.getKey());
                    String strValueOf2 = String.valueOf(kzsVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32 + String.valueOf(strValueOf2).length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(strValueOf);
                    sb.append("/");
                    sb.append(strValueOf2);
                    Log.w("WearableClient", sb.toString());
                }
            }
        }
    }

    public final synchronized float e(jti jtiVar, float f) {
        float f2;
        float f3;
        boolean z = true;
        obr.aF(f >= 0.0f);
        this.a.put(jtiVar, Float.valueOf(f));
        f2 = 0.0f;
        f3 = 0.0f;
        for (Map.Entry entry : this.a.entrySet()) {
            jti jtiVar2 = (jti) entry.getKey();
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            float f4 = jtiVar2.a;
            f3 += fFloatValue * f4;
            f2 += f4;
        }
        if (f2 <= 0.0f) {
            z = false;
        }
        obr.aR(z, "No progress to calculate");
        return f3 / f2;
    }

    public final synchronized ede f(hsp hspVar) {
        ede edeVarO;
        edeVarO = (ede) this.a.get(hspVar);
        if (edeVarO == null) {
            edeVarO = edf.o();
            this.a.put(hspVar, edeVarO);
        }
        return edeVarO;
    }

    public final edf g(hsp hspVar) {
        ede edeVarO = (ede) this.a.remove(hspVar);
        if (edeVarO == null) {
            edeVarO = edf.o();
        }
        opc opcVar = edeVarO.a;
        if (opcVar != null) {
            edeVarO.b = opcVar.f();
        } else if (edeVarO.b == null) {
            edeVarO.b = orx.a;
        }
        opc opcVar2 = edeVarO.c;
        if (opcVar2 != null) {
            edeVarO.d = opcVar2.f();
        } else if (edeVarO.d == null) {
            edeVarO.d = orx.a;
        }
        opc opcVar3 = edeVarO.e;
        if (opcVar3 != null) {
            edeVarO.f = opcVar3.f();
        } else if (edeVarO.f == null) {
            edeVarO.f = orx.a;
        }
        opc opcVar4 = edeVarO.g;
        if (opcVar4 != null) {
            edeVarO.h = opcVar4.f();
        } else if (edeVarO.h == null) {
            edeVarO.h = orx.a;
        }
        opc opcVar5 = edeVarO.i;
        if (opcVar5 != null) {
            edeVarO.j = opcVar5.f();
        } else if (edeVarO.j == null) {
            edeVarO.j = orx.a;
        }
        opc opcVar6 = edeVarO.k;
        if (opcVar6 != null) {
            edeVarO.l = opcVar6.f();
        } else if (edeVarO.l == null) {
            edeVarO.l = orx.a;
        }
        opc opcVar7 = edeVarO.m;
        if (opcVar7 != null) {
            edeVarO.n = opcVar7.f();
        } else if (edeVarO.n == null) {
            edeVarO.n = orx.a;
        }
        opc opcVar8 = edeVarO.o;
        if (opcVar8 != null) {
            edeVarO.p = opcVar8.f();
        } else if (edeVarO.p == null) {
            edeVarO.p = orx.a;
        }
        opc opcVar9 = edeVarO.q;
        if (opcVar9 != null) {
            edeVarO.r = opcVar9.f();
        } else if (edeVarO.r == null) {
            edeVarO.r = orx.a;
        }
        opc opcVar10 = edeVarO.s;
        if (opcVar10 != null) {
            edeVarO.t = opcVar10.f();
        } else if (edeVarO.t == null) {
            edeVarO.t = orx.a;
        }
        opc opcVar11 = edeVarO.u;
        if (opcVar11 != null) {
            edeVarO.v = opcVar11.f();
        } else if (edeVarO.v == null) {
            edeVarO.v = orx.a;
        }
        opc opcVar12 = edeVarO.w;
        if (opcVar12 != null) {
            edeVarO.x = opcVar12.f();
        } else if (edeVarO.x == null) {
            edeVarO.x = orx.a;
        }
        opc opcVar13 = edeVarO.y;
        if (opcVar13 != null) {
            edeVarO.z = opcVar13.f();
        } else if (edeVarO.z == null) {
            edeVarO.z = orx.a;
        }
        opc opcVar14 = edeVarO.A;
        if (opcVar14 != null) {
            edeVarO.B = opcVar14.f();
        } else if (edeVarO.B == null) {
            edeVarO.B = orx.a;
        }
        return new edf(edeVarO.b, edeVarO.d, edeVarO.f, edeVarO.h, edeVarO.j, edeVarO.l, edeVarO.n, edeVarO.p, edeVarO.r, edeVarO.t, edeVarO.v, edeVarO.x, edeVarO.z, edeVarO.B);
    }

    public final String h(String str) {
        return (String) this.a.get(str.length() != 0 ? "camera:".concat(str) : new String("camera:"));
    }

    public final float i() {
        return 1.0f / ((Float) this.a.get(cqj.ACTIVE)).floatValue();
    }

    public final float j(cqj cqjVar) {
        Float f = (Float) this.a.get(cqjVar);
        f.getClass();
        return f.floatValue();
    }

    public final lap k(cms cmsVar) {
        if (this.a.containsKey(cmsVar)) {
            return (lap) this.a.get(cmsVar);
        }
        lap lapVar = new lap();
        this.a.put(cmsVar, lapVar);
        return lapVar;
    }

    public final void l(cms cmsVar) {
        lap lapVar = (lap) this.a.remove(cmsVar);
        if (lapVar != null) {
            lapVar.close();
        }
    }

    public final boolean m(Class cls) {
        return this.a.containsKey(cls);
    }
}
