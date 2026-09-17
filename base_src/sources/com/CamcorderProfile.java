package com;

import defpackage.ler;

/* JADX INFO: loaded from: classes2.dex */
public final class CamcorderProfile {
    public static ler getProfile(int i) {
        switch (i) {
            case 5:
                return getProfile720();
            case 6:
                return getProfile1080();
            case 8:
                return getProfile4k();
            default:
                return getProfile480();
        }
    }

    public static ler getProfile1080() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(6);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.k(-1);
        lerVar.j(-1);
        lerVar.l(1080);
        lerVar.m(60);
        lerVar.n(1920);
        return lerVar;
    }

    public static ler getProfile480() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(4);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.k(-1);
        lerVar.j(-1);
        lerVar.l(480);
        lerVar.m(60);
        lerVar.n(720);
        return lerVar;
    }

    public static ler getProfile4k() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(8);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(2160);
        lerVar.m(60);
        lerVar.n(3840);
        return lerVar;
    }

    public static ler getProfile720() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(5);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(720);
        lerVar.m(60);
        lerVar.n(1280);
        return lerVar;
    }

    public static ler getProfileHfr(int i) {
        switch (i) {
            case 2002:
                return getProfileHfr480();
            case 2003:
                return getProfileHfr720();
            case 2004:
                return getProfileHfr1080();
            case 2005:
                return getProfileHfr4k();
            default:
                return getProfileHfr480();
        }
    }

    public static ler getProfileHfr1080() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(2004);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(1080);
        lerVar.m(240);
        lerVar.n(1920);
        return lerVar;
    }

    public static ler getProfileHfr480() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(2002);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(480);
        lerVar.m(480);
        lerVar.n(720);
        return lerVar;
    }

    public static ler getProfileHfr4k() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(2005);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(2160);
        lerVar.m(240);
        lerVar.n(3840);
        return lerVar;
    }

    public static ler getProfileHfr720() {
        ler lerVar = new ler();
        lerVar.b(96000);
        lerVar.c(1);
        lerVar.d(1);
        lerVar.e(48000);
        lerVar.f(2);
        lerVar.g(2003);
        lerVar.h(105000000);
        lerVar.i(2);
        lerVar.j(-1);
        lerVar.k(-1);
        lerVar.l(720);
        lerVar.m(240);
        lerVar.n(1280);
        return lerVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean getProfilehas(int i) {
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static boolean getProfilehasHfr(int i) {
        switch (i) {
            case 2002:
            case 2003:
            case 2004:
            case 2005:
                return true;
            default:
                return false;
        }
    }
}
