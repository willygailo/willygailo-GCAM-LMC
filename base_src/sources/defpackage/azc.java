package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class azc implements ayy {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final biq j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public aza f = new aza();

    static {
        azc.class.getSimpleName();
    }

    public azc(biq biqVar, aza azaVar, ByteBuffer byteBuffer, int i) {
        this.j = biqVar;
        c(azaVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap bitmapB = this.j.a.b(this.t, this.s, config);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    /* JADX WARN: Code duplicated, block: B:229:0x041f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0421 A[Catch: all -> 0x04d4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:62:0x00b8, B:64:0x00d0, B:66:0x00d5, B:67:0x00da, B:69:0x00e0, B:71:0x00e4, B:73:0x00f6, B:75:0x0102, B:77:0x0111, B:79:0x0115, B:82:0x0120, B:84:0x0128, B:85:0x012c, B:87:0x0132, B:88:0x0136, B:90:0x013c, B:91:0x0142, B:93:0x0156, B:94:0x015f, B:98:0x017d, B:103:0x01a2, B:135:0x027a, B:137:0x0284, B:140:0x028b, B:142:0x02a1, B:146:0x02ae, B:148:0x02b4, B:150:0x02be, B:152:0x02c2, B:154:0x02c6, B:155:0x02cf, B:156:0x02d5, B:158:0x02d9, B:169:0x02ed, B:246:0x0492, B:248:0x0496, B:252:0x049d, B:254:0x04a1, B:255:0x04a7, B:256:0x04ba, B:162:0x02e2, B:170:0x02f5, B:172:0x031a, B:176:0x0323, B:177:0x0325, B:182:0x0333, B:184:0x0338, B:186:0x033b, B:190:0x0348, B:194:0x0357, B:196:0x0364, B:200:0x0372, B:199:0x036b, B:239:0x0469, B:202:0x0389, B:204:0x0396, B:205:0x03a5, B:207:0x03ac, B:210:0x03b5, B:212:0x03c2, B:213:0x03d7, B:216:0x03e7, B:217:0x03e9, B:219:0x03ee, B:222:0x03f5, B:224:0x0400, B:225:0x0415, B:232:0x0435, B:236:0x0443, B:235:0x043c, B:230:0x0421, B:240:0x047e, B:245:0x048c, B:244:0x0488, B:106:0x01b2, B:108:0x01d4, B:115:0x0200, B:117:0x0211, B:120:0x021b, B:121:0x0224, B:123:0x0232, B:126:0x0243, B:130:0x0252, B:101:0x018a, B:81:0x0118, B:76:0x010b, B:8:0x000e), top: B:266:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0435 A[Catch: all -> 0x04d4, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:62:0x00b8, B:64:0x00d0, B:66:0x00d5, B:67:0x00da, B:69:0x00e0, B:71:0x00e4, B:73:0x00f6, B:75:0x0102, B:77:0x0111, B:79:0x0115, B:82:0x0120, B:84:0x0128, B:85:0x012c, B:87:0x0132, B:88:0x0136, B:90:0x013c, B:91:0x0142, B:93:0x0156, B:94:0x015f, B:98:0x017d, B:103:0x01a2, B:135:0x027a, B:137:0x0284, B:140:0x028b, B:142:0x02a1, B:146:0x02ae, B:148:0x02b4, B:150:0x02be, B:152:0x02c2, B:154:0x02c6, B:155:0x02cf, B:156:0x02d5, B:158:0x02d9, B:169:0x02ed, B:246:0x0492, B:248:0x0496, B:252:0x049d, B:254:0x04a1, B:255:0x04a7, B:256:0x04ba, B:162:0x02e2, B:170:0x02f5, B:172:0x031a, B:176:0x0323, B:177:0x0325, B:182:0x0333, B:184:0x0338, B:186:0x033b, B:190:0x0348, B:194:0x0357, B:196:0x0364, B:200:0x0372, B:199:0x036b, B:239:0x0469, B:202:0x0389, B:204:0x0396, B:205:0x03a5, B:207:0x03ac, B:210:0x03b5, B:212:0x03c2, B:213:0x03d7, B:216:0x03e7, B:217:0x03e9, B:219:0x03ee, B:222:0x03f5, B:224:0x0400, B:225:0x0415, B:232:0x0435, B:236:0x0443, B:235:0x043c, B:230:0x0421, B:240:0x047e, B:245:0x048c, B:244:0x0488, B:106:0x01b2, B:108:0x01d4, B:115:0x0200, B:117:0x0211, B:120:0x021b, B:121:0x0224, B:123:0x0232, B:126:0x0243, B:130:0x0252, B:101:0x018a, B:81:0x0118, B:76:0x010b, B:8:0x000e), top: B:266:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x0438  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50, types: [short] */
    /* JADX WARN: Type inference failed for: r0v52 */
    @Override // defpackage.ayy
    public final synchronized Bitmap a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        short s;
        int i13;
        Bitmap bitmap;
        int i14;
        if (this.f.c <= 0 || this.e < 0) {
            this.q = 1;
        }
        int i15 = this.q;
        if (i15 != 1 && i15 != 2) {
            this.q = 0;
            if (this.b == null) {
                this.b = this.j.c(255);
            }
            ayz ayzVar = (ayz) this.f.e.get(this.e);
            int i16 = this.e - 1;
            ayz ayzVar2 = i16 >= 0 ? (ayz) this.f.e.get(i16) : null;
            int[] iArr = ayzVar.k;
            if (iArr == null) {
                iArr = this.f.a;
            }
            this.k = iArr;
            if (iArr == null) {
                this.q = 1;
                return null;
            }
            if (ayzVar.f) {
                System.arraycopy(iArr, 0, this.l, 0, 256);
                int[] iArr2 = this.l;
                this.k = iArr2;
                iArr2[ayzVar.h] = 0;
                if (ayzVar.g == 2 && this.e == 0) {
                    this.h = true;
                }
            }
            int[] iArr3 = this.d;
            if (ayzVar2 == null) {
                Bitmap bitmap2 = this.g;
                if (bitmap2 != null) {
                    this.j.a(bitmap2);
                }
                this.g = null;
                Arrays.fill(iArr3, 0);
            }
            if (ayzVar2 != null && ayzVar2.g == 3 && this.g == null) {
                Arrays.fill(iArr3, 0);
            }
            if (ayzVar2 != null && (i13 = ayzVar2.g) > 0) {
                if (i13 == 2) {
                    if (ayzVar.f) {
                        i14 = 0;
                    } else {
                        aza azaVar = this.f;
                        i14 = azaVar.l;
                        if (ayzVar.k != null && azaVar.j == ayzVar.h) {
                            i14 = 0;
                        }
                    }
                    int i17 = ayzVar2.d;
                    int i18 = this.r;
                    int i19 = i17 / i18;
                    int i20 = ayzVar2.b / i18;
                    int i21 = ayzVar2.c / i18;
                    int i22 = ayzVar2.a / i18;
                    int i23 = this.t;
                    int i24 = (i20 * i23) + i22;
                    int i25 = (i19 * i23) + i24;
                    while (i24 < i25) {
                        int i26 = i24 + i21;
                        for (int i27 = i24; i27 < i26; i27++) {
                            iArr3[i27] = i14;
                        }
                        i24 += this.t;
                    }
                } else if (i13 == 3 && (bitmap = this.g) != null) {
                    int i28 = this.t;
                    bitmap.getPixels(iArr3, 0, i28, 0, 0, i28, this.s);
                }
            }
            if (ayzVar != null) {
            }
            if (ayzVar == null) {
                aza azaVar2 = this.f;
                i = azaVar2.f * azaVar2.g;
            } else {
                i = ayzVar.d * ayzVar.c;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null || bArr2.length < i) {
                this.c = this.j.c(i);
            }
            byte[] bArr3 = this.c;
            if (this.m == null) {
                this.m = new short[4096];
            }
            short[] sArr = this.m;
            if (this.n == null) {
                this.n = new byte[4096];
            }
            byte[] bArr4 = this.n;
            if (this.o == null) {
                this.o = new byte[4097];
            }
            byte[] bArr5 = this.o;
            int iD = d();
            int i29 = 1 << iD;
            int i30 = i29 + 1;
            int i31 = i29 + 2;
            int i32 = iD + 1;
            int i33 = (1 << i32) - 1;
            for (int i34 = 0; i34 < i29; i34++) {
                sArr[i34] = 0;
                bArr4[i34] = (byte) i34;
            }
            byte[] bArr6 = this.b;
            int i35 = i32;
            int i36 = i31;
            int i37 = i33;
            int i38 = 0;
            int i39 = -1;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            while (i38 < i) {
                if (i40 == 0) {
                    int iD2 = d();
                    if (iD2 <= 0) {
                        i40 = 0;
                    } else {
                        ByteBuffer byteBuffer = this.a;
                        i40 = iD2;
                        byteBuffer.get(this.b, 0, Math.min(iD2, byteBuffer.remaining()));
                    }
                    if (i40 <= 0) {
                        this.q = 3;
                        break;
                    }
                    i41 = 0;
                } else {
                    i38 = i38;
                    i39 = i39;
                }
                i43 += (bArr6[i41] & 255) << i42;
                i41++;
                i40--;
                i35 = i35;
                int i47 = i42 + 8;
                i38 = i38;
                i39 = i39;
                bArr6 = bArr6;
                i32 = i32;
                i44 = i44;
                i36 = i36;
                while (true) {
                    if (i47 < i35) {
                        iArr3 = iArr3;
                        i42 = i47;
                        break;
                    }
                    iArr3 = iArr3;
                    int i48 = i43 & i37;
                    i43 >>= i35;
                    i47 -= i35;
                    if (i48 == i29) {
                        i36 = i31;
                        i37 = i33;
                        i35 = i32;
                        i39 = -1;
                    } else {
                        if (i48 == i30) {
                            iArr3 = iArr3;
                            i42 = i47;
                            break;
                        }
                        if (i39 == -1) {
                            bArr3[i46] = bArr4[i48];
                            i46++;
                            i38++;
                            i44 = i48;
                            i39 = i44;
                            i47 = i47;
                        } else {
                            if (i48 >= i36) {
                                bArr5[i45] = (byte) i44;
                                i45++;
                                s = i39;
                            } else {
                                s = i48;
                            }
                            while (s >= i29) {
                                bArr5[i45] = bArr4[s];
                                i45++;
                                s = sArr[s];
                            }
                            int i49 = bArr4[s] & 255;
                            byte b = (byte) i49;
                            bArr3[i46] = b;
                            i46++;
                            i38++;
                            while (i45 > 0) {
                                i45--;
                                bArr3[i46] = bArr5[i45];
                                i46++;
                                i38++;
                            }
                            if (i36 < 4096) {
                                sArr[i36] = (short) i39;
                                bArr4[i36] = b;
                                i36++;
                                if ((i36 & i37) == 0 && i36 < 4096) {
                                    i35++;
                                    i37 += i36;
                                }
                            }
                            i39 = i48;
                            i47 = i47;
                            i44 = i49;
                        }
                    }
                }
            }
            Arrays.fill(bArr3, i46, i, (byte) 0);
            if (ayzVar.e || this.r != 1) {
                int[] iArr4 = this.d;
                int i50 = ayzVar.d;
                int i51 = this.r;
                int i52 = i50 / i51;
                int i53 = ayzVar.b / i51;
                int i54 = ayzVar.c / i51;
                int i55 = ayzVar.a / i51;
                int i56 = this.e;
                int i57 = this.t;
                int i58 = this.s;
                byte[] bArr7 = this.c;
                int[] iArr5 = this.k;
                Boolean bool = this.h;
                int i59 = 0;
                int i60 = 0;
                int i61 = 1;
                int i62 = 8;
                while (i59 < i52) {
                    Boolean bool2 = bool;
                    if (ayzVar.e) {
                        if (i60 >= i52) {
                            i61++;
                            switch (i61) {
                                case 2:
                                    i60 = 4;
                                    break;
                                case 3:
                                    i60 = 2;
                                    i62 = 4;
                                    break;
                                case 4:
                                    i60 = 1;
                                    i62 = 2;
                                    break;
                            }
                        }
                        i2 = i60 + i62;
                    } else {
                        i2 = i60;
                        i60 = i59;
                    }
                    int i63 = i60 + i53;
                    if (i63 < i58) {
                        int i64 = i63 * i57;
                        int i65 = i64 + i55;
                        i3 = i52;
                        int i66 = i65 + i54;
                        int i67 = i64 + i57;
                        if (i67 < i66) {
                            i66 = i67;
                        }
                        i4 = i53;
                        int i68 = i59 * i51 * ayzVar.c;
                        if (i51 == 1) {
                            int i69 = i65;
                            while (i69 < i66) {
                                int i70 = i54;
                                int i71 = i55;
                                int i72 = iArr5[bArr7[i68] & 255];
                                if (i72 != 0) {
                                    iArr4[i69] = i72;
                                } else if (i56 == 0 && bool2 == null) {
                                    bool2 = true;
                                }
                                i68++;
                                i69++;
                                i54 = i70;
                                i55 = i71;
                            }
                            i5 = i54;
                            i6 = i55;
                            i7 = i57;
                            i8 = i58;
                            bArr = bArr7;
                        } else {
                            i5 = i54;
                            i6 = i55;
                            int i73 = ((i66 - i65) * i51) + i68;
                            int i74 = i65;
                            while (i74 < i66) {
                                int i75 = ayzVar.c;
                                int i76 = i66;
                                int i77 = i68;
                                int i78 = 0;
                                int i79 = 0;
                                int i80 = 0;
                                int i81 = 0;
                                int i82 = 0;
                                while (true) {
                                    i9 = i57;
                                    if (i77 < this.r + i68) {
                                        byte[] bArr8 = this.c;
                                        i10 = i58;
                                        if (i77 < bArr8.length && i77 < i73) {
                                            byte[] bArr9 = bArr7;
                                            int i83 = this.k[bArr8[i77] & 255];
                                            if (i83 != 0) {
                                                i82 += (i83 >> 24) & 255;
                                                i78 += (i83 >> 16) & 255;
                                                i79 += (i83 >> 8) & 255;
                                                i80 += i83 & 255;
                                                i81++;
                                            }
                                            i77++;
                                            i57 = i9;
                                            i58 = i10;
                                            bArr7 = bArr9;
                                        }
                                    } else {
                                        i10 = i58;
                                    }
                                }
                                int i84 = i75 + i68;
                                for (int i85 = i84; i85 < this.r + i84; i85++) {
                                    byte[] bArr10 = this.c;
                                    if (i85 >= bArr10.length || i85 >= i73) {
                                        if (i81 == 0) {
                                            i11 = 0;
                                        } else {
                                            i11 = ((i82 / i81) << 24) | ((i78 / i81) << 16) | ((i79 / i81) << 8) | (i80 / i81);
                                        }
                                        if (i11 != 0) {
                                            iArr4[i74] = i11;
                                        } else if (i56 != 0 && bool2 == null) {
                                            bool2 = true;
                                        }
                                        i68 += i51;
                                        i74++;
                                        i66 = i76;
                                        i57 = i9;
                                        i58 = i10;
                                        bArr7 = bArr7;
                                    } else {
                                        int i86 = this.k[bArr10[i85] & 255];
                                        if (i86 != 0) {
                                            i82 += (i86 >> 24) & 255;
                                            i78 += (i86 >> 16) & 255;
                                            i79 += (i86 >> 8) & 255;
                                            i80 += i86 & 255;
                                            i81++;
                                        }
                                    }
                                }
                                if (i81 == 0) {
                                    i11 = 0;
                                } else {
                                    i11 = ((i82 / i81) << 24) | ((i78 / i81) << 16) | ((i79 / i81) << 8) | (i80 / i81);
                                }
                                if (i11 != 0) {
                                    iArr4[i74] = i11;
                                } else if (i56 != 0) {
                                }
                                i68 += i51;
                                i74++;
                                i66 = i76;
                                i57 = i9;
                                i58 = i10;
                                bArr7 = bArr7;
                            }
                            i7 = i57;
                            i8 = i58;
                            bArr = bArr7;
                        }
                    } else {
                        i3 = i52;
                        i4 = i53;
                        i5 = i54;
                        i6 = i55;
                        i7 = i57;
                        i8 = i58;
                        bArr = bArr7;
                    }
                    i59++;
                    i60 = i2;
                    bool = bool2;
                    i52 = i3;
                    i53 = i4;
                    i54 = i5;
                    i55 = i6;
                    i57 = i7;
                    i58 = i8;
                    bArr7 = bArr;
                }
                Boolean bool3 = bool;
                if (this.h == null) {
                    this.h = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
                }
            } else {
                int[] iArr6 = this.d;
                int i87 = ayzVar.d;
                int i88 = ayzVar.b;
                int i89 = ayzVar.c;
                int i90 = ayzVar.a;
                int i91 = this.e;
                int i92 = this.t;
                byte[] bArr11 = this.c;
                int[] iArr7 = this.k;
                byte b2 = -1;
                for (int i93 = 0; i93 < i87; i93++) {
                    int i94 = (i93 + i88) * i92;
                    int i95 = i94 + i90;
                    int i96 = i95 + i89;
                    int i97 = i94 + i92;
                    if (i97 < i96) {
                        i96 = i97;
                    }
                    int i98 = ayzVar.c * i93;
                    while (i95 < i96) {
                        int i99 = i87;
                        byte b3 = bArr11[i98];
                        int i100 = i96;
                        int i101 = b3 & 255;
                        if (i101 != b2) {
                            int i102 = iArr7[i101];
                            if (i102 != 0) {
                                iArr6[i95] = i102;
                            } else {
                                b2 = b3;
                            }
                        }
                        i98++;
                        i95++;
                        i87 = i99;
                        i96 = i100;
                    }
                }
                Boolean bool4 = this.h;
                if (bool4 == null || !bool4.booleanValue()) {
                    z = this.h == null && i91 == 0 && b2 != -1;
                }
                this.h = Boolean.valueOf(z);
            }
            if (this.p && ((i12 = ayzVar.g) == 0 || i12 == 1)) {
                if (this.g == null) {
                    this.g = e();
                }
                Bitmap bitmap3 = this.g;
                int i103 = this.t;
                bitmap3.setPixels(iArr3, 0, i103, 0, 0, i103, this.s);
            }
            Bitmap bitmapE = e();
            int i104 = this.t;
            bitmapE.setPixels(iArr3, 0, i104, 0, 0, i104, this.s);
            return bitmapE;
        }
        return null;
    }

    @Override // defpackage.ayy
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(aza azaVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Sample size must be >=0, not: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.q = 0;
            this.f = azaVar;
            this.e = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = byteBufferAsReadOnlyBuffer;
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            Iterator it = azaVar.e.iterator();
            while (it.hasNext()) {
                if (((ayz) it.next()).g == 3) {
                    this.p = true;
                    break;
                }
            }
            this.r = iHighestOneBit;
            int i2 = azaVar.f;
            this.t = i2 / iHighestOneBit;
            int i3 = azaVar.g;
            this.s = i3 / iHighestOneBit;
            this.c = this.j.c(i2 * i3);
            biq biqVar = this.j;
            int i4 = this.t * this.s;
            bct bctVar = biqVar.b;
            this.d = bctVar == null ? new int[i4] : (int[]) bctVar.a(i4, int[].class);
        } catch (Throwable th) {
            throw th;
        }
    }
}
