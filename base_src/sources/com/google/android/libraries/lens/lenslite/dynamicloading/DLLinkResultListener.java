package com.google.android.libraries.lens.lenslite.dynamicloading;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DLLinkResultListener {
    void onResultUpdate(List list, ByteBuffer byteBuffer);

    void onResultUpdate(List list, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
