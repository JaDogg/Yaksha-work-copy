// YK
#include "yk__lib.h"
// --forward declarations-- 
struct ykentry0;
struct ykentry1;
int32_t yy__main();
// --structs-- 
struct ykentry0 { yk__sds key; int32_t value; };
struct ykentry1 { yk__sds key; float value; };
// --functions-- 
int32_t yy__main() 
{
    struct ykentry0* yy__m = NULL;
    yk__sh_new_strdup(yy__m);
    yk__shput(yy__m, yk__sdsnewlen("hello", 5), INT32_C(42));
    yk__shput(yy__m, yk__sdsnewlen("world", 5), INT32_C(10000));
    yk__printstr("hello = ");
    yk__printlnint((intmax_t)yk__shget(yy__m, yk__sdsnewlen("hello", 5)));
    yk__printstr("length of this map is = ");
    yk__printlnint((intmax_t)yk__shlen(yy__m));
    yk__printstr("\"hello\" is located at = ");
    yk__printlnint((intmax_t)yk__shgeti(yy__m, yk__sdsnewlen("hello", 5)));
    yk__printstr("\"unknown\" is located at = ");
    yk__printlnint((intmax_t)yk__shgeti(yy__m, yk__sdsnewlen("unknown", 7)));
    yk__shfree(yy__m);
    struct ykentry1* yy__m2 = NULL;
    yk__sh_new_strdup(yy__m2);
    yk__shput(yy__m2, yk__sdsnewlen("hello", 5), 42.0f);
    yk__printstr("hello in m2 = ");
    yk__printlndbl(yk__shget(yy__m2, yk__sdsnewlen("hello", 5)));
    struct ykentry1* yy__m3 = NULL;
    yk__sh_new_strdup(yy__m3);
    yk__shput(yy__m3, yk__sdsnewlen("hello", 5), 123.0f);
    yk__printstr("hello in m3 = ");
    yk__printlndbl(yk__shget(yy__m3, yk__sdsnewlen("hello", 5)));
    yk__printlnstr("bye!");
    return INT32_C(0);
}
#if defined(YK__MINIMAL_MAIN)
int main(void) { return yy__main(); }
#endif