package com.google.android.libraries.vision.visionkit.pipeline;

import defpackage.nvi;
import defpackage.nvo;
import defpackage.ohh;
import defpackage.oih;
import defpackage.ojc;
import defpackage.ojq;
import defpackage.oom;
import defpackage.pos;
import defpackage.ppd;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final nvi statusCode;
    private final String statusMessage;
    private final nvo visionkitStatus;

    public PipelineException(int i, String str) {
        String str2 = nvi.values()[i].r;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.statusCode = nvi.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    private PipelineException(nvo nvoVar) {
        String str = nvi.values()[nvoVar.a].r;
        String str2 = nvoVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        super(sb.toString());
        this.statusCode = nvi.values()[nvoVar.a];
        this.statusMessage = nvoVar.b;
        this.visionkitStatus = nvoVar;
    }

    PipelineException(byte[] bArr) {
        this((nvo) ppd.s(nvo.d, bArr, pos.a()));
    }

    public List getComponentStatuses() {
        nvo nvoVar = this.visionkitStatus;
        return nvoVar != null ? nvoVar.c : oom.l();
    }

    public ojc getRootCauseMessage() {
        return this.statusMessage.contains(ROOT_CAUSE_DELIMITER) ? ojc.i((String) ohh.t(ojq.d(ROOT_CAUSE_DELIMITER).g(this.statusMessage))) : oih.a;
    }

    public nvi getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }
}
