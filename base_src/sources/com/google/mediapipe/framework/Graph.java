package com.google.mediapipe.framework;

import defpackage.obr;
import defpackage.oug;
import defpackage.ouj;
import defpackage.pmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Graph {
    private static final ouj a = ouj.h("com/google/mediapipe/framework/Graph");
    private final List c = new ArrayList();
    private Map d = new HashMap();
    private Map e = new HashMap();
    private boolean f = false;
    private boolean g = false;
    private Map h = new HashMap();
    private long b = nativeCreateGraph();

    private static void i(Map map, String[] strArr, long[] jArr) {
        if (map.size() != strArr.length || map.size() != jArr.length) {
            throw new RuntimeException("Input array length doesn't match the map size!");
        }
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            jArr[i] = ((Packet) entry.getValue()).getNativeHandle();
            i++;
        }
    }

    private native void nativeAddPacketCallback(long j, String str, PacketCallback packetCallback);

    private native long nativeAddSurfaceOutput(long j, String str);

    private native long nativeCreateGraph();

    private native void nativeLoadBinaryGraph(long j, String str);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized void b(String str, Packet packet, long j) {
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called.");
        if (this.g) {
            nativeMovePacketToInputStream(this.b, str, packet.getNativeHandle(), j);
            packet.release();
            return;
        }
        Packet packet2 = new Packet(packet.nativeCopyPacket(packet.a));
        if (!this.h.containsKey(str)) {
            this.h.put(str, new ArrayList());
        }
        List list = (List) this.h.get(str);
        if (list.size() <= 20) {
            list.add(new pmx(packet2, Long.valueOf(j)));
            packet.release();
            return;
        }
        for (Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() == null) {
                ((oug) ((oug) a.b()).G((char) 3705)).r("Stream: %s might be missing.", entry.getKey());
            }
        }
        throw new RuntimeException("Graph is not started because of missing streams");
    }

    public final synchronized void c(String str, PacketCallback packetCallback) {
        boolean z = true;
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called already.");
        if (this.g || this.f) {
            z = false;
        }
        obr.aQ(z);
        this.c.add(packetCallback);
        nativeAddPacketCallback(this.b, str, packetCallback);
    }

    public final synchronized void d(byte[] bArr) {
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraphBytes(this.b, bArr);
    }

    public final synchronized void e(long j) {
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called already.");
        obr.aQ(!this.g);
        nativeSetParentGlContext(this.b, j);
    }

    public final synchronized void f() {
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called.");
        this.f = true;
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == null) {
                return;
            }
        }
        String[] strArr = new String[this.d.size()];
        long[] jArr = new long[this.d.size()];
        i(this.d, strArr, jArr);
        String[] strArr2 = new String[this.e.size()];
        long[] jArr2 = new long[this.e.size()];
        i(this.e, strArr2, jArr2);
        nativeStartRunningGraph(this.b, strArr, jArr, strArr2, jArr2);
        this.g = true;
        if (!this.h.isEmpty()) {
            for (Map.Entry entry : this.h.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    pmx pmxVar = (pmx) arrayList.get(i);
                    try {
                        nativeMovePacketToInputStream(this.b, (String) entry.getKey(), pmxVar.a.getNativeHandle(), pmxVar.b.longValue());
                        pmxVar.a.release();
                    } catch (MediaPipeException e) {
                        ((oug) ((oug) a.b()).G(3703)).y("AddPacket for stream: %s failed: %s.", entry.getKey(), e.getMessage());
                        throw e;
                    }
                }
            }
            this.h.clear();
        }
    }

    public final synchronized void g(String str) {
        boolean z = true;
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called.");
        str.getClass();
        if (this.g || this.f) {
            z = false;
        }
        obr.aQ(z);
        nativeAddSurfaceOutput(this.b, str);
    }

    public final synchronized void h() {
        obr.aR(this.b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraph(this.b, "gca_postprocessing.binarypb");
    }
}
