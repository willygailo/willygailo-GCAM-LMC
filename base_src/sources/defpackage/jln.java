package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jln implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jln u = new jln(20);
    public static final /* synthetic */ jln t = new jln(19);
    public static final /* synthetic */ jln s = new jln(18);
    public static final /* synthetic */ jln r = new jln(17);
    public static final /* synthetic */ jln q = new jln(16);
    public static final /* synthetic */ jln p = new jln(15);
    public static final /* synthetic */ jln o = new jln(14);
    public static final /* synthetic */ jln n = new jln(13);
    public static final /* synthetic */ jln m = new jln(12);
    public static final /* synthetic */ jln l = new jln(11);
    public static final /* synthetic */ jln k = new jln(10);
    public static final /* synthetic */ jln j = new jln(9);
    public static final /* synthetic */ jln i = new jln(8);
    public static final /* synthetic */ jln h = new jln(7);
    public static final /* synthetic */ jln g = new jln(6);
    public static final /* synthetic */ jln f = new jln(5);
    public static final /* synthetic */ jln e = new jln(4);
    public static final /* synthetic */ jln d = new jln(3);
    public static final /* synthetic */ jln c = new jln(2);
    public static final /* synthetic */ jln b = new jln(1);
    public static final /* synthetic */ jln a = new jln(0);

    private /* synthetic */ jln(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                Resources resources = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA = jlq.a();
                    jlpVarA.o(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA.m(0);
                    jlpVarA.n(resources.getColor(R.color.camera_mode_idle_color, null));
                    jlpVarA.z(resources.getColor(R.color.video_mode_color, null));
                    jlpVarA.A(resources.getDimensionPixelSize(R.dimen.video_button_inner_radius));
                    jlpVarA.u(0);
                    jlpVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA.t(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA.l(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA;
                }
                jlp jlpVarA2 = jlq.a();
                jlpVarA2.o(resources.getDimensionPixelSize(R.dimen.P20_video_button_inner_radius));
                jlpVarA2.j(resources.getColor(R.color.camera_main_button_color, null));
                jlpVarA2.m(255);
                jlpVarA2.n(resources.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA2.z(resources.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA2.A(0);
                jlpVarA2.u(0);
                jlpVarA2.s(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA2.p(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA2.q(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA2.t(resources.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA2.l(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA2.d(R.drawable.ic_center);
                jlpVarA2.i(resources.getDrawable(R.drawable.ic_center, null).getIntrinsicWidth() / 2);
                return jlpVarA2;
            case 1:
                Resources resources2 = (Resources) obj;
                jlp jlpVarA3 = jlq.a();
                jlpVarA3.o(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.j(resources2.getColor(R.color.camera_main_button_color, null));
                jlpVarA3.m(255);
                jlpVarA3.n(resources2.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA3.A(0);
                jlpVarA3.z(resources2.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA3.u(0);
                jlpVarA3.s(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.p(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.q(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA3.t(resources2.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA3.l(resources2.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA3.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA3.i(resources2.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA3;
            case 2:
                Resources resources3 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA4 = jlq.a();
                    jlpVarA4.o(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA4.m(255);
                    jlpVarA4.n(resources3.getColor(R.color.long_press_mode_color, null));
                    jlpVarA4.A(0);
                    jlpVarA4.z(resources3.getColor(R.color.long_press_mode_color, null));
                    jlpVarA4.u(0);
                    jlpVarA4.s(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA4.r(0);
                    jlpVarA4.t(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA4.l(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA4;
                }
                if (jlq.b) {
                    jlp jlpVarA5 = jlq.a();
                    jlpVarA5.o(0);
                    jlpVarA5.j(resources3.getColor(R.color.camera_main_button_color, null));
                    jlpVarA5.m(255);
                    jlpVarA5.n(resources3.getColor(R.color.long_press_mode_color, null));
                    jlpVarA5.A(0);
                    jlpVarA5.z(resources3.getColor(R.color.long_press_mode_color, null));
                    jlpVarA5.u(0);
                    jlpVarA5.b(true);
                    jlpVarA5.s(0);
                    jlpVarA5.r(255);
                    jlpVarA5.p(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA5.q(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA5.t(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                    jlpVarA5.l(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA5;
                }
                jlp jlpVarA6 = jlq.a();
                jlpVarA6.o(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA6.j(resources3.getColor(R.color.camera_main_button_color, null));
                jlpVarA6.m(255);
                jlpVarA6.n(resources3.getColor(R.color.long_press_mode_color, null));
                jlpVarA6.A(0);
                jlpVarA6.z(resources3.getColor(R.color.long_press_mode_color, null));
                jlpVarA6.u(0);
                jlpVarA6.b(true);
                jlpVarA6.s(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA6.r(255);
                jlpVarA6.p(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA6.q(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA6.t(resources3.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA6.l(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA6;
            case 3:
                Resources resources4 = (Resources) obj;
                jlp jlpVarA7 = jlq.a();
                jlpVarA7.o(resources4.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA7.j(resources4.getColor(R.color.camera_main_button_color, null));
                jlpVarA7.m(0);
                jlpVarA7.n(0);
                jlpVarA7.A(0);
                jlpVarA7.z(0);
                jlpVarA7.u(0);
                jlpVarA7.b(true);
                jlpVarA7.r(127);
                jlpVarA7.s(resources4.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA7.p(0);
                jlpVarA7.q(0);
                jlpVarA7.e();
                jlpVarA7.f(-16777216);
                jlpVarA7.t(resources4.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA7.l(resources4.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA7.g(61);
                jlpVarA7.d(R.drawable.ic_filter_tilt_shift_24px);
                return jlpVarA7;
            case 4:
                Resources resources5 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA8 = jlq.a();
                    jlpVarA8.o(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA8.m(255);
                    jlpVarA8.n(-1);
                    jlpVarA8.z(resources5.getColor(R.color.camera_button_cancel_color, null));
                    jlpVarA8.A(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA8.u(0);
                    jlpVarA8.d(R.drawable.ic_check);
                    jlpVarA8.i(resources5.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2);
                    jlpVarA8.s(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA8.t(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA8.l(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA8;
                }
                jlp jlpVarA9 = jlq.a();
                jlpVarA9.o(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA9.j(resources5.getColor(R.color.camera_main_button_color, null));
                jlpVarA9.m(255);
                jlpVarA9.n(resources5.getColor(R.color.confirm_disabled_color, null));
                jlpVarA9.z(0);
                jlpVarA9.A(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA9.u(0);
                jlpVarA9.d(R.drawable.quantum_gm_ic_done_white_24);
                jlpVarA9.i(resources5.getDrawable(R.drawable.quantum_gm_ic_done_white_24, null).getIntrinsicWidth() / 2);
                jlpVarA9.s(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA9.t(resources5.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA9.l(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA9;
            case 5:
                Resources resources6 = (Resources) obj;
                jlp jlpVarA10 = jlq.a();
                jlpVarA10.o(resources6.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA10.m(0);
                jlpVarA10.j(resources6.getColor(R.color.camera_main_button_color, null));
                jlpVarA10.n(resources6.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA10.A(0);
                jlpVarA10.z(resources6.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA10.u(0);
                jlpVarA10.s(resources6.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_radius));
                jlpVarA10.p(resources6.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_ring_radius));
                jlpVarA10.q(resources6.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA10.t(resources6.getDimensionPixelSize(R.dimen.P20_portrait_button_outer_radius));
                jlpVarA10.l(resources6.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA10.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA10.i(resources6.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA10;
            case 6:
                Resources resources7 = (Resources) obj;
                jlp jlpVarA11 = jlq.a();
                jlpVarA11.o(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA11.j(resources7.getColor(R.color.camera_main_button_color, null));
                jlpVarA11.m(0);
                jlpVarA11.n(jlq.c ? jlq.d : resources7.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA11.A(0);
                jlpVarA11.z(resources7.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA11.u(0);
                jlpVarA11.b(true);
                jlpVarA11.r(61);
                jlpVarA11.s(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA11.t(resources7.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA11.l(resources7.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA11.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA11.i(resources7.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA11;
            case 7:
                Resources resources8 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA12 = jlq.a();
                    jlpVarA12.o(resources8.getDimensionPixelSize(R.dimen.night_button_inner_radius));
                    jlpVarA12.m(255);
                    jlpVarA12.n(resources8.getColor(R.color.night_mode_idle_color, null));
                    jlpVarA12.A(0);
                    jlpVarA12.z(resources8.getColor(R.color.video_mode_color, null));
                    jlpVarA12.u(0);
                    jlpVarA12.s(resources8.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA12.p(resources8.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA12.q(resources8.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA12.t(resources8.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA12.l(resources8.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA12.d(R.drawable.ic_night_filled);
                    return jlpVarA12;
                }
                jlp jlpVarA13 = jlq.a();
                jlpVarA13.o(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA13.j(resources8.getColor(R.color.camera_main_button_color, null));
                jlpVarA13.m(255);
                jlpVarA13.n(resources8.getColor(R.color.night_mode_idle_color, null));
                jlpVarA13.A(0);
                jlpVarA13.z(resources8.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA13.u(0);
                jlpVarA13.s(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA13.p(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA13.q(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA13.t(resources8.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA13.l(resources8.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA13.d(R.drawable.ic_brightness_white_24px);
                return jlpVarA13;
            case 8:
                Resources resources9 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA14 = jlq.a();
                    jlpVarA14.o(resources9.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA14.m(255);
                    jlpVarA14.n(-1);
                    jlpVarA14.A(resources9.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA14.z(resources9.getColor(R.color.video_mode_color, null));
                    jlpVarA14.u(resources9.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2);
                    jlpVarA14.s(resources9.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA14.t(resources9.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA14.l(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA14;
                }
                jlp jlpVarA15 = jlq.a();
                jlpVarA15.o(0);
                jlpVarA15.j(resources9.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA15.m(0);
                jlpVarA15.n(-1);
                jlpVarA15.A(0);
                jlpVarA15.z(resources9.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA15.u(resources9.getDimensionPixelSize(R.dimen.P20_video_button_stop_square_size) / 2);
                jlpVarA15.s(resources9.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA15.p(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA15.q(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA15.t(resources9.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA15.l(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA15.d(R.drawable.ic_center_rec);
                jlpVarA15.i(resources9.getDrawable(R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return jlpVarA15;
            case 9:
                Resources resources10 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA16 = jlq.a();
                    jlpVarA16.o(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA16.m(0);
                    jlpVarA16.n(-1);
                    jlpVarA16.A(0);
                    jlpVarA16.z(resources10.getColor(R.color.video_mode_color, null));
                    jlpVarA16.u(0);
                    jlpVarA16.b(true);
                    jlpVarA16.r(255);
                    jlpVarA16.s(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA16.t(resources10.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA16.l(resources10.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA16;
                }
                jlp jlpVarA17 = jlq.a();
                jlpVarA17.o(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA17.j(resources10.getColor(R.color.camera_main_button_color, null));
                jlpVarA17.m(0);
                jlpVarA17.n(-1);
                jlpVarA17.A(0);
                jlpVarA17.z(0);
                jlpVarA17.u(0);
                jlpVarA17.b(true);
                jlpVarA17.r(255);
                jlpVarA17.s(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA17.p(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA17.q(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA17.t(resources10.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA17.l(resources10.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA17;
            case 10:
                Resources resources11 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA18 = jlq.a();
                    jlpVarA18.o(resources11.getDimensionPixelSize(R.dimen.night_button_inner_radius));
                    jlpVarA18.m(255);
                    jlpVarA18.n(-1);
                    jlpVarA18.A(0);
                    jlpVarA18.z(resources11.getColor(R.color.video_mode_color, null));
                    jlpVarA18.u(0);
                    jlpVarA18.s(resources11.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA18.p(resources11.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA18.q(resources11.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA18.t(resources11.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA18.l(resources11.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA18.d(R.drawable.ic_stop_night_sight_24dp);
                    jlpVarA18.i(resources11.getDrawable(R.drawable.ic_stop_night_sight_24dp, null).getIntrinsicWidth() / 2);
                    return jlpVarA18;
                }
                jlp jlpVarA19 = jlq.a();
                jlpVarA19.o(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA19.j(resources11.getColor(R.color.camera_main_button_color, null));
                jlpVarA19.n(0);
                jlpVarA19.m(0);
                jlpVarA19.A(0);
                jlpVarA19.z(resources11.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA19.u(resources11.getDimensionPixelSize(R.dimen.P20_video_button_stop_square_size) / 2);
                jlpVarA19.r(61);
                jlpVarA19.s(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA19.t(resources11.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA19.l(resources11.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA19.g(61);
                jlpVarA19.d(R.drawable.ic_stop_night);
                jlpVarA19.i(resources11.getDrawable(R.drawable.ic_stop_night, null).getIntrinsicWidth() / 2);
                return jlpVarA19;
            case 11:
                Resources resources12 = (Resources) obj;
                jlp jlpVarA20 = jlq.a();
                jlpVarA20.o(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.j(resources12.getColor(R.color.camera_main_button_color, null));
                jlpVarA20.m(255);
                jlpVarA20.n(jlq.c ? jlq.d : resources12.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA20.A(0);
                jlpVarA20.z(resources12.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA20.u(0);
                jlpVarA20.r(61);
                jlpVarA20.s(resources12.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA20.t(resources12.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA20.l(resources12.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA20.g(61);
                jlpVarA20.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA20.i(resources12.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA20;
            case 12:
                Resources resources13 = (Resources) obj;
                jlp jlpVarA21 = jlq.a();
                jlpVarA21.o(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA21.j(resources13.getColor(R.color.camera_main_button_color, null));
                jlpVarA21.m(0);
                jlpVarA21.n(0);
                jlpVarA21.A(0);
                jlpVarA21.z(0);
                jlpVarA21.u(0);
                jlpVarA21.b(true);
                jlpVarA21.r(127);
                jlpVarA21.s(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA21.p(0);
                jlpVarA21.q(0);
                jlpVarA21.e();
                jlpVarA21.f(-16777216);
                jlpVarA21.t(resources13.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA21.l(resources13.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA21.d(R.drawable.ic_filter_tilt_shift_24px);
                return jlpVarA21;
            case 13:
                Resources resources14 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA22 = jlq.a();
                    jlpVarA22.o(resources14.getDimensionPixelSize(R.dimen.portrait_button_inner_radius));
                    jlpVarA22.m(255);
                    jlpVarA22.n(-1);
                    jlpVarA22.A(0);
                    jlpVarA22.z(resources14.getColor(R.color.video_mode_color, null));
                    jlpVarA22.u(0);
                    jlpVarA22.s(resources14.getDimensionPixelSize(R.dimen.portrait_button_inner_radius));
                    jlpVarA22.p(resources14.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius));
                    jlpVarA22.q(resources14.getDimensionPixelSize(R.dimen.portrait_button_outer_ring_radius));
                    jlpVarA22.t(resources14.getDimensionPixelSize(R.dimen.portrait_button_outer_radius));
                    jlpVarA22.l(resources14.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA22;
                }
                jlp jlpVarA23 = jlq.a();
                jlpVarA23.o(resources14.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA23.m(0);
                jlpVarA23.j(resources14.getColor(R.color.camera_main_button_color, null));
                jlpVarA23.n(resources14.getColor(R.color.camera_mode_idle_color_p20, null));
                jlpVarA23.A(0);
                jlpVarA23.z(resources14.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA23.u(0);
                jlpVarA23.s(resources14.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_radius));
                jlpVarA23.p(resources14.getDimensionPixelSize(R.dimen.P20_portrait_button_inner_ring_radius));
                jlpVarA23.q(resources14.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA23.t(resources14.getDimensionPixelSize(R.dimen.P20_portrait_button_outer_radius));
                jlpVarA23.l(resources14.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA23;
            case 14:
                Resources resources15 = (Resources) obj;
                jlp jlpVarA24 = jlq.a();
                jlpVarA24.o(resources15.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA24.j(resources15.getColor(R.color.camera_main_button_color, null));
                jlpVarA24.m(255);
                jlpVarA24.n(resources15.getColor(R.color.night_mode_idle_color, null));
                jlpVarA24.A(0);
                jlpVarA24.z(resources15.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA24.u(0);
                jlpVarA24.s(resources15.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA24.p(resources15.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA24.q(resources15.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA24.t(resources15.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA24.l(resources15.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA24.d(R.drawable.ic_shutter_astro_white);
                return jlpVarA24;
            case 15:
                Resources resources16 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA25 = jlq.a();
                    jlpVarA25.o(resources16.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA25.m(255);
                    jlpVarA25.n(-1);
                    jlpVarA25.A(resources16.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA25.z(resources16.getColor(R.color.video_mode_color, null));
                    jlpVarA25.u(resources16.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2);
                    jlpVarA25.s(resources16.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA25.t(resources16.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA25.w(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_length));
                    jlpVarA25.x(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_padding_to_bound));
                    jlpVarA25.y(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_rect_round_radius));
                    jlpVarA25.v(255);
                    jlpVarA25.l(resources16.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA25;
                }
                jlp jlpVarA26 = jlq.a();
                jlpVarA26.o(0);
                jlpVarA26.j(resources16.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA26.m(0);
                jlpVarA26.n(-1);
                jlpVarA26.A(0);
                jlpVarA26.z(resources16.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA26.u(resources16.getDimensionPixelSize(R.dimen.P20_video_button_stop_square_size) / 2);
                jlpVarA26.s(resources16.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA26.t(resources16.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA26.l(resources16.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA26.w(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_length));
                jlpVarA26.x(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_padding_to_bound));
                jlpVarA26.y(resources16.getDimensionPixelSize(R.dimen.timelapse_tick_mark_rect_round_radius));
                jlpVarA26.v(255);
                jlpVarA26.d(R.drawable.ic_center_rec);
                jlpVarA26.i(resources16.getDrawable(R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return jlpVarA26;
            case 16:
                Resources resources17 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA27 = jlq.a();
                    jlpVarA27.o(resources17.getDimensionPixelSize(R.dimen.night_button_inner_radius));
                    jlpVarA27.m(0);
                    jlpVarA27.n(resources17.getColor(R.color.night_mode_idle_color, null));
                    jlpVarA27.A(0);
                    jlpVarA27.z(resources17.getColor(R.color.video_mode_color, null));
                    jlpVarA27.u(0);
                    jlpVarA27.b(true);
                    jlpVarA27.r(255);
                    jlpVarA27.s(resources17.getDimensionPixelSize(R.dimen.night_button_inner_radius));
                    jlpVarA27.t(resources17.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA27.l(resources17.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA27.d(R.drawable.ic_night_filled);
                    jlpVarA27.i(resources17.getDrawable(R.drawable.ic_night_filled, null).getIntrinsicWidth() / 2);
                    return jlpVarA27;
                }
                jlp jlpVarA28 = jlq.a();
                jlpVarA28.o(resources17.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA28.j(resources17.getColor(R.color.camera_main_button_color, null));
                jlpVarA28.m(255);
                jlpVarA28.n(jlq.c ? jlq.d : resources17.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA28.A(0);
                jlpVarA28.z(resources17.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA28.u(0);
                jlpVarA28.b(true);
                jlpVarA28.r(61);
                jlpVarA28.s(resources17.getDimensionPixelSize(R.dimen.P20_photo_button_press_radius));
                jlpVarA28.t(resources17.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA28.l(resources17.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA28.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA28.i(resources17.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA28;
            case 17:
                Resources resources18 = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA29 = jlq.a();
                    jlpVarA29.o(resources18.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA29.m(255);
                    jlpVarA29.n(resources18.getColor(R.color.long_press_mode_color, null));
                    jlpVarA29.A(0);
                    jlpVarA29.z(resources18.getColor(R.color.long_press_mode_color, null));
                    jlpVarA29.u(0);
                    jlpVarA29.s(resources18.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA29.r(0);
                    jlpVarA29.t(resources18.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA29.l(resources18.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA29;
                }
                if (!jlq.b) {
                    jlp jlpVarA30 = jlq.a();
                    jlpVarA30.o(resources18.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                    jlpVarA30.j(resources18.getColor(R.color.camera_main_button_color, null));
                    jlpVarA30.m(255);
                    jlpVarA30.n(resources18.getColor(R.color.long_press_mode_color, null));
                    jlpVarA30.A(0);
                    jlpVarA30.z(resources18.getColor(R.color.long_press_mode_color, null));
                    jlpVarA30.u(0);
                    jlpVarA30.s(resources18.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                    jlpVarA30.r(0);
                    jlpVarA30.t(resources18.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                    jlpVarA30.l(resources18.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA30;
                }
                resources18.getDrawable(R.drawable.ic_center_rec_red, null).setTint(resources18.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlp jlpVarA31 = jlq.a();
                jlpVarA31.o(0);
                jlpVarA31.j(resources18.getColor(R.color.camera_main_button_color, null));
                jlpVarA31.m(0);
                jlpVarA31.n(resources18.getColor(R.color.long_press_mode_color, null));
                jlpVarA31.A(0);
                jlpVarA31.z(resources18.getColor(R.color.long_press_mode_color, null));
                jlpVarA31.u(0);
                jlpVarA31.b(true);
                jlpVarA31.s(0);
                jlpVarA31.t(resources18.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA31.l(resources18.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA31.d(R.drawable.ic_center_rec_red);
                return jlpVarA31;
            case 18:
                Resources resources19 = (Resources) obj;
                jlp jlpVarA32 = jlq.a();
                jlpVarA32.o(resources19.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA32.j(resources19.getColor(R.color.camera_main_button_color, null));
                jlpVarA32.m(255);
                jlpVarA32.n(jlq.c ? jlq.d : resources19.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA32.A(0);
                jlpVarA32.z(resources19.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA32.u(0);
                jlpVarA32.r(61);
                jlpVarA32.s(0);
                jlpVarA32.t(resources19.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA32.l(resources19.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA32.g(61);
                jlpVarA32.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA32.i(resources19.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA32;
            case 19:
                Resources resources20 = (Resources) obj;
                jlp jlpVarA33 = jlq.a();
                jlpVarA33.o(resources20.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA33.j(resources20.getColor(R.color.camera_main_button_color, null));
                jlpVarA33.m(255);
                jlpVarA33.n(jlq.c ? jlq.d : resources20.getColor(R.color.night_sight_pressed_color, null));
                jlpVarA33.A(0);
                jlpVarA33.z(resources20.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                jlpVarA33.u(0);
                jlpVarA33.r(61);
                jlpVarA33.s(resources20.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA33.t(resources20.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA33.l(resources20.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA33.g(61);
                jlpVarA33.d(R.drawable.ic_brightness_dark_24px);
                jlpVarA33.i(resources20.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return jlpVarA33;
            default:
                Resources resources21 = (Resources) obj;
                if (jlq.a) {
                    jlp jlpVarA34 = jlq.a();
                    jlpVarA34.o(resources21.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                    jlpVarA34.j(resources21.getColor(R.color.camera_main_button_color, null));
                    jlpVarA34.n(0);
                    jlpVarA34.m(0);
                    jlpVarA34.A(0);
                    jlpVarA34.z(resources21.getColor(true != jlq.c ? R.color.video_mode_idle_color_legacy : R.color.video_mode_idle_color, null));
                    jlpVarA34.u(0);
                    jlpVarA34.s(resources21.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                    jlpVarA34.t(resources21.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                    jlpVarA34.l(resources21.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    jlpVarA34.g(61);
                    jlpVarA34.d(R.drawable.ic_cancel_night_24px);
                    jlpVarA34.i(resources21.getDrawable(R.drawable.ic_cancel_night_24px, null).getIntrinsicWidth() / 2);
                    return jlpVarA34;
                }
                jlp jlpVarA35 = jlq.a();
                jlpVarA35.o(resources21.getDimensionPixelSize(R.dimen.night_button_inner_radius));
                jlpVarA35.m(255);
                jlpVarA35.n(-1);
                jlpVarA35.A(0);
                jlpVarA35.z(resources21.getColor(R.color.video_mode_color, null));
                jlpVarA35.u(0);
                jlpVarA35.s(resources21.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                jlpVarA35.p(resources21.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                jlpVarA35.q(resources21.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                jlpVarA35.t(resources21.getDimensionPixelSize(R.dimen.photo_button_radius));
                jlpVarA35.l(resources21.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                jlpVarA35.g(61);
                jlpVarA35.d(R.drawable.quantum_gm_ic_clear_grey600_36);
                jlpVarA35.i(resources21.getDrawable(R.drawable.quantum_gm_ic_clear_grey600_36, null).getIntrinsicWidth() / 2);
                return jlpVarA35;
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function.CC.$default$compose(this, function);
    }
}
