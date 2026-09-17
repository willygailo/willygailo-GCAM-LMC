.class public abstract Lagc/Agc;
.super Ljava/lang/Object;
.source "Agc.java"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Lagc/Agc;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static native devSetting(Ljava/lang/String;)Z
.end method

.method public static native getGcamSensorID(IFFZZZZZZZZI)I
.end method

.method public static native getSensorId()I
.end method

.method public static native noNeedFixLens()Z
.end method

.method public static native setSensorId(I)V
.end method

.method public static touch()V
    .locals 0

    return-void
.end method
