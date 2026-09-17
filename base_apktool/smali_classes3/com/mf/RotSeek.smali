.class public Lcom/mf/RotSeek;
.super Landroid/view/View;


# static fields
.field public static app:Lcom/mf/RotSeek;


# instance fields
.field private FocusValue:[F

.field private final TAG:Ljava/lang/String;

.field private final VISIBLE_ITEMS_INVIEW:I

.field private Values:[Ljava/lang/String;

.field private allItemsHeight:I

.field private appContext:Landroid/content/Context;

.field private autoscroll:Z

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
    .locals 5

    const/4 v2, 0x1

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/mf/RotSeek;->app:Lcom/mf/RotSeek;

    invoke-virtual {p0}, Lcom/mf/RotSeek;->setFocusString()V

    const/16 v0, 0x9

    iput v0, p0, Lcom/mf/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/mf/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcom/mf/RotSeek;->debug:Z

    const-class v0, Lcom/mf/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mf/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcom/mf/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcom/mf/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/mf/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sput-object p0, Lcom/mf/RotSeek;->app:Lcom/mf/RotSeek;

    invoke-virtual {p0}, Lcom/mf/RotSeek;->setFocusString()V

    const/16 v0, 0x9

    iput v0, p0, Lcom/mf/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/mf/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcom/mf/RotSeek;->debug:Z

    const-class v0, Lcom/mf/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mf/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcom/mf/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcom/mf/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    invoke-direct {p0, p1, p2}, Lcom/mf/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sput-object p0, Lcom/mf/RotSeek;->app:Lcom/mf/RotSeek;

    invoke-virtual {p0}, Lcom/mf/RotSeek;->setFocusString()V

    const/16 v0, 0x9

    iput v0, p0, Lcom/mf/RotSeek;->textsize:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/mf/RotSeek;->textColor:I

    iput-boolean v2, p0, Lcom/mf/RotSeek;->debug:Z

    const-class v0, Lcom/mf/RotSeek;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mf/RotSeek;->TAG:Ljava/lang/String;

    iput v2, p0, Lcom/mf/RotSeek;->scrollsubstract:I

    const/16 v0, 0x10

    iput v0, p0, Lcom/mf/RotSeek;->VISIBLE_ITEMS_INVIEW:I

    invoke-direct {p0, p1, p2}, Lcom/mf/RotSeek;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/mf/RotSeek;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/mf/RotSeek;->autoscroll:Z

    return v0
.end method

.method static synthetic access$002(Lcom/mf/RotSeek;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/mf/RotSeek;->autoscroll:Z

    return p1
.end method

.method static synthetic access$100(Lcom/mf/RotSeek;)I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    return v0
.end method

.method static synthetic access$1000(Lcom/mf/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcom/mf/RotSeek;->redraw()V

    return-void
.end method

.method static synthetic access$102(Lcom/mf/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    return p1
.end method

.method static synthetic access$1100(Lcom/mf/RotSeek;)Landroid/widget/SeekBar$OnSeekBarChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-object v0
.end method

.method static synthetic access$200(Lcom/mf/RotSeek;)I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    return v0
.end method

.method static synthetic access$202(Lcom/mf/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    return p1
.end method

.method static synthetic access$300(Lcom/mf/RotSeek;)I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->realMax:I

    return v0
.end method

.method static synthetic access$400(Lcom/mf/RotSeek;)I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->realMin:I

    return v0
.end method

.method static synthetic access$500(Lcom/mf/RotSeek;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mf/RotSeek;->log(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lcom/mf/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcom/mf/RotSeek;->checkifCurrentValueHasChanged()V

    return-void
.end method

.method static synthetic access$700(Lcom/mf/RotSeek;)I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->currentValue:I

    return v0
.end method

.method static synthetic access$702(Lcom/mf/RotSeek;I)I
    .locals 0

    iput p1, p0, Lcom/mf/RotSeek;->currentValue:I

    return p1
.end method

.method static synthetic access$800(Lcom/mf/RotSeek;)V
    .locals 0

    invoke-direct {p0}, Lcom/mf/RotSeek;->handleAutoScroll()V

    return-void
.end method

.method static synthetic access$900(Lcom/mf/RotSeek;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    return-object v0
.end method

.method private checkifCurrentValueHasChanged()V
    .locals 3

    iget v1, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    iget v2, p0, Lcom/mf/RotSeek;->realMin:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int v0, v1, v2

    if-gez v0, :cond_0

    mul-int/lit8 v0, v0, -0x1

    :cond_0
    iget v1, p0, Lcom/mf/RotSeek;->currentValue:I

    if-eq v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "currentpos"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "item "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/mf/RotSeek;->log(Ljava/lang/String;)V

    iput v0, p0, Lcom/mf/RotSeek;->currentValue:I

    iget-object v1, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    const v2, 0x4

    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/mf/RotSeek;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/mf/RotSeek$2;

    invoke-direct {v2, p0}, Lcom/mf/RotSeek$2;-><init>(Lcom/mf/RotSeek;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method private convertDpiToPixel(I)F
    .locals 3

    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/mf/RotSeek;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method private getSignedDistance(II)I
    .locals 1

    sub-int v0, p1, p2

    return v0
.end method

.method private handleAutoScroll()V
    .locals 2

    iget-object v0, p0, Lcom/mf/RotSeek;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/mf/RotSeek$1;

    invoke-direct {v1, p0}, Lcom/mf/RotSeek$1;-><init>(Lcom/mf/RotSeek;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    iput-object p1, p0, Lcom/mf/RotSeek;->appContext:Landroid/content/Context;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mf/RotSeek;->handler:Landroid/os/Handler;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget v0, p0, Lcom/mf/RotSeek;->textsize:I

    invoke-direct {p0, v0}, Lcom/mf/RotSeek;->convertDpiToPixel(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/mf/RotSeek;->textsize:I

    iget v0, p0, Lcom/mf/RotSeek;->currentValue:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/mf/RotSeek;->setProgress(IZ)V

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

    invoke-virtual {p0}, Lcom/mf/RotSeek;->invalidate()V

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
    const/16 v0, 0x1f

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x3e

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x5d

    goto :goto_0

    :pswitch_4
    const/16 v0, 0x7c

    goto :goto_0

    :pswitch_5
    const/16 v0, 0x9b

    goto :goto_0

    :pswitch_6
    const/16 v0, 0xba

    goto :goto_0

    :pswitch_7
    const/16 v0, 0xd9

    goto :goto_0

    :pswitch_8
    const/16 v0, 0xff

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public GetCurrentString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    iget v1, p0, Lcom/mf/RotSeek;->currentValue:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public IsAutoScrolling()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mf/RotSeek;->autoscroll:Z

    return v0
.end method

.method public IsMoving()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    return v0
.end method

.method public SetStringValues([Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    iget v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    iget-object v1, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    array-length v1, v1

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->allItemsHeight:I

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->realMin:I

    iget v0, p0, Lcom/mf/RotSeek;->allItemsHeight:I

    iget v1, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->realMax:I

    invoke-direct {p0}, Lcom/mf/RotSeek;->redraw()V

    return-void
.end method

.method public getProgress()I
    .locals 1

    iget v0, p0, Lcom/mf/RotSeek;->currentValue:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    const-string v0, "pref_mf_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/mf/RotSeek;->textsize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_2

    iget-object v0, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    aget-object v8, v0, v7

    iget v0, p0, Lcom/mf/RotSeek;->currentValue:I

    sub-int v6, v0, v7

    if-gez v6, :cond_0

    mul-int/lit8 v6, v6, -0x1

    :cond_0
    const/16 v0, 0x9

    if-gt v6, v0, :cond_1

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    invoke-direct {p0, v6}, Lcom/mf/RotSeek;->switchalpha(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    mul-int/2addr v0, v7

    iget v1, p0, Lcom/mf/RotSeek;->textsize:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->textsize:I

    div-int/lit8 v1, v1, 0x2

    sub-int v9, v0, v1

    iget v0, p0, Lcom/mf/RotSeek;->viewWidth:I

    int-to-float v0, v0

    const/16 v1, 0xf

    invoke-direct {p0, v1}, Lcom/mf/RotSeek;->convertDpiToPixel(I)F

    move-result v1

    sub-float v1, v0, v1

    iget v0, p0, Lcom/mf/RotSeek;->textsize:I

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v9, v0

    int-to-float v2, v0

    iget v0, p0, Lcom/mf/RotSeek;->viewWidth:I

    add-int/lit8 v0, v0, -0x14

    int-to-float v3, v0

    iget v0, p0, Lcom/mf/RotSeek;->textsize:I

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v9, v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    if-eqz v8, :cond_1

    const/high16 v0, 0x42a00000    # 80.0f

    int-to-float v1, v9

    iget-object v2, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, p0, Lcom/mf/RotSeek;->viewWidth:I

    int-to-float v0, v0

    const/16 v1, 0xf

    invoke-direct {p0, v1}, Lcom/mf/RotSeek;->convertDpiToPixel(I)F

    move-result v1

    sub-float v1, v0, v1

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0x2

    iget v2, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    int-to-float v2, v0

    iget v0, p0, Lcom/mf/RotSeek;->viewWidth:I

    int-to-float v3, v0

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0x2

    iget v4, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v0, v4

    int-to-float v4, v0

    iget-object v5, p0, Lcom/mf/RotSeek;->paint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :goto_1
    return-void

    :cond_3
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/mf/RotSeek;->setVisibility(I)V

    goto :goto_1
.end method

.method protected onSizeChanged(IIII)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/mf/RotSeek;->viewWidth:I

    iput p2, p0, Lcom/mf/RotSeek;->viewHeight:I

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    iget v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    iget-object v1, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    array-length v1, v1

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->allItemsHeight:I

    iget v0, p0, Lcom/mf/RotSeek;->viewHeight:I

    neg-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->realMin:I

    iget v0, p0, Lcom/mf/RotSeek;->allItemsHeight:I

    iget v1, p0, Lcom/mf/RotSeek;->viewHeight:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/mf/RotSeek;->realMax:I

    iget v0, p0, Lcom/mf/RotSeek;->currentValue:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/mf/RotSeek;->setProgress(IZ)V

    invoke-direct {p0}, Lcom/mf/RotSeek;->redraw()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/mf/RotSeek;->redraw()V

    return v3

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    iput v4, p0, Lcom/mf/RotSeek;->startY:I

    iput-boolean v5, p0, Lcom/mf/RotSeek;->autoscroll:Z

    const/4 v3, 0x1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x0

    iget-boolean v4, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    if-nez v4, :cond_2

    iget v4, p0, Lcom/mf/RotSeek;->startY:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {p0, v4, v5}, Lcom/mf/RotSeek;->getSignedDistance(II)I

    move-result v0

    const/16 v4, 0x28

    if-gt v0, v4, :cond_1

    const/16 v4, -0x28

    if-ge v0, v4, :cond_2

    :cond_1
    iput-boolean v6, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    iget-object v4, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v4, v7}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_2
    iget-boolean v4, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/mf/RotSeek;->startY:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {p0, v4, v5}, Lcom/mf/RotSeek;->getSignedDistance(II)I

    move-result v4

    iput v4, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    iget v4, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    iget v5, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    sub-int v1, v4, v5

    mul-int/lit8 v2, v1, -0x1

    iget v4, p0, Lcom/mf/RotSeek;->realMax:I

    if-ge v2, v4, :cond_3

    iget v4, p0, Lcom/mf/RotSeek;->realMin:I

    if-le v2, v4, :cond_3

    iput v1, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    invoke-direct {p0}, Lcom/mf/RotSeek;->checkifCurrentValueHasChanged()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    iput v4, p0, Lcom/mf/RotSeek;->startY:I

    :cond_3
    iget-boolean v3, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    goto :goto_0

    :pswitch_2
    iget-boolean v4, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    if-eqz v4, :cond_0

    iput-boolean v5, p0, Lcom/mf/RotSeek;->sliderMoving:Z

    iget-object v4, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v4, v7}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_4
    const/4 v3, 0x0

    iget v4, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    if-lez v4, :cond_5

    iget v4, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    const/16 v5, 0xa

    if-gt v4, v5, :cond_6

    :cond_5
    iget v4, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    if-gez v4, :cond_7

    iget v4, p0, Lcom/mf/RotSeek;->distanceInPixelFromLastSwipe:I

    const/16 v5, -0xa

    if-ge v4, v5, :cond_7

    :cond_6
    iput-boolean v6, p0, Lcom/mf/RotSeek;->autoscroll:Z

    invoke-direct {p0}, Lcom/mf/RotSeek;->handleAutoScroll()V

    :cond_7
    iget v4, p0, Lcom/mf/RotSeek;->currentValue:I

    invoke-virtual {p0, v4, v6}, Lcom/mf/RotSeek;->setProgress(IZ)V

    iget-object p1, p0, Lcom/mf/RotSeek;->appContext:Landroid/content/Context;

    const-string v0, "pref_set_focus_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/google/android/apps/camera/legacy/app/activity/main/CameraActivity;->ReInit()V

    goto/16 :goto_0

    :cond_8
    invoke-static {p1}, Lcom/Helper;->execCommands(Landroid/content/Context;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setFocusString()V
    .locals 9

    sget v3, Lcom/Helper;->sFront:I

    const-string v0, "pref_aux_key"

    invoke-static {v0}, Lcom/Fix/Pref;->MenuValue(Ljava/lang/String;)I

    move-result v0

    const v1, 0x1

    if-eq v0, v1, :cond_0

    const v1, 0x2

    if-eq v0, v1, :cond_1

    const v1, 0x3

    if-eq v0, v1, :cond_2

    const v1, 0x4

    if-eq v0, v1, :cond_3

    const-string v1, "pref_max_focus_value_key"

    goto :goto_0

    :cond_0
    const-string v1, "pref_max_focus_value_key_2"

    goto :goto_0

    :cond_1
    const-string v1, "pref_max_focus_value_key_3"

    goto :goto_0

    :cond_2
    const-string v1, "pref_max_focus_value_key_4"

    goto :goto_0

    :cond_3
    const-string v1, "pref_max_focus_value_key_5"

    goto :goto_0

    :goto_0
    if-nez v3, :cond_4

    const-string v0, "back"

    const-string v2, "front"

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-static {v1}, Lcom/Helper;->MenuValueFloat2(Ljava/lang/String;)F

    move-result v0

    const-string v1, "pref_focus_value_key"

    invoke-static {v1}, Lcom/Helper;->MenuValueFloat2(Ljava/lang/String;)F

    move-result v1

    move v4, v1

    float-to-int v4, v4

    div-float v1, v0, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Auto,inf,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x0

    const v0, 0x0

    new-array v5, v4, [F

    :goto_1
    if-ge v3, v4, :cond_5

    add-float v0, v0, v1

    aput v0, v5, v3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    const-string v6, "%.2f"

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v8, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ","

    const-string v8, "."

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    if-ge v3, v4, :cond_5

    const-string v6, ","

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    iput-object v5, p0, Lcom/mf/RotSeek;->FocusValue:[F

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v1, ","

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mf/RotSeek;->Values:[Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/mf/RotSeek;->currentValue:I

    return-void
.end method

.method public setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method public setProgress(IZ)V
    .locals 4

    invoke-static {}, Lcom/mf/manualfocus;->getInstance()Lcom/mf/manualfocus;

    move-result-object v2

    const/4 v3, 0x2

    if-ge p1, v3, :cond_0

    const v0, 0x0

    goto :goto_0

    :cond_0
    sub-int v3, p1, v3

    iget-object v1, p0, Lcom/mf/RotSeek;->FocusValue:[F

    aget v0, v1, v3

    :goto_0
    invoke-static {p1, v0}, Lcom/mf/manualfocus;->calcdist3(IF)V

    iput p1, p0, Lcom/mf/RotSeek;->currentValue:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setprogres"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mf/RotSeek;->log(Ljava/lang/String;)V

    iget v0, p0, Lcom/mf/RotSeek;->itemHeight:I

    mul-int/2addr v0, p1

    iget v1, p0, Lcom/mf/RotSeek;->itemHeight:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/mf/RotSeek;->realMin:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mf/RotSeek;->currentPosToDraw:I

    invoke-direct {p0}, Lcom/mf/RotSeek;->redraw()V

    iget-object v0, p0, Lcom/mf/RotSeek;->mListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/mf/RotSeek;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/mf/RotSeek$3;

    invoke-direct {v1, p0}, Lcom/mf/RotSeek$3;-><init>(Lcom/mf/RotSeek;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
