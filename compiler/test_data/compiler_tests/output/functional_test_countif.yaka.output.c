// YK
#include "yk__lib.h"
// --forward declarations-- 
typedef bool (*ykfncptr0)(yk__sds, int32_t);
bool yy__keep_len_n(yk__sds, int32_t);
bool yy__keep_upto_n(int32_t, int32_t);
int32_t yy__main();
// --structs-- 
// --functions-- 
bool yy__keep_len_n(yk__sds yy__a, int32_t yy__n) 
{
    if (yk__sdslen(yy__a) == yy__n)
    {
        yk__sdsfree(yy__a);
        return true;
    }
    yk__sdsfree(yy__a);
    return false;
}
bool yy__keep_upto_n(int32_t yy__a, int32_t yy__n) 
{
    if (yy__a > yy__n)
    {
        return false;
    }
    return true;
}
int32_t yy__main() 
{
    yk__printlnstr(">> countif str test <<");
    ykfncptr0 yy__f = yy__keep_len_n;
    yk__sds* t__0 = NULL;
    yk__arrsetcap(t__0, 5);
    yk__arrput(t__0, yk__sdsnewlen("Hello", 5));
    yk__arrput(t__0, yk__sdsnewlen("World", 5));
    yk__arrput(t__0, yk__sdsnewlen("How", 3));
    yk__arrput(t__0, yk__sdsnewlen("Are", 3));
    yk__arrput(t__0, yk__sdsnewlen("You", 3));
    yk__sds* yy__ar = t__0;
    yk__printstr("count len 3 ==> ");
    yk__sds* t__3 = yy__ar;
    int32_t t__5 = INT32_C(3);
    size_t t__2 = yk__arrlenu(t__3);
    int32_t t__6 = 0;
    for (size_t t__1 = 0; t__1 < t__2; t__1++) { 
        yk__sds t__4 = yk__sdsdup(t__3[t__1]);
        bool t__7 = yy__keep_len_n(t__4, t__5);
        if (t__7) {t__6++; }
    }
    yk__printlnint((intmax_t)t__6);
    yk__printstr("count len 5 ==> ");
    yk__sds* t__10 = yy__ar;
    int32_t t__12 = INT32_C(5);
    size_t t__9 = yk__arrlenu(t__10);
    int32_t t__13 = 0;
    for (size_t t__8 = 0; t__8 < t__9; t__8++) { 
        yk__sds t__11 = yk__sdsdup(t__10[t__8]);
        bool t__14 = yy__f(t__11, t__12);
        if (t__14) {t__13++; }
    }
    yk__printlnint((intmax_t)t__13);
    yk__printlnstr(">> countif int test <<");
    int32_t* t__15 = NULL;
    yk__arrsetcap(t__15, 10);
    yk__arrput(t__15, INT32_C(1));
    yk__arrput(t__15, INT32_C(2));
    yk__arrput(t__15, INT32_C(3));
    yk__arrput(t__15, INT32_C(4));
    yk__arrput(t__15, INT32_C(5));
    yk__arrput(t__15, INT32_C(6));
    yk__arrput(t__15, INT32_C(7));
    yk__arrput(t__15, INT32_C(8));
    yk__arrput(t__15, INT32_C(9));
    yk__arrput(t__15, INT32_C(10));
    int32_t* yy__ai = t__15;
    yk__printstr("count up to 5 ==> ");
    int32_t* t__18 = yy__ai;
    int32_t t__20 = INT32_C(5);
    size_t t__17 = yk__arrlenu(t__18);
    int32_t t__21 = 0;
    for (size_t t__16 = 0; t__16 < t__17; t__16++) { 
        int32_t t__19 = t__18[t__16];
        bool t__22 = yy__keep_upto_n(t__19, t__20);
        if (t__22) {t__21++; }
    }
    yk__printlnint((intmax_t)t__21);
    yk__printlnstr("completed.");
    return INT32_C(0);
}
#if defined(YK__MINIMAL_MAIN)
int main(void) { return yy__main(); }
#endif