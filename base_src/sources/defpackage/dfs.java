package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class dfs {
    private final fmi a;

    public dfs(fmi fmiVar) {
        this.a = fmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x015b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x015b, please report this as an issue */
    public final boolean a(Context context, bty btyVar) throws IOException {
        String path;
        fml fmlVar;
        boolean zB;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        boolean z;
        boolean z2;
        BitmapFactory.Options options;
        InputStream inputStreamC;
        int i;
        int i2;
        int i3;
        boolean z3;
        double d;
        double d2;
        fmg fmgVar = new fmg();
        boolean z4 = true;
        if (btyVar.b().equals(bua.PHOTO)) {
            Uri uriC = btyVar.a().c();
            ContentResolver contentResolver = context.getContentResolver();
            fmk fmkVar = null;
            if ("content".equals(uriC.getScheme())) {
                Cursor cursorQuery = contentResolver.query(uriC, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null) {
                    path = null;
                } else {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            cursorQuery.close();
                            path = string;
                        } else {
                            cursorQuery.close();
                            path = null;
                        }
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
            } else {
                path = uriC.getPath();
            }
            if (path == null) {
                fmlVar = fmm.a;
            } else {
                InputStream inputStreamC2 = fcy.c(path);
                if (inputStreamC2 != null) {
                    ast astVarM = mde.m(inputStreamC2);
                    try {
                        inputStreamC2.close();
                    } catch (IOException e) {
                        ((oug) ((oug) fmk.a.b()).G((char) 1777)).r("Failed to close stream: %s", e);
                    }
                    if (astVarM != null) {
                        try {
                            fmk.d(astVarM, "FirstPhotoDate");
                            fmk.d(astVarM, "LastPhotoDate");
                            fmk.a(astVarM, "SourcePhotosCount");
                            if (astVarM.e("http://ns.google.com/photos/1.0/panorama/", "ProjectionType")) {
                            }
                            zB = fmk.b(astVarM, "UsePanoramaViewer");
                            try {
                                iA = fmk.a(astVarM, "CroppedAreaImageWidthPixels");
                                try {
                                    iA2 = fmk.a(astVarM, "CroppedAreaImageHeightPixels");
                                    try {
                                        iA3 = fmk.a(astVarM, "FullPanoWidthPixels");
                                        try {
                                            iA4 = fmk.a(astVarM, "FullPanoHeightPixels");
                                            try {
                                                fmk.a(astVarM, "CroppedAreaLeftPixels");
                                                fmk.a(astVarM, "CroppedAreaTopPixels");
                                                fmk.a(astVarM, "LargestValidInteriorRectLeft");
                                                fmk.a(astVarM, "LargestValidInteriorRectTop");
                                                fmk.a(astVarM, "LargestValidInteriorRectWidth");
                                                fmk.a(astVarM, "LargestValidInteriorRectHeight");
                                                if (astVarM.e("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere")) {
                                                    fmk.b(astVarM, "IsPhotosphere");
                                                } else {
                                                    fmk.b(astVarM, "UsePanoramaViewer");
                                                }
                                                z2 = iA > 0 && iA2 > 0 && iA3 > 0 && iA4 > 0;
                                                z = zB;
                                            } catch (ass e2) {
                                                z = zB;
                                                z2 = false;
                                            }
                                        } catch (ass e3) {
                                            iA4 = 0;
                                            z = zB;
                                            z2 = false;
                                            options = new BitmapFactory.Options();
                                            options.inJustDecodeBounds = true;
                                            inputStreamC = fcy.c(path);
                                            if (inputStreamC == null) {
                                                ((oug) ((oug) fmk.a.c()).G((char) 1776)).o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                            } else {
                                                BitmapFactory.decodeStream(inputStreamC, null, options);
                                                try {
                                                    inputStreamC.close();
                                                } catch (IOException e4) {
                                                    ((oug) ((oug) fmk.a.b()).G((char) 1775)).r("Failed to close stream: %s", e4);
                                                }
                                                i = options.outWidth;
                                                i2 = options.outHeight;
                                                i3 = i2 + i2;
                                                if (!z2) {
                                                    z3 = i3 == i;
                                                    if (fmlVar == fmm.a) {
                                                        btyVar.a().c();
                                                        z4 = false;
                                                    } else {
                                                        fmgVar.e = true;
                                                        fmgVar.f = fmlVar.b;
                                                        fmgVar.g = fmlVar.a;
                                                    }
                                                    btyVar.g(fmgVar.a());
                                                    return z4;
                                                }
                                                double d3 = i;
                                                double d4 = i2;
                                                Double.isNaN(d3);
                                                Double.isNaN(d4);
                                                double d5 = d3 / d4;
                                                double d6 = iA;
                                                double d7 = iA2;
                                                Double.isNaN(d6);
                                                Double.isNaN(d7);
                                                double d8 = d6 / d7;
                                                if (!z3) {
                                                    if (!z3) {
                                                        d = iA3;
                                                        d2 = iA4;
                                                        Double.isNaN(d);
                                                        Double.isNaN(d2);
                                                        if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                            ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                        } else if (z3) {
                                                            fmkVar = new fmk(i, i2);
                                                        } else {
                                                            fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                        }
                                                    } else if (z3) {
                                                        fmkVar = new fmk(i, i2);
                                                    } else {
                                                        fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                    }
                                                } else if (!z3) {
                                                    d = iA3;
                                                    d2 = iA4;
                                                    Double.isNaN(d);
                                                    Double.isNaN(d2);
                                                    if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                        ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                    } else if (z3) {
                                                        fmkVar = new fmk(i, i2);
                                                    } else {
                                                        fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                    }
                                                } else if (z3) {
                                                    fmkVar = new fmk(i, i2);
                                                } else {
                                                    fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                }
                                            }
                                            if (fmkVar == null) {
                                                fmlVar = fmm.a;
                                            } else {
                                                fmlVar = new fml(fmkVar);
                                            }
                                            if (fmlVar == fmm.a) {
                                                btyVar.a().c();
                                                z4 = false;
                                            } else {
                                                fmgVar.e = true;
                                                fmgVar.f = fmlVar.b;
                                                fmgVar.g = fmlVar.a;
                                            }
                                            btyVar.g(fmgVar.a());
                                            return z4;
                                        }
                                    } catch (ass e5) {
                                        iA3 = 0;
                                        iA4 = 0;
                                        z = zB;
                                        z2 = false;
                                        options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        inputStreamC = fcy.c(path);
                                        if (inputStreamC == null) {
                                            ((oug) ((oug) fmk.a.c()).G((char) 1776)).o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                        } else {
                                            BitmapFactory.decodeStream(inputStreamC, null, options);
                                            inputStreamC.close();
                                            i = options.outWidth;
                                            i2 = options.outHeight;
                                            i3 = i2 + i2;
                                            if (!z2) {
                                                if (i3 == i) {
                                                }
                                                if (fmlVar == fmm.a) {
                                                    btyVar.a().c();
                                                    z4 = false;
                                                } else {
                                                    fmgVar.e = true;
                                                    fmgVar.f = fmlVar.b;
                                                    fmgVar.g = fmlVar.a;
                                                }
                                                btyVar.g(fmgVar.a());
                                                return z4;
                                            }
                                            double d9 = i;
                                            double d10 = i2;
                                            Double.isNaN(d9);
                                            Double.isNaN(d10);
                                            double d11 = d9 / d10;
                                            double d12 = iA;
                                            double d13 = iA2;
                                            Double.isNaN(d12);
                                            Double.isNaN(d13);
                                            double d14 = d12 / d13;
                                            if (!z3) {
                                                if (!z3) {
                                                    d = iA3;
                                                    d2 = iA4;
                                                    Double.isNaN(d);
                                                    Double.isNaN(d2);
                                                    if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                        ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                    } else if (z3) {
                                                        fmkVar = new fmk(i, i2);
                                                    } else {
                                                        fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                    }
                                                } else if (z3) {
                                                    fmkVar = new fmk(i, i2);
                                                } else {
                                                    fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                }
                                            } else if (!z3) {
                                                d = iA3;
                                                d2 = iA4;
                                                Double.isNaN(d);
                                                Double.isNaN(d2);
                                                if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                    ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                } else if (z3) {
                                                    fmkVar = new fmk(i, i2);
                                                } else {
                                                    fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                }
                                            } else if (z3) {
                                                fmkVar = new fmk(i, i2);
                                            } else {
                                                fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                            }
                                        }
                                        if (fmkVar == null) {
                                            fmlVar = fmm.a;
                                        } else {
                                            fmlVar = new fml(fmkVar);
                                        }
                                        if (fmlVar == fmm.a) {
                                            btyVar.a().c();
                                            z4 = false;
                                        } else {
                                            fmgVar.e = true;
                                            fmgVar.f = fmlVar.b;
                                            fmgVar.g = fmlVar.a;
                                        }
                                        btyVar.g(fmgVar.a());
                                        return z4;
                                    }
                                } catch (ass e6) {
                                    iA2 = 0;
                                    iA3 = 0;
                                    iA4 = 0;
                                    z = zB;
                                    z2 = false;
                                    options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    inputStreamC = fcy.c(path);
                                    if (inputStreamC == null) {
                                        ((oug) ((oug) fmk.a.c()).G((char) 1776)).o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                    } else {
                                        BitmapFactory.decodeStream(inputStreamC, null, options);
                                        inputStreamC.close();
                                        i = options.outWidth;
                                        i2 = options.outHeight;
                                        i3 = i2 + i2;
                                        if (!z2) {
                                            if (i3 == i) {
                                            }
                                            if (fmlVar == fmm.a) {
                                                btyVar.a().c();
                                                z4 = false;
                                            } else {
                                                fmgVar.e = true;
                                                fmgVar.f = fmlVar.b;
                                                fmgVar.g = fmlVar.a;
                                            }
                                            btyVar.g(fmgVar.a());
                                            return z4;
                                        }
                                        double d15 = i;
                                        double d16 = i2;
                                        Double.isNaN(d15);
                                        Double.isNaN(d16);
                                        double d17 = d15 / d16;
                                        double d18 = iA;
                                        double d19 = iA2;
                                        Double.isNaN(d18);
                                        Double.isNaN(d19);
                                        double d110 = d18 / d19;
                                        if (!z3) {
                                            if (!z3) {
                                                d = iA3;
                                                d2 = iA4;
                                                Double.isNaN(d);
                                                Double.isNaN(d2);
                                                if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                    ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                } else if (z3) {
                                                    fmkVar = new fmk(i, i2);
                                                } else {
                                                    fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                                }
                                            } else if (z3) {
                                                fmkVar = new fmk(i, i2);
                                            } else {
                                                fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                            }
                                        } else if (!z3) {
                                            d = iA3;
                                            d2 = iA4;
                                            Double.isNaN(d);
                                            Double.isNaN(d2);
                                            if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                            } else if (z3) {
                                                fmkVar = new fmk(i, i2);
                                            } else {
                                                fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                            }
                                        } else if (z3) {
                                            fmkVar = new fmk(i, i2);
                                        } else {
                                            fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                        }
                                    }
                                    if (fmkVar == null) {
                                        fmlVar = fmm.a;
                                    } else {
                                        fmlVar = new fml(fmkVar);
                                    }
                                    if (fmlVar == fmm.a) {
                                        btyVar.a().c();
                                        z4 = false;
                                    } else {
                                        fmgVar.e = true;
                                        fmgVar.f = fmlVar.b;
                                        fmgVar.g = fmlVar.a;
                                    }
                                    btyVar.g(fmgVar.a());
                                    return z4;
                                }
                            } catch (ass e7) {
                                iA = 0;
                                iA2 = 0;
                                iA3 = 0;
                                iA4 = 0;
                                z = zB;
                                z2 = false;
                                options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                inputStreamC = fcy.c(path);
                                if (inputStreamC == null) {
                                    ((oug) ((oug) fmk.a.c()).G((char) 1776)).o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                } else {
                                    BitmapFactory.decodeStream(inputStreamC, null, options);
                                    inputStreamC.close();
                                    i = options.outWidth;
                                    i2 = options.outHeight;
                                    i3 = i2 + i2;
                                    if (!z2) {
                                        if (i3 == i) {
                                        }
                                        if (fmlVar == fmm.a) {
                                            btyVar.a().c();
                                            z4 = false;
                                        } else {
                                            fmgVar.e = true;
                                            fmgVar.f = fmlVar.b;
                                            fmgVar.g = fmlVar.a;
                                        }
                                        btyVar.g(fmgVar.a());
                                        return z4;
                                    }
                                    double d111 = i;
                                    double d112 = i2;
                                    Double.isNaN(d111);
                                    Double.isNaN(d112);
                                    double d113 = d111 / d112;
                                    double d114 = iA;
                                    double d115 = iA2;
                                    Double.isNaN(d114);
                                    Double.isNaN(d115);
                                    double d116 = d114 / d115;
                                    if (!z3) {
                                        if (!z3) {
                                            d = iA3;
                                            d2 = iA4;
                                            Double.isNaN(d);
                                            Double.isNaN(d2);
                                            if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                                ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                            } else if (z3) {
                                                fmkVar = new fmk(i, i2);
                                            } else {
                                                fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                            }
                                        } else if (z3) {
                                            fmkVar = new fmk(i, i2);
                                        } else {
                                            fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                        }
                                    } else if (!z3) {
                                        d = iA3;
                                        d2 = iA4;
                                        Double.isNaN(d);
                                        Double.isNaN(d2);
                                        if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                            ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                                        } else if (z3) {
                                            fmkVar = new fmk(i, i2);
                                        } else {
                                            fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                        }
                                    } else if (z3) {
                                        fmkVar = new fmk(i, i2);
                                    } else {
                                        fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                                    }
                                }
                                if (fmkVar == null) {
                                    fmlVar = fmm.a;
                                } else {
                                    fmlVar = new fml(fmkVar);
                                }
                                if (fmlVar == fmm.a) {
                                    btyVar.a().c();
                                    z4 = false;
                                } else {
                                    fmgVar.e = true;
                                    fmgVar.f = fmlVar.b;
                                    fmgVar.g = fmlVar.a;
                                }
                                btyVar.g(fmgVar.a());
                                return z4;
                            }
                        } catch (ass e8) {
                            zB = false;
                        }
                    } else {
                        z2 = false;
                        iA = 0;
                        iA2 = 0;
                        iA3 = 0;
                        iA4 = 0;
                        z = false;
                    }
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    inputStreamC = fcy.c(path);
                    if (inputStreamC == null) {
                        ((oug) ((oug) fmk.a.c()).G((char) 1776)).o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                    } else {
                        BitmapFactory.decodeStream(inputStreamC, null, options);
                        inputStreamC.close();
                        i = options.outWidth;
                        i2 = options.outHeight;
                        i3 = i2 + i2;
                        if (!z2) {
                            if (i3 == i) {
                            }
                        }
                        double d117 = i;
                        double d118 = i2;
                        Double.isNaN(d117);
                        Double.isNaN(d118);
                        double d119 = d117 / d118;
                        double d1110 = iA;
                        double d1111 = iA2;
                        Double.isNaN(d1110);
                        Double.isNaN(d1111);
                        double d1112 = d1110 / d1111;
                        if (!z3 && !fmk.c(d119, d1112, 0.001d)) {
                            ((oug) ((oug) fmk.a.c()).G((char) 1773)).o("Pano metadata does not match file dimensions.");
                        } else if (!z3) {
                            d = iA3;
                            d2 = iA4;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            if (!fmk.c(d / d2, 2.0d, 0.1d)) {
                                ((oug) ((oug) fmk.a.c()).G((char) 1772)).o("Pano metadata invalid: Full pano dimension not 2:1.");
                            } else if (z3) {
                                fmkVar = new fmk(i, i2);
                            } else {
                                fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                            }
                        } else if (z3) {
                            fmkVar = new fmk(i, i2);
                        } else {
                            fmkVar = new fmk(z, iA, iA2, iA3, iA4);
                        }
                    }
                }
                if (fmkVar == null) {
                    fmlVar = fmm.a;
                } else {
                    fmlVar = new fml(fmkVar);
                }
            }
            if (fmlVar == fmm.a) {
                btyVar.a().c();
                z4 = false;
            } else {
                fmgVar.e = true;
                fmgVar.f = fmlVar.b;
                fmgVar.g = fmlVar.a;
            }
        } else if (btyVar.b().equals(bua.VIDEO)) {
            fmi fmiVar = this.a;
            Uri uriC2 = btyVar.a().c();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(fmiVar.b, uriC2);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
                    if (strExtractMetadata2 == null || strExtractMetadata3 == null) {
                        ((oug) ((oug) fmi.a.c()).G(1767)).r("Size metadata does not exist for the video at %s", uriC2);
                    } else {
                        fmgVar.b = Integer.parseInt(strExtractMetadata2);
                        fmgVar.c = Integer.parseInt(strExtractMetadata3);
                    }
                    if (strExtractMetadata != null) {
                        fmgVar.a = strExtractMetadata;
                    } else {
                        ((oug) ((oug) fmi.a.c()).G(1768)).r("Orientation metadata does not exist for the video at %s", uriC2);
                    }
                    if (strExtractMetadata4 != null) {
                        fmgVar.d = (int) Double.parseDouble(strExtractMetadata4);
                    } else {
                        ((oug) ((oug) fmi.a.c()).G(1769)).r("Framerate metadata does not exist for the video at %s", uriC2);
                    }
                    if (strExtractMetadata2 == null || strExtractMetadata3 == null || strExtractMetadata == null) {
                        mediaMetadataRetriever.release();
                        mediaMetadataRetriever.close();
                        z4 = false;
                    } else {
                        mediaMetadataRetriever.release();
                        mediaMetadataRetriever.close();
                    }
                } catch (Throwable th2) {
                    mediaMetadataRetriever.release();
                    mediaMetadataRetriever.close();
                    throw th2;
                }
            } catch (RuntimeException e9) {
                ((oug) ((oug) ((oug) fmi.a.b()).h(e9)).G(1770)).o("VideoRotationMetadataLoader.loadRotationMetadata() failed!");
            }
        } else {
            z4 = false;
        }
        btyVar.g(fmgVar.a());
        return z4;
    }
}
