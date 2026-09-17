package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class box extends mip {
    private final fjs a;
    private final Boolean b;
    private final float c;
    private final lco d;
    private final lwd g;
    private final boolean h;
    private final jrl i;
    private final lvs j;
    private int k;
    private final List l = new ArrayList();
    private lzv m = null;
    private int n = -1;
    private int o = -1;
    private int p = -1;

    public box(fjs fjsVar, Boolean bool, lvp lvpVar, lco lcoVar, lvs lvsVar, jrl jrlVar) {
        this.a = fjsVar;
        this.b = bool;
        this.d = lcoVar;
        Rect rectH = lvpVar.h();
        this.c = rectH.width() * rectH.height();
        this.g = lvpVar.k();
        this.j = lvsVar;
        this.h = lvpVar.L();
        this.i = jrlVar;
    }

    private final synchronized void eW(List list, int i, int i2) {
        List list2;
        int i3;
        List list3;
        int i4;
        if (list.isEmpty()) {
            return;
        }
        int i5 = i2;
        if (i5 != 3) {
            i5 = 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i5 == 2) {
            bow bowVar = (bow) list.get(0);
            list3 = bowVar.a;
            list2 = bowVar.b;
            i3 = bowVar.c;
            i4 = bowVar.d;
        } else {
            list2 = arrayList2;
            i3 = 0;
            list3 = arrayList;
            i4 = 0;
        }
        if (i5 == 3) {
            int size = list.size();
            for (int i6 = 0; i6 < 40; i6++) {
                Iterator it = list.iterator();
                float fFloatValue = 0.0f;
                boolean z = false;
                while (it.hasNext()) {
                    ojc ojcVar = (ojc) ((bow) it.next()).a.get(i6);
                    if (ojcVar.g()) {
                        fFloatValue += ((Float) ojcVar.c()).floatValue();
                        z = true;
                    }
                }
                list3.add(z ? ojc.i(Float.valueOf(fFloatValue / size)) : oih.a);
            }
            bow bowVar2 = (bow) ohh.t(list);
            list2 = bowVar2.b;
            i3 = bowVar2.c;
            i4 = bowVar2.d;
        }
        ojc ojcVar2 = (ojc) list3.get(0);
        ojc ojcVar3 = (ojc) list3.get(1);
        ojc ojcVar4 = (ojc) list3.get(2);
        ojc ojcVar5 = (ojc) list3.get(3);
        ojc ojcVar6 = (ojc) list3.get(4);
        ojc ojcVar7 = (ojc) list3.get(5);
        ojc ojcVar8 = (ojc) list3.get(6);
        ojc ojcVar9 = (ojc) list3.get(7);
        ojc ojcVar10 = (ojc) list3.get(8);
        ojc ojcVar11 = (ojc) list3.get(9);
        ojc ojcVar12 = (ojc) list3.get(10);
        ojc ojcVar13 = (ojc) list3.get(11);
        ojc ojcVar14 = (ojc) list3.get(12);
        int i7 = i5;
        ojc ojcVar15 = (ojc) list3.get(13);
        int i8 = i4;
        ojc ojcVar16 = (ojc) list3.get(14);
        int i9 = i3;
        ojc ojcVar17 = (ojc) list3.get(15);
        ojc ojcVar18 = (ojc) list3.get(16);
        ojc ojcVar19 = (ojc) list3.get(17);
        ojc ojcVar20 = (ojc) list3.get(18);
        ojc ojcVar21 = (ojc) list3.get(19);
        ojc ojcVar22 = (ojc) list3.get(20);
        ojc ojcVar23 = (ojc) list3.get(21);
        ojc ojcVar24 = (ojc) list3.get(22);
        ojc ojcVar25 = (ojc) list3.get(23);
        ojc ojcVar26 = (ojc) list3.get(24);
        ojc ojcVar27 = (ojc) list3.get(25);
        ojc ojcVar28 = (ojc) list3.get(26);
        ojc ojcVar29 = (ojc) list3.get(27);
        ojc ojcVar30 = (ojc) list3.get(28);
        ojc ojcVar31 = (ojc) list3.get(29);
        ojc ojcVar32 = (ojc) list3.get(30);
        ojc ojcVar33 = (ojc) list3.get(31);
        ojc ojcVar34 = (ojc) list3.get(32);
        ojc ojcVar35 = (ojc) list3.get(33);
        ojc ojcVar36 = (ojc) list3.get(34);
        ojc ojcVar37 = (ojc) list3.get(35);
        ojc ojcVar38 = (ojc) list3.get(36);
        ojc ojcVar39 = (ojc) list3.get(37);
        ojc ojcVar40 = (ojc) list3.get(38);
        ojc ojcVar41 = (ojc) list3.get(39);
        ojc ojcVar42 = (ojc) list2.get(0);
        ojc ojcVar43 = (ojc) list2.get(1);
        ojc ojcVar44 = (ojc) list2.get(2);
        ojc ojcVar45 = (ojc) list2.get(3);
        ojc ojcVar46 = (ojc) list2.get(4);
        ojc ojcVar47 = (ojc) list2.get(5);
        ojc ojcVar48 = (ojc) list2.get(6);
        poy poyVarM = pea.ad.m();
        int size2 = list.size();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pea peaVar = (pea) poyVarM.b;
        peaVar.a |= 1;
        peaVar.c = size2;
        if (ojcVar2.g()) {
            float fFloatValue2 = ((Float) ojcVar2.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar2 = (pea) poyVarM.b;
            peaVar2.a |= 2;
            peaVar2.d = fFloatValue2;
        }
        if (ojcVar3.g()) {
            float fFloatValue3 = ((Float) ojcVar3.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar3 = (pea) poyVarM.b;
            peaVar3.a |= 8;
            peaVar3.e = fFloatValue3;
        }
        if (ojcVar4.g()) {
            float fFloatValue4 = ((Float) ojcVar4.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar4 = (pea) poyVarM.b;
            peaVar4.a |= 16;
            peaVar4.f = fFloatValue4;
        }
        if (ojcVar5.g()) {
            float fFloatValue5 = ((Float) ojcVar5.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar5 = (pea) poyVarM.b;
            peaVar5.a |= 32;
            peaVar5.g = fFloatValue5;
        }
        if (ojcVar6.g()) {
            float fFloatValue6 = ((Float) ojcVar6.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar6 = (pea) poyVarM.b;
            peaVar6.a |= 64;
            peaVar6.h = fFloatValue6;
        }
        if (ojcVar7.g()) {
            float fFloatValue7 = ((Float) ojcVar7.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar7 = (pea) poyVarM.b;
            peaVar7.a |= 128;
            peaVar7.i = fFloatValue7;
        }
        if (ojcVar8.g()) {
            float fFloatValue8 = ((Float) ojcVar8.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar8 = (pea) poyVarM.b;
            peaVar8.a |= 256;
            peaVar8.j = fFloatValue8;
        }
        if (ojcVar9.g()) {
            float fFloatValue9 = ((Float) ojcVar9.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar9 = (pea) poyVarM.b;
            peaVar9.a |= 512;
            peaVar9.k = fFloatValue9;
        }
        if (ojcVar10.g()) {
            float fFloatValue10 = ((Float) ojcVar10.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar10 = (pea) poyVarM.b;
            peaVar10.a |= 1024;
            peaVar10.l = fFloatValue10;
        }
        if (ojcVar11.g()) {
            float fFloatValue11 = ((Float) ojcVar11.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar11 = (pea) poyVarM.b;
            peaVar11.a |= 2048;
            peaVar11.m = fFloatValue11;
        }
        if (ojcVar12.g()) {
            float fFloatValue12 = ((Float) ojcVar12.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar12 = (pea) poyVarM.b;
            peaVar12.a |= 4096;
            peaVar12.n = fFloatValue12;
        }
        if (ojcVar13.g()) {
            float fFloatValue13 = ((Float) ojcVar13.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar13 = (pea) poyVarM.b;
            peaVar13.a |= 8192;
            peaVar13.o = fFloatValue13;
        }
        if (ojcVar14.g()) {
            float fFloatValue14 = ((Float) ojcVar14.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar14 = (pea) poyVarM.b;
            peaVar14.a |= 16384;
            peaVar14.p = fFloatValue14;
        }
        if (ojcVar15.g()) {
            float fFloatValue15 = ((Float) ojcVar15.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar15 = (pea) poyVarM.b;
            peaVar15.a |= 32768;
            peaVar15.q = fFloatValue15;
        }
        if (ojcVar16.g()) {
            float fFloatValue16 = ((Float) ojcVar16.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar16 = (pea) poyVarM.b;
            peaVar16.a |= 65536;
            peaVar16.r = fFloatValue16;
        }
        if (ojcVar17.g()) {
            float fFloatValue17 = ((Float) ojcVar17.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar17 = (pea) poyVarM.b;
            peaVar17.a |= 131072;
            peaVar17.s = fFloatValue17;
        }
        if (ojcVar18.g()) {
            float fFloatValue18 = ((Float) ojcVar18.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar18 = (pea) poyVarM.b;
            peaVar18.a |= 262144;
            peaVar18.t = fFloatValue18;
        }
        if (ojcVar19.g()) {
            float fFloatValue19 = ((Float) ojcVar19.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar19 = (pea) poyVarM.b;
            peaVar19.a |= 524288;
            peaVar19.u = fFloatValue19;
        }
        if (ojcVar20.g()) {
            float fFloatValue20 = ((Float) ojcVar20.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar20 = (pea) poyVarM.b;
            peaVar20.a |= 1048576;
            peaVar20.v = fFloatValue20;
        }
        if (ojcVar21.g()) {
            float fFloatValue21 = ((Float) ojcVar21.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar21 = (pea) poyVarM.b;
            peaVar21.a |= 2097152;
            peaVar21.w = fFloatValue21;
        }
        if (ojcVar22.g()) {
            float fFloatValue22 = ((Float) ojcVar22.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar22 = (pea) poyVarM.b;
            peaVar22.a |= 4194304;
            peaVar22.x = fFloatValue22;
        }
        if (ojcVar23.g()) {
            float fFloatValue23 = ((Float) ojcVar23.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar23 = (pea) poyVarM.b;
            peaVar23.a |= 8388608;
            peaVar23.y = fFloatValue23;
        }
        if (ojcVar24.g()) {
            float fFloatValue24 = ((Float) ojcVar24.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar24 = (pea) poyVarM.b;
            peaVar24.a |= 16777216;
            peaVar24.z = fFloatValue24;
        }
        if (ojcVar25.g()) {
            float fFloatValue25 = ((Float) ojcVar25.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar25 = (pea) poyVarM.b;
            peaVar25.a |= 33554432;
            peaVar25.A = fFloatValue25;
        }
        if (ojcVar26.g()) {
            float fFloatValue26 = ((Float) ojcVar26.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar26 = (pea) poyVarM.b;
            peaVar26.a |= 67108864;
            peaVar26.B = fFloatValue26;
        }
        if (ojcVar27.g()) {
            float fFloatValue27 = ((Float) ojcVar27.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar27 = (pea) poyVarM.b;
            peaVar27.a |= 134217728;
            peaVar27.C = fFloatValue27;
        }
        if (ojcVar28.g()) {
            float fFloatValue28 = ((Float) ojcVar28.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar28 = (pea) poyVarM.b;
            peaVar28.a |= 268435456;
            peaVar28.D = fFloatValue28;
        }
        if (ojcVar42.g()) {
            int iIntValue = ((Integer) ojcVar42.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar29 = (pea) poyVarM.b;
            peaVar29.a |= 536870912;
            peaVar29.E = iIntValue;
        }
        if (ojcVar29.g()) {
            float fFloatValue29 = ((Float) ojcVar29.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar30 = (pea) poyVarM.b;
            peaVar30.a |= 1073741824;
            peaVar30.F = fFloatValue29;
        }
        if (ojcVar30.g()) {
            float fFloatValue30 = ((Float) ojcVar30.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar31 = (pea) poyVarM.b;
            peaVar31.a |= Integer.MIN_VALUE;
            peaVar31.G = fFloatValue30;
        }
        if (ojcVar43.g()) {
            int iIntValue2 = ((Integer) ojcVar43.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar32 = (pea) poyVarM.b;
            peaVar32.b |= 1;
            peaVar32.H = iIntValue2;
        }
        if (ojcVar31.g()) {
            float fFloatValue31 = ((Float) ojcVar31.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar33 = (pea) poyVarM.b;
            peaVar33.b |= 2;
            peaVar33.I = fFloatValue31;
        }
        if (ojcVar32.g()) {
            float fFloatValue32 = ((Float) ojcVar32.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar34 = (pea) poyVarM.b;
            peaVar34.b |= 4;
            peaVar34.J = fFloatValue32;
        }
        if (ojcVar33.g()) {
            float fFloatValue33 = ((Float) ojcVar33.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar35 = (pea) poyVarM.b;
            peaVar35.b |= 8;
            peaVar35.K = fFloatValue33;
        }
        if (ojcVar34.g()) {
            float fFloatValue34 = ((Float) ojcVar34.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar36 = (pea) poyVarM.b;
            peaVar36.b |= 16;
            peaVar36.L = fFloatValue34;
        }
        if (ojcVar44.g()) {
            int iIntValue3 = ((Integer) ojcVar44.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar37 = (pea) poyVarM.b;
            peaVar37.b |= 32;
            peaVar37.M = iIntValue3;
        }
        if (ojcVar35.g()) {
            float fFloatValue35 = ((Float) ojcVar35.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar38 = (pea) poyVarM.b;
            peaVar38.b |= 64;
            peaVar38.N = fFloatValue35;
        }
        if (ojcVar36.g()) {
            float fFloatValue36 = ((Float) ojcVar36.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar39 = (pea) poyVarM.b;
            peaVar39.b |= 128;
            peaVar39.O = fFloatValue36;
        }
        if (ojcVar37.g()) {
            float fFloatValue37 = ((Float) ojcVar37.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar40 = (pea) poyVarM.b;
            peaVar40.b |= 256;
            peaVar40.P = fFloatValue37;
        }
        if (ojcVar38.g()) {
            float fFloatValue38 = ((Float) ojcVar38.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar41 = (pea) poyVarM.b;
            peaVar41.b |= 512;
            peaVar41.Q = fFloatValue38;
        }
        if (ojcVar39.g()) {
            float fFloatValue39 = ((Float) ojcVar39.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar42 = (pea) poyVarM.b;
            peaVar42.b |= 1024;
            peaVar42.R = fFloatValue39;
        }
        if (ojcVar45.g()) {
            int iIntValue4 = ((Integer) ojcVar45.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar43 = (pea) poyVarM.b;
            peaVar43.b |= 4096;
            peaVar43.T = iIntValue4;
        }
        if (ojcVar46.g()) {
            int iIntValue5 = ((Integer) ojcVar46.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar44 = (pea) poyVarM.b;
            peaVar44.b |= 8192;
            peaVar44.U = iIntValue5;
        }
        if (ojcVar40.g()) {
            float fFloatValue40 = ((Float) ojcVar40.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar45 = (pea) poyVarM.b;
            peaVar45.b = 32768 | peaVar45.b;
            peaVar45.W = fFloatValue40;
        }
        if (ojcVar41.g()) {
            float fFloatValue41 = ((Float) ojcVar41.c()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar46 = (pea) poyVarM.b;
            peaVar46.b = 65536 | peaVar46.b;
            peaVar46.X = fFloatValue41;
        }
        if (ojcVar47.g()) {
            int iIntValue6 = ((Integer) ojcVar47.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar47 = (pea) poyVarM.b;
            peaVar47.b |= 131072;
            peaVar47.Y = iIntValue6;
        }
        if (ojcVar48.g()) {
            int iIntValue7 = ((Integer) ojcVar48.c()).intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar48 = (pea) poyVarM.b;
            peaVar48.b |= 262144;
            peaVar48.Z = iIntValue7;
        }
        if (i == 2) {
            int i10 = this.n;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pea peaVar49 = (pea) poyVarM.b;
            int i11 = peaVar49.b | 524288;
            peaVar49.b = i11;
            peaVar49.aa = i10;
            int i12 = this.o;
            int i13 = i11 | 1048576;
            peaVar49.b = i13;
            peaVar49.ab = i12;
            int i14 = this.p;
            peaVar49.b = i13 | 2097152;
            peaVar49.ac = i14;
        }
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pea peaVar50 = (pea) poyVarM.b;
        int i15 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        peaVar50.S = i15;
        int i16 = peaVar50.b | 2048;
        peaVar50.b = i16;
        int i17 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        peaVar50.V = i17;
        peaVar50.b = i16 | 16384;
        pea peaVar51 = (pea) poyVarM.j();
        fjs fjsVar = this.a;
        poy poyVarM2 = peb.e.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        peb pebVar = (peb) poyVarM2.b;
        pebVar.b = i - 1;
        int i18 = pebVar.a | 1;
        pebVar.a = i18;
        pebVar.c = i7 - 1;
        int i19 = i18 | 2;
        pebVar.a = i19;
        peaVar51.getClass();
        pebVar.d = peaVar51;
        pebVar.a = i19 | 4;
        fjsVar.H((peb) poyVarM2.j());
    }

    /* JADX WARN: Code duplicated, block: B:68:0x025f  */
    private final bow w(lzv lzvVar) {
        oid oidVar;
        oib oibVar;
        oic oicVar;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Float fValueOf;
        int i;
        oom oomVar;
        int i2;
        int i3;
        int length;
        byte[] bArr = (byte[]) lzvVar.d(kdc.j);
        if (bArr == null || bArr.length <= 0) {
            oidVar = null;
        } else {
            try {
                oidVar = (oid) oid.o(oid.o, new ByteArrayInputStream(bArr));
            } catch (IOException e) {
                e.getMessage();
                oidVar = null;
            }
        }
        byte[] bArr2 = (byte[]) lzvVar.d(kdc.k);
        if (bArr2 == null || bArr2.length <= 0) {
            oibVar = null;
        } else {
            try {
                oibVar = (oib) oib.o(oib.h, new ByteArrayInputStream(bArr2));
            } catch (IOException e2) {
                e2.getMessage();
                oibVar = null;
            }
        }
        byte[] bArr3 = (byte[]) lzvVar.d(kdc.l);
        if (bArr3 == null || bArr3.length <= 0) {
            oicVar = null;
        } else {
            try {
                oicVar = (oic) oic.o(oic.k, new ByteArrayInputStream(bArr3));
            } catch (IOException e3) {
                e3.getMessage();
                oicVar = null;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (oidVar != null) {
            arrayList.add(ojc.i(Float.valueOf(oidVar.a)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.c)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.d)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.e)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.f)));
            arrayList.add(ojc.i(Float.valueOf(true != oidVar.g ? 0.0f : 1.0f)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.h)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.i)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.j)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.k)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.l)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.m)));
            arrayList.add(ojc.i(Float.valueOf(oidVar.n)));
        } else {
            for (int i4 = 0; i4 < 13; i4++) {
                arrayList.add(oih.a);
            }
        }
        if (oibVar != null) {
            arrayList.add(ojc.i(Float.valueOf(oibVar.a)));
            arrayList.add(ojc.i(Float.valueOf(true != oibVar.b ? 0.0f : 1.0f)));
            arrayList.add(ojc.i(Float.valueOf(oibVar.c)));
            arrayList.add(ojc.i(Float.valueOf(true != oibVar.e ? 0.0f : 1.0f)));
            arrayList.add(ojc.i(Float.valueOf(oibVar.g)));
        } else {
            for (int i5 = 0; i5 < 5; i5++) {
                arrayList.add(oih.a);
            }
        }
        int i6 = 9;
        if (oicVar != null) {
            arrayList.add(ojc.i(Float.valueOf(oicVar.a)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.b)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.c)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.d)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.e)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.f)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.g)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.h)));
            arrayList.add(ojc.i(Float.valueOf(oicVar.i)));
        } else {
            for (int i7 = 0; i7 < 9; i7++) {
                arrayList.add(oih.a);
            }
        }
        arrayList.add(x(lzvVar, false, true, false));
        arrayList.add(ojc.h((Float) lzvVar.d(CaptureResult.LENS_FOCUS_DISTANCE)));
        arrayList.add(x(lzvVar, true, false, false));
        if (oibVar != null) {
            ppj ppjVar = oibVar.f;
            if (ppjVar.size() >= 3) {
                f2 = (Float) ppjVar.get(0);
                f3 = (Float) ppjVar.get(1);
                f = (Float) ppjVar.get(2);
            } else {
                f = null;
                f2 = null;
                f3 = null;
            }
        } else {
            f = null;
            f2 = null;
            f3 = null;
        }
        arrayList.add(ojc.h(f2));
        arrayList.add(ojc.h(f3));
        arrayList.add(ojc.h(f));
        arrayList.add(x(lzvVar, false, false, true));
        arrayList.add(ojc.i(Float.valueOf(this.c)));
        Face[] faceArr = (Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES);
        if (faceArr == null || (length = faceArr.length) <= 0) {
            f4 = null;
            fValueOf = null;
        } else {
            Float fValueOf2 = Float.valueOf(length);
            float fWidth = 0.0f;
            for (Face face : faceArr) {
                fWidth += face.getBounds().width() * face.getBounds().height();
            }
            fValueOf = Float.valueOf(fWidth);
            f4 = fValueOf2;
        }
        arrayList.add(ojc.h(f4));
        arrayList.add(ojc.h(fValueOf));
        arrayList.add(ojc.i((Float) this.d.fA()));
        Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        arrayList.add(num != null ? ojc.i(Float.valueOf(num.floatValue())) : oih.a);
        Boolean bool = (Boolean) lzvVar.d(CaptureResult.CONTROL_AE_LOCK);
        if (bool != null) {
            arrayList.add(ojc.i(Float.valueOf(true != bool.booleanValue() ? 0.0f : 1.0f)));
        } else {
            arrayList.add(oih.a);
        }
        arrayList2.add(ojc.h((Integer) lzvVar.d(CaptureResult.CONTROL_AE_STATE)));
        arrayList2.add(ojc.h((Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE)));
        arrayList2.add(ojc.h((Integer) lzvVar.d(CaptureResult.CONTROL_AWB_STATE)));
        if (oibVar != null) {
            switch (oibVar.d) {
                case 0:
                    i3 = 2;
                    break;
                case 1:
                    i3 = 3;
                    break;
                case 2:
                    i3 = 4;
                    break;
                case 3:
                    i3 = 5;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 == 0) {
                i3 = 1;
            }
            if (i3 == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            arrayList2.add(ojc.i(Integer.valueOf(i3 - 2)));
        } else {
            arrayList2.add(oih.a);
        }
        if (oidVar != null) {
            arrayList2.add(ojc.i(Integer.valueOf(oidVar.b)));
        } else {
            arrayList2.add(oih.a);
        }
        arrayList2.add(ojc.h((Integer) lzvVar.d(CaptureResult.FLASH_STATE)));
        if (oicVar != null) {
            arrayList2.add(ojc.i(Integer.valueOf(oicVar.j)));
        } else {
            arrayList2.add(oih.a);
        }
        lwd lwdVar = this.g;
        String str = (String) lzvVar.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (lwdVar == lwd.EXTERNAL) {
            i6 = 4;
        } else {
            lwd lwdVar2 = lwd.FRONT;
            if (str == null || !this.h) {
                i6 = lwdVar == lwdVar2 ? 2 : 3;
            } else if (!this.j.a.equals(str)) {
                i6 = lwdVar == lwdVar2 ? 12 : 10;
            } else if (lwdVar == lwdVar2) {
                i6 = 11;
            }
        }
        bov bovVar = new bov();
        oom oomVarJ = oom.j(arrayList);
        if (oomVarJ == null) {
            throw new NullPointerException("Null dataFieldsFloat");
        }
        bovVar.a = oomVarJ;
        oom oomVarJ2 = oom.j(arrayList2);
        if (oomVarJ2 == null) {
            throw new NullPointerException("Null dataFieldsInteger");
        }
        bovVar.b = oomVarJ2;
        bovVar.c = i6;
        jrl jrlVar = this.i;
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 6;
                break;
            case 6:
                i = 4;
                break;
            case 12:
                i = 5;
                break;
            default:
                i = 1;
                break;
        }
        bovVar.d = i;
        oom oomVar2 = bovVar.a;
        if (oomVar2 != null && (oomVar = bovVar.b) != null && (i2 = bovVar.c) != 0) {
            bow bowVar = new bow(oomVar2, oomVar, i2, i);
            obr.aW(bowVar.a.size() == 40 && bowVar.b.size() == 7, "Incorrect number of data fields. expected floats=%s, integers=%s. received floats=%s, integers=%s", 40, 7, Integer.valueOf(bowVar.a.size()), Integer.valueOf(bowVar.b.size()));
            return bowVar;
        }
        StringBuilder sb = new StringBuilder();
        if (bovVar.a == null) {
            sb.append(" dataFieldsFloat");
        }
        if (bovVar.b == null) {
            sb.append(" dataFieldsInteger");
        }
        if (bovVar.c == 0) {
            sb.append(" cameraPosition");
        }
        if (bovVar.d == 0) {
            sb.append(" cameraApplicationMode");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    private static ojc x(lzv lzvVar, boolean z, boolean z2, boolean z3) {
        Float fValueOf;
        MeteringRectangle[] meteringRectangleArr;
        MeteringRectangle[] meteringRectangleArr2;
        MeteringRectangle[] meteringRectangleArr3;
        ArrayList arrayList = new ArrayList();
        if (z && (meteringRectangleArr3 = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AF_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr3);
        }
        if (z2 && (meteringRectangleArr2 = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AE_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr2);
        }
        if (z3 && (meteringRectangleArr = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AWB_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr);
        }
        if (arrayList.isEmpty()) {
            fValueOf = null;
        } else {
            int size = arrayList.size();
            float width = 0.0f;
            for (int i = 0; i < size; i++) {
                MeteringRectangle meteringRectangle = (MeteringRectangle) arrayList.get(i);
                width += meteringRectangle.getWidth() * meteringRectangle.getHeight();
            }
            fValueOf = Float.valueOf(width);
        }
        return ojc.h(fValueOf);
    }

    public final synchronized void a(int i) {
        lzv lzvVar;
        if (this.b.booleanValue() && (lzvVar = this.m) != null) {
            eW(oom.m(w(lzvVar)), i, 2);
        }
    }

    @Override // defpackage.mip
    public final synchronized void b(lzv lzvVar) {
        Integer num;
        Integer num2;
        Integer num3;
        if (this.b.booleanValue()) {
            this.m = lzvVar;
            this.k++;
            if (this.n == -1 && (num3 = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_STATE)) != null && (num3.intValue() == 2 || num3.intValue() == 4 || num3.intValue() == 3)) {
                this.n = this.k;
            }
            if (this.o == -1 && (num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE)) != null && (num2.intValue() == 2 || num2.intValue() == 4 || num2.intValue() == 5)) {
                this.o = this.k;
            }
            if (this.p == -1 && (num = (Integer) lzvVar.d(CaptureResult.CONTROL_AWB_STATE)) != null && (num.intValue() == 2 || num.intValue() == 3)) {
                this.p = this.k;
            }
            if (this.k > 60) {
                return;
            }
            this.l.add(w(lzvVar));
            if (this.k == 60) {
                eW(this.l, 2, 3);
            }
        }
    }
}
