.class public Lcustom/defcomk/prorec/cust/RotSeek;
.super Landroid/view/View;


# static fields
.field public static app:Lcustom/defcomk/prorec/cust/RotSeek;

.field public static sMFicon:I


# instance fields
.field private AUTOscroll:Z

.field private final TAG:Ljava/lang/String;

.field private final VISIBLE_ITEMS_INVIEW:I

.field private Values:[Ljava/lang/String;

.field private allItemsHeight:I

.field private currentPosToDraw:I

.field private currentValue:I

.field private final debug:Z

.field private distanceInPixelFromLastSwipe:I

.field private handler:Landroid/os/Handler;

.field private itemHeight:I

.field private mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private paint:Landroid/graphics/Paint;

.field private realMax:I

.field private realMin:I

.field private final scrollsubstract:I

.field private sliderMoving:Z

.field private startY:I

.field private final textColor:I

.field private textsize:I

.field private viewHeight:I

.field private viewWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcustom/defcomk/prorec/cust/RotSeek;->app:Lcustom/defcomk/prorec/cust/RotSeek;

    const-string v0, "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0"

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    const/16 v0, 0x8

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->debug:Z

    const-class v0, Lcustom/defcomk/prorec/cust/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcustom/defcomk/prorec/cust/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sput-object p0, Lcustom/defcomk/prorec/cust/RotSeek;->app:Lcustom/defcomk/prorec/cust/RotSeek;

    const-string v0, "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0"

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    const/16 v0, 0x8

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->debug:Z

    const-class v0, Lcustom/defcomk/prorec/cust/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    invoke-direct {p0, p1, p2}, Lcustom/defcomk/prorec/cust/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sput-object p0, Lcustom/defcomk/prorec/cust/RotSeek;->app:Lcustom/defcomk/prorec/cust/RotSeek;

    const-string v0, "AUTO,INF,2M,SELFIE,MACRO,0.005,0.006,0.007,0.008,0.009,0.01,0.03,0.05,0.07,0.09,0.11,0.21,0.31,0.41,0.51,0.61,0.71,0.81,0.91,0.95,1.01,1.21,1.41,1.61,1.81,2.01,2.21,2.41,2.61,2.81,3.01,3.21,3.41,3.61,3.81,4.01,4.21,4.41,4.61,4.81,5.01,5.21,5.41,5.61,5.81,6.01,6.21,6.41,6.61,6.81,7.01,7.21,7.41,7.61,7.81,8.01,8.21,8.41,8.61,9.01,9.21,9.41,9.61,9.81,9.9,10.0,11.0,12.0,14.0,15.0"

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    const/16 v0, 0x8

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->debug:Z

    const-class v0, Lcustom/defcomk/prorec/cust/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    invoke-direct {p0, p1, p2}, Lcustom/defcomk/prorec/cust/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcustom/defcomk/prorec/cust/RotSeek;)Z
    .locals 1

    iget-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->AUTOscroll:Z

    return v0
.end method

.method static synthetic access$002(Lcustom/defcomk/prorec/cust/RotSeek;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->AUTOscroll:Z

    return p1
.end method

.method static synthetic access$100(Lcustom/defcomk/prorec/cust/RotSeek;)I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    return v0
.end method

.method static synthetic access$1000(Lcustom/defcomk/prorec/cust/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->redraw()V

    return-void
.end method

.method static synthetic access$102(Lcustom/defcomk/prorec/cust/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    return p1
.end method

.method static synthetic access$1100(Lcustom/defcomk/prorec/cust/RotSeek;)Landroid/widget/SeekBar$OnSeekBarChangeListener;
    .locals 1

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-object v0
.end method

.method static synthetic access$200(Lcustom/defcomk/prorec/cust/RotSeek;)I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    return v0
.end method

.method static synthetic access$202(Lcustom/defcomk/prorec/cust/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    return p1
.end method

.method static synthetic access$300(Lcustom/defcomk/prorec/cust/RotSeek;)I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMax:I

    return v0
.end method

.method static synthetic access$400(Lcustom/defcomk/prorec/cust/RotSeek;)I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    return v0
.end method

.method static synthetic access$500(Lcustom/defcomk/prorec/cust/RotSeek;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcustom/defcomk/prorec/cust/RotSeek;->log(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lcustom/defcomk/prorec/cust/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->checkifCurrentValueHasChanged()V

    return-void
.end method

.method static synthetic access$700(Lcustom/defcomk/prorec/cust/RotSeek;)I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    return v0
.end method

.method static synthetic access$702(Lcustom/defcomk/prorec/cust/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    return p1
.end method

.method static synthetic access$800(Lcustom/defcomk/prorec/cust/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->handleAUTOScroll()V

    return-void
.end method

.method static synthetic access$900(Lcustom/defcomk/prorec/cust/RotSeek;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    return-object v0
.end method

.method private checkifCurrentValueHasChanged()V
    .locals 3

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    add-int/2addr v0, v1

    div-int/2addr v0, v2

    if-ltz v0, :cond_2

    :goto_0
    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "currentpos"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "item "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->log(Ljava/lang/String;)V

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    const-string v1, "pref_camera_vibrator_key"

    invoke-static {v1}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_3

    :goto_2
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->handler:Landroid/os/Handler;

    new-instance v1, Lcustom/defcomk/prorec/cust/RotSeek$2;

    invoke-direct {v1, p0}, Lcustom/defcomk/prorec/cust/RotSeek$2;-><init>(Lcustom/defcomk/prorec/cust/RotSeek;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    mul-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    goto :goto_2
.end method

.method private convertDpiToPixel(I)F
    .locals 3

    int-to-float v0, p1

    invoke-virtual {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method public static getManualFocus()I
    .locals 2

    const-string v0, "pref_manual_focus_slider_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v1

    const/4 v0, 0x1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    sget v0, Lcustom/defcomk/prorec/cust/RotSeek;->sMFicon:I

    goto :goto_0
.end method

.method private getSignedDistance(II)I
    .locals 1

    sub-int v0, p1, p2

    return v0
.end method

.method private handleAUTOScroll()V
    .locals 2

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->handler:Landroid/os/Handler;

    new-instance v1, Lcustom/defcomk/prorec/cust/RotSeek$1;

    invoke-direct {v1, p0}, Lcustom/defcomk/prorec/cust/RotSeek$1;-><init>(Lcustom/defcomk/prorec/cust/RotSeek;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->handler:Landroid/os/Handler;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    invoke-direct {p0, v0}, Lcustom/defcomk/prorec/cust/RotSeek;->convertDpiToPixel(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->setProgress(IZ)V

    return-void
.end method

.method private log(Ljava/lang/String;)V
    .locals 1

    const-string v0, "ProReC"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private redraw()V
    .locals 0

    invoke-virtual {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->invalidate()V

    return-void
.end method

.method private switchalpha(I)I
    .locals 1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    const/16 v0, 0x7c

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x1f

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x5d

    goto :goto_0

    :pswitch_4
    const/16 v0, 0x9b

    goto :goto_0

    :pswitch_5
    const/16 v0, 0xff

    goto :goto_0

    :pswitch_6
    const/16 v0, 0xba

    goto :goto_0

    :pswitch_7
    const/16 v0, 0xd9

    goto :goto_0

    :pswitch_8
    const/16 v0, 0x3e

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_1
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public GetCurrentString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public IsAUTOScrolling()Z
    .locals 1

    iget-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->AUTOscroll:Z

    return v0
.end method

.method public IsMoving()Z
    .locals 1

    iget-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    return v0
.end method

.method public SetStringValues([Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget-object v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    array-length v1, v1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v2

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->allItemsHeight:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->allItemsHeight:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMax:I

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->redraw()V

    return-void
.end method

.method public getProgress()I
    .locals 1

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    const/16 v9, 0x8

    invoke-static {}, Lcustom/defcomk/prorec/cust/RotSeek;->getManualFocus()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v9}, Lcustom/defcomk/prorec/cust/RotSeek;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    invoke-direct {p0, v0}, Lcustom/defcomk/prorec/cust/RotSeek;->switchalpha(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    iget v3, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v3, v3, 0x2

    iget v4, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    div-int/lit8 v4, v4, 0x2

    mul-int/2addr v0, v6

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    add-int/2addr v0, v3

    sub-int v8, v0, v4

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewWidth:I

    int-to-float v0, v0

    const/16 v1, 0x1e

    invoke-direct {p0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->convertDpiToPixel(I)F

    move-result v1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, v8, v2

    int-to-float v2, v2

    iget v3, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewWidth:I

    add-int/lit8 v3, v3, -0x14

    int-to-float v3, v3

    iget v4, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    div-int/lit8 v4, v4, 0x2

    sub-int v4, v8, v4

    int-to-float v4, v4

    iget-object v5, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    sub-float v1, v0, v1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-nez v7, :cond_3

    :goto_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    :goto_2
    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    array-length v0, v0

    if-lt v6, v0, :cond_1

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewWidth:I

    int-to-float v0, v0

    const/16 v1, 0x14

    invoke-direct {p0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->convertDpiToPixel(I)F

    move-result v1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v2, v2, 0x2

    iget v3, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    int-to-float v2, v2

    iget v3, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewWidth:I

    int-to-float v3, v3

    iget v4, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v4, v4, 0x2

    iget v5, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    sub-float v1, v0, v1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    aget-object v7, v0, v6

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    sub-int/2addr v0, v6

    if-ltz v0, :cond_4

    :goto_3
    if-le v0, v9, :cond_0

    goto :goto_1

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->textsize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v0, 0x0

    move v6, v0

    goto :goto_2

    :cond_3
    int-to-float v0, v8

    iget-object v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->paint:Landroid/graphics/Paint;

    const/high16 v2, 0x42a00000    # 80.0f

    invoke-virtual {p1, v7, v2, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_4
    mul-int/lit8 v0, v0, -0x1

    goto :goto_3
.end method

.method protected onSizeChanged(IIII)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewWidth:I

    iput p2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0xc

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget-object v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->Values:[Ljava/lang/String;

    array-length v1, v1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v2

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->allItemsHeight:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->allItemsHeight:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->viewHeight:I

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    sub-int/2addr v0, v1

    mul-int/lit8 v1, v2, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMax:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->setProgress(IZ)V

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->redraw()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    move v0, v1

    :goto_0
    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->redraw()V

    return v0

    :cond_0
    iput-boolean v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    iget-object v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-nez v2, :cond_9

    :goto_1
    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    if-gtz v2, :cond_6

    :cond_1
    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    if-ltz v2, :cond_b

    :goto_2
    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    invoke-virtual {p0, v2, v0}, Lcustom/defcomk/prorec/cust/RotSeek;->setProgress(IZ)V

    const-string v0, "manualfocus_restart"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, Lcom/google/android/apps/camera/legacy/app/activity/main/CameraActivity;->ReInit()V

    :goto_3
    move v0, v1

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iput v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->startY:I

    iput-boolean v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->AUTOscroll:Z

    goto :goto_0

    :pswitch_1
    iget-boolean v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    if-eqz v1, :cond_8

    :cond_2
    :goto_4
    iget-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    if-nez v0, :cond_5

    :cond_3
    :goto_5
    iget-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    goto :goto_0

    :cond_4
    const/16 v2, -0x28

    if-ge v1, v2, :cond_2

    :goto_6
    iput-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, v3}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Landroid/widget/SeekBar;)V

    goto :goto_4

    :cond_5
    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->startY:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-direct {p0, v0, v1}, Lcustom/defcomk/prorec/cust/RotSeek;->getSignedDistance(II)I

    move-result v0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    sub-int/2addr v0, v1

    mul-int/lit8 v1, v0, -0x1

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMax:I

    if-ge v1, v2, :cond_3

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    if-le v1, v2, :cond_3

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->checkifCurrentValueHasChanged()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->startY:I

    goto :goto_5

    :cond_6
    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    const/16 v3, 0xa

    if-le v2, v3, :cond_1

    :cond_7
    iput-boolean v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->AUTOscroll:Z

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->handleAUTOScroll()V

    goto :goto_2

    :cond_8
    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->startY:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-direct {p0, v1, v2}, Lcustom/defcomk/prorec/cust/RotSeek;->getSignedDistance(II)I

    move-result v1

    const/16 v2, 0x28

    if-le v1, v2, :cond_4

    goto :goto_6

    :cond_9
    iget-object v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v2, v3}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    goto/16 :goto_1

    :cond_a
    const-string v0, "pref_af_mode_back"

    const-string v2, "2"

    invoke-static {v0, v2}, Lcom/Helper;->setMenuValue(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :pswitch_2
    iget-boolean v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->sliderMoving:Z

    if-nez v2, :cond_0

    move v0, v1

    goto/16 :goto_0

    :cond_b
    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->distanceInPixelFromLastSwipe:I

    const/16 v3, -0xa

    if-lt v2, v3, :cond_7

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method public setProgress(IZ)V
    .locals 3

    invoke-static {}, Lza/lol;->getInstance()Lza/lol;

    invoke-static {p1}, Lza/lol;->calcdist(I)V

    iput p1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentValue:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setprogres"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcustom/defcomk/prorec/cust/RotSeek;->log(Ljava/lang/String;)V

    iget v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    iget v1, p0, Lcustom/defcomk/prorec/cust/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lcustom/defcomk/prorec/cust/RotSeek;->realMin:I

    mul-int/2addr v0, p1

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->currentPosToDraw:I

    invoke-direct {p0}, Lcustom/defcomk/prorec/cust/RotSeek;->redraw()V

    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcustom/defcomk/prorec/cust/RotSeek;->handler:Landroid/os/Handler;

    new-instance v1, Lcustom/defcomk/prorec/cust/RotSeek$3;

    invoke-direct {v1, p0}, Lcustom/defcomk/prorec/cust/RotSeek$3;-><init>(Lcustom/defcomk/prorec/cust/RotSeek;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    if-nez p2, :cond_0

    goto :goto_0
.end method
