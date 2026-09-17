package defpackage;

import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mgq extends LinkConfig {
    private final Boolean A;
    private final ByteBuffer B;
    private final Boolean C;
    private final ByteBuffer D;
    private final Boolean E;
    private final Boolean F;
    private final Boolean G;
    private final mie H;
    private final Boolean I;
    public final mhy a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;
    private final List g;
    private final Integer h;
    private final Integer i;
    private final Boolean j;
    private final boolean k;
    private final boolean l;
    private final Integer m;
    private final Boolean n;
    private final Map o;
    private final Boolean p;
    private final Boolean q;
    private final Boolean r;
    private final Boolean s;
    private final Integer t;
    private final Boolean u;
    private final Long v;
    private final Boolean w;
    private final Boolean x;
    private final mhz y;
    private final Long z;

    public mgq(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list, Integer num, Integer num2, Boolean bool6, boolean z, boolean z2, Integer num3, Boolean bool7, Map map, Boolean bool8, Boolean bool9, Boolean bool10, mhy mhyVar, Boolean bool11, Integer num4, Boolean bool12, Long l, Boolean bool13, Boolean bool14, mhz mhzVar, Long l2, Boolean bool15, ByteBuffer byteBuffer, Boolean bool16, ByteBuffer byteBuffer2, Boolean bool17, Boolean bool18, Boolean bool19, mie mieVar, Boolean bool20) {
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = list;
        this.h = num;
        this.i = num2;
        this.j = bool6;
        this.k = z;
        this.l = z2;
        this.m = num3;
        this.n = bool7;
        this.o = map;
        this.p = bool8;
        this.q = bool9;
        this.r = bool10;
        this.a = mhyVar;
        this.s = bool11;
        this.t = num4;
        this.u = bool12;
        this.v = l;
        this.w = bool13;
        this.x = bool14;
        this.y = mhzVar;
        this.z = l2;
        this.A = bool15;
        this.B = byteBuffer;
        this.C = bool16;
        this.D = byteBuffer2;
        this.E = bool17;
        this.F = bool18;
        this.G = bool19;
        this.H = mieVar;
        this.I = bool20;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final boolean aiAiShoppingDetectionEnabled() {
        return this.k;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final boolean aiAiTranslateDetectionEnabled() {
        return this.l;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean apparelDetectionEnabled() {
        return this.j;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    @Deprecated
    public final Integer apparelMode() {
        return null;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean barcodeEnabled() {
        return this.w;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean documentScanningEnabled() {
        return this.r;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Integer dutyCycleMode() {
        return this.t;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final mhy dynamicLoadingMode() {
        return this.a;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean embedderModeEnabled() {
        return this.G;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Boolean bool;
        Integer num3;
        Boolean bool2;
        Map map;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Integer num4;
        Boolean bool7;
        Long l;
        Boolean bool8;
        Boolean bool9;
        mhz mhzVar;
        Long l2;
        Boolean bool10;
        ByteBuffer byteBuffer;
        Boolean bool11;
        ByteBuffer byteBuffer2;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        mie mieVar;
        Boolean bool15;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkConfig)) {
            return false;
        }
        LinkConfig linkConfig = (LinkConfig) obj;
        Boolean bool16 = this.b;
        if (bool16 != null ? bool16.equals(linkConfig.wifiConnectionEnabled()) : linkConfig.wifiConnectionEnabled() == null) {
            Boolean bool17 = this.c;
            if (bool17 != null ? bool17.equals(linkConfig.wifiScanEnabled()) : linkConfig.wifiScanEnabled() == null) {
                Boolean bool18 = this.d;
                if (bool18 != null ? bool18.equals(linkConfig.sceneDetectionEnabled()) : linkConfig.sceneDetectionEnabled() == null) {
                    Boolean bool19 = this.e;
                    if (bool19 != null ? bool19.equals(linkConfig.freeTextCopyEnabled()) : linkConfig.freeTextCopyEnabled() == null) {
                        Boolean bool20 = this.f;
                        if (bool20 != null ? bool20.equals(linkConfig.foreignLanguageDetectionEnabled()) : linkConfig.foreignLanguageDetectionEnabled() == null) {
                            List list = this.g;
                            if (list != null ? list.equals(linkConfig.supportedTranslateLanguages()) : linkConfig.supportedTranslateLanguages() == null) {
                                if (linkConfig.productDetectionEnabled() == null && linkConfig.productMode() == null && linkConfig.productIndex() == null && ((num = this.h) != null ? num.equals(linkConfig.processorMode()) : linkConfig.processorMode() == null) && linkConfig.textSelectionEnabled() == null && ((num2 = this.i) != null ? num2.equals(linkConfig.triggerMode()) : linkConfig.triggerMode() == null) && ((bool = this.j) != null ? bool.equals(linkConfig.apparelDetectionEnabled()) : linkConfig.apparelDetectionEnabled() == null) && linkConfig.apparelMode() == null && this.k == linkConfig.aiAiShoppingDetectionEnabled() && this.l == linkConfig.aiAiTranslateDetectionEnabled() && ((num3 = this.m) != null ? num3.equals(linkConfig.processorImagePoolSize()) : linkConfig.processorImagePoolSize() == null) && ((bool2 = this.n) != null ? bool2.equals(linkConfig.nonEnPersonNameDetectionEnabled()) : linkConfig.nonEnPersonNameDetectionEnabled() == null) && ((map = this.o) != null ? map.equals(linkConfig.sceneClassificationMap()) : linkConfig.sceneClassificationMap() == null) && ((bool3 = this.p) != null ? bool3.equals(linkConfig.legacyPixelParity()) : linkConfig.legacyPixelParity() == null) && ((bool4 = this.q) != null ? bool4.equals(linkConfig.pixelChipMode()) : linkConfig.pixelChipMode() == null) && ((bool5 = this.r) != null ? bool5.equals(linkConfig.documentScanningEnabled()) : linkConfig.documentScanningEnabled() == null) && this.a.equals(linkConfig.dynamicLoadingMode()) && linkConfig.minimumDynamicLoadingHostVersion() == null && ((bool6 = this.s) != null ? bool6.equals(linkConfig.gleamEngineEnabled()) : linkConfig.gleamEngineEnabled() == null) && ((num4 = this.t) != null ? num4.equals(linkConfig.dutyCycleMode()) : linkConfig.dutyCycleMode() == null) && ((bool7 = this.u) != null ? bool7.equals(linkConfig.modelDownloadEnabled()) : linkConfig.modelDownloadEnabled() == null) && ((l = this.v) != null ? l.equals(linkConfig.modelDownloadCheckTimeoutMs()) : linkConfig.modelDownloadCheckTimeoutMs() == null) && ((bool8 = this.w) != null ? bool8.equals(linkConfig.barcodeEnabled()) : linkConfig.barcodeEnabled() == null) && ((bool9 = this.x) != null ? bool9.equals(linkConfig.lens2020ModeEnabled()) : linkConfig.lens2020ModeEnabled() == null) && ((mhzVar = this.y) != null ? mhzVar.equals(linkConfig.lens2020Params()) : linkConfig.lens2020Params() == null) && ((l2 = this.z) != null ? l2.equals(linkConfig.trivialFeatureEnabledBits()) : linkConfig.trivialFeatureEnabledBits() == null) && ((bool10 = this.A) != null ? bool10.equals(linkConfig.pdpTextExtractionEnabled()) : linkConfig.pdpTextExtractionEnabled() == null) && ((byteBuffer = this.B) != null ? byteBuffer.equals(linkConfig.linkEvalConfigMetadata()) : linkConfig.linkEvalConfigMetadata() == null) && ((bool11 = this.C) != null ? bool11.equals(linkConfig.linkModelDownloadEnabled()) : linkConfig.linkModelDownloadEnabled() == null) && ((byteBuffer2 = this.D) != null ? byteBuffer2.equals(linkConfig.serializedPipelineConfig()) : linkConfig.serializedPipelineConfig() == null) && ((bool12 = this.E) != null ? bool12.equals(linkConfig.lightweightSuggestionsModeEnabled()) : linkConfig.lightweightSuggestionsModeEnabled() == null) && ((bool13 = this.F) != null ? bool13.equals(linkConfig.stopPipelineOnPause()) : linkConfig.stopPipelineOnPause() == null) && ((bool14 = this.G) != null ? bool14.equals(linkConfig.embedderModeEnabled()) : linkConfig.embedderModeEnabled() == null) && ((mieVar = this.H) != null ? mieVar.equals(linkConfig.mobileRaidParams()) : linkConfig.mobileRaidParams() == null) && ((bool15 = this.I) != null ? bool15.equals(linkConfig.waitForVkpStartEnabled()) : linkConfig.waitForVkpStartEnabled() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean foreignLanguageDetectionEnabled() {
        return this.f;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean freeTextCopyEnabled() {
        return this.e;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean gleamEngineEnabled() {
        return this.s;
    }

    public final int hashCode() {
        int iB;
        int iB2;
        Boolean bool = this.b;
        int iHashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.c;
        int iHashCode2 = (iHashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.e;
        int iHashCode4 = (iHashCode3 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.f;
        int iHashCode5 = (iHashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        List list = this.g;
        int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1525764945;
        Integer num = this.h;
        int iHashCode7 = (iHashCode6 ^ (num == null ? 0 : num.hashCode())) * (-721379959);
        Integer num2 = this.i;
        int iHashCode8 = (iHashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Boolean bool6 = this.j;
        int iHashCode9 = (((((iHashCode8 ^ (bool6 == null ? 0 : bool6.hashCode())) * (-721379959)) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003;
        Integer num3 = this.m;
        int iHashCode10 = (iHashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Boolean bool7 = this.n;
        int iHashCode11 = (iHashCode10 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Map map = this.o;
        int iHashCode12 = (iHashCode11 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        Boolean bool8 = this.p;
        int iHashCode13 = (iHashCode12 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.q;
        int iHashCode14 = (iHashCode13 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.r;
        int iHashCode15 = (((iHashCode14 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003) ^ this.a.hashCode()) * (-721379959);
        Boolean bool11 = this.s;
        int iHashCode16 = (iHashCode15 ^ (bool11 == null ? 0 : bool11.hashCode())) * 1000003;
        Integer num4 = this.t;
        int iHashCode17 = (iHashCode16 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Boolean bool12 = this.u;
        int iHashCode18 = (iHashCode17 ^ (bool12 == null ? 0 : bool12.hashCode())) * 1000003;
        Long l = this.v;
        int iHashCode19 = (iHashCode18 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool13 = this.w;
        int iHashCode20 = (iHashCode19 ^ (bool13 == null ? 0 : bool13.hashCode())) * 1000003;
        Boolean bool14 = this.x;
        int iHashCode21 = (iHashCode20 ^ (bool14 == null ? 0 : bool14.hashCode())) * 1000003;
        mhz mhzVar = this.y;
        if (mhzVar == null) {
            iB = 0;
        } else {
            iB = mhzVar.aD;
            if (iB == 0) {
                iB = pqu.a.b(mhzVar).b(mhzVar);
                mhzVar.aD = iB;
            }
        }
        int i = (iHashCode21 ^ iB) * 1000003;
        Long l2 = this.z;
        int iHashCode22 = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Boolean bool15 = this.A;
        int iHashCode23 = (iHashCode22 ^ (bool15 == null ? 0 : bool15.hashCode())) * 1000003;
        ByteBuffer byteBuffer = this.B;
        int iHashCode24 = (iHashCode23 ^ (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 1000003;
        Boolean bool16 = this.C;
        int iHashCode25 = (iHashCode24 ^ (bool16 == null ? 0 : bool16.hashCode())) * 1000003;
        ByteBuffer byteBuffer2 = this.D;
        int iHashCode26 = (iHashCode25 ^ (byteBuffer2 == null ? 0 : byteBuffer2.hashCode())) * 1000003;
        Boolean bool17 = this.E;
        int iHashCode27 = (iHashCode26 ^ (bool17 == null ? 0 : bool17.hashCode())) * 1000003;
        Boolean bool18 = this.F;
        int iHashCode28 = (iHashCode27 ^ (bool18 == null ? 0 : bool18.hashCode())) * 1000003;
        Boolean bool19 = this.G;
        int iHashCode29 = (iHashCode28 ^ (bool19 == null ? 0 : bool19.hashCode())) * 1000003;
        mie mieVar = this.H;
        if (mieVar == null) {
            iB2 = 0;
        } else {
            iB2 = mieVar.aD;
            if (iB2 == 0) {
                iB2 = pqu.a.b(mieVar).b(mieVar);
                mieVar.aD = iB2;
            }
        }
        int i2 = (iHashCode29 ^ iB2) * 1000003;
        Boolean bool20 = this.I;
        return i2 ^ (bool20 != null ? bool20.hashCode() : 0);
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean legacyPixelParity() {
        return this.p;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean lens2020ModeEnabled() {
        return this.x;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final mhz lens2020Params() {
        return this.y;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean lightweightSuggestionsModeEnabled() {
        return this.E;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final ByteBuffer linkEvalConfigMetadata() {
        return this.B;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean linkModelDownloadEnabled() {
        return this.C;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Long minimumDynamicLoadingHostVersion() {
        return null;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final mie mobileRaidParams() {
        return this.H;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Long modelDownloadCheckTimeoutMs() {
        return this.v;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean modelDownloadEnabled() {
        return this.u;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean nonEnPersonNameDetectionEnabled() {
        return this.n;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean pdpTextExtractionEnabled() {
        return this.A;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean pixelChipMode() {
        return this.q;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Integer processorImagePoolSize() {
        return this.m;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Integer processorMode() {
        return this.h;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    @Deprecated
    public final Boolean productDetectionEnabled() {
        return null;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    @Deprecated
    public final String productIndex() {
        return null;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    @Deprecated
    public final Integer productMode() {
        return null;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Map sceneClassificationMap() {
        return this.o;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean sceneDetectionEnabled() {
        return this.d;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final ByteBuffer serializedPipelineConfig() {
        return this.D;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean stopPipelineOnPause() {
        return this.F;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final List supportedTranslateLanguages() {
        return this.g;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    @Deprecated
    public final Boolean textSelectionEnabled() {
        return null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        String strValueOf5 = String.valueOf(this.f);
        String strValueOf6 = String.valueOf(this.g);
        String strValueOf7 = String.valueOf((Object) null);
        String strValueOf8 = String.valueOf((Object) null);
        String strValueOf9 = String.valueOf(this.h);
        String strValueOf10 = String.valueOf((Object) null);
        String strValueOf11 = String.valueOf(this.i);
        String strValueOf12 = String.valueOf(this.j);
        String strValueOf13 = String.valueOf((Object) null);
        boolean z = this.k;
        boolean z2 = this.l;
        String strValueOf14 = String.valueOf(this.m);
        String strValueOf15 = String.valueOf(this.n);
        String strValueOf16 = String.valueOf(this.o);
        String strValueOf17 = String.valueOf(this.p);
        String strValueOf18 = String.valueOf(this.q);
        String strValueOf19 = String.valueOf(this.r);
        String strValueOf20 = String.valueOf(this.a);
        String strValueOf21 = String.valueOf((Object) null);
        String strValueOf22 = String.valueOf(this.s);
        String strValueOf23 = String.valueOf(this.t);
        String strValueOf24 = String.valueOf(this.u);
        String strValueOf25 = String.valueOf(this.v);
        String strValueOf26 = String.valueOf(this.w);
        String strValueOf27 = String.valueOf(this.x);
        String strValueOf28 = String.valueOf(this.y);
        String strValueOf29 = String.valueOf(this.z);
        String strValueOf30 = String.valueOf(this.A);
        String strValueOf31 = String.valueOf(this.B);
        String strValueOf32 = String.valueOf(this.C);
        String strValueOf33 = String.valueOf(this.D);
        String strValueOf34 = String.valueOf(this.E);
        String strValueOf35 = String.valueOf(this.F);
        String strValueOf36 = String.valueOf(this.G);
        String strValueOf37 = String.valueOf(this.H);
        String strValueOf38 = String.valueOf(this.I);
        int length = String.valueOf(strValueOf).length() + 989 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length() + String.valueOf(strValueOf6).length() + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length();
        int length2 = String.valueOf((Object) null).length();
        int length3 = String.valueOf(strValueOf9).length();
        int length4 = String.valueOf(strValueOf10).length();
        int length5 = String.valueOf(strValueOf11).length();
        int length6 = String.valueOf(strValueOf12).length();
        int length7 = String.valueOf(strValueOf13).length();
        int length8 = String.valueOf(strValueOf14).length();
        int length9 = String.valueOf(strValueOf15).length();
        int length10 = String.valueOf(strValueOf16).length();
        int length11 = String.valueOf(strValueOf17).length();
        int length12 = String.valueOf(strValueOf18).length();
        int length13 = String.valueOf(strValueOf19).length();
        int length14 = String.valueOf(strValueOf20).length();
        int length15 = String.valueOf(strValueOf21).length();
        int length16 = String.valueOf(strValueOf22).length();
        int length17 = String.valueOf(strValueOf23).length();
        int length18 = String.valueOf(strValueOf24).length();
        int length19 = String.valueOf(strValueOf25).length();
        int length20 = String.valueOf(strValueOf26).length();
        int length21 = String.valueOf(strValueOf27).length();
        int length22 = String.valueOf(strValueOf28).length();
        int length23 = String.valueOf(strValueOf29).length();
        int length24 = String.valueOf(strValueOf30).length();
        int length25 = String.valueOf(strValueOf31).length();
        int length26 = String.valueOf(strValueOf32).length();
        int length27 = String.valueOf(strValueOf33).length();
        int length28 = String.valueOf(strValueOf34).length();
        int length29 = String.valueOf(strValueOf35).length();
        int length30 = String.valueOf(strValueOf36).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + length21 + length22 + length23 + length24 + length25 + length26 + length27 + length28 + length29 + length30 + String.valueOf(strValueOf37).length() + String.valueOf(strValueOf38).length());
        sb.append("LinkConfig{wifiConnectionEnabled=");
        sb.append(strValueOf);
        sb.append(", wifiScanEnabled=");
        sb.append(strValueOf2);
        sb.append(", sceneDetectionEnabled=");
        sb.append(strValueOf3);
        sb.append(", freeTextCopyEnabled=");
        sb.append(strValueOf4);
        sb.append(", foreignLanguageDetectionEnabled=");
        sb.append(strValueOf5);
        sb.append(", supportedTranslateLanguages=");
        sb.append(strValueOf6);
        sb.append(", productDetectionEnabled=");
        sb.append(strValueOf7);
        sb.append(", productMode=");
        sb.append(strValueOf8);
        sb.append(", productIndex=null, processorMode=");
        sb.append(strValueOf9);
        sb.append(", textSelectionEnabled=");
        sb.append(strValueOf10);
        sb.append(", triggerMode=");
        sb.append(strValueOf11);
        sb.append(", apparelDetectionEnabled=");
        sb.append(strValueOf12);
        sb.append(", apparelMode=");
        sb.append(strValueOf13);
        sb.append(", aiAiShoppingDetectionEnabled=");
        sb.append(z);
        sb.append(", aiAiTranslateDetectionEnabled=");
        sb.append(z2);
        sb.append(", processorImagePoolSize=");
        sb.append(strValueOf14);
        sb.append(", nonEnPersonNameDetectionEnabled=");
        sb.append(strValueOf15);
        sb.append(", sceneClassificationMap=");
        sb.append(strValueOf16);
        sb.append(", legacyPixelParity=");
        sb.append(strValueOf17);
        sb.append(", pixelChipMode=");
        sb.append(strValueOf18);
        sb.append(", documentScanningEnabled=");
        sb.append(strValueOf19);
        sb.append(", dynamicLoadingMode=");
        sb.append(strValueOf20);
        sb.append(", minimumDynamicLoadingHostVersion=");
        sb.append(strValueOf21);
        sb.append(", gleamEngineEnabled=");
        sb.append(strValueOf22);
        sb.append(", dutyCycleMode=");
        sb.append(strValueOf23);
        sb.append(", modelDownloadEnabled=");
        sb.append(strValueOf24);
        sb.append(", modelDownloadCheckTimeoutMs=");
        sb.append(strValueOf25);
        sb.append(", barcodeEnabled=");
        sb.append(strValueOf26);
        sb.append(", lens2020ModeEnabled=");
        sb.append(strValueOf27);
        sb.append(", lens2020Params=");
        sb.append(strValueOf28);
        sb.append(", trivialFeatureEnabledBits=");
        sb.append(strValueOf29);
        sb.append(", pdpTextExtractionEnabled=");
        sb.append(strValueOf30);
        sb.append(", linkEvalConfigMetadata=");
        sb.append(strValueOf31);
        sb.append(", linkModelDownloadEnabled=");
        sb.append(strValueOf32);
        sb.append(", serializedPipelineConfig=");
        sb.append(strValueOf33);
        sb.append(", lightweightSuggestionsModeEnabled=");
        sb.append(strValueOf34);
        sb.append(", stopPipelineOnPause=");
        sb.append(strValueOf35);
        sb.append(", embedderModeEnabled=");
        sb.append(strValueOf36);
        sb.append(", mobileRaidParams=");
        sb.append(strValueOf37);
        sb.append(", waitForVkpStartEnabled=");
        sb.append(strValueOf38);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Integer triggerMode() {
        return this.i;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Long trivialFeatureEnabledBits() {
        return this.z;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean waitForVkpStartEnabled() {
        return this.I;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean wifiConnectionEnabled() {
        return this.b;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.LinkConfig
    public final Boolean wifiScanEnabled() {
        return this.c;
    }
}
