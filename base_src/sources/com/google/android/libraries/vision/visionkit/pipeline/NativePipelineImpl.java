package com.google.android.libraries.vision.visionkit.pipeline;

import android.util.Log;
import com.google.android.apps.cerebra.federatedperception.shared.communications.CommunicationsManager;
import defpackage.nmk;
import defpackage.nvd;
import defpackage.nvg;
import defpackage.nvj;
import defpackage.nvk;
import defpackage.pos;
import defpackage.ppd;
import defpackage.ppp;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativePipelineImpl implements nvd {
    private pos a;
    private nvg b;
    private nvj c;

    public NativePipelineImpl(nvg nvgVar, nvj nvjVar, pos posVar) {
        this.b = nvgVar;
        this.c = nvjVar;
        this.a = posVar;
    }

    public NativePipelineImpl(nvg nvgVar, nvj nvjVar, pos posVar, byte[] bArr) {
        this(nvgVar, nvjVar, posVar);
        System.loadLibrary("camerapipeline");
    }

    @Override // defpackage.nvd
    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.nvd
    public native void close(long j, long j2, long j3, long j4);

    @Override // defpackage.nvd
    public native boolean disableSubpipeline(long j, String str);

    @Override // defpackage.nvd
    public native boolean enableSubpipeline(long j, String str);

    @Override // defpackage.nvd
    public native long initialize(byte[] bArr, long j, long j2, CommunicationsManager communicationsManager, long j3);

    @Override // defpackage.nvd
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // defpackage.nvd
    public native long initializeFrameManager();

    @Override // defpackage.nvd
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long j) {
        this.b.a(j);
    }

    public void onResult(byte[] bArr) {
        try {
            this.c.b((nvk) ppd.s(nvk.f, bArr, this.a));
        } catch (ppp e) {
            nmk nmkVar = nmk.a;
            Object[] objArr = new Object[0];
            if (nmkVar.e(6)) {
                Log.e(nmkVar.b, nmkVar.a("Error in result from JNI layer", objArr), e);
            }
        }
    }

    @Override // defpackage.nvd
    public native boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // defpackage.nvd
    public native void start(long j);

    @Override // defpackage.nvd
    public native boolean stop(long j);

    @Override // defpackage.nvd
    public native void waitUntilIdle(long j);
}
