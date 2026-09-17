package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes.dex */
public final class fjx {
    public final poy a;

    public fjx() {
        this.a = pdb.v.m();
    }

    public fjx(int i, boolean z) {
        obr.aF(i != 1);
        poy poyVarM = pam.T.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pam pamVar = (pam) poyVarM.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        pamVar.c = i2;
        int i3 = pamVar.a | 2;
        pamVar.a = i3;
        pamVar.a = i3 | 4;
        pamVar.d = z;
        this.a = poyVarM;
    }

    public static final pbi l(pln plnVar) {
        poy poyVarM = pbi.h.m();
        int i = plnVar.a;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbi pbiVar = (pbi) poyVarM.b;
        int i2 = pbiVar.a | 1;
        pbiVar.a = i2;
        pbiVar.b = i;
        int i3 = plnVar.b;
        int i4 = i2 | 2;
        pbiVar.a = i4;
        pbiVar.c = i3;
        int i5 = plnVar.c;
        int i6 = i4 | 4;
        pbiVar.a = i6;
        pbiVar.d = i5;
        int i7 = plnVar.d;
        int i8 = i6 | 8;
        pbiVar.a = i8;
        pbiVar.e = i7;
        int i9 = plnVar.e;
        int i10 = i8 | 16;
        pbiVar.a = i10;
        pbiVar.f = i9;
        int i11 = plnVar.f;
        pbiVar.a = i10 | 32;
        pbiVar.g = i11;
        return (pbi) poyVarM.j();
    }

    public final void a(llz llzVar) {
        if (llzVar == null) {
            return;
        }
        poy poyVar = this.a;
        poy poyVarM = pbe.p.m();
        String tagStringValue = llzVar.getTagStringValue(ExifInterface.g);
        if (tagStringValue != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar = (pbe) poyVarM.b;
            pbeVar.a |= 4;
            pbeVar.c = tagStringValue;
        }
        String tagStringValue2 = llzVar.getTagStringValue(ExifInterface.h);
        if (tagStringValue2 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar2 = (pbe) poyVarM.b;
            pbeVar2.a |= 4;
            pbeVar2.c = tagStringValue2;
        }
        String tagStringValue3 = llzVar.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue3 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar3 = (pbe) poyVarM.b;
            pbeVar3.a |= 1;
            pbeVar3.b = tagStringValue3;
        }
        lid lidVarA = llzVar.a(ExifInterface.F);
        if (lidVarA != null) {
            float f = lidVarA.a / lidVarA.b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar4 = (pbe) poyVarM.b;
            pbeVar4.a |= 8;
            pbeVar4.d = f;
        }
        Integer numB = llzVar.b(ExifInterface.J);
        if (numB != null) {
            int iIntValue = numB.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar5 = (pbe) poyVarM.b;
            pbeVar5.a |= 16;
            pbeVar5.e = iIntValue;
        }
        lid lidVarA2 = llzVar.a(ExifInterface.Z);
        if (lidVarA2 != null) {
            float f2 = lidVarA2.a / lidVarA2.b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar6 = (pbe) poyVarM.b;
            pbeVar6.a |= 32;
            pbeVar6.f = f2;
        }
        lid lidVarA3 = llzVar.a(ExifInterface.R);
        if (lidVarA3 != null) {
            float f3 = lidVarA3.a / lidVarA3.b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar7 = (pbe) poyVarM.b;
            pbeVar7.a |= 64;
            pbeVar7.g = f3;
        }
        boolean z = (llzVar.a(ExifInterface.aT) == null || llzVar.a(ExifInterface.aV) == null) ? false : true;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbe pbeVar8 = (pbe) poyVarM.b;
        pbeVar8.a |= 256;
        pbeVar8.h = z;
        Integer numB2 = llzVar.b(ExifInterface.j);
        if (numB2 != null) {
            int iIntValue2 = numB2.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar9 = (pbe) poyVarM.b;
            pbeVar9.a |= 512;
            pbeVar9.i = iIntValue2;
        }
        Integer numB3 = llzVar.b(ExifInterface.aj);
        if (numB3 != null) {
            int iIntValue3 = numB3.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar10 = (pbe) poyVarM.b;
            pbeVar10.a |= 1024;
            pbeVar10.j = iIntValue3;
        }
        Integer numB4 = llzVar.b(ExifInterface.ai);
        if (numB4 != null) {
            int iIntValue4 = numB4.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar11 = (pbe) poyVarM.b;
            pbeVar11.a |= 2048;
            pbeVar11.k = iIntValue4;
        }
        Integer numB5 = llzVar.b(ExifInterface.Y);
        if (numB5 != null) {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar12 = (pbe) poyVarM.b;
            pbeVar12.a |= 4096;
            pbeVar12.l = true;
            int iIntValue5 = numB5.intValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar13 = (pbe) poyVarM.b;
            pbeVar13.a |= 8192;
            pbeVar13.m = iIntValue5;
        } else {
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar14 = (pbe) poyVarM.b;
            pbeVar14.a |= 4096;
            pbeVar14.l = false;
        }
        lid lidVarA4 = llzVar.a(ExifInterface.T);
        if (lidVarA4 != null) {
            float f4 = lidVarA4.a / lidVarA4.b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar15 = (pbe) poyVarM.b;
            pbeVar15.a |= 16384;
            pbeVar15.n = f4;
        }
        lid lidVarA5 = llzVar.a(ExifInterface.V);
        if (lidVarA5 != null) {
            float f5 = lidVarA5.a / lidVarA5.b;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbe pbeVar16 = (pbe) poyVarM.b;
            pbeVar16.a |= 32768;
            pbeVar16.o = f5;
        }
        pbe pbeVar17 = (pbe) poyVarM.j();
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pbeVar17.getClass();
        pamVar.g = pbeVar17;
        pamVar.a |= 32;
    }

    public final void b(boolean z) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.a |= 64;
        pamVar.h = z;
    }

    public final void c(boolean z) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.b |= 131072;
        pamVar.O = z;
    }

    public final void d(pcu pcuVar) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.S = pcuVar;
        pamVar.b |= 8388608;
    }

    public final void e(float f) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.a |= 16;
        pamVar.f = f;
    }

    public final void f(pem pemVar) {
        if (pemVar == null) {
            return;
        }
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.n = pemVar;
        pamVar.a |= 8192;
    }

    public final void g(float f) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.a |= 8;
        pamVar.e = f;
    }

    public final void h(int i) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        int i2 = i - 1;
        pam pamVar2 = pam.T;
        if (i == 0) {
            throw null;
        }
        pamVar.z = i2;
        pamVar.b |= 2;
    }

    public final void i(int i) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        pam pamVar2 = pam.T;
        pamVar.j = i - 1;
        pamVar.a |= 256;
    }

    public final void j(int i) {
        poy poyVar = this.a;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pam pamVar = (pam) poyVar.b;
        int i2 = i - 1;
        pam pamVar2 = pam.T;
        if (i == 0) {
            throw null;
        }
        pamVar.K = i2;
        pamVar.b |= 4096;
    }

    public final pdb k() {
        return (pdb) this.a.j();
    }
}
