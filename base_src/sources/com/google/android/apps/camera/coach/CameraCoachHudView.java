package com.google.android.apps.camera.coach;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import defpackage.dbc;
import defpackage.dbp;
import defpackage.dbq;
import defpackage.dck;
import defpackage.fqk;
import defpackage.jsa;
import defpackage.jty;
import defpackage.lic;
import defpackage.oih;
import defpackage.ojc;
import j$.util.function.BooleanSupplier;

/* JADX INFO: loaded from: classes.dex */
public class CameraCoachHudView extends View {
    public float a;
    public ojc b;
    public ojc c;
    public ojc d;
    public volatile boolean e;

    public CameraCoachHudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = oih.a;
        this.c = oih.a;
        this.d = oih.a;
        this.e = true;
    }

    public final float a() {
        return lic.c(getDisplay()).e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0160  */
    /* JADX WARN: Code duplicated, block: B:40:0x0164  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Pair pair;
        Pair pair2;
        dbp dbpVar;
        dbp dbpVar2;
        float f;
        float f2;
        fqk fqkVar;
        fqk fqkVar2;
        double dAbs;
        fqk fqkVar3;
        double d;
        if (this.b.g()) {
            dbq dbqVar = (dbq) this.b.c();
            fqk fqkVar4 = dbqVar.o;
            if (dbqVar.l && fqkVar4 != null) {
                float width = dbqVar.j.getWidth() / 2.0f;
                float height = dbqVar.j.getHeight() / 2.0f;
                float degrees = (float) Math.toDegrees(fqkVar4.c);
                float fAbs = Math.abs(degrees);
                float f3 = -(dbqVar.j.a - dbqVar.j.a());
                double dAbs2 = Math.abs(Math.toDegrees(fqkVar4.b));
                double dAbs3 = Math.abs(Math.toDegrees(fqkVar4.c));
                if (dAbs2 < 0.5d) {
                    if (dAbs3 < 0.5d) {
                        dbpVar2 = dbqVar.f;
                    } else {
                        dbpVar = dbqVar.e;
                    }
                    canvas.rotate(f3, width, height);
                    if (dbqVar.m) {
                        float f4 = (width - dbqVar.c) - dbqVar.b;
                        f = height;
                        f2 = width;
                        canvas.drawLine(f4 - dbqVar.a, height, f4, height, dbpVar2.a);
                        float f5 = f2 + dbqVar.c + dbqVar.b;
                        canvas.drawLine(f5, f, f5 + dbqVar.a, height, dbpVar2.a);
                    } else {
                        f = height;
                        f2 = width;
                    }
                    canvas.rotate(-degrees, f2, f);
                    float f6 = dbqVar.c;
                    canvas.drawLine(f2 - f6, f, f2 + f6, f, dbpVar2.a);
                    canvas.drawText(String.format("%3.0f°", Float.valueOf(fAbs)), f2, f - dbqVar.d, dbpVar2.b);
                    int iB = jsa.b((float) Math.toDegrees(fqkVar4.b));
                    float f7 = dbqVar.c;
                    float f8 = f - iB;
                    canvas.drawLine(f2 - f7, f8, f2 + f7, f8, dbqVar.i);
                    fqkVar = dbqVar.o;
                    if (fqkVar != null && (fqkVar2 = dbqVar.p) != null && fqkVar2.a != fqkVar.a) {
                        dAbs = Math.abs(Math.toDegrees(fqkVar.c) - Math.toDegrees(dbqVar.p.c));
                        fqkVar3 = dbqVar.o;
                        d = fqkVar3.a - dbqVar.p.a;
                        Double.isNaN(d);
                        if (dAbs / d <= 0.019999999552965164d) {
                            if (Math.abs(Math.toDegrees(fqkVar3.c)) < 0.5d && dbqVar.o.c * dbqVar.p.c >= 0.0f) {
                                dbqVar.n = false;
                            } else if (!dbqVar.n) {
                                if (dbqVar.k.getAsBoolean()) {
                                    jty.b(dbqVar.j.getContext());
                                }
                                dbqVar.n = true;
                            }
                        }
                    }
                    dbqVar.p = fqkVar4;
                } else {
                    dbpVar = dAbs3 < 0.5d ? dbqVar.h : dbqVar.g;
                }
                dbpVar2 = dbpVar;
                canvas.rotate(f3, width, height);
                if (dbqVar.m) {
                    float f9 = (width - dbqVar.c) - dbqVar.b;
                    f = height;
                    f2 = width;
                    canvas.drawLine(f9 - dbqVar.a, height, f9, height, dbpVar2.a);
                    float f10 = f2 + dbqVar.c + dbqVar.b;
                    canvas.drawLine(f10, f, f10 + dbqVar.a, height, dbpVar2.a);
                } else {
                    f = height;
                    f2 = width;
                }
                canvas.rotate(-degrees, f2, f);
                float f11 = dbqVar.c;
                canvas.drawLine(f2 - f11, f, f2 + f11, f, dbpVar2.a);
                canvas.drawText(String.format("%3.0f°", Float.valueOf(fAbs)), f2, f - dbqVar.d, dbpVar2.b);
                int iB2 = jsa.b((float) Math.toDegrees(fqkVar4.b));
                float f12 = dbqVar.c;
                float f13 = f - iB2;
                canvas.drawLine(f2 - f12, f13, f2 + f12, f13, dbqVar.i);
                fqkVar = dbqVar.o;
                if (fqkVar != null) {
                    dAbs = Math.abs(Math.toDegrees(fqkVar.c) - Math.toDegrees(dbqVar.p.c));
                    fqkVar3 = dbqVar.o;
                    d = fqkVar3.a - dbqVar.p.a;
                    Double.isNaN(d);
                    if (dAbs / d <= 0.019999999552965164d) {
                        if (Math.abs(Math.toDegrees(fqkVar3.c)) < 0.5d) {
                            if (!dbqVar.n) {
                                if (dbqVar.k.getAsBoolean()) {
                                    jty.b(dbqVar.j.getContext());
                                }
                                dbqVar.n = true;
                            }
                        } else if (!dbqVar.n) {
                            if (dbqVar.k.getAsBoolean()) {
                                jty.b(dbqVar.j.getContext());
                            }
                            dbqVar.n = true;
                        }
                    }
                }
                dbqVar.p = fqkVar4;
            }
        }
        if (this.c.g()) {
            dck dckVar = (dck) this.c.c();
            if (dckVar.h) {
                float width2 = dckVar.a.getWidth() / 2.0f;
                float height2 = dckVar.a.getHeight() / 2.0f;
                float degrees2 = (float) Math.toDegrees(dckVar.i);
                float degrees3 = (float) Math.toDegrees(dckVar.j);
                dckVar.a.setRotation(0.0f);
                if (Math.abs(degrees2) >= 0.5d || Math.abs(degrees3) >= 0.5d) {
                    dck.a(width2, height2, dckVar.b, dckVar.c, canvas);
                    int iA = (int) dckVar.a.a();
                    if (iA == 270) {
                        pair2 = new Pair(Float.valueOf(degrees3 * 4.0f), Float.valueOf(degrees2 * 4.0f));
                    } else {
                        pair2 = iA == 90 ? new Pair(Float.valueOf((-degrees3) * 4.0f), Float.valueOf((-degrees2) * 4.0f)) : new Pair(Float.valueOf((-degrees2) * 4.0f), Float.valueOf(degrees3 * 4.0f));
                    }
                    dck.a(width2 - ((Float) pair2.first).floatValue(), height2 - ((Float) pair2.second).floatValue(), dckVar.e, dckVar.f, canvas);
                    dckVar.m = false;
                } else {
                    dck.a(width2, height2, dckVar.d, dckVar.f, canvas);
                    dck.a(width2, height2, dckVar.e, dckVar.f, canvas);
                    if (!dckVar.m) {
                        if (dckVar.g.getAsBoolean()) {
                            jty.b(dckVar.a.getContext());
                        }
                        dckVar.m = true;
                    }
                }
            }
        }
        if (this.d.g()) {
            dbc dbcVar = (dbc) this.d.c();
            if (dbcVar.h) {
                float width3 = dbcVar.d.getWidth() / 2.0f;
                float height3 = dbcVar.d.getHeight() / 2.0f;
                float degrees4 = (float) Math.toDegrees(dbcVar.i);
                float degrees5 = (float) Math.toDegrees(dbcVar.j);
                dbcVar.d.setRotation(0.0f);
                canvas.drawCircle(width3, height3, dbc.c, dbcVar.e);
                int iA2 = (int) dbcVar.d.a();
                if (iA2 == 270) {
                    pair = new Pair(Float.valueOf(degrees5 * dbcVar.m), Float.valueOf(degrees4 * dbcVar.m));
                } else {
                    pair = iA2 == 90 ? new Pair(Float.valueOf((-degrees5) * dbcVar.m), Float.valueOf((-degrees4) * dbcVar.m)) : new Pair(Float.valueOf((-degrees4) * dbcVar.m), Float.valueOf(degrees5 * dbcVar.m));
                }
                float fFloatValue = width3 - ((Float) pair.first).floatValue();
                float fFloatValue2 = height3 - ((Float) pair.second).floatValue();
                Paint paint = dbcVar.e;
                canvas.drawCircle(fFloatValue, fFloatValue2, dbc.b, dbcVar.f);
                canvas.drawLine(fFloatValue - (dbc.a / 2.0f), fFloatValue2, fFloatValue, fFloatValue2, paint);
                canvas.drawLine(fFloatValue + (dbc.a / 2.0f), fFloatValue2, fFloatValue + dbc.b, fFloatValue2, paint);
                canvas.drawLine(fFloatValue, fFloatValue2 - (dbc.a / 2.0f), fFloatValue, fFloatValue2 - dbc.b, paint);
                canvas.drawLine(fFloatValue, fFloatValue2 + (dbc.a / 2.0f), fFloatValue, fFloatValue2 + dbc.b, paint);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: dak
            @Override // j$.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.a.e;
            }
        };
        this.b = ojc.i(new dbq(this, booleanSupplier));
        this.c = ojc.i(new dck(this, booleanSupplier));
        this.d = ojc.i(new dbc(this));
    }
}
