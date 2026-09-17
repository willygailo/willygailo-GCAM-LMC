package com.google.android.libraries.lens.lenslite.api;

import android.util.Log;
import defpackage.mgp;
import defpackage.mhf;
import defpackage.mhy;
import defpackage.mhz;
import defpackage.mia;
import defpackage.mib;
import defpackage.mic;
import defpackage.mid;
import defpackage.mie;
import defpackage.mif;
import defpackage.mio;
import defpackage.mip;
import defpackage.pnl;
import defpackage.poc;
import defpackage.pos;
import defpackage.poy;
import defpackage.ppd;
import defpackage.ppm;
import defpackage.ppp;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LinkConfig {
    private static final String TAG = "LinkConfig";

    /* JADX INFO: loaded from: classes2.dex */
    public abstract class Builder {
        public abstract void a(mhy mhyVar);

        public abstract LinkConfig build();
    }

    public static Builder builder() {
        mgp mgpVar = new mgp();
        mgpVar.a(mhf.b);
        mgpVar.j = false;
        mgpVar.k = false;
        return mgpVar;
    }

    public static LinkConfig fromByteArray(byte[] bArr) {
        mhy mhyVarB;
        mia miaVar = (mia) ppd.s(mia.L, bArr, pos.b());
        Builder builder = builder();
        if ((miaVar.a & 1) != 0) {
            ((mgp) builder).a = Boolean.valueOf(miaVar.c);
        }
        if ((miaVar.a & 8388608) != 0) {
            ((mgp) builder).b = Boolean.valueOf(miaVar.c);
        }
        if ((miaVar.a & 2) != 0) {
            ((mgp) builder).c = Boolean.valueOf(miaVar.d);
        }
        if ((miaVar.a & 16) != 0) {
            mgp mgpVar = (mgp) builder;
            mgpVar.e = Boolean.valueOf(miaVar.g);
            mic micVar = miaVar.r;
            if (micVar == null) {
                micVar = mic.b;
            }
            mgpVar.f = micVar.a;
        }
        if ((miaVar.a & 32) != 0) {
            ((mgp) builder).g = Integer.valueOf(miaVar.h);
        }
        mid midVar = miaVar.i;
        if (midVar == null) {
            midVar = mid.c;
        }
        if ((midVar.a & 2) != 0) {
            mid midVar2 = miaVar.i;
            if (midVar2 == null) {
                midVar2 = mid.c;
            }
            ((mgp) builder).d = Boolean.valueOf(midVar2.b);
        }
        if ((miaVar.a & 2) != 0) {
            mgp mgpVar2 = (mgp) builder;
            mgpVar2.c = Boolean.valueOf(miaVar.d);
            if (miaVar.p.size() > 0) {
                HashMap map = new HashMap();
                for (mif mifVar : miaVar.p) {
                    map.put(mifVar.b, Float.valueOf(mifVar.c));
                }
                mgpVar2.n = map;
            }
        }
        if ((miaVar.a & 128) != 0) {
            int iY = mip.y(miaVar.j);
            if (iY == 0) {
                iY = 2;
            }
            ((mgp) builder).h = Integer.valueOf(iY - 1);
        }
        if ((miaVar.a & 256) != 0) {
            ((mgp) builder).i = Boolean.valueOf(miaVar.k);
        }
        if ((miaVar.a & 1048576) != 0) {
            mgp mgpVar3 = (mgp) builder;
            mgpVar3.w = Boolean.valueOf(miaVar.x);
            if ((miaVar.a & 4194304) != 0) {
                mhz mhzVar = miaVar.z;
                if (mhzVar == null) {
                    mhzVar = mhz.a;
                }
                mgpVar3.x = mhzVar;
            }
        }
        if ((miaVar.a & 512) != 0) {
            ((mgp) builder).l = Integer.valueOf(miaVar.l);
        }
        if ((miaVar.a & 1024) != 0) {
            ((mgp) builder).m = Boolean.valueOf(miaVar.m);
        }
        if ((miaVar.a & 2048) != 0) {
            ((mgp) builder).o = Boolean.valueOf(miaVar.n);
        }
        if ((miaVar.a & 4096) != 0) {
            ((mgp) builder).p = Boolean.valueOf(miaVar.o);
        }
        if ((miaVar.a & 4) != 0) {
            ((mgp) builder).q = true;
        }
        if ((miaVar.a & 65536) != 0) {
            ((mgp) builder).r = Boolean.valueOf(miaVar.t);
        }
        mhy mhyVarB2 = mhy.b(miaVar.q);
        if (mhyVarB2 == null) {
            mhyVarB2 = mhy.UNKNOWN_DYNAMIC_LOADING_MODE;
        }
        if (mhyVarB2 == mhy.UNKNOWN_DYNAMIC_LOADING_MODE) {
            mhyVarB = mhf.b;
        } else {
            mhyVarB = mhy.b(miaVar.q);
            if (mhyVarB == null) {
                mhyVarB = mhy.UNKNOWN_DYNAMIC_LOADING_MODE;
            }
        }
        builder.a(mhyVarB);
        if ((miaVar.a & 131072) != 0) {
            int iZ = mip.z(miaVar.u);
            if (iZ == 0) {
                iZ = 1;
            }
            ((mgp) builder).s = Integer.valueOf(iZ - 1);
        }
        if ((miaVar.a & 262144) != 0) {
            ((mgp) builder).t = Boolean.valueOf(miaVar.v);
        }
        if ((miaVar.b & 2) != 0) {
            ((mgp) builder).u = Long.valueOf(miaVar.K);
        }
        if ((miaVar.a & 524288) != 0) {
            ((mgp) builder).v = Boolean.valueOf(miaVar.w);
        }
        if ((miaVar.a & 2097152) != 0) {
            ((mgp) builder).y = Long.valueOf(miaVar.y);
        }
        if ((miaVar.a & 16777216) != 0) {
            ((mgp) builder).z = Boolean.valueOf(miaVar.B);
        }
        if ((miaVar.a & 33554432) != 0) {
            mio mioVar = miaVar.C;
            if (mioVar == null) {
                mioVar = mio.a;
            }
            ((mgp) builder).A = ByteBuffer.wrap(mioVar.g());
        }
        if ((miaVar.a & 67108864) != 0) {
            ((mgp) builder).B = Boolean.valueOf(miaVar.D);
        }
        if ((miaVar.a & 134217728) != 0) {
            ((mgp) builder).C = ByteBuffer.wrap(miaVar.E.B());
        }
        if ((miaVar.a & 268435456) != 0) {
            ((mgp) builder).D = Boolean.valueOf(miaVar.F);
        }
        if ((miaVar.b & 1) != 0) {
            ((mgp) builder).E = Boolean.valueOf(miaVar.J);
        }
        if ((miaVar.a & 536870912) != 0) {
            mie mieVar = miaVar.G;
            if (mieVar == null) {
                mieVar = mie.a;
            }
            ((mgp) builder).G = mieVar;
        }
        if ((miaVar.a & 1073741824) != 0) {
            ((mgp) builder).F = Boolean.valueOf(miaVar.H);
        }
        if ((miaVar.a & Integer.MIN_VALUE) != 0) {
            ((mgp) builder).H = Boolean.valueOf(miaVar.I);
        }
        return builder.build();
    }

    public abstract boolean aiAiShoppingDetectionEnabled();

    public abstract boolean aiAiTranslateDetectionEnabled();

    public abstract Boolean apparelDetectionEnabled();

    @Deprecated
    public abstract Integer apparelMode();

    public abstract Boolean barcodeEnabled();

    public abstract Boolean documentScanningEnabled();

    public abstract Integer dutyCycleMode();

    public abstract mhy dynamicLoadingMode();

    public abstract Boolean embedderModeEnabled();

    public abstract Boolean foreignLanguageDetectionEnabled();

    public abstract Boolean freeTextCopyEnabled();

    public abstract Boolean gleamEngineEnabled();

    public abstract Boolean legacyPixelParity();

    public abstract Boolean lens2020ModeEnabled();

    public abstract mhz lens2020Params();

    public abstract Boolean lightweightSuggestionsModeEnabled();

    public abstract ByteBuffer linkEvalConfigMetadata();

    public abstract Boolean linkModelDownloadEnabled();

    public abstract Long minimumDynamicLoadingHostVersion();

    public abstract mie mobileRaidParams();

    public abstract Long modelDownloadCheckTimeoutMs();

    public abstract Boolean modelDownloadEnabled();

    public abstract Boolean nonEnPersonNameDetectionEnabled();

    public abstract Boolean pdpTextExtractionEnabled();

    public abstract Boolean pixelChipMode();

    public abstract Integer processorImagePoolSize();

    public abstract Integer processorMode();

    @Deprecated
    public abstract Boolean productDetectionEnabled();

    @Deprecated
    public abstract String productIndex();

    @Deprecated
    public abstract Integer productMode();

    public abstract Map sceneClassificationMap();

    public abstract Boolean sceneDetectionEnabled();

    public abstract ByteBuffer serializedPipelineConfig();

    public abstract Boolean stopPipelineOnPause();

    public abstract List supportedTranslateLanguages();

    @Deprecated
    public abstract Boolean textSelectionEnabled();

    public final byte[] toByteArray() {
        poy poyVarM = mia.L.m();
        Boolean boolWifiConnectionEnabled = wifiConnectionEnabled();
        if (boolWifiConnectionEnabled != null) {
            boolean zBooleanValue = boolWifiConnectionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar = (mia) poyVarM.b;
            miaVar.a |= 1;
            miaVar.c = zBooleanValue;
        }
        Boolean boolWifiScanEnabled = wifiScanEnabled();
        if (boolWifiScanEnabled != null) {
            boolean zBooleanValue2 = boolWifiScanEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar2 = (mia) poyVarM.b;
            miaVar2.a |= 8388608;
            miaVar2.A = zBooleanValue2;
        }
        Boolean boolSceneDetectionEnabled = sceneDetectionEnabled();
        if (boolSceneDetectionEnabled != null) {
            boolean zBooleanValue3 = boolSceneDetectionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar3 = (mia) poyVarM.b;
            miaVar3.a |= 2;
            miaVar3.d = zBooleanValue3;
        }
        Boolean boolFreeTextCopyEnabled = freeTextCopyEnabled();
        if (boolFreeTextCopyEnabled != null) {
            boolean zBooleanValue4 = boolFreeTextCopyEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar4 = (mia) poyVarM.b;
            miaVar4.a |= 8;
            miaVar4.f = zBooleanValue4;
        }
        Boolean boolForeignLanguageDetectionEnabled = foreignLanguageDetectionEnabled();
        if (boolForeignLanguageDetectionEnabled != null) {
            boolean zBooleanValue5 = boolForeignLanguageDetectionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar5 = (mia) poyVarM.b;
            miaVar5.a |= 16;
            miaVar5.g = zBooleanValue5;
            List listSupportedTranslateLanguages = supportedTranslateLanguages();
            if (listSupportedTranslateLanguages != null) {
                poy poyVarM2 = mic.b.m();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                mic micVar = (mic) poyVarM2.b;
                ppm ppmVar = micVar.a;
                if (!ppmVar.c()) {
                    micVar.a = ppd.B(ppmVar);
                }
                pnl.e(listSupportedTranslateLanguages, micVar.a);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                mia miaVar6 = (mia) poyVarM.b;
                mic micVar2 = (mic) poyVarM2.j();
                micVar2.getClass();
                miaVar6.r = micVar2;
                miaVar6.a |= 16384;
            }
        }
        Integer numProcessorMode = processorMode();
        if (numProcessorMode != null) {
            int iIntValue = numProcessorMode.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar7 = (mia) poyVarM.b;
            miaVar7.a |= 32;
            miaVar7.h = iIntValue;
        }
        Boolean boolFreeTextCopyEnabled2 = freeTextCopyEnabled();
        if (boolFreeTextCopyEnabled2 != null && boolFreeTextCopyEnabled2.booleanValue()) {
            poy poyVarM3 = mid.c.m();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            mid midVar = (mid) poyVarM3.b;
            midVar.a |= 2;
            midVar.b = true;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar8 = (mia) poyVarM.b;
            mid midVar2 = (mid) poyVarM3.j();
            midVar2.getClass();
            miaVar8.i = midVar2;
            miaVar8.a |= 64;
        }
        Boolean boolSceneDetectionEnabled2 = sceneDetectionEnabled();
        if (boolSceneDetectionEnabled2 != null) {
            boolean zBooleanValue6 = boolSceneDetectionEnabled2.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar9 = (mia) poyVarM.b;
            miaVar9.a |= 2;
            miaVar9.d = zBooleanValue6;
            Map mapSceneClassificationMap = sceneClassificationMap();
            if (mapSceneClassificationMap != null) {
                for (Map.Entry entry : mapSceneClassificationMap.entrySet()) {
                    poy poyVarM4 = mif.d.m();
                    String str = (String) entry.getKey();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    mif mifVar = (mif) poyVarM4.b;
                    str.getClass();
                    mifVar.a |= 1;
                    mifVar.b = str;
                    float fFloatValue = ((Float) entry.getValue()).floatValue();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    mif mifVar2 = (mif) poyVarM4.b;
                    mifVar2.a |= 2;
                    mifVar2.c = fFloatValue;
                    mif mifVar3 = (mif) poyVarM4.j();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    mia miaVar10 = (mia) poyVarM.b;
                    mifVar3.getClass();
                    ppm ppmVar2 = miaVar10.p;
                    if (!ppmVar2.c()) {
                        miaVar10.p = ppd.B(ppmVar2);
                    }
                    miaVar10.p.add(mifVar3);
                }
            }
        }
        Integer numTriggerMode = triggerMode();
        if (numTriggerMode != null) {
            int iY = mip.y(numTriggerMode.intValue());
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar11 = (mia) poyVarM.b;
            int i = iY - 1;
            if (iY == 0) {
                throw null;
            }
            miaVar11.j = i;
            miaVar11.a |= 128;
        }
        Boolean boolApparelDetectionEnabled = apparelDetectionEnabled();
        if (boolApparelDetectionEnabled != null) {
            boolean zBooleanValue7 = boolApparelDetectionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar12 = (mia) poyVarM.b;
            int i2 = miaVar12.a | 256;
            miaVar12.a = i2;
            miaVar12.k = zBooleanValue7;
            miaVar12.s = 1;
            miaVar12.a = 32768 | i2;
        }
        Integer numProcessorImagePoolSize = processorImagePoolSize();
        if (numProcessorImagePoolSize != null) {
            int iIntValue2 = numProcessorImagePoolSize.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar13 = (mia) poyVarM.b;
            miaVar13.a |= 512;
            miaVar13.l = iIntValue2;
        }
        Boolean boolNonEnPersonNameDetectionEnabled = nonEnPersonNameDetectionEnabled();
        if (boolNonEnPersonNameDetectionEnabled != null) {
            boolean zBooleanValue8 = boolNonEnPersonNameDetectionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar14 = (mia) poyVarM.b;
            miaVar14.a |= 1024;
            miaVar14.m = zBooleanValue8;
        }
        Boolean boolLegacyPixelParity = legacyPixelParity();
        if (boolLegacyPixelParity != null) {
            boolean zBooleanValue9 = boolLegacyPixelParity.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar15 = (mia) poyVarM.b;
            miaVar15.a |= 2048;
            miaVar15.n = zBooleanValue9;
        }
        Boolean boolPixelChipMode = pixelChipMode();
        if (boolPixelChipMode != null) {
            boolean zBooleanValue10 = boolPixelChipMode.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar16 = (mia) poyVarM.b;
            miaVar16.a |= 4096;
            miaVar16.o = zBooleanValue10;
        }
        Boolean boolDocumentScanningEnabled = documentScanningEnabled();
        if (boolDocumentScanningEnabled != null && boolDocumentScanningEnabled.booleanValue()) {
            mib mibVar = mib.a;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar17 = (mia) poyVarM.b;
            mibVar.getClass();
            miaVar17.e = mibVar;
            miaVar17.a |= 4;
        }
        Boolean boolGleamEngineEnabled = gleamEngineEnabled();
        if (boolGleamEngineEnabled != null) {
            boolean zBooleanValue11 = boolGleamEngineEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar18 = (mia) poyVarM.b;
            miaVar18.a |= 65536;
            miaVar18.t = zBooleanValue11;
        }
        mhy mhyVarDynamicLoadingMode = dynamicLoadingMode();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        mia miaVar19 = (mia) poyVarM.b;
        miaVar19.q = mhyVarDynamicLoadingMode.f;
        miaVar19.a |= 8192;
        Integer numDutyCycleMode = dutyCycleMode();
        if (numDutyCycleMode != null) {
            int iZ = mip.z(numDutyCycleMode.intValue());
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar20 = (mia) poyVarM.b;
            int i3 = iZ - 1;
            if (iZ == 0) {
                throw null;
            }
            miaVar20.u = i3;
            miaVar20.a |= 131072;
        }
        Boolean boolModelDownloadEnabled = modelDownloadEnabled();
        if (boolModelDownloadEnabled != null) {
            boolean zBooleanValue12 = boolModelDownloadEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar21 = (mia) poyVarM.b;
            miaVar21.a |= 262144;
            miaVar21.v = zBooleanValue12;
        }
        Long lModelDownloadCheckTimeoutMs = modelDownloadCheckTimeoutMs();
        if (lModelDownloadCheckTimeoutMs != null) {
            long jLongValue = lModelDownloadCheckTimeoutMs.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar22 = (mia) poyVarM.b;
            miaVar22.b |= 2;
            miaVar22.K = jLongValue;
        }
        Boolean boolBarcodeEnabled = barcodeEnabled();
        if (boolBarcodeEnabled != null) {
            boolean zBooleanValue13 = boolBarcodeEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar23 = (mia) poyVarM.b;
            miaVar23.a |= 524288;
            miaVar23.w = zBooleanValue13;
        }
        Boolean boolLens2020ModeEnabled = lens2020ModeEnabled();
        if (boolLens2020ModeEnabled != null) {
            boolean zBooleanValue14 = boolLens2020ModeEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar24 = (mia) poyVarM.b;
            miaVar24.a |= 1048576;
            miaVar24.x = zBooleanValue14;
            mhz mhzVarLens2020Params = lens2020Params();
            if (mhzVarLens2020Params != null) {
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                mia miaVar25 = (mia) poyVarM.b;
                miaVar25.z = mhzVarLens2020Params;
                miaVar25.a |= 4194304;
            }
        }
        Long lTrivialFeatureEnabledBits = trivialFeatureEnabledBits();
        if (lTrivialFeatureEnabledBits != null) {
            long jLongValue2 = lTrivialFeatureEnabledBits.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar26 = (mia) poyVarM.b;
            miaVar26.a |= 2097152;
            miaVar26.y = jLongValue2;
        }
        Boolean boolPdpTextExtractionEnabled = pdpTextExtractionEnabled();
        if (boolPdpTextExtractionEnabled != null) {
            boolean zBooleanValue15 = boolPdpTextExtractionEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar27 = (mia) poyVarM.b;
            miaVar27.a |= 16777216;
            miaVar27.B = zBooleanValue15;
        }
        ByteBuffer byteBufferLinkEvalConfigMetadata = linkEvalConfigMetadata();
        if (byteBufferLinkEvalConfigMetadata != null) {
            try {
                mio mioVar = (mio) ppd.r(mio.a, byteBufferLinkEvalConfigMetadata, pos.b());
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                mia miaVar28 = (mia) poyVarM.b;
                mioVar.getClass();
                miaVar28.C = mioVar;
                miaVar28.a |= 33554432;
            } catch (ppp e) {
                Object[] objArr = new Object[0];
                if (Log.isLoggable(TAG, 6)) {
                    Log.e(TAG, mip.D("Unable to parse LinkEvalConfigMetadata.", objArr));
                }
            }
        }
        Boolean boolLinkModelDownloadEnabled = linkModelDownloadEnabled();
        if (boolLinkModelDownloadEnabled != null) {
            boolean zBooleanValue16 = boolLinkModelDownloadEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar29 = (mia) poyVarM.b;
            miaVar29.a |= 67108864;
            miaVar29.D = zBooleanValue16;
        }
        ByteBuffer byteBufferSerializedPipelineConfig = serializedPipelineConfig();
        if (byteBufferSerializedPipelineConfig != null) {
            poc pocVarS = poc.s(byteBufferSerializedPipelineConfig);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar30 = (mia) poyVarM.b;
            miaVar30.a |= 134217728;
            miaVar30.E = pocVarS;
        }
        Boolean boolStopPipelineOnPause = stopPipelineOnPause();
        if (boolStopPipelineOnPause != null) {
            boolean zBooleanValue17 = boolStopPipelineOnPause.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar31 = (mia) poyVarM.b;
            miaVar31.b = 1 | miaVar31.b;
            miaVar31.J = zBooleanValue17;
        }
        Boolean boolLightweightSuggestionsModeEnabled = lightweightSuggestionsModeEnabled();
        if (boolLightweightSuggestionsModeEnabled != null) {
            boolean zBooleanValue18 = boolLightweightSuggestionsModeEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar32 = (mia) poyVarM.b;
            miaVar32.a |= 268435456;
            miaVar32.F = zBooleanValue18;
        }
        mie mieVarMobileRaidParams = mobileRaidParams();
        if (mieVarMobileRaidParams != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar33 = (mia) poyVarM.b;
            miaVar33.G = mieVarMobileRaidParams;
            miaVar33.a |= 536870912;
        }
        Boolean boolEmbedderModeEnabled = embedderModeEnabled();
        if (boolEmbedderModeEnabled != null) {
            boolean zBooleanValue19 = boolEmbedderModeEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar34 = (mia) poyVarM.b;
            miaVar34.a |= 1073741824;
            miaVar34.H = zBooleanValue19;
        }
        Boolean boolWaitForVkpStartEnabled = waitForVkpStartEnabled();
        if (boolWaitForVkpStartEnabled != null) {
            boolean zBooleanValue20 = boolWaitForVkpStartEnabled.booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mia miaVar35 = (mia) poyVarM.b;
            miaVar35.a |= Integer.MIN_VALUE;
            miaVar35.I = zBooleanValue20;
        }
        return ((mia) poyVarM.j()).g();
    }

    public abstract Integer triggerMode();

    public abstract Long trivialFeatureEnabledBits();

    public abstract Boolean waitForVkpStartEnabled();

    public abstract Boolean wifiConnectionEnabled();

    public abstract Boolean wifiScanEnabled();
}
