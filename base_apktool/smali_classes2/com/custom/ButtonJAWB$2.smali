.class Lcom/custom/ButtonJAWB$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonJAWB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/custom/ButtonJAWB;


# direct methods
.method constructor <init>(Lcom/custom/ButtonJAWB;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonJAWB$2;->this$1:Lcom/custom/ButtonJAWB;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, Lcom/Helper;->onRestart()V

    return-void
.end method
