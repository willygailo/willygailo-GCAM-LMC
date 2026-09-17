package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.android.GoogleCameraEngR18F1.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qw {
    private static qw b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private qv g;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final xe h = new xe(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        xe xeVar = h;
        porterDuffColorFilter = (PorterDuffColorFilter) xeVar.a(Integer.valueOf(xe.c(i, mode)));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized qw e() {
        if (b == null) {
            b = new qw();
        }
        return b;
    }

    static void h(Drawable drawable, rl rlVar, int[] iArr) {
        ColorStateList colorStateList;
        if (!oj.c(drawable) || drawable.mutate() == drawable) {
            PorterDuffColorFilter porterDuffColorFilterB = null;
            if (rlVar.d) {
                colorStateList = rlVar.a;
            } else {
                if (!rlVar.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = rlVar.c ? rlVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterB);
        }
    }

    private final synchronized Drawable i(Context context, long j) {
        xd xdVar = (xd) this.d.get(context);
        if (xdVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) xdVar.c(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = xb.b(xdVar.c, xdVar.e, j);
            if (iB >= 0 && xdVar.d[iB] != xd.a) {
                xdVar.d[iB] = xd.a;
                xdVar.b = true;
            }
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            xd xdVar = (xd) this.d.get(context);
            if (xdVar == null) {
                xdVar = new xd();
                this.d.put(context, xdVar);
            }
            xdVar.g(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        int iB;
        xg xgVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateListA = null;
        ColorStateList colorStateList = (weakHashMap == null || (xgVar = (xg) weakHashMap.get(context)) == null) ? null : (ColorStateList) xgVar.d(i);
        if (colorStateList == null) {
            qv qvVar = this.g;
            if (qvVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListA = jr.a(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListA = jr.a(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = ri.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = ri.a;
                        iArr2[0] = ri.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = ri.d;
                        iArr2[1] = ri.b(context, R.attr.colorControlActivated);
                        iArr[2] = ri.e;
                        iArr2[2] = ri.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = ri.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = ri.d;
                        iArr2[1] = ri.b(context, R.attr.colorControlActivated);
                        iArr[2] = ri.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListA = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == R.drawable.abc_btn_default_mtrl_shape) {
                        iB = ri.b(context, R.attr.colorButtonNormal);
                    } else if (i == R.drawable.abc_btn_borderless_material) {
                        colorStateListA = mt.b(context, 0);
                    } else if (i == R.drawable.abc_btn_colored_material) {
                        iB = ri.b(context, R.attr.colorAccent);
                    } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                        colorStateListA = jr.a(context, R.color.abc_tint_spinner);
                    } else if (mt.a(((mt) qvVar).b, i)) {
                        colorStateListA = ri.c(context, R.attr.colorControlNormal);
                    } else if (mt.a(((mt) qvVar).e, i)) {
                        colorStateListA = jr.a(context, R.color.abc_tint_default);
                    } else if (mt.a(((mt) qvVar).f, i)) {
                        colorStateListA = jr.a(context, R.color.abc_tint_btn_checkable);
                    } else if (i == R.drawable.abc_seekbar_thumb_material) {
                        colorStateListA = jr.a(context, R.color.abc_tint_seek_thumb);
                        i = R.drawable.abc_seekbar_thumb_material;
                    }
                    colorStateListA = mt.b(context, iB);
                }
            }
            if (colorStateListA != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                xg xgVar2 = (xg) this.c.get(context);
                if (xgVar2 == null) {
                    xgVar2 = new xg();
                    this.c.put(context, xgVar2);
                }
                int i2 = xgVar2.e;
                if (i2 == 0 || i > xgVar2.c[i2 - 1]) {
                    if (xgVar2.b && i2 >= xgVar2.c.length) {
                        xgVar2.f();
                    }
                    int i3 = xgVar2.e;
                    if (i3 >= xgVar2.c.length) {
                        int iD = xb.d(i3 + 1);
                        int[] iArr4 = new int[iD];
                        Object[] objArr = new Object[iD];
                        int[] iArr5 = xgVar2.c;
                        System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                        Object[] objArr2 = xgVar2.d;
                        System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                        xgVar2.c = iArr4;
                        xgVar2.d = objArr;
                    }
                    xgVar2.c[i3] = i;
                    xgVar2.d[i3] = colorStateListA;
                    xgVar2.e = i3 + 1;
                } else {
                    xgVar2.g(i, colorStateListA);
                }
                return colorStateListA;
            }
            colorStateList = colorStateListA;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0153 A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0185 A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0 A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c3 A[Catch: all -> 0x01db, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:41:0x00c3, B:42:0x00c8, B:49:0x00d9, B:47:0x00d5, B:51:0x00e0, B:55:0x00f7, B:56:0x011e, B:60:0x0129, B:62:0x0153, B:79:0x01aa, B:81:0x01b0, B:83:0x01b6, B:85:0x01c3, B:65:0x016a, B:68:0x017b, B:70:0x0185, B:73:0x018f, B:91:0x01cd, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:94:0x01d1, B:95:0x01da), top: B:101:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    final synchronized Drawable d(Context context, int i, boolean z) {
        Drawable drawable;
        PorterDuff.Mode mode;
        boolean zA;
        int i2;
        int iRound;
        Drawable drawableMutate;
        Drawable drawableFindDrawableByLayerId;
        int iB;
        PorterDuff.Mode mode2;
        int i3 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f) {
                this.f = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof akq) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue = this.e;
            context.getResources().getValue(i3, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableI = i(context, j);
            drawable = null;
            mode = null;
            PorterDuff.Mode mode3 = null;
            if (drawableI == null) {
                if (this.g == null) {
                    drawableI = null;
                } else if (i3 == R.drawable.abc_cab_background_top_material) {
                    drawableI = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                } else if (i3 == R.drawable.abc_ratingbar_material) {
                    drawableI = mt.c(this, context, R.dimen.abc_star_big);
                } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                    drawableI = mt.c(this, context, R.dimen.abc_star_medium);
                } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                    drawableI = mt.c(this, context, R.dimen.abc_star_small);
                    i3 = R.drawable.abc_ratingbar_small_material;
                } else {
                    drawableI = null;
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    j(context, j, drawableI);
                }
            }
            if (drawableI == null) {
                drawableI = aar.a(context, i3);
            }
            if (drawableI == null) {
                drawable = drawableI;
            } else {
                ColorStateList colorStateListA = a(context, i3);
                if (colorStateListA != null) {
                    if (oj.c(drawableI)) {
                        drawableI = drawableI.mutate();
                    }
                    drawableI.setTintList(colorStateListA);
                    if (this.g != null && i3 == R.drawable.abc_switch_thumb_material) {
                        mode3 = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode3 != null) {
                        drawableI.setTintMode(mode3);
                    }
                } else {
                    qv qvVar = this.g;
                    if (qvVar != null) {
                        if (i3 == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawableI;
                            mt.d(layerDrawable.findDrawableByLayerId(android.R.id.background), ri.b(context, R.attr.colorControlNormal), mu.a);
                            mt.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ri.b(context, R.attr.colorControlNormal), mu.a);
                            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                            iB = ri.b(context, R.attr.colorControlActivated);
                            mode2 = mu.a;
                        } else if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawableI;
                            mt.d(layerDrawable2.findDrawableByLayerId(android.R.id.background), ri.a(context, R.attr.colorControlNormal), mu.a);
                            mt.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ri.b(context, R.attr.colorControlActivated), mu.a);
                            drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
                            iB = ri.b(context, R.attr.colorControlActivated);
                            mode2 = mu.a;
                        } else if (qvVar != null) {
                            mode = mu.a;
                            zA = mt.a(((mt) qvVar).a, i3);
                            i2 = android.R.attr.colorBackground;
                            if (zA) {
                                iRound = -1;
                                z2 = true;
                                i2 = R.attr.colorControlNormal;
                            } else if (mt.a(((mt) qvVar).c, i3)) {
                                iRound = -1;
                                z2 = true;
                                i2 = R.attr.colorControlActivated;
                            } else if (mt.a(((mt) qvVar).d, i3)) {
                                mode = PorterDuff.Mode.MULTIPLY;
                                iRound = -1;
                                z2 = true;
                            } else if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                                iRound = Math.round(40.8f);
                                z2 = true;
                                i2 = android.R.attr.colorForeground;
                            } else if (i3 == R.drawable.abc_dialog_material_background) {
                                iRound = -1;
                                z2 = true;
                            } else {
                                iRound = -1;
                                i2 = 0;
                            }
                            if (z2) {
                                if (oj.c(drawableI)) {
                                    drawableMutate = drawableI.mutate();
                                } else {
                                    drawableMutate = drawableI;
                                }
                                drawableMutate.setColorFilter(mu.b(ri.b(context, i2), mode));
                                if (iRound != -1) {
                                    drawableMutate.setAlpha(iRound);
                                }
                            } else if (z) {
                            }
                        } else if (z) {
                        }
                        mt.d(drawableFindDrawableByLayerId, iB, mode2);
                    } else if (qvVar != null) {
                        mode = mu.a;
                        zA = mt.a(((mt) qvVar).a, i3);
                        i2 = android.R.attr.colorBackground;
                        if (zA) {
                            iRound = -1;
                            z2 = true;
                            i2 = R.attr.colorControlNormal;
                        } else if (mt.a(((mt) qvVar).c, i3)) {
                            iRound = -1;
                            z2 = true;
                            i2 = R.attr.colorControlActivated;
                        } else if (mt.a(((mt) qvVar).d, i3)) {
                            mode = PorterDuff.Mode.MULTIPLY;
                            iRound = -1;
                            z2 = true;
                        } else if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                            iRound = Math.round(40.8f);
                            z2 = true;
                            i2 = android.R.attr.colorForeground;
                        } else if (i3 == R.drawable.abc_dialog_material_background) {
                            iRound = -1;
                            z2 = true;
                        } else {
                            iRound = -1;
                            i2 = 0;
                        }
                        if (z2) {
                            if (oj.c(drawableI)) {
                                drawableMutate = drawableI.mutate();
                            } else {
                                drawableMutate = drawableI;
                            }
                            drawableMutate.setColorFilter(mu.b(ri.b(context, i2), mode));
                            if (iRound != -1) {
                                drawableMutate.setAlpha(iRound);
                            }
                        } else if (z) {
                        }
                    } else if (z) {
                    }
                }
                drawable = drawableI;
            }
            if (drawable != null) {
                Rect rect = oj.a;
            }
        }
        return drawable;
    }

    public final synchronized void f(Context context) {
        xd xdVar = (xd) this.d.get(context);
        if (xdVar != null) {
            xdVar.e();
        }
    }

    public final synchronized void g(qv qvVar) {
        this.g = qvVar;
    }
}
